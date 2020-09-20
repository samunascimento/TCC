import React, { Component, Fragment, useState } from 'react'
import Button from '@material-ui/core/Button';
import Fade from '@material-ui/core/Fade';
import ChartMenu from './chartMenu'
import Checkbox from '@material-ui/core/Checkbox';
import FormGroup from '@material-ui/core/FormGroup';
import FormControlLabel from '@material-ui/core/FormControlLabel';
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

export default class Project extends Component {
  constructor(props) {
    super(props);
    this.state = {

      projectName: props.nameProject.name,

      projectTloc: true,

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

      data: [],

      
      projectMetricsChart: [],
      packageMetricsChart: [],
      classMetricsChart: [],
      methodMetricsChart: [],

      packageTree: [],
      classTree: [{ name: 'MetricDao', id: 1 }, { name: 'ClassDao', id: 2 }, { name: 'PackageDaO', id: 3 }, { name: 'versionDao', id: 4 }, { name: 'ProjectDao', id: 5 }, { name: 'Teste', id: 6 }, { name: 'teste1', id: 7 }, { name: 'teste2', id: 8 }, { name: 'teste3', id: 9 }, { name: 'teste4', id: 10 }],
      methodTree: [{ name: 'runRepository', id: 1 }, { name: 'select', id: 2 }, { name: 'insert', id: 3 }, { name: 'update', id: 4 }, { name: 'delete', id: 5 }, { name: 'getConnection', id: 6 }, { name: 'teste4', id: 7 }, { name: 'teste2', id: 8 }, { name: 'teste3', id: 9 }, { name: 'teste4', id: 10 }],


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

  componentDidMount = () => {
    axios.get(`metric/version/` + this.props.nameProject.name)
      .then(res => {
        const data = this.state.data
        data.push(res.data)
        this.setState({ data: res.data });
        this.setState({
          maximaY: this.getMaximaY(this.state.data)
        })
        this.setState({projectTLOC: res.data})
      })
      
    this.getMetricDescription('TLOC', 'project')

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
        data.push(res.data)
        this.setState({ data: res.data });
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
    //this.setState({ data: [] })
    this.state.data.map((metrics, index) => {
      metrics.splice(0,metrics.length);
    })
    this.setState({ metricsDescriptions: [] })
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
          <ChartMenu projectTloc={this.state.projectTloc} addProjectMetric={this.addProjectMetric}
            packageTree={this.state.packageTree} packageMetrics={this.state.packageMetrics} addPackageMetric={this.addPackageMetric}
            classTree={this.state.classTree} classMetrics={this.state.classMetrics} handleChangeClass={this.handleChangeClass}
            methodTree={this.state.methodTree} methodMetrics={this.state.methodMetrics} handleChangeMethod={this.handleChangeMethod}
            generateChart={this.generateChart} clearChart={this.clearChart} />
          <Caption metricsDescriptions={this.state.metricsDescriptions} colors={this.state.colors} />
        </div>

        <div className="App" style={{ width: '80%', height: '100%' }}>
          <Chart data={this.state.data} colors={this.state.colors} switch={this.state.checkSwitch} maximaY={this.state.maximaY} />
        </div>
      </div >
    );
  }
}

// Project.propTypes = {
//   data: PropTypes.arrayOf(PropTypes.shape({
//     x: PropTypes.number,
//     y: PropTypes.number,
//     name: PropTypes.string,
//     versionDate: PropTypes.string
//   })),
// }