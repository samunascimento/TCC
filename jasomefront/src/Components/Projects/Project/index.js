import React, { Component, Fragment, useState } from 'react'
import Button from '@material-ui/core/Button';
import Menu from '@material-ui/core/Menu';
import Fade from '@material-ui/core/Fade';
import Checkbox from '@material-ui/core/Checkbox';
import FormGroup from '@material-ui/core/FormGroup';
import FormControlLabel from '@material-ui/core/FormControlLabel';
import Chart from './../../Charts/chart';
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

      packageTloc: false, packageA: false, packageCcrc: false, packageCa: false, packageCe: false, packageDms: false, packageI: false, packageNoc: false, packageNoi: false, packagePkgRCi: false, packagepkgTCi: false,

      packageMetrics: [{ name: 'TLOC' }, { name: 'A' }, { name: 'CCRC' }, { name: 'Ca', }, { name: 'Ce', }, { name: 'DMS', }, { name: 'I', }, { name: 'NOC', }, { name: 'NOI', },
      { name: 'PkgRCi' }, { name: 'PkgTCi' }],

      classTloc: false, classAhf: false, class: false, classAif: false, classAa: false, classAi: false, classAit: false, classAo: false, classAv: false, classCf: false, classClrci: false, classCltci: false,
      classDit: false, classHmd: false, classHmi: false, classLcom: false, classMhf: false, classMif: false, classMa: false, classMd: false, classMi: false, classMit: false, classMo: false, classNf: false,
      classNm: false, classNma: false, classNmi: false, classNmir: false, classNoa: false, classNoch: false, classNod: false, classNoda: false, classNode: false, classNol: false, classNopa: false,
      classNorm: false, classNpf: false, classNpm: false, classNsf: false, classNsm: false, classPf: false, classPmr: false, classPmd: false, classPmi: false, classRtloc: false, classSix: false, classWmc: false,
      classAh: false,

      // classMetrics: [{ checked: false, name: 'tloc' }, { checked: false, name: 'ahf' }, { checked: false, name: 'aif' }, { checked: false, name: 'aa' },
      // { checked: false, name: 'ai' }, { checked: false, name: 'ait' }, { checked: false, name: 'ao' }, { checked: false, name: 'av' }, { checked: false, name: 'cf' },
      // { checked: false, name: 'clrci' }, { checked: false, name: 'cltci' }, { checked: false, name: 'dit' }, { checked: false, name: 'hmd' },
      // { checked: false, name: 'hmi' }, { checked: false, name: 'lcom' }, { checked: false, name: 'mhf' },
      // { checked: false, name: 'mif' }, { checked: false, name: 'ma' }, { checked: false, name: 'md' }, { checked: false, name: 'mi' }, { checked: false, name: 'mit' },
      // { checked: false, name: 'mo' }, { checked: false, name: 'nf' }, { checked: false, name: 'nm' }, { checked: false, name: 'nma' },
      // { checked: false, name: 'nmi' }, { checked: false, name: 'nmir' }, { checked: false, name: 'noa' }, { checked: false, name: 'noch' }, { checked: false, name: 'nod' },
      // { checked: false, name: 'noda' }, { checked: false, name: 'node' }, { checked: false, name: 'nol' }, { checked: false, name: 'nopa' },
      // { checked: false, name: 'norm' }, { checked: false, name: 'npf' }, { checked: false, name: 'npm' }, { checked: false, name: 'nsf' }, { checked: false, name: 'nsm' },
      // { checked: false, name: 'pf' }, { checked: false, name: 'pmr' }, { checked: false, name: 'pmd' }, { checked: false, name: 'pmi' },
      // { checked: false, name: 'rtloc' }, { checked: false, name: 'six' }, { checked: false, name: 'wmc' }, { checked: false, name: 'ah' },],

      methodTloc: false, methodCi: false, methodDi: false, methodFin: false, methodFout: false, methodIovars: false, methodMclc: false, methodNbd: false, methodNcomp: false, methodNop: false, methodNvar: false, methodSi: false, methodVg: false,
      // methodMetrics: [{ checked: false, name: 'tloc' }, { checked: false, name: 'ci' }, { checked: false, name: 'di' }, { checked: false, name: 'fin' }, { checked: false, name: 'fout' },
      // { checked: false, name: 'iovars' }, { checked: false, name: 'mclc' }, { checked: false, name: 'nbd' }, { checked: false, name: 'ncomp' }, { checked: false, name: 'nop' },
      // { checked: false, name: 'nvar' }, { checked: false, name: 'si' }, { checked: false, name: 'vg' }],

      maxHeight: 192,

      data: [],

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
    axios.get(`http://localhost:56875/JasomeWeb/webresources/jasome/namePackage/` + this.props.nameProject.name)
      .then(res => {
         const packageTree = res.data
         this.setState({ packageTree })
      })
  }

  handleChangeProject = (event) => {
    this.setState({ ...this.state, [event.target.name]: event.target.checked });

    if (event.target.checked === true) {
      axios.get(`http://localhost:56875/JasomeWeb/webresources/jasome/metric/version/` + this.props.nameProject.name)
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

  handleChangePackage = (event, metricName,packageName) => {
    this.setState({ ...this.state, [event.target.name]: event.target.checked });


    if (event.target.checked === true) {
      axios.get(`http://localhost:56875/JasomeWeb/webresources/jasome/metric/package/` + this.props.nameProject.name)
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
          this.setState({data})
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
      axios.get(`http://localhost:56875/JasomeWeb/webresources/jasome/metric/class/` + this.props.nameProject.name)
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
      axios.get(`http://localhost:56875/JasomeWeb/webresources/jasome/metric/method/` + this.props.nameProject.name)
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
                        {/* <FormControlLabel
                        control={<Checkbox onChange={(event) => this.handleChangePackage(event, packages.metricName)} name='packageTloc' color="primary" />}
                        label='tloc'
                      />
                      <FormControlLabel
                        control={<Checkbox onChange={(event) => this.handleChangePackage(event, 'A')} name='packageA' color="primary" />}
                        label='a'
                      />
                      <FormControlLabel
                        control={<Checkbox onChange={(event) => this.handleChangePackage(event, 'CCRC')} name='packageCcrc' color="primary" />}
                        label='ccrc'
                      />
                      <FormControlLabel
                        control={<Checkbox onChange={(event) => this.handleChangePackage(event, 'Ca')} name='packageCa' color="primary" />}
                        label='ca'
                      />
                      <FormControlLabel
                        control={<Checkbox onChange={(event) => this.handleChangePackage(event, 'Ce')} name='packageCe' color="primary" />}
                        label='ce'
                      />
                      <FormControlLabel
                        control={<Checkbox onChange={(event) => this.handleChangePackage(event, 'DMS')} name='packageDms' color="primary" />}
                        label='dms'
                      />
                      <FormControlLabel
                        control={<Checkbox onChange={(event) => this.handleChangePackage(event, 'I')} name='packageI' color="primary" />}
                        label='i'
                      />
                      <FormControlLabel
                        control={<Checkbox onChange={(event) => this.handleChangePackage(event, 'NOC')} name='packageNoc' color="primary" />}
                        label='noc'
                      />
                      <FormControlLabel
                        control={<Checkbox onChange={(event) => this.handleChangePackage(event, 'PkgRCi')} name='packagePkgRCi' color="primary" />}
                        label='pkgrci'
                      />
                      <FormControlLabel
                        control={<Checkbox onChange={(event) => this.handleChangePackage(event, 'PkgTCi')} name='packagePkgTCi' color="primary" />}
                        label='pkgtci'
                      /> */}
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
                        {/* {classMetrics.map((metric) => (
                    <FormControlLabel
                      control={<Checkbox checked={metric.checked} onChange={this.handleChangeClass} name={metric.name} color="primary" />}
                      label={metric.name}
                    />
                  ))} */}
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classTloc} onChange={(event) => this.handleChangeClass(event, 'TLOC')} name='classTloc' color="primary" />}
                          label='tloc'
                        /><FormControlLabel
                          control={<Checkbox checked={this.state.classAhf} onChange={(event) => this.handleChangeClass(event, 'AHF')} name='classAhf' color="primary" />}
                          label='ahf'
                        /><FormControlLabel
                          control={<Checkbox checked={this.state.classAif} onChange={(event) => this.handleChangeClass(event, 'AIF')} name='classAif' color="primary" />}
                          label='aif'
                        /><FormControlLabel
                          control={<Checkbox checked={this.state.classAa} onChange={(event) => this.handleChangeClass(event, 'Aa')} name='classAa' color="primary" />}
                          label='aa'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classAd} onChange={(event) => this.handleChangeClass(event, 'Ad')} name='classAd' color="primary" />}
                          label='ad'
                        /><FormControlLabel
                          control={<Checkbox checked={this.state.classAi} onChange={(event) => this.handleChangeClass(event, 'Ai')} name='classAi' color="primary" />}
                          label='ai'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classAit} onChange={(event) => this.handleChangeClass(event, 'Ait')} name='classAit' color="primary" />}
                          label='ait'
                        /><FormControlLabel
                          control={<Checkbox checked={this.state.classAo} onChange={(event) => this.handleChangeClass(event, 'Ao')} name='classAo' color="primary" />}
                          label='ao'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classAv} onChange={(event) => this.handleChangeClass(event, 'Av')} name='classAv' color="primary" />}
                          label='av'
                        /><FormControlLabel
                          control={<Checkbox checked={this.state.classCf} onChange={(event) => this.handleChangeClass(event, 'TLOC')} name='classCf' color="primary" />}
                          label='cf'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classClrci} onChange={(event) => this.handleChangeClass(event, 'ClRCi')} name='classClrci' color="primary" />}
                          label='clrci'
                        /><FormControlLabel
                          control={<Checkbox checked={this.state.classCltci} onChange={(event) => this.handleChangeClass(event, 'ClTCi')} name='classCltci' color="primary" />}
                          label='cltci'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classDit} onChange={(event) => this.handleChangeClass(event, 'DIT')} name='classDit' color="primary" />}
                          label='dit'
                        /><FormControlLabel
                          control={<Checkbox checked={this.state.classHmd} onChange={(event) => this.handleChangeClass(event, 'HMd')} name='classHmd' color="primary" />}
                          label='hmd'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classHmi} onChange={(event) => this.handleChangeClass(event, 'HMi')} name='classHmi' color="primary" />}
                          label='hmi'
                        /><FormControlLabel
                          control={<Checkbox checked={this.state.classLcom} onChange={(event) => this.handleChangeClass(event, 'TLOC')} name='classLcom' color="primary" />}
                          label='lcom'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classMhf} onChange={(event) => this.handleChangeClass(event, 'MHF')} name='classMhf' color="primary" />}
                          label='mhf'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classMif} onChange={(event) => this.handleChangeClass(event, 'MIF')} name='classMif' color="primary" />}
                          label='mif'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classMa} onChange={(event) => this.handleChangeClass(event, 'Ma')} name='classMa' color="primary" />}
                          label='ma'
                        /><FormControlLabel
                          control={<Checkbox checked={this.state.classMd} onChange={(event) => this.handleChangeClass(event, 'Md')} name='classMd' color="primary" />}
                          label='md'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classMi} onChange={(event) => this.handleChangeClass(event, 'Mi')} name='classMi' color="primary" />}
                          label='mi'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classMit} onChange={(event) => this.handleChangeClass(event, 'Mit')} name='classMit' color="primary" />}
                          label='mit'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classMo} onChange={(event) => this.handleChangeClass(event, 'Mo')} name='classMo' color="primary" />}
                          label='mo'
                        /><FormControlLabel
                          control={<Checkbox checked={this.state.classNf} onChange={(event) => this.handleChangeClass(event, 'NF')} name='classNf' color="primary" />}
                          label='nf'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classNmi} onChange={(event) => this.handleChangeClass(event, 'NMI')} name='classNmi' color="primary" />}
                          label='nmi'
                        /><FormControlLabel
                          control={<Checkbox checked={this.state.classNmir} onChange={(event) => this.handleChangeClass(event, 'TLOC')} name='classNmir' color="primary" />}
                          label='nmir'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classNoa} onChange={(event) => this.handleChangeClass(event, 'NOA')} name='classNoa' color="primary" />}
                          label='noa'
                        /><FormControlLabel
                          control={<Checkbox checked={this.state.classNoch} onChange={(event) => this.handleChangeClass(event, 'NOCh')} name='classNoch' color="primary" />}
                          label='noch'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classNod} onChange={(event) => this.handleChangeClass(event, 'NOD')} name='classNod' color="primary" />}
                          label='nod'
                        /><FormControlLabel
                          control={<Checkbox checked={this.state.classNoda} onChange={(event) => this.handleChangeClass(event, 'TLOC')} name='classNoda' color="primary" />}
                          label='noda'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classNode} onChange={(event) => this.handleChangeClass(event, 'TLOC')} name='classNode' color="primary" />}
                          label='node'
                        /><FormControlLabel
                          control={<Checkbox checked={this.state.classNol} onChange={(event) => this.handleChangeClass(event, 'NOL')} name='classNol' color="primary" />}
                          label='nol'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classNopa} onChange={(event) => this.handleChangeClass(event, 'NOPa')} name='classNopa' color="primary" />}
                          label='nopa'
                        /><FormControlLabel
                          control={<Checkbox checked={this.state.classNorm} onChange={(event) => this.handleChangeClass(event, 'NORM')} name='classNorm' color="primary" />}
                          label='norm'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classNpf} onChange={(event) => this.handleChangeClass(event, 'NPF')} name='classNpf' color="primary" />}
                          label='npf'
                        /><FormControlLabel
                          control={<Checkbox checked={this.state.classNpm} onChange={(event) => this.handleChangeClass(event, 'NPM')} name='classNpm' color="primary" />}
                          label='npm'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classNsf} onChange={(event) => this.handleChangeClass(event, 'NSF')} name='classNsf' color="primary" />}
                          label='nsf'
                        /><FormControlLabel
                          control={<Checkbox checked={this.state.classNsm} onChange={(event) => this.handleChangeClass(event, 'NSM')} name='classNsm' color="primary" />}
                          label='nsm'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classPf} onChange={(event) => this.handleChangeClass(event, 'TLOC')} name='classPf' color="primary" />}
                          label='pf'
                        /><FormControlLabel
                          control={<Checkbox checked={this.state.classPmr} onChange={(event) => this.handleChangeClass(event, 'PMR')} name='classPmr' color="primary" />}
                          label='pmr'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classPmd} onChange={(event) => this.handleChangeClass(event, 'PMd')} name='classPmd' color="primary" />}
                          label='pmd'
                        /><FormControlLabel
                          control={<Checkbox checked={this.state.classPmi} onChange={(event) => this.handleChangeClass(event, 'PMi')} name='classPmi' color="primary" />}
                          label='pmi'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classRtloc} onChange={(event) => this.handleChangeClass(event, 'RTLOC')} name='classRtloc' color="primary" />}
                          label='rtloc'
                        /><FormControlLabel
                          control={<Checkbox checked={this.state.classSix} onChange={(event) => this.handleChangeClass(event, 'SIX')} name='classSix' color="primary" />}
                          label='six'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classWmc} onChange={(event) => this.handleChangeClass(event, 'WMC')} name='classWmc' color="primary" />}
                          label='wmc'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classAh} onChange={(event) => this.handleChangeClass(event, 'TLOC')} name='classAh' color="primary" />}
                          label='ah'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.classNf} onChange={(event) => this.handleChangeClass(event, 'NF')} name='classNf' color="primary" />}
                          label='nf'
                        />
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
                        <FormControlLabel
                          control={<Checkbox checked={this.state.methodTloc} onChange={(event) => this.handleChangeMethod(event, 'TLOC')} name='methodTloc' color="primary" />}
                          label='tloc'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.methodCi} onChange={(event) => this.handleChangeMethod(event, 'Ci')} name='methodCi' color="primary" />}
                          label='ci'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.methodDi} onChange={(event) => this.handleChangeMethod(event, 'Di')} name='methodDi' color="primary" />}
                          label='di'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.methodFin} onChange={(event) => this.handleChangeMethod(event, 'Fin')} name='methodFin' color="primary" />}
                          label='fin'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.methodFout} onChange={(event) => this.handleChangeMethod(event, 'Fout')} name='methodFout' color="primary" />}
                          label='fout'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.methodIovars} onChange={(event) => this.handleChangeMethod(event, 'IOVars')} name='methodIovars' color="primary" />}
                          label='iovars'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.methodMclc} onChange={(event) => this.handleChangeMethod(event, 'MCLC')} name='methodMclc' color="primary" />}
                          label='mclc'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.methodNbd} onChange={(event) => this.handleChangeMethod(event, 'NBD')} name='methodNbd' color="primary" />}
                          label='nbd'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.methodNcomp} onChange={(event) => this.handleChangeMethod(event, 'NCOMP')} name='methodNcomp' color="primary" />}
                          label='ncomp'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.methodNop} onChange={(event) => this.handleChangeMethod(event, 'NOP')} name='methodNop' color="primary" />}
                          label='nop'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.methodNvar} onChange={(event) => this.handleChangeMethod(event, 'NVAR')} name='methodNvar' color="primary" />}
                          label='nvar'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.methodSi} onChange={(event) => this.handleChangeMethod(event, 'Si')} name='methodSi' color="primary" />}
                          label='si'
                        />
                        <FormControlLabel
                          control={<Checkbox checked={this.state.methodVg} onChange={(event) => this.handleChangeMethod(event, 'VG')} name='methodVg' color="primary" />}
                          label='vg'
                        />
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



