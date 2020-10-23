import React, { Component, Fragment, useState } from 'react'
import Button from '@material-ui/core/Button';
import Menu from '@material-ui/core/Menu';
import Fade from '@material-ui/core/Fade';
import Checkbox from '@material-ui/core/Checkbox';
import FormGroup from '@material-ui/core/FormGroup';
import FormControlLabel from '@material-ui/core/FormControlLabel';
import index from './index'
//import Chart from './../../Charts/chart';
import Chart from './../../Charts/chartLine';
import Caption from './chartCaption'
import ListSubheader from '@material-ui/core/ListSubheader';
import axios from 'axios';
import Box from '@material-ui/core/Box'
import Grid from '@material-ui/core/Grid';
import { createMuiTheme, makeStyles, ThemeProvider } from '@material-ui/core/styles';
import TreeView from '@material-ui/lab/TreeView';
import ExpandMoreIcon from '@material-ui/icons/ExpandMore';
import ChevronRightIcon from '@material-ui/icons/ChevronRight';
import TreeItem from '@material-ui/lab/TreeItem';
import Paper from '@material-ui/core/Paper';
import List from '@material-ui/core/List';
import ListItem from '@material-ui/core/ListItem';
import Collapse from '@material-ui/core/Collapse';
import ListItemText from '@material-ui/core/ListItemText';
import ExpandLess from '@material-ui/icons/ExpandLess';
import ExpandMore from '@material-ui/icons/ExpandMore';
import Switch from '@material-ui/core/Switch';
import CircularProgress from '@material-ui/core/CircularProgress';

import { PropTypes } from 'prop-types';


export default class chartMenu extends Component {
    constructor(props) {
        super(props);
        this.state = {
            openMetrics: false,
            openProject: false,
            openPackage: false,
            openClass: false,
            openMethod: false,

            projectTloc: this.props.projectTloc,

            addProjectMetric: this.props.addProjectMetric,
            addPackageMetric: this.props.addPackageMetric, 
            addClassMetrics: this.props.addClassMetric,       
            handleChangeClass: this.props.handleChangeClass,
            handleChangeMethod: this.props.handleChangeMethod,

            packageTree: this.props.packageTree,
            packageMetrics: this.props.packageMetrics,

            classTree: this.props.classTree,
            classMetrics: this.props.classMetrics,

            methodTree: this.props.methodTree,
            methodMetrics:this.props.methodMetrics,

            generatechart: this.props.generateChart,
            clearChart: this.props.clearChart,


            root: {
                height: 240,
                flexGrow: 1,
                maxWidth: 400
            },

            menu: makeStyles((theme) => ({
                root: {
                    width: '100%',
                    maxWidth: 360,
                    backgroundColor: theme.palette.background.paper,
                    position: 'relative',
                    overflow: 'auto',
                    maxHeight: 300,
                },
                nested: {
                    paddingLeft: theme.spacing(4),
                },
            })),
        }
    }

    handleClickMetrics = () => {
        const openMetrics = !this.state.openMetrics
        this.setState({ openMetrics })
    };

    handleClickProject = () => {
        const openProject = !this.state.openProject
        this.setState({ openProject })
    };


    handleClickPackage = () => {
        const openPackage = !this.state.openPackage
        this.setState({ openPackage })
    };


    handleClickClass = () => {
        const openClass = !this.state.openClass
        this.setState({ openClass })
    };


    handleClickMethod = () => {
        const openMethod = !this.state.openMethod
        this.setState({ openMethod })
    };

    closeMenu = () => {
        this.props.clearChart();
        this.setState({openProject:false, openPackage: false, openClass:false, openMethod:false })
    }


