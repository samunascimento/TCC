import React, { Component, Fragment, useState } from 'react'
import Button from '@material-ui/core/Button';
import Menu from '@material-ui/core/Menu';
import Fade from '@material-ui/core/Fade';
import Checkbox from '@material-ui/core/Checkbox';
import FormGroup from '@material-ui/core/FormGroup';
import FormControlLabel from '@material-ui/core/FormControlLabel';
//import Chart from './../../Charts/chart';
import Chart from './../../Charts/chartLine';
import axios from 'axios';
import Grid from '@material-ui/core/Grid';
import { makeStyles } from '@material-ui/core/styles';
import TreeView from '@material-ui/lab/TreeView';
import ExpandMoreIcon from '@material-ui/icons/ExpandMore';
import ChevronRightIcon from '@material-ui/icons/ChevronRight';
import TreeItem from '@material-ui/lab/TreeItem';


// export default ({ match: { url}, name}) =>

// useEffect (() => {
//   axios.get(`http://localhost:8080/JasomeWeb/webresources/jasome/metric/package/` + {name}
//   .then(res => {
//     const data = res.data;
//     this.setState({ data });
//   })
// )

// <Fragment>


//   <h1>{name}</h1>
//   <h1>{url}</h1>


// </Fragment>



export default class Project extends Component {
  constructor(props) {
    super(props);
    this.state = {
      anchorE1: null,
      anchorE2: null,
      anchorE3: null,
      anchorE4: null,
      anchorTloc: null,

      projectTloc: false,

      
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

      maxHeight: 192,




      
      data: [
        [
          {
            "x": 0,
            "y": 42.0,
            "metricName": "TLOC",
            "versionDate": "Jan 31, 2020 11:58:48 PM"
          },
          {
            "x": 1,
            "y": 173.0,
            "metricName": "TLOC",
            "versionDate": "Feb 1, 2020 2:00:26 AM"
          },
          {
            "x": 2,
            "y": 272.0,
            "metricName": "TLOC",
            "versionDate": "Feb 1, 2020 3:57:13 AM"
          },
          {
            "x": 3,
            "y": 270.0,
            "metricName": "TLOC",
            "versionDate": "Feb 1, 2020 4:51:56 AM"
          },
          {
            "x": 4,
            "y": 270.0,
            "metricName": "TLOC",
            "versionDate": "Feb 1, 2020 4:52:19 AM"
          },
          {
            "x": 5,
            "y": 501.0,
            "metricName": "TLOC",
            "versionDate": "Feb 1, 2020 10:04:29 PM"
          },
          {
            "x": 6,
            "y": 590.0,
            "metricName": "TLOC",
            "versionDate": "Feb 2, 2020 7:31:40 PM"
          },
          {
            "x": 7,
            "y": 673.0,
            "metricName": "TLOC",
            "versionDate": "Feb 2, 2020 8:14:19 PM"
          },
          {
            "x": 8,
            "y": 673.0,
            "metricName": "TLOC",
            "versionDate": "Feb 2, 2020 9:58:37 PM"
          },
          {
            "x": 9,
            "y": 673.0,
            "metricName": "TLOC",
            "versionDate": "Feb 2, 2020 10:00:41 PM"
          },
          {
            "x": 10,
            "y": 673.0,
            "metricName": "TLOC",
            "versionDate": "Feb 2, 2020 10:10:13 PM"
          },
          {
            "x": 11,
            "y": 673.0,
            "metricName": "TLOC",
            "versionDate": "Feb 2, 2020 10:19:23 PM"
          },
          {
            "x": 12,
            "y": 673.0,
            "metricName": "TLOC",
            "versionDate": "Feb 2, 2020 11:03:00 PM"
          },
          {
            "x": 13,
            "y": 673.0,
            "metricName": "TLOC",
            "versionDate": "Feb 2, 2020 11:05:00 PM"
          },
          {
            "x": 14,
            "y": 673.0,
            "metricName": "TLOC",
            "versionDate": "Feb 2, 2020 11:08:55 PM"
          },
          {
            "x": 15,
            "y": 673.0,
            "metricName": "TLOC",
            "versionDate": "Feb 2, 2020 11:15:16 PM"
          },
          {
            "x": 16,
            "y": 673.0,
            "metricName": "TLOC",
            "versionDate": "Feb 3, 2020 12:00:32 AM"
          },
          {
            "x": 17,
            "y": 713.0,
            "metricName": "TLOC",
            "versionDate": "Feb 3, 2020 12:24:41 AM"
          },
          {
            "x": 18,
            "y": 713.0,
            "metricName": "TLOC",
            "versionDate": "Feb 3, 2020 12:29:28 AM"
          },
          {
            "x": 19,
            "y": 713.0,
            "metricName": "TLOC",
            "versionDate": "Feb 3, 2020 12:32:56 AM"
          },
          {
            "x": 20,
            "y": 713.0,
            "metricName": "TLOC",
            "versionDate": "Feb 3, 2020 12:33:33 AM"
          },
          {
            "x": 21,
            "y": 798.0,
            "metricName": "TLOC",
            "versionDate": "Feb 4, 2020 9:51:43 PM"
          },
          {
            "x": 22,
            "y": 813.0,
            "metricName": "TLOC",
            "versionDate": "Feb 6, 2020 2:21:36 PM"
          },
          {
            "x": 23,
            "y": 795.0,
            "metricName": "TLOC",
            "versionDate": "Feb 6, 2020 2:45:44 PM"
          },
          {
            "x": 24,
            "y": 813.0,
            "metricName": "TLOC",
            "versionDate": "Feb 6, 2020 3:18:29 PM"
          },
          {
            "x": 25,
            "y": 839.0,
            "metricName": "TLOC",
            "versionDate": "Feb 16, 2020 11:27:15 PM"
          },
          {
            "x": 26,
            "y": 858.0,
            "metricName": "TLOC",
            "versionDate": "Feb 29, 2020 9:13:44 PM"
          },
          {
            "x": 27,
            "y": 858.0,
            "metricName": "TLOC",
            "versionDate": "Feb 29, 2020 9:13:44 PM"
          },
          {
            "x": 28,
            "y": 858.0,
            "metricName": "TLOC",
            "versionDate": "Mar 1, 2020 11:11:48 PM"
          },
          {
            "x": 29,
            "y": 858.0,
            "metricName": "TLOC",
            "versionDate": "Apr 5, 2020 1:56:08 PM"
          },
          {
            "x": 30,
            "y": 858.0,
            "metricName": "TLOC",
            "versionDate": "Apr 5, 2020 1:56:42 PM"
          },
          {
            "x": 31,
            "y": 858.0,
            "metricName": "TLOC",
            "versionDate": "Apr 5, 2020 10:57:26 PM"
          }
        ]
      ],

      root: {
        height: 240,
        flexGrow: 1,
        maxWidth: 400
      },

      packageTree: [],
      classTree: [{ name: 'MetricDao', id: 1 }, { name: 'ClassDao', id: 2 }, { name: 'PackageDaO', id: 3 }, { name: 'versionDao', id: 4 }, { name: 'ProjectDao', id: 5 }, { name: 'Teste', id: 6 }, { name: 'teste1', id: 7 }, { name: 'teste2', id: 8 }, { name: 'teste3', id: 9 }, { name: 'teste4', id: 10 }],
      methodTree: [{ name: 'runRepository', id: 1 }, { name: 'select', id: 2 }, { name: 'insert', id: 3 }, { name: 'update', id: 4 }, { name: 'delete', id: 5 }, { name: 'getConnection', id: 6 }, { name: 'teste4', id: 7 }, { name: 'teste2', id: 8 }, { name: 'teste3', id: 9 }, { name: 'teste4', id: 10 }],
    }

  };




