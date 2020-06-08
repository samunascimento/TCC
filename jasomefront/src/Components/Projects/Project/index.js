import React , { Component } from 'react'
import Button from '@material-ui/core/Button';
import Menu from '@material-ui/core/Menu';
import MenuItem from '@material-ui/core/MenuItem';
import Fade from '@material-ui/core/Fade';
import Checkbox from '@material-ui/core/Checkbox';
import FormGroup from '@material-ui/core/FormGroup';
import FormControlLabel from '@material-ui/core/FormControlLabel';
import BarChart from './../../Charts/chart';
import axios from 'axios';

import Grid from '@material-ui/core/Grid';
class Project extends Component {
  constructor(props){
    super(props);
    this.state = {
      data: []
      // data:[
      //   [{'x':1,'y':6},{'x':2,'y':5},{'x':3,'y':18},{'x':4,'y':10},{'x':5,'y':2},{'x':6,'y':24},{'x':7,'y':13},{'x':8,'y':3}],
      //   [{'x':1,'y':7},{'x':2,'y':5},{'x':3,'y':9},{'x':4,'y':5},{'x':5,'y':1},{'x':6,'y':11},{'x':7,'y':8},{'x':8,'y':6}],
      //   [{'x':1,'y':2},{'x':2,'y':3},{'x':3,'y':1},{'x':4,'y':3},{'x':5,'y':0},{'x':6,'y':5},{'x':7,'y':3},{'x':8,'y':3}],
      //   [{'x':1,'y':2},{'x':2,'y':0},{'x':3,'y':2},{'x':4,'y':2},{'x':5,'y':1},{'x':6,'y':2},{'x':7,'y':5},{'x':8,'y':1}],
      //   [{'x':1,'y':0},{'x':2,'y':0},{'x':3,'y':0},{'x':4,'y':0},{'x':5,'y':1},{'x':6,'y':1},{'x':7,'y':0},{'x':8,'y':1}]
      // ]
    }
  };

  componentDidMount(){
    axios.get(`http://localhost:8080/JasomeWeb/webresources/jasome/metric/package/CalculadoraJava`)
    .then(res => {
      const data = res.data;
      this.setState({data});
      this.setState({ data });
    })
  }

  render(){
    return (
      <div>
        <div>
          <h1>GRÁFICO</h1>
          <div className="App">
              <BarChart width={600} height={400} data={this.state.data} />
          </div>
        </div>
      </div>
    );
  }
}

export default Project;