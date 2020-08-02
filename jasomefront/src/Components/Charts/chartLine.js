import React, { Component } from 'react';
import {
          VictoryChart,
          VictoryZoomContainer,
          VictoryLine,
          VictoryBrushContainer,
          VictoryAxis,
          VictoryTheme,
          VictoryTooltip,
          VictoryVoronoiContainer } from 'victory'

import { PropTypes } from 'prop-types';
/*
  Line 21:12:  'VictoryChart' is not defined           react/jsx-no-undef
  Line 26:16:  'VictoryZoomContainer' is not defined   react/jsx-no-undef
  Line 33:14:  'VictoryLine' is not defined            react/jsx-no-undef
  Line 51:12:  'VictoryChart' is not defined           react/jsx-no-undef
  Line 57:16:  'VictoryBrushContainer' is not defined  react/jsx-no-undef
  Line 64:14:  'VictoryAxis' is not defined            react/jsx-no-undef
  Line 76:14:  'VictoryLine' is not defined            react/jsx-no-undef*/

// const data = [
//   [
//     {
//       "x": 0,
//       "y": 42.0,
//       "metricName": "TLOC",
//       "versionDate": "Jan 31, 2020 11:58:48 PM"
//     },
//     {
//       "x": 1,
//       "y": 173.0,
//       "metricName": "TLOC",
//       "versionDate": "Feb 1, 2020 2:00:26 AM"
//     },
//     {
//       "x": 2,
//       "y": 272.0,
//       "metricName": "TLOC",
//       "versionDate": "Feb 1, 2020 3:57:13 AM"
//     },
//     {
//       "x": 3,
//       "y": 270.0,
//       "metricName": "TLOC",
//       "versionDate": "Feb 1, 2020 4:51:56 AM"
//     }
//   ]
// ]
//   // find maxima for normalizing data


function aleatorio(inferior,superior){
  let numPossibilidades = superior - inferior
  let aleat = Math.random() * numPossibilidades
  aleat = Math.floor(aleat)
  return parseInt(inferior) + aleat
}

function gerarCor(){
  let hexadecimal = new Array("0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F")
  let cor_aleatoria = "#";
  for (let i=0;i<6;i++){
     let posarray = aleatorio(0,hexadecimal.length)
     cor_aleatoria += hexadecimal[posarray]
  }
  return cor_aleatoria
}

const colors = [];

for (let index = 0; index < 200; index++) {
  colors[index] = gerarCor()
}

class ChartLine extends Component {

  constructor(props) {
    super(props);
    this.state = {
      data: this.props.data,
      zoomDomain: { x: [0, this.props.data.map(
        (dataset) => Math.max(...dataset.map((d) => d.x))
      )]},
      // data:[
      //   [{ x: 1, y: 1 }, { x: 2, y: 2 }, { x: 3, y: 3 }, { x: 4, y: 4 }],
      //   [{ x: 1, y: 400 }, { x: 2, y: 350 }, { x: 3, y: 300 }, { x: 4, y: 250 }],
      //   [{ x: 1, y: 75 }, { x: 2, y: 85 }, { x: 3, y: 95 }, { x: 4, y: 100 }]
      // ],
      metric: false,
      maximaY : this.props.data.map(
        (dataset) => Math.max(...dataset.map((d) => d.y))
      ),
      maximaX : this.props.data.map(
        (dataset) => Math.max(...dataset.map((d) => d.x))
      )
    };

    console.log(this.state.data)

    // this.xOffsets = [50, 200, 350];
    // this.tickPadding = [0, 0, -15];
    // this.anchors = ["end", "end", "start"];
    // this.colors = ["black", "red", "blue", "orange"];
  }

  componentDidUpdate(prevProps, prevState) {
    // Uso típico, (não esqueça de comparar as props):
    if (this.props.data !== prevState.data) {
      this.setState({ data: this.props.data })
      console.log(this.state.data)
    }
  }

//   aleatorio(inferior,superior){
//     let numPossibilidades = superior - inferior
//     let aleat = Math.random() * numPossibilidades
//     aleat = Math.floor(aleat)
//     return parseInt(inferior) + aleat
//  }

//   gerarCor(){
//     let hexadecimal = new Array("0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F")
//     let cor_aleatoria = "#";
//     for (let i=0;i<6;i++){
//        let posarray = this.aleatorio(0,hexadecimal.length)
//        cor_aleatoria += hexadecimal[posarray]
//     }
//     return cor_aleatoria
//  }


  handleZoom(domain) {
    this.setState({ zoomDomain: domain });
  }

  // handleBrush(domain) {
  //   this.setState({ zoomDomain: domain });
  // }

  render() {
    return (
      <div>
        <VictoryChart
          //domain={{ x: [0,800], y: [0, 100] }}
          theme={VictoryTheme.material}
          width={1350} height={850}
          // containerComponent=
          // {
          //   <VictoryVoronoiContainer/>
          // }
          containerComponent={
            <VictoryZoomContainer
              //zoomDimension="x"
              zoomDomain={this.state.zoomDomain} //add
              responsive={true}
              onZoomDomainChange={this.handleZoom.bind(this)} //add
              //zoomDomain={{ x: [0, 8], y: [0, 500] }} //removido
              />
          }
        >
          {this.state.data.map((d, i) => (
            <VictoryLine
              key={i}
              data={d}
              //labels={({ datum }) => datum.y}
              labelComponent={
                <VictoryTooltip
                  style={ {fontSize: 10 }}
                />
              }
              style={{
                data: {
                  stroke: colors[i]
                }
              }}
          //     containerComponent={
          //   <VictoryZoomContainer
          //     responsive={true}
          //     zoomDomain={{ x: [0, 8], y: [0, 500] }} />
          // }
            >
            </VictoryLine>
          ))}
        </VictoryChart>

        {/* Mini gráfico */}
        <VictoryChart
        padding={{ top: 0, left: 50, right: 50, bottom: 30 }}
        width={600} height={100} //scale={{ x: "time" }}
        containerComponent={
          <VictoryBrushContainer
            brushDimension="x"
            brushDomain={this.state.zoomDomain}
            onBrushDomainChange={this.handleZoom.bind(this)}
          />
        }
        >
        <VictoryAxis
          tickFormat={[0,this.state.maximaX]}
        />
        {this.state.data.map((d, i) => (
            <VictoryLine
              key={i}
              data={d}
              labels={({ datum }) => datum.y}
              labelComponent={
                <VictoryTooltip
                  style={{ fontSize: 10 }}
                />
              }
            >
            </VictoryLine>
          ))}
        </VictoryChart>

      
      </div>
    );
  }
}

export default ChartLine;

ChartLine.propTypes = {
  data: PropTypes.arrayOf(PropTypes.shape({
    x: PropTypes.number,
    y: PropTypes.number,
    name: PropTypes.string,
    versionDate: PropTypes.string
  })),
}