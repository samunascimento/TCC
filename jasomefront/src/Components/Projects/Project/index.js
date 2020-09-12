import React, { Component, Fragment, useState } from 'react'
import Button from '@material-ui/core/Button';
import Menu from '@material-ui/core/Menu';
import Fade from '@material-ui/core/Fade';
import Checkbox from '@material-ui/core/Checkbox';
import FormGroup from '@material-ui/core/FormGroup';
import FormControlLabel from '@material-ui/core/FormControlLabel';
//import Chart from './../../Charts/chart';
import Chart from './../../Charts/chartLine';
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

export default class Project extends Component {
  constructor(props) {
    super(props);
    this.state = {

      projectName: props.nameProject.name,

      openMetrics: false,
      openProject: false,
      openPackage: false,
      openClass: false,
      openMethod: false,

      projectTloc: false,

      loadingState: false,


      packageMetrics: [{ name: 'TLOC' }, { name: 'A' }, { name: 'CCRC' }, { name: 'Ca', }, { name: 'Ce', }, { name: 'DMS', }, { name: 'I', }, { name: 'NOC', }, { name: 'NOI', },
      { name: 'PkgRCi' }, { name: 'PkgTCi' }],


      classMetrics: [{ name: 'TLOC' }, { name: 'AHF' }, { name: 'AIF' }, { name: 'Aa' },
      { name: 'Ad' }, { name: 'Ai' }, { name: 'Ait' }, { name: 'Ao' }, { name: 'Av' }, { name: 'Cf' },
      { name: 'ClRCi' }, { name: 'ClTCi' }, { name: 'DIT' }, { name: 'HMd' },
      { name: 'HMi' }, { name: 'Lcom' }, { name: 'MHF' },
      { name: 'MILF' }, { name: 'Ma' }, { name: 'Md' }, { name: 'Mi' }, { name: 'Mit' },
      { name: 'Mo' }, { name: 'NF' }, { name: 'NMI' }, { name: 'NMIR' },
      { name: 'NOA' }, { name: 'NOCh' }, { name: 'NOD' },
      { name: 'NODa' }, { name: 'NODe ' }, { name: 'NOL' }, { name: 'NOPa' },
      { name: 'NORM' }, { name: 'NPF' }, { name: 'NPM' }, { name: 'NSF' }, { name: 'NSM' },
      { name: 'PF' }, { name: 'PMR' }, { name: 'PMd' }, { name: 'PMi' },
      { name: 'RTLOC' }, { name: 'SIX' }, { name: 'WMC' }, { name: 'Ah' }, { name: 'NF' }],


      methodMetrics: [{ name: 'TLOC' }, { name: 'Ci' }, { name: 'Di' }, { name: 'Fin' }, { name: 'Fout' },
      { name: 'IOvars' }, { name: 'MCLC' }, { name: 'NBD' }, { name: 'NCOMP' }, { name: 'NOP' },
      { name: 'NVAR' }, { name: 'SI' }, { name: 'VG' }],

      colors: [],

      data: [
        [
          {
            "x": 0,
            "y": 100
          },
          {
            "x": 1,
            "y": 200
          },
          {
            "x": 2,
            "y": 300
          },
          {
            "x": 3,
            "y": 400.0
          },
          {
            "x": 4,
            "y": 500
          },
          {
            "x": 5,
            "y": 600.0
          }
        ]
      ],

      root: {
        height: 240,
        flexGrow: 1,
        maxWidth: 400
      },

      theme: createMuiTheme({
        overrides: {
          TreeItem: {
            fontStyle: 'italic',
            fontSize: 12,
          },
          label: {
            fontStyle: 'italic',
            fontSize: '5px',
          },
        }
      }),

      projectMetricsChart: [],
      packageMetricsChart: [],
      classMetricsChart: [],
      methodMetricsChart: [],

      packageTree: [],
      classTree: [{ name: 'MetricDao', id: 1 }, { name: 'ClassDao', id: 2 }, { name: 'PackageDaO', id: 3 }, { name: 'versionDao', id: 4 }, { name: 'ProjectDao', id: 5 }, { name: 'Teste', id: 6 }, { name: 'teste1', id: 7 }, { name: 'teste2', id: 8 }, { name: 'teste3', id: 9 }, { name: 'teste4', id: 10 }],
      methodTree: [{ name: 'runRepository', id: 1 }, { name: 'select', id: 2 }, { name: 'insert', id: 3 }, { name: 'update', id: 4 }, { name: 'delete', id: 5 }, { name: 'getConnection', id: 6 }, { name: 'teste4', id: 7 }, { name: 'teste2', id: 8 }, { name: 'teste3', id: 9 }, { name: 'teste4', id: 10 }],

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

      checkSwitch: true,

      metricsDescriptions: [],

      maximaY: 0,

    };
  }

