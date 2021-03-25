import React, { Component, Fragment } from 'react'
import { Link, withRouter } from 'react-router-dom'
import ReactDOM from 'react-dom';
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
import Button from '@material-ui/core/Button';
import Login from '../Login';

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
    openInsert: false

  }

  onSubmit = () => {
    ReactDOM.render(<Login />, document.getElementById('root'));
  }

  handleClickInsert = () => {
    const openInsert = !this.state.openInsert;
    this.setState({ openInsert })
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
    const { mobileOpen, openInsert } = this.state

    const drawer = (
      <>
        <div>
          <Hidden smDown>
            <div className={classes.toolbar} />
          </Hidden>
          <MenuList>
            <MenuItem onClick={this.handleClickInsert} style={{ borderRadius: '5px', border: '1px solid grey', margin: '4px 2px' }}>
              Cadastros
              {this.state.openInsert ? <ExpandLess/> : <ExpandMore/>}
            </MenuItem>
            <Collapse in={openInsert} timeout="auto" unmountOnExit>
              <MenuList>
                <MenuItem component={Link} to="/insert/projects" selected={'/insert/projects' === pathname}>
                  Cadastro de Projeto 
                </MenuItem>
                <MenuItem component={Link} to="/insert/login" selected={'/insert/login' === pathname}>
                  Cadastro de Login
                </MenuItem>
              </MenuList>
            </Collapse>
            <MenuItem component={Link} to="/metric" selected={'/metric' === pathname} style={{ borderRadius: '5px', border: '1px solid grey', margin: '4px 2px' }}>
              Metric
            </MenuItem>
            <MenuItem component={Link} to="/search" selected={'/search' === pathname} style={{ borderRadius: '5px', border: '1px solid grey', margin: '4px 2px' }}>
              Acompanhamento
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
        <div style={{display:'flex'}}>
          <Toolbar style={{display: 'flex'}}>
              <IconButton
                color="inherit"
                aria-label="open drawer"
                onClick={this.handleDrawerToggle}
                className={classes.navIconHide}
              >
                <Menu />
              </IconButton>
              <Button color='primary' variant='contained' size='medium' type='submit' onClick={() => this.onSubmit()}>
                <Typography variant="h6" style={{color: 'white'}} noWrap>
                  Logout
                </Typography>
              </Button>
            </Toolbar>
        </div>
      </>
    )

    return <Fragment>
      <CssBaseline />

      <div className={classes.root}>
        <AppBar style = {{left:'0px', width:'12.5%', borderRadius: '3px'}} position="absolute" className={classes.appBar}>
          <Toolbar style={{display: 'flex'}}>
            <IconButton
              color="inherit"
              aria-label="open drawer"
              onClick={this.handleDrawerToggle}
              className={classes.navIconHide}
            >
              <Menu />
            </IconButton>
            <Button>
              <Typography variant="h6" style = {{ color: 'white'}} noWrap>
                Jasome Web
              </Typography>
            </Button>
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
