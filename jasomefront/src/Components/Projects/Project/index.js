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
      ProjectTloc: false,
      PackageTloc: false,
      ClassTloc: false,
      MethodTloc: false,
      PackageA: false,
      PackageCcrc: false,
      data: [],
      //writers = this.props
      //data: [
      //  [{ 'x': 1, 'y': 6 }, { 'x': 2, 'y': 5 }, { 'x': 3, 'y': 18 }, { 'x': 4, 'y': 10 }, { 'x': 5, 'y': 2 }, { 'x': 6, 'y': 24 }, { 'x': 7, 'y': 13 }, { 'x': 8, 'y': 3 }],
      //  [{ 'x': 1, 'y': 7 }, { 'x': 2, 'y': 5 }, { 'x': 3, 'y': 9 }, { 'x': 4, 'y': 5 }, { 'x': 5, 'y': 1 }, { 'x': 6, 'y': 11 }, { 'x': 7, 'y': 8 }, { 'x': 8, 'y': 6 }],
      //  [{ 'x': 1, 'y': 2 }, { 'x': 2, 'y': 3 }, { 'x': 3, 'y': 1 }, { 'x': 4, 'y': 3 }, { 'x': 5, 'y': 0 }, { 'x': 6, 'y': 5 }, { 'x': 7, 'y': 3 }, { 'x': 8, 'y': 3 }],
      //  [{ 'x': 1, 'y': 2 }, { 'x': 2, 'y': 0 }, { 'x': 3, 'y': 2 }, { 'x': 4, 'y': 2 }, { 'x': 5, 'y': 1 }, { 'x': 6, 'y': 2 }, { 'x': 7, 'y': 5 }, { 'x': 8, 'y': 1 }],
      //  [{ 'x': 1, 'y': 0 }, { 'x': 2, 'y': 0 }, { 'x': 3, 'y': 0 }, { 'x': 4, 'y': 0 }, { 'x': 5, 'y': 1 }, { 'x': 6, 'y': 1 }, { 'x': 7, 'y': 0 }, { 'x': 8, 'y': 1 }]
     // ]
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

  limparChart = () => {   
    const data = [];
    this.setState({ data });
  }


  handleClick = event => this.setState({ anchorE1: event.currentTarget })

  handleClose = () => this.setState({ anchorE1: null })

  handleClickPackage = event => this.setState({ anchorE2: event.currentTarget })

  handleClosePackage = () => this.setState({ anchorE2: null })

  handleClickClass = event => this.setState({ anchorE3: event.currentTarget })

  handleCloseClass = () => this.setState({ anchorE3: null })

  handleClickMethod = event => this.setState({ anchorE4: event.currentTarget })

  handleCloseMethod = () => this.setState({ anchorE4: null })

  handleChangeProject = (event) => {
    this.setState({ ...this.state, [event.target.name]: event.target.checked });
    if (event.target.checked === true) {
      axios.get(`http://localhost:56875/JasomeWeb/webresources/jasome/metric/version/` + this.props.nameProject.name)
        .then(res => {
          const data = res.data;
          this.setState({ data });
        })
    }
  };

  handleChangePackage = (event) => {
    this.setState({ ...this.state, [event.target.name]: event.target.checked });
    if (event.target.checked === true) {
      axios.get(`http://localhost:56875/JasomeWeb/webresources/jasome/metric/package/` + this.props.nameProject.name)
        .then(res => {
          const data = res.data;
          this.setState({ data });
         // console.log(data)
        })
    }
    else if (event.target.checked === false) {

      const data = [];
      this.setState({ data });
      //console.log(data);
    }

  };

  render() {
    const { anchorE1 } = this.state
    const { anchorE2 } = this.state
    const { anchorE3 } = this.state
    const { anchorE4 } = this.state

    const projectTloc = this.state

    return (
      <div>
        <div>
          <Grid container spacing={10}>
            <Grid item xs={2}>
              <Button aria-controls="fade-menu" variant="contained" color="primary" aria-haspopup="true" onClick={this.handleClick}>
                Project Metrics
              </Button>
              <Menu
                id="fade-menu"
                anchorEl={anchorE1}
                keepMounted
                open={Boolean(anchorE1)}
                onClose={this.handleClose}
                TransitionComponent={Fade}
              >
                <FormGroup>
                  <FormControlLabel
                    control={<Checkbox checked={this.state.ProjectTloc} onChange={this.handleChangeProject} name="ProjectTloc" color="primary" />}
                    label="tloc"
                  />
                </FormGroup>
              </Menu>
            </Grid>
            <Grid item xs={2}>
              <Button aria-controls="fade-menu" variant="contained" color="primary" aria-haspopup="true" onClick={this.handleClickPackage}>
                Package Metrics
              </Button>
              <Menu
                id="fade-menu"
                anchorEl={anchorE2}
                keepMounted
                open={Boolean(anchorE2)}
                onClose={this.handleClosePackage}
                TransitionComponent={Fade}
              >
                <FormGroup>
                  <FormControlLabel
                    control={<Checkbox checked={this.state.PackageTloc} onChange={this.handleChangePackage} name="PackageTloc" color="primary" />}
                    label="tloc"
                  />
                  <FormControlLabel
                    control={<Checkbox checked={this.state.PackageA} onChange={this.handleChange} name="PackageA" color="primary" />}
                    label="a"
                  />
                  <FormControlLabel
                    control={<Checkbox checked={this.state.PackageCcrc} onChange={this.handleChange} name="PackageCcrc" color="primary" />}
                    label="ccrc"
                  />
                </FormGroup>
              </Menu>
            </Grid>
            <Grid item xs={2}>
              <Button aria-controls="fade-menu" variant="contained" color="primary" aria-haspopup="true" onClick={this.handleClickClass}>
                Class Metrics
              </Button>
              <Menu
                id="fade-menu"
                anchorEl={anchorE3}
                keepMounted
                open={Boolean(anchorE3)}
                onClose={this.handleCloseClass}
                TransitionComponent={Fade}
              >
                <FormGroup>
                  <FormControlLabel
                    control={<Checkbox checked={this.state.ClassTloc} onChange={this.handleChange} name="ClassTloc" color="primary" />}
                    label="tloc"
                  />

                </FormGroup>
              </Menu>
            </Grid>
            <Grid item xs={2}>
              <Button aria-controls="fade-menu" variant="contained" color="primary" aria-haspopup="true" onClick={this.handleClickMethod}>
                Method Metrics
              </Button>
              <Menu
                id="fade-menu"
                anchorEl={anchorE4}
                keepMounted
                open={Boolean(anchorE4)}
                onClose={this.handleCloseMethod}
                TransitionComponent={Fade}
              >
                <FormGroup>
                  <FormControlLabel
                    control={<Checkbox checked={this.state.MethodTloc} onChange={this.handleChange} name="MethodTloc" color="primary" />}
                    label="tloc"
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