  handleClick = event => this.setState({ anchorE1: event.currentTarget })

  handleClose = () => this.setState({ anchorE1: null })

  handleClickPackage = event => this.setState({ anchorE2: event.currentTarget })

  handleClosePackage = () => this.setState({ anchorE2: null })

  handleClickClass = event => this.setState({ anchorE3: event.currentTarget })

  handleCloseClass = () => this.setState({ anchorE3: null })

  handleClickMethod = event => this.setState({ anchorE4: event.currentTarget })

  handleCloseMethod = () => this.setState({ anchorE4: null })



  componentDidMount = () => {
    axios.get(`http://localhost:8080/JasomeWeb/webresources/jasome/namePackage/` + this.props.nameProject.name)
      .then(res => {
        const packageTree = res.data
        this.setState({ packageTree })
      })
  }

  handleChangeProject = (event) => {
    this.setState({ ...this.state, [event.target.name]: event.target.checked });

    if (event.target.checked === true) {
      axios.get(`http://localhost:8080/JasomeWeb/webresources/jasome/metric/version/` + this.props.nameProject.name)
        .then(res => {
          const data = res.data;
          this.setState({ data });
        })
    }

    else if (event.target.checked === false) {

      const data = [];
      this.setState({ data });

    }
  };

  handleChangePackage = (event, metricName, packageName) => {
    this.setState({ ...this.state, [event.target.name]: event.target.checked });


    if (event.target.checked === true) {
      axios.get(`http://localhost:8080/JasomeWeb/webresources/jasome/metric/package/` + this.props.nameProject.name)
        .then(res => {
          let metricCheck = false
          //const data = this.state.data;
          const data = []

          const packagePoints = res.data;
          packagePoints.map((metrics) => {
            metrics.map((metric, index) => {
              if ((metric !== null) && (metric.metricName === metricName) && (metric.namePackage === packageName)) {
                metricCheck = true
              }
            })
            if (metricCheck === true) {
              data.push(metrics)
            }
            metricCheck = false;
          })
          this.setState({ data })
          console.log(data)

        })
    }

    //arrumar esse else
    else if (event.target.checked === false) {

      const data = [];
      this.setState({ data });

    }
  };


