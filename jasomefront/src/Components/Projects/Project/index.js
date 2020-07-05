import React, { Component, Fragment, useState } from 'react'
import Button from '@material-ui/core/Button';
import Menu from '@material-ui/core/Menu';
import MenuItem from '@material-ui/core/MenuItem';
import Fade from '@material-ui/core/Fade';
import Checkbox from '@material-ui/core/Checkbox';
import FormGroup from '@material-ui/core/FormGroup';
import FormControlLabel from '@material-ui/core/FormControlLabel';
import Chart from './../../Charts/chart';
import axios from 'axios';
import Grid from '@material-ui/core/Grid';
import IconButton from '@material-ui/core/IconButton';
import MoreVertIcon from '@material-ui/icons/MoreVert';
import MenuList from '@material-ui/core/MenuList';
import { forceCenter } from 'd3';

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

      projectTloc: false,

      packageTloc: false, packageA: false, packageCcrc: false, packageCa: false, packageCe: false, packageDms: false, packageI: false, packageNoc: false, packageNoi: false, packagePkgRCi: false, packagepkgTCi: false,

      // packageMetrics: [{ tloc:false}, { a: false}, { ccrc: false},
      // { checked: false, name: 'dms', namechecked: 'checked' }, { checked: false, name: 'i', namechecked: 'checked' }, { checked: false, name: 'noc', namechecked: 'checked' }, { checked: false, name: 'noi', namechecked: 'checked' }, { checked: false, name: 'pkgRCi', namechecked: 'checked' },
      // { checked: false, name: 'pkgTCi', namechecked: 'checked' }],
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

      transition: 0,
      maxHeight: 192,
      data: [],

    }

  };




  // componentDidMount = () => {
  //  if (this.state.ProjectTloc === false) {
  //    axios.get(`http://localhost:56875/JasomeWeb/webresources/jasome/metric/version/` + this.props.nameProject.name)
  //      .then(res => {
  //        const data = res.data;
  //        this.setState({ data });
  //      })
  //  }
  //}


  handleClick = event => this.setState({ anchorE1: event.currentTarget })

  handleClose = () => this.setState({ anchorE1: null })

  handleClickPackage = event => this.setState({ anchorE2: event.currentTarget })

  handleClosePackage = () => this.setState({ anchorE2: null })

  handleClickClass = event => this.setState({ anchorE3: event.currentTarget })

  handleCloseClass = () => this.setState({ anchorE3: null })

  handleClickMethod = event => this.setState({ anchorE4: event.currentTarget })

  handleCloseMethod = () => this.setState({ anchorE4: null })

  // limparChart = () => {
  //   const data = [];
  //   this.setState({ data });
  //   this.state.ProjectTloc = false;
  //   this.state.packageMetrics.forEach((metric) => (
  //     console.log(metric.state)
  //   ));
  // }

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

  handleChangePackage = (event, metricName) => {
    this.setState({ ...this.state, [event.target.name]: event.target.checked });


    if (event.target.checked === true) {
      const data = [];
      axios.get(`http://localhost:56875/JasomeWeb/webresources/jasome/metric/package/` + this.props.nameProject.name)
        .then(res => {
          let metricCheck = false
          const data = []
          const packagePoints = res.data;
          packagePoints.map((metrics) => {
            metrics.map((metric, index) => {             
                if((metric !== null) && (metric.metricName === metricName)) {
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
    else if(event.target.checked === false) {

  const data = [];
  this.setState({ data });

}
  };

handleChangeClass = (event) => {
  this.setState({ ...this.state, [event.target.name]: event.target.checked });


  if (event.target.checked === true) {
    axios.get(`http://localhost:56875/JasomeWeb/webresources/jasome/metric/class/` + this.props.nameProject.name)
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

handleChangeMethod = (event) => {
  this.setState({ ...this.state, [event.target.name]: event.target.checked });
  if (event.target.checked === true) {
    axios.get(`http://localhost:56875/JasomeWeb/webresources/jasome/metric/method/` + this.props.nameProject.name)
      .then(res => {
        const data = res.data;
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
                vertical: 150,
                horizontal: 'left',
              }}
              PaperProps={{
                style: {
                  maxHeight: maxHeight,
                  width: 200,
                },
              }}
            >
              <FormGroup>
                <FormControlLabel
                  control={<Checkbox checked={this.state.packageTloc} onChange={(event) => this.handleChangePackage(event, 'TLOC')} name='packageTloc' color="primary" />}
                  label='tloc'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.packageA} onChange={(event) => this.handleChangePackage(event, 'A')} name='packageA' color="primary" />}
                  label='a'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.packageCcrc} onChange={(event) => this.handleChangePackage(event, 'CCRC')} name='packageCcrc' color="primary" />}
                  label='ccrc'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.packageCa} onChange={(event) => this.handleChangePackage(event, 'Ca')} name='packageCa' color="primary" />}
                  label='ca'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.packageCe} onChange={(event) => this.handleChangePackage(event, 'Ce')} name='packageCe' color="primary" />}
                  label='ce'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.packagedms} onChange={(event) => this.handleChangePackage(event, 'DMS')} name='packageDms' color="primary" />}
                  label='dms'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.packageI} onChange={(event) => this.handleChangePackage(event, 'I')} name='packageI' color="primary" />}
                  label='i'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.packageNoc} onChange={(event) => this.handleChangePackage(event, 'NOC')} name='packageNoc' color="primary" />}
                  label='noc'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.packagePkgRCi} onChange={(event) => this.handleChangePackage(event, 'PkgRCi')} name='packagePkgRCi' color="primary" />}
                  label='pkgrci'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.packagePkgTCi} onChange={(event) => this.handleChangePackage(event, 'PkgTCi')} name='packagePkgTCi' color="primary" />}
                  label='pkgtci'
                />
              </FormGroup>
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
                vertical: 1000,
                horizontal: 'left',
              }}
              PaperProps={{
                style: {
                  maxHeight: maxHeight,
                  width: '20ch',
                },
              }}
            >
              <FormGroup>
                {/* {classMetrics.map((metric) => (
                    <FormControlLabel
                      control={<Checkbox checked={metric.checked} onChange={this.handleChangeClass} name={metric.name} color="primary" />}
                      label={metric.name}
                    />
                  ))} */}
                <FormControlLabel
                  control={<Checkbox checked={this.state.classTloc} onChange={this.handleChangeClass} name='classTloc' color="primary" />}
                  label='tloc'
                /><FormControlLabel
                  control={<Checkbox checked={this.state.classAhf} onChange={this.handleChangeClass} name='classAhf' color="primary" />}
                  label='ahf'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classAif} onChange={this.handleChangeClass} name='classAif' color="primary" />}
                  label='aif'
                /><FormControlLabel
                  control={<Checkbox checked={this.state.classAa} onChange={this.handleChangeClass} name='classAa' color="primary" />}
                  label='aa'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classAd} onChange={this.handleChangeClass} name='classAd' color="primary" />}
                  label='ad'
                /><FormControlLabel
                  control={<Checkbox checked={this.state.classAi} onChange={this.handleChangeClass} name='classAi' color="primary" />}
                  label='ai'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classAit} onChange={this.handleChangeClass} name='classAit' color="primary" />}
                  label='ait'
                /><FormControlLabel
                  control={<Checkbox checked={this.state.classAo} onChange={this.handleChangeClass} name='classAo' color="primary" />}
                  label='ao'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classAv} onChange={this.handleChangeClass} name='classAv' color="primary" />}
                  label='av'
                /><FormControlLabel
                  control={<Checkbox checked={this.state.classCf} onChange={this.handleChangeClass} name='classCf' color="primary" />}
                  label='cf'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classClrci} onChange={this.handleChangeClass} name='classClrci' color="primary" />}
                  label='clrci'
                /><FormControlLabel
                  control={<Checkbox checked={this.state.classCltci} onChange={this.handleChangeClass} name='classCltci' color="primary" />}
                  label='cltci'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classDit} onChange={this.handleChangeClass} name='classDit' color="primary" />}
                  label='dit'
                /><FormControlLabel
                  control={<Checkbox checked={this.state.classHmd} onChange={this.handleChangeClass} name='classHmd' color="primary" />}
                  label='hmd'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classHmi} onChange={this.handleChangeClass} name='classHmi' color="primary" />}
                  label='hmi'
                /><FormControlLabel
                  control={<Checkbox checked={this.state.classLcom} onChange={this.handleChangeClass} name='classLcom' color="primary" />}
                  label='lcom'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classMhf} onChange={this.handleChangeClass} name='classMhf' color="primary" />}
                  label='mhf'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classMif} onChange={this.handleChangeClass} name='classMif' color="primary" />}
                  label='mif'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classMa} onChange={this.handleChangeClass} name='classMa' color="primary" />}
                  label='ma'
                /><FormControlLabel
                  control={<Checkbox checked={this.state.classMd} onChange={this.handleChangeClass} name='classMd' color="primary" />}
                  label='md'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classMi} onChange={this.handleChangeClass} name='classMi' color="primary" />}
                  label='mi'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classMit} onChange={this.handleChangeClass} name='classMit' color="primary" />}
                  label='mit'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classMo} onChange={this.handleChangeClass} name='classMo' color="primary" />}
                  label='mo'
                /><FormControlLabel
                  control={<Checkbox checked={this.state.classNf} onChange={this.handleChangeClass} name='classNf' color="primary" />}
                  label='nf'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classNmi} onChange={this.handleChangeClass} name='classNmi' color="primary" />}
                  label='nmi'
                /><FormControlLabel
                  control={<Checkbox checked={this.state.classNmir} onChange={this.handleChangeClass} name='classNmir' color="primary" />}
                  label='nmir'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classNoa} onChange={this.handleChangeClass} name='classNoa' color="primary" />}
                  label='noa'
                /><FormControlLabel
                  control={<Checkbox checked={this.state.classNoch} onChange={this.handleChangeClass} name='classNoch' color="primary" />}
                  label='noch'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classNod} onChange={this.handleChangeClass} name='classNod' color="primary" />}
                  label='nod'
                /><FormControlLabel
                  control={<Checkbox checked={this.state.classNoda} onChange={this.handleChangeClass} name='classNoda' color="primary" />}
                  label='noda'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classNode} onChange={this.handleChangeClass} name='classNode' color="primary" />}
                  label='node'
                /><FormControlLabel
                  control={<Checkbox checked={this.state.classNol} onChange={this.handleChangeClass} name='classNol' color="primary" />}
                  label='nol'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classNopa} onChange={this.handleChangeClass} name='classNopa' color="primary" />}
                  label='nopa'
                /><FormControlLabel
                  control={<Checkbox checked={this.state.classNorm} onChange={this.handleChangeClass} name='classNorm' color="primary" />}
                  label='norm'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classNpf} onChange={this.handleChangeClass} name='classNpf' color="primary" />}
                  label='npf'
                /><FormControlLabel
                  control={<Checkbox checked={this.state.classNpm} onChange={this.handleChangeClass} name='classNpm' color="primary" />}
                  label='npm'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classNsf} onChange={this.handleChangeClass} name='classNsf' color="primary" />}
                  label='nsf'
                /><FormControlLabel
                  control={<Checkbox checked={this.state.classNsm} onChange={this.handleChangeClass} name='classNsm' color="primary" />}
                  label='nsm'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classPf} onChange={this.handleChangeClass} name='classPf' color="primary" />}
                  label='pf'
                /><FormControlLabel
                  control={<Checkbox checked={this.state.classPmr} onChange={this.handleChangeClass} name='classPmr' color="primary" />}
                  label='pmr'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classPmd} onChange={this.handleChangeClass} name='classPmd' color="primary" />}
                  label='pmd'
                /><FormControlLabel
                  control={<Checkbox checked={this.state.classPmi} onChange={this.handleChangeClass} name='classPmi' color="primary" />}
                  label='pmi'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classRtloc} onChange={this.handleChangeClass} name='classRtloc' color="primary" />}
                  label='rtloc'
                /><FormControlLabel
                  control={<Checkbox checked={this.state.classSix} onChange={this.handleChangeClass} name='classSix' color="primary" />}
                  label='six'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classWmc} onChange={this.handleChangeClass} name='classWmc' color="primary" />}
                  label='wmc'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classAh} onChange={this.handleChangeClass} name='classAh' color="primary" />}
                  label='ah'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.classNf} onChange={this.handleChangeClass} name='classNf' color="primary" />}
                  label='nf'
                />
              </FormGroup>
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
                vertical: 200,
                horizontal: 'left',
              }}
              PaperProps={{
                style: {
                  maxHeight: maxHeight,
                  width: '20ch',
                },
              }}
            >
              <FormGroup>
                <FormControlLabel
                  control={<Checkbox checked={this.state.methodTloc} onChange={this.handleChangeMethod} name='methodTloc' color="primary" />}
                  label='tloc'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.methodCi} onChange={this.handleChangeMethod} name='methodCi' color="primary" />}
                  label='ci'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.methodDi} onChange={this.handleChangeMethod} name='methodDi' color="primary" />}
                  label='di'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.methodFin} onChange={this.handleChangeMethod} name='methodFin' color="primary" />}
                  label='fin'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.methodFout} onChange={this.handleChangeMethod} name='methodFout' color="primary" />}
                  label='fout'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.methodIovars} onChange={this.handleChangeMethod} name='methodIovars' color="primary" />}
                  label='iovars'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.methodMclc} onChange={this.handleChangeMethod} name='methodMclc' color="primary" />}
                  label='mclc'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.methodNbd} onChange={this.handleChangeMethod} name='methodNbd' color="primary" />}
                  label='nbd'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.methodNcomp} onChange={this.handleChangeMethod} name='methodNcomp' color="primary" />}
                  label='ncomp'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.methodNop} onChange={this.handleChangeMethod} name='methodNop' color="primary" />}
                  label='nop'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.methodNvar} onChange={this.handleChangeMethod} name='methodNvar' color="primary" />}
                  label='nvar'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.methodSi} onChange={this.handleChangeMethod} name='methodSi' color="primary" />}
                  label='si'
                />
                <FormControlLabel
                  control={<Checkbox checked={this.state.methodVg} onChange={this.handleChangeMethod} name='methodVg' color="primary" />}
                  label='vg'
                />
              </FormGroup>
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



