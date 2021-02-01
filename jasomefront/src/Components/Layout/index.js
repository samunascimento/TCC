import React, { Component, Fragment } from 'react'
import { Link, withRouter } from 'react-router-dom'
import {
  AppBar, Toolbar, IconButton, Typography, Hidden,
  Drawer, CssBaseline, MenuList, MenuItem
} from '@material-ui/core'
import { withStyles } from '@material-ui/core/styles'
import { Menu } from '@material-ui/icons'
import { compose } from 'recompose'
import Collapse from '@material-ui/core/Collapse';
import ExpandLess from '@material-ui/icons/ExpandLess';
import ExpandMore from '@material-ui/icons/ExpandMore';

const drawerWidth = 240

const styles = theme => ({

  openProject: false,

  root: {
    flexGrow: 1,
    zIndex: 1,
    overflow: 'hidden',
    position: 'relative',
    display: 'flex',
    width: '100%',
  },
  appBar: {
    zIndex: theme.zIndex.drawer + 1,
  },
  navIconHide: {
    [theme.breakpoints.up('md')]: {
      display: 'none',
    },
  },
  toolbar: theme.mixins.toolbar,
  drawerPaper: {
    width: drawerWidth,
    [theme.breakpoints.up('md')]: {
      position: 'relative',
    },
  },
  content: {
    flexGrow: 1,
    backgroundColor: theme.palette.background.default,
    padding: theme.spacing(0),
  },
  nested: {
    paddingLeft: theme.spacing(2),
  },
})

class Layout extends Component {
  state = {
    mobileOpen: false,
    to: null,
  }

  handleClickProject = () => {
    const openProject = !this.state.openProject
    this.setState({ openProject })
  }

  handleDrawerToggle = () => {
    this.setState({ mobileOpen: !this.state.mobileOpen })
  }

  render() {
    const { classes, location: { pathname }, children, projects } = this.props
    const { mobileOpen } = this.state

    const drawer = (
      <div>
        <Hidden smDown>
          <div className={classes.toolbar} />
        </Hidden>
        <MenuList>
          <MenuItem component={Link} to="/" selected={'/' === pathname} style={{ borderRadius: '5px', border: '1px solid grey', margin: '4px 2px' }}>
            Cadastro
          </MenuItem>
          <MenuItem component={Link} to="/metric" selected={'/metric' === pathname} style={{ borderRadius: '5px', border: '1px solid grey', margin: '4px 2px' }}>
            Metric
          </MenuItem>
          <MenuItem onClick={this.handleClickProject} component={Link} to="/projects" selected={'/projects' === pathname} style={{ borderRadius: '5px', border: '1px solid grey', margin: '4px 2px' }}>
            Projects
            {this.state.openProject ? <ExpandLess/> : <ExpandMore/>}
          </MenuItem>
          <Collapse in={this.state.openProject} timeout="auto" unmountOnExit>
            <MenuList>
              {projects.map(({ id, name }) => {
                const to = `/projects/${id}`
                return <MenuItem
                  to={to}
                  key={id}
                  className={classes.nested}
                  component={Link}
                  selected={to === pathname}
                >
                  {name}
                </MenuItem>
              })}
            </MenuList>
          </Collapse>
        </MenuList>
      </div>
    )

    return <Fragment>
      <CssBaseline />

      <div className={classes.root}>
        <AppBar style = {{left:'0px', width:'12.5%', borderRadius: '3px'}} position="absolute" className={classes.appBar}>
          <Toolbar>
            <IconButton
              color="inherit"
              aria-label="open drawer"
              onClick={this.handleDrawerToggle}
              className={classes.navIconHide}
            >
              <Menu />
            </IconButton>
            <Typography variant="h6" color="inherit" noWrap>
              Jasome Web
            </Typography>
          </Toolbar>
        </AppBar>
        <Hidden mdUp>
          <Drawer
            variant="temporary"
            open={mobileOpen}
            onClose={this.handleDrawerToggle}
            classes={{
              paper: classes.drawerPaper,
            }}
            ModalProps={{
              keepMounted: true, // Better open performance on mobile.
            }}
          >
            {drawer}
          </Drawer>
        </Hidden>
        <Hidden smDown implementation="css">
          <Drawer
            variant="permanent"
            open
            classes={{
              paper: classes.drawerPaper,
            }}
          >
            {drawer}
          </Drawer>
        </Hidden>
        <main className={classes.content}>
          {children}
        </main>
      </div>
    </Fragment>
  }
}


export default compose(
  withRouter,
  withStyles(styles)
)(Layout)