  handleChangeClass = (event, metricName) => {
    this.setState({ ...this.state, [event.target.name]: event.target.checked });
    if (event.target.checked === true) {
      axios.get(`http://localhost:8080/JasomeWeb/webresources/jasome/metric/class/` + this.props.nameProject.name)
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
      axios.get(`http://localhost:8080/JasomeWeb/webresources/jasome/metric/method/` + this.props.nameProject.name)
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



  render() {
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


    return (
      <div>
        <div>
          <Grid container spacing={10}>
            <Grid item xs={2}>
              <Button aria-controls="long-menu" variant="contained" color="primary" aria-haspopup="true" onClick={this.handleClick}>
                Project Metrics
              </Button>
              <Menu
                id="long-menu"
                anchorEl={anchorE1}
                keepMounted
                open={Boolean(anchorE1)}
                onClose={this.handleClose}
                TransitionComponent={Fade}
                PaperProps={{
                  style: {
                    maxHeight: maxHeight,
                    width: '20ch',
                  },
                }}
              >
                <FormGroup>
                  <FormControlLabel
                    control={<Checkbox checked={projectTloc} onChange={this.handleChangeProject} name='projectTloc' color="primary" />}
                    label='tloc'
                  />
                </FormGroup>
              </Menu>
            </Grid>
            <Grid item xs={2}>
              <Button aria-controls="long-menu" variant="contained" color="primary" aria-haspopup="true" onClick={this.handleClickPackage}>
                Package Metrics
              </Button>
              <Menu
                id="long-menu"
                anchorEl={anchorE2}
                keepMounted
                open={Boolean(anchorE2)}
                onClose={this.handleClosePackage}
                TransitionComponent={Fade}
                transformOrigin={{
                  vertical: 2000000000,
                  horizontal: 'left',
                }}
                PaperProps={{
                  style: {
                    maxHeight: maxHeight,
                    width: 400,
                  },
                }}
              >
                <TreeView
                  className={root}
                  defaultCollapseIcon={<ExpandMoreIcon />}
                  defaultExpandIcon={<ChevronRightIcon />}
                >
                  {this.state.packageTree.map((packages) => (

                    <TreeItem nodeId={packages.id} label={packages.name}>
                      <FormGroup>
                        {packageMetrics.map((metric) => (
                          <FormControlLabel
                            control={<Checkbox onChange={(event) => this.handleChangePackage(event, metric.name, packages.name)} name={metric.name} color="primary" />}
                            label={metric.name}
                          />
                        ))}
                      </FormGroup>
                    </TreeItem>

                  ))}

                </TreeView>
              </Menu>
            </Grid>
            <Grid item xs={2}>
              <Button aria-controls="long-menu" variant="contained" color="primary" aria-haspopup="true" onClick={this.handleClickClass}>
                Class Metrics
              </Button>
              <Menu
                id="long-menu"
                anchorEl={anchorE3}
                keepMounted
                open={Boolean(anchorE3)}
                onClose={this.handleCloseClass}
                TransitionComponent={Fade}
                transformOrigin={{
                  vertical: 2000000000,
                  horizontal: 'left',
                }}
                PaperProps={{
                  style: {
                    maxHeight: maxHeight,
                    width: '20ch',
                  },
                }}
              >
                <TreeView
                  className={root}
                  defaultCollapseIcon={<ExpandMoreIcon />}
                  defaultExpandIcon={<ChevronRightIcon />}
                >
                  {this.state.classTree.map((classes) => (
                    <TreeItem nodeId={classes.id} label={classes.name}>
                      <FormGroup>
                        {classMetrics.map((metric) => (
                          <FormControlLabel
                            control={<Checkbox onChange={(event) => this.handleChangeClass(event, metric.name)} name={metric.name} color="primary" />}
                            label={metric.name}
                          />
                        ))}
                      </FormGroup>
                    </TreeItem>
                  ))}
                </TreeView>
              </Menu>
            </Grid>
            <Grid item xs={2}>
              <Button aria-controls="long-menu" variant="contained" color="primary" aria-haspopup="true" onClick={this.handleClickMethod}>
                Method Metrics
              </Button>
              <Menu
                id="long-menu"
                anchorEl={anchorE4}
                keepMounted
                open={Boolean(anchorE4)}
                onClose={this.handleCloseMethod}
                TransitionComponent={Fade}
                transformOrigin={{
                  vertical: 2000000000,
                  horizontal: 'left',
                }}
                PaperProps={{
                  style: {
                    maxHeight: maxHeight,
                    width: '20ch',
                  },
                }}
              >
                <TreeView
                  className={root}
                  defaultCollapseIcon={<ExpandMoreIcon />}
                  defaultExpandIcon={<ChevronRightIcon />}
                >
                  {this.state.methodTree.map((methods) => (

                    <TreeItem nodeId={methods.id} label={methods.name}>
                      <FormGroup>
                        {methodMetrics.map((metric) => (
                          <FormControlLabel
                            control={<Checkbox onChange={(event) => this.handleChangeMethod(event, metric.name)} name={metric.name} color="primary" />}
                            label={metric.name}
                          />
                        ))}
                      </FormGroup>
                    </TreeItem>
                  ))}
                </TreeView>
              </Menu>
            </Grid>
            <Grid item xs={2}>
              <Button variant="contained" onClick={this.limparChart}>
                limpar gráfico
              </Button>
            </Grid>
          </Grid>
        </div>
        <div>
          <h1>GRÁFICO</h1>

          <div className="App">
            <Chart data={this.state.data} />
            {/* <BarChart /> */}
          </div>
        </div>
      </div>
    );
  }
}