  aleatorio = (inferior, superior) => {
    let numPossibilidades = superior - inferior
    let aleat = Math.random() * numPossibilidades
    aleat = Math.floor(aleat)
    return parseInt(inferior) + aleat
  }

  gerarCor = () => {
    let hexadecimal = new Array("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F")
    let cor_aleatoria = "#";
    for (let i = 0; i < 6; i++) {
      let posarray = this.aleatorio(0, hexadecimal.length)
      cor_aleatoria += hexadecimal[posarray]
    }
    return cor_aleatoria
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

  handleClickMetricsDescriptions = () => {
    const openDescriptions = !this.state.openDescriptions
    this.setState({ openDescriptions })
  };


  componentDidMount = () => {
    axios.get(`namePackage/` + this.props.nameProject.name)
      .then(res => {
        const packageTree = res.data
        this.setState({ packageTree })
      })

    for (let index = 0; index < 200; index++) {
      const colors = this.state.colors
      colors[index] = this.gerarCor()
      this.setState({ colors })
    }
  }

  getMetricDescription = (metricName, checkMetric) => {
    axios.get(`metric/description/` + metricName)
      .then(res => {
        const description = res.data;
        const metricDescription = { 'metricName': metricName, 'metricDescription': description, 'checkMetric': checkMetric }
        const metricsDescriptions = this.state.metricsDescriptions;
        metricsDescriptions.push(metricDescription)
        this.setState({ metricsDescriptions })
      })
  }

  RemoveMetricDescription = (metricName, checkMetric) => {
    let metricCheck = false
    let metricIndex = 1
    this.state.metricsDescriptions.map((metric, index) => {
      if (metric.metricName === metricName && metric.checkMetric === checkMetric) {
        metricCheck = true
        metricIndex = index
      }
    })
    if (metricCheck === true) {
      this.state.metricsDescriptions.splice(metricIndex, 1)
    }
  }

  addProjectMetric = (event, metricName) => {

    this.setState({ ...this.state, [event.target.name]: event.target.checked });

    if (event.target.checked === true) {

      const metric = { 'metricName': metricName }
      const projectMetricsChart = this.state.projectMetricsChart;
      projectMetricsChart.push(metric)
      this.setState({ projectMetricsChart })

    }

    else if (event.target.checked === false) {
      let metricCheck = false
      let metricIndex = 1

      this.state.projectMetricsChart.map((metric, index) => {
        if (metric.metricName === metricName) {
          metricCheck = true
          metricIndex = index
        }
      })
      if (metricCheck === true) {
        this.state.projectMetricsChart.splice(metricIndex, 1)
        metricCheck = false
      }

      this.state.data.map((metrics, index) => {

        metrics.map((metric, index) => {
          if ((metric !== null) && (metric.metricName === metricName) && (metric.nameProject === this.state.projectName)) {
            metricCheck = true
            metricIndex = index
          }
        })
        if (metricCheck === true) {
          this.state.data.splice(index, 1)
          metricCheck = false
        }

        this.RemoveMetricDescription(metricName, 'project')

      })
    }

  }


  handleChangeProject = async (metric) => {

    await axios.get(`metric/version/` + this.props.nameProject.name)
      .then(res => {
        const data = this.state.data
        data.push(res.data[0])
        this.setState({ data });
        this.setState({
          maximaY: this.getMaximaY(this.state.data)
        })
      })
    this.getMetricDescription(metric.metricName, 'project')
  }

  addPackageMetric = (event, metricName, packageName, packageIndex) => {
    this.setState({ ...this.state, [event.target.name]: event.target.checked });

    this.state.packageTree[packageIndex][metricName] = !this.state.packageTree[packageIndex][metricName]

    if (event.target.checked === true) {


      const metric = { 'metricName': metricName, 'packageName': packageName }
      const packageMetricsChart = this.state.packageMetricsChart;
      packageMetricsChart.push(metric)
      this.setState({ packageMetricsChart })



    }

    else if (event.target.checked === false) {

      let metricCheck = false
      let metricIndex = 1
      this.state.packageMetricsChart.map((metric, index) => {
        if (metric.metricName === metricName && metric.packageName === packageName) {
          metricCheck = true
          metricIndex = index
        }
      })
      if (metricCheck === true) {
        this.state.packageMetricsChart.splice(metricIndex, 1)
        metricCheck = false
      }

      this.state.data.map((metrics, index) => {
        metrics.map((metric, index) => {
          if ((metric !== null) && (metric.metricName === metricName) && (metric.namePackage === packageName)) {
            metricCheck = true
          }
        })
        if (metricCheck === true) {
          this.state.data.splice(index, 1)
          metricCheck = false
        }
      })
      const packageSplit = packageName.split('.');
      if (packageSplit.length !== 1) {
        packageName = packageSplit[0].concat('...').concat(packageSplit[packageSplit.length - 1])
      }
      this.RemoveMetricDescription(metricName, packageName);

    }


  }


  handleChangePackage = async (packageMetric) => {

    await axios.get(`metric/package/` + this.props.nameProject.name + `/` + packageMetric.packageName + `/` + packageMetric.metricName)
      .then(res => {
        const data = this.state.data
        data.push(res.data[0])
        this.setState({ data });
        this.setState({
          maximaY: this.getMaximaY(this.state.data)
        })
      })


    const packageSplit = packageMetric.packageName.split('.');
    if (packageSplit.length !== 1) {
      packageMetric.packageName = packageSplit[0].concat('...').concat(packageSplit[packageSplit.length - 1])
    }

    this.getMetricDescription(packageMetric.metricName, packageMetric.packageName);

  }


  handleChangeClass = (event, metricName, classIndex) => {
    this.setState({ ...this.state, [event.target.name]: event.target.checked });

    this.state.classTree[classIndex][metricName] = !this.state.classTree[classIndex][metricName]

    if (event.target.checked === true) {
      axios.get(`metric/class/` + this.props.nameProject.name)
        .then(res => {
          let metricCheck = false
          const data = []
          const classPoints = res.data;
          classPoints.map((metrics) => {
            metrics.map((metric, index) => {
              if ((metric !== null) && (metric.metricName === metricName)) {
                metricCheck = true
              }
            })
            if (metricCheck === true) {
              data.push(metrics)
            }
            metricCheck = false;
          })
          this.setState({ data });
        })
    }
    else if (event.target.checked === false) {

      const data = [];
      this.setState({ data });

    }
  };

  handleChangeMethod = (event, metricName) => {
    this.setState({ ...this.state, [event.target.name]: event.target.checked });
    if (event.target.checked === true) {
      axios.get(`metric/method/` + this.props.nameProject.name)
        .then(res => {
          let metricCheck = false
          const data = []
          const methodPoints = res.data;
          methodPoints.map((metrics) => {
            metrics.map((metric, index) => {
              if ((metric !== null) && (metric.metricName === metricName)) { //modificar isso aqui depois
                metricCheck = true
              }
            })
            if (metricCheck === true) {
              data.push(metrics)
            }
            metricCheck = false;
          })
          this.setState({ data });
        })
    }
    else if (event.target.checked === false) {

      const data = [];
      this.setState({ data });

    }
  }

  handleChangeSwitch = (event) => {
    this.setState({ ...this.state, [event.target.name]: event.target.checked });
  };


  //   setStateAsync(state) {
  //     return new Promise((resolve) => {
  //       this.setState(state, resolve)
  //     });
  //   }

  //   teste = () => {

  //     this.state.projectMetricsChart.map((projectMetric) => {
  //       this.handleChangeProject(projectMetric)
  //     })
  //     this.state.packageMetricsChart.map((packageMetric) => {
  //       this.handleChangePackage(packageMetric);
  //     })
  //     this.setState({ projectMetricsChart: [] })

  //     this.setState({ packageMetricsChart: [] })

  // }

  generateChart = async () => {

    // this.setStateAsync({ loadingState: true })

    // console.log(this.state.loadingState)

    // this.teste();

    // console.log(this.state.loadingState)

    // await this.setStateAsync({ loadingState: false })

    // console.log(this.state.loadingState)


    // this.setState({
    //   loadingState: true
    // }, () => {
    //   console.log('teste')
    //   await this.teste().then(() => {
    //     console.log('teste')
    //     this.setState({ loadingState: false })

    //   })
    // })

    this.state.projectMetricsChart.map((projectMetric) => {
      this.handleChangeProject(projectMetric)
    })
    this.state.packageMetricsChart.map((packageMetric) => {
      this.handleChangePackage(packageMetric);
    })
    this.setState({ projectMetricsChart: [] })

    this.setState({ packageMetricsChart: [] })

    // this.state.loadingState = false
  }

  clearMenuPackage = () => {
    const packageTree = []
    this.state.packageTree.map((packageItem, packageIndex) => {
      packageTree.push(packageItem)
      this.state.packageMetrics.map((metric, metricIndex) => {
        packageTree[packageIndex][metric.name] = false
      })
    })

    return packageTree

  }

  clearChart = () => {
    this.setState({ data: [] })
    this.setState({ metricsDescriptions: [] })
    this.setState({openProject:false, openPackage: false, openClass:false, openMethod:false })
    this.setState({ projectTloc: false })
    this.setState({ packageTree: this.clearMenuPackage() })

  }

  getMaximaY = (data) => {

    const maximas = data.map(
      (dataset) => Math.max(...dataset.map((d) => d.y))
    )

    const max = Math.max(...maximas)

    return max

  }


  render() {

    const classes = this.state.menu;

    const { anchorE1 } = this.state
    const { anchorE2 } = this.state
    const { anchorE3 } = this.state
    const { anchorE4 } = this.state

    const { projectTloc } = this.state
    const { projectMetric } = this.state
    const { packageMetrics } = this.state
    const { classMetrics } = this.state
    const { methodMetrics } = this.state

    const { maxHeight } = this.state

    const { root } = this.state

    const { square } = this.state

    const { data } = this.state

    return (
      <div>
        <div style={{ width: '20%', position: "relative", float: "right" }}>
          {/* <div style={{ position: 'relative',  align: 'center'}}> */}
          <Grid component="label" container alignItems="center" spacing={1}>
            <Grid item>Commit</Grid>
            <Grid item>
              <Switch
                checked={this.state.checkedA}
                //onChange={this.handleChangeSwitch}
                name="checkedA"
                color="primary"
                inputProps={{ 'aria-label': 'primary checkbox' }}
                onClick={() => this.setState({ checkSwitch: !this.state.checkSwitch })}
              />
            </Grid>
            <Grid item>Date</Grid>
          </Grid>
          {/* </div> */}
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
                className={classes.root}>
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
                          control={<Checkbox checked={projectTloc} onChange={(event) => this.addProjectMetric(event, 'TLOC')} name='projectTloc' color="primary" />}
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
                        <ListItem button className={classes.nested}>
                          <TreeView
                            className={root}
                            defaultCollapseIcon={<ExpandMoreIcon />}
                            defaultExpandIcon={<ChevronRightIcon />}
                          >
                            {this.state.packageTree.map((packages, packageIndex) => (
                              <TreeItem title={packages.name} nodeId={packages.id} label={<span style={{ fontSize: '16px' }}>{packages.name}</span>}>
                                <FormGroup>
                                  {packageMetrics.map((metric) => (
                                    <FormControlLabel
                                      control={<Checkbox checked={packages[metric.name]} onChange={(event) => this.addPackageMetric(event, metric.name, packages.name, packageIndex)} name={metric.name} color="primary" />}
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
                        <ListItem button className={classes.nested}>
                          <TreeView
                            className={root}
                            defaultCollapseIcon={<ExpandMoreIcon />}
                            defaultExpandIcon={<ChevronRightIcon />}
                          >
                            {this.state.classTree.map((classes, index) => (
                              <TreeItem title={classes.name} nodeId={classes.id} label={<span style={{ fontSize: '16px' }}>{classes.name}</span>}>
                                <FormGroup>
                                  {classMetrics.map((metric) => (
                                    <FormControlLabel
                                      control={<Checkbox checked={classes[metric.name]} onChange={(event) => this.handleChangeClass(event, metric.name, index)} name={metric.name} color="primary" />}
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
                        <ListItem button className={classes.nested}>
                          <TreeView
                            className={root}
                            defaultCollapseIcon={<ExpandMoreIcon />}
                            defaultExpandIcon={<ChevronRightIcon />}
                          >
                            {this.state.classTree.map((classes) => (
                              <TreeItem title={classes.name} nodeId={classes.id} label={<span style={{ fontSize: '16px' }}>{classes.name}</span>}>
                                <FormGroup>
                                  {classMetrics.map((metric) => (
                                    <FormControlLabel
                                      control={<Checkbox onChange={(event) => this.handleChangeMethod(event, metric.name)} name={metric.name} color="primary" />}
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
                    <Button style={{ display: 'inline-block', marginLeft: '10%' }} onClick={this.generateChart} variant="contained" color="primary">
                      generate
                  </Button>
                    <Button style={{ display: 'inline-block', marginLeft: '10%' }} onClick={this.clearChart} variant="contained" color="primary">
                      clear
                  </Button>
                  </div>
                  {/* {this.state.loadingState && <CircularProgress />} */}
                </Collapse>
              </List>

            </Grid>
          </Box>
          <Box
            display="flex"

            flexDirection="row-reverse"
            p={1}
            m={1}
            bgcolor="background.paper"
            style={{ border: '2px groove black', borderRadius: '5px', marginLeft: '16px', marginRight: '0' }}
          >
            <Grid item xs={12}>
              {this.state.metricsDescriptions.map((metric, index) => (
                <div>
                  <div style={{ display: 'inline-block', height: '20px', width: '20px', backgroundColor: this.state.colors[index + 1] }}></div>
                  <dt style={{ marginLeft: '10px', display: 'inline-block' }} title={metric.metricDescription}>{metric.metricName + ' (' + metric.checkMetric + ')'}</dt>
                </div>
              ))}
            </Grid>
          </Box>
        </div>

        <div className="App" style={{ width: '80%', height: '100%' }}>
          <Chart data={this.state.data} colors={this.state.colors} switch={this.state.checkSwitch} maximaY={this.state.maximaY} />
        </div>
      </div >
    );
  }
}

Project.propTypes = {
  data: PropTypes.arrayOf(PropTypes.shape({
    x: PropTypes.number,
    y: PropTypes.number,
    name: PropTypes.string,
    versionDate: PropTypes.string
  })),
}