    render() {
        return (
            <Box
                display="flex"

                flexDirection="row-reverse"
                p={1}
                m={1}
                bgcolor="background.paper"
                style={{ border: '2px groove black', borderRadius: '5px', marginLeft: '16px', marginRight: '0' }}
            >
                <Grid item xs={12}>
                    <List component="nav"
                        aria-labelledby="nested-list-subheader"
                        position="relative"
                        left="1000px"
                        className={this.state.menu.root}>
                        <ListItem button onClick={this.handleClickMetrics} style={{ border: '1px solid grey', margin: '3px 0' }}>
                            <ListItemText align="left" primary="Metrics" />
                            {this.state.openMetrics ? <ExpandLess /> : <ExpandMore />}
                        </ListItem>
                        <Collapse in={this.state.openMetrics} timeout="auto" unmountOnExit>
                            <ListItem button onClick={this.handleClickProject} style={{ border: '1px solid grey', margin: '3px 0' }}>
                                <ListItemText align="left" primary="Project Metrics" />
                                {this.state.openProject ? <ExpandLess /> : <ExpandMore />}
                            </ListItem>
                            <Collapse in={this.state.openProject} timeout="auto" unmountOnExit>
                                <Paper style={{ maxHeight: 300, overflow: 'auto' }}>
                                    <FormGroup style={{ border: '1px solid grey' }}>
                                        <FormControlLabel
                                            control={<Checkbox checked={this.props.projectTloc} onChange={(event) => this.props.addProjectMetric(event, 'TLOC')} name='projectTloc' color="primary" />}
                                            label={<span style={{ fontSize: '14px' }}>TLOC</span>}
                                        />
                                    </FormGroup>
                                </Paper>
                            </Collapse>
                            <ListItem button onClick={this.handleClickPackage} style={{ border: '1px solid grey', margin: '3px 0' }}>
                                <ListItemText align="left" primary="Package Metrics" />
                                {this.state.openPackage ? <ExpandLess /> : <ExpandMore />}
                            </ListItem>
                            <Collapse in={this.state.openPackage} timeout="auto" unmountOnExit>
                                <Paper style={{ maxHeight: 300, overflow: 'auto', border: '1px solid grey' }}>
                                    <List component="div" disablePadding>
                                        <ListItem button className={this.state.menu.nested}>
                                            <TreeView
                                                className={this.state.root}
                                                defaultCollapseIcon={<ExpandMoreIcon />}
                                                defaultExpandIcon={<ChevronRightIcon />}
                                            >
                                                {this.props.packageTree.map((packages, packageIndex) => (
                                                    <TreeItem title={packages.name} nodeId={packages.id} label={<span style={{ fontSize: '16px' }}>{packages.name}</span>}>
                                                        <FormGroup>
                                                            {this.props.packageMetrics.map((metric) => (
                                                                <FormControlLabel
                                                                    control={<Checkbox checked={packages[metric.name]} onChange={(event) => this.props.addPackageMetric(event, metric.name, packages.name, packageIndex)} name={metric.name} color="primary" />}
                                                                    label={<span style={{ fontSize: '14px' }}>{metric.name}</span>}
                                                                />
                                                            ))}
                                                        </FormGroup>
                                                    </TreeItem>
                                                ))}
                                            </TreeView>
                                        </ListItem>
                                    </List>
                                </Paper>
                            </Collapse>
                            <ListItem button onClick={this.handleClickClass} style={{ border: '1px solid grey', margin: '3px 0' }}>
                                <ListItemText align="left" primary="Class Metrics" />
                                {this.state.openClass ? <ExpandLess /> : <ExpandMore />}
                            </ListItem>
                            <Collapse in={this.state.openClass} timeout="auto" unmountOnExit>
                                <Paper style={{ maxHeight: 300, overflow: 'auto', border: '1px solid grey' }}>
                                    <List component="div" disablePadding>
                                        <ListItem button className={this.state.menu.nested}>
                                            <TreeView
                                                className={this.state.root}
                                                defaultCollapseIcon={<ExpandMoreIcon />}
                                                defaultExpandIcon={<ChevronRightIcon />}
                                            >
                                                {this.props.classTree.map((classes, classIndex) => (
                                                    <TreeItem title={classes.name} nodeId={classes.id} label={<span style={{ fontSize: '16px' }}>{classes.name}</span>}>
                                                        <FormGroup>
                                                            {this.props.classMetrics.map((metric) => (
                                                                <FormControlLabel
                                                                    control={<Checkbox checked={classes[metric.name]} onChange={(event) => this.props.addClassMetric(event, metric.name, classes.name, classIndex)} name={metric.name} color="primary" />}
                                                                    label={<span style={{ fontSize: '14px' }}>{metric.name}</span>}
                                                                />
                                                            ))}
                                                        </FormGroup>
                                                    </TreeItem>
                                                ))}
                                            </TreeView>
                                        </ListItem>
                                    </List>
                                </Paper>
                            </Collapse>
                            <ListItem button onClick={this.handleClickMethod} style={{ border: '1px solid grey', margin: '3px 0' }}>
                                <ListItemText align="left" primary="Method Metrics" />
                                {this.state.openMethod ? <ExpandLess /> : <ExpandMore />}
                            </ListItem>
                            <Collapse in={this.state.openMethod} timeout="auto" unmountOnExit>
                                <Paper style={{ maxHeight: 300, overflow: 'auto', border: '1px solid grey' }}>
                                    <List component="div" disablePadding>
                                        <ListItem button className={this.state.menu.nested}>
                                            <TreeView
                                                className={this.state.root}
                                                defaultCollapseIcon={<ExpandMoreIcon />}
                                                defaultExpandIcon={<ChevronRightIcon />}
                                            >
                                                {this.props.classTree.map((classes) => (
                                                    <TreeItem title={classes.name} nodeId={classes.id} label={<span style={{ fontSize: '16px' }}>{classes.name}</span>}>
                                                        <FormGroup>
                                                            {this.props.classMetrics.map((metric) => (
                                                                <FormControlLabel
                                                                    control={<Checkbox onChange={(event) => this.props.handleChangeMethod(event, metric.name)} name={metric.name} color="primary" />}
                                                                    label={<span style={{ fontSize: '14px' }}>{metric.name}</span>}
                                                                />
                                                            ))}
                                                        </FormGroup>
                                                    </TreeItem>
                                                ))}
                                            </TreeView>
                                        </ListItem>
                                    </List>
                                </Paper>
                            </Collapse>
                            <div>
                                <Button style={{ display: 'inline-block', marginLeft: '10%' }} onClick={this.props.generateChart} variant="contained" color="primary">
                                    generate
                                </Button>
                                <Button style={{ display: 'inline-block', marginLeft: '10%' }} onClick={this.closeMenu} variant="contained" color="primary">
                                    clear
                                </Button>
                            </div>
                            {this.state.loadingState && <CircularProgress />}
                        </Collapse>
                    </List>

                </Grid>
            </Box>
        )
    }
}