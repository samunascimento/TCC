import React, { Component } from 'react';
import {
  VictoryChart,
  VictoryZoomContainer,
  VictoryLine,
  VictoryBrushContainer,
  VictoryAxis,
  VictoryTheme,
  VictoryTooltip,
  VictoryVoronoiContainer,
  createContainer,
  VictoryScatter
} from 'victory'

import { PropTypes } from 'prop-types';

const VictoryZoomVoronoiContainer = createContainer("zoom", "voronoi");



class ChartLine extends Component {

  constructor(props) {
    super(props); //depreciado...
    this.state = {
      data: [],
      colors: this.props.colors,
      zoomDomain: { x: [new Date(1990, 1, 1), new Date(2009, 1, 1)] },
      // zoomDomain: {
      //   x: [1, this.props.data.map(
      //     (dataset) => Math.max(...dataset.map((d) => d.x))
      //   )]
      // },
      metric: false,
      maximaY: this.props.maximaY,
      nameX: ""
    };
  }

  // componentDidMount(){
  //   console.log('imprimindo data')
  //   console.log(this.props.data)
  //   this.setState({ data: this.props.data })

  //   this.setState({
  //     zoomDomain: {
  //       x: [1, this.props.data.map(
  //         (dataset) => Math.max(...dataset.map((d) => d.x))
  //       )]
  //     }
  //   })

  //   console.log('zoomDomain')
  //   console.log(this.state.zoomDomain)

  //   this.setState({
  //     maximaX: this.state.data.map(
  //       (dataset) => Math.max(...dataset.map((d) => d.x))
  //     )
  //   })
  //   this.setState({
  //     maximaY: this.state.data.map(
  //       (dataset) => Math.max(...dataset.map((d) => d.y))
  //     )
  //   })
  //   console.log('imprimindo maximaY')
  //   console.log(this.state.maximaY)
  // }
  
  componentDidUpdate(prevProps,prevState) {

    if (this.props.data !== prevState.data) {
      this.setState({ data: this.props.data })

      this.setState({
        zoomDomain: { x: [new Date(2019, 1, 1), new Date(2021, 1, 1)] },
      })

      // this.setState({
      //   zoomDomain: {
      //     x: [1, this.props.data.map(
      //       (dataset) => Math.max(...dataset.map((d) => d.x))
      //     )]
      //   }
      // })


      this.setState({
        maximaX: this.state.data.map(
          (dataset) => Math.max(...dataset.map((d) => d.x))
        )
      })
      this.setState({
        maximaY: this.state.data.map(
          (dataset) => Math.max(...dataset.map((d) => d.y))
        )
      })

    }
  }

  handleZoom(domain) {
    this.setState({ zoomDomain: domain });
  }

  handleSwitch() {
    if (this.props.switch) {
      return "x"
    } else {
      return "dateString"
    }
  }

  render() {
    {console.log(this.props.data)}
    return (
      <div>
        <VictoryChart
          minDomain={{ x: 1 }}
          minDomain={{ y: 0 }}
          maxDomain={{ y: (this.props.maximaY * 1.1)}}
          theme={VictoryTheme.material}
          width={1350} height={800}
          containerComponent={
            <VictoryZoomVoronoiContainer
              zoomDomain={this.state.zoomDomain} //add
              responsive={true}
              labels={({ datum }) => `(x : ${datum.x}, y: ${datum.y}) \n sha: ${datum.sha}`}
              onZoomDomainChange={this.handleZoom.bind(this)} //add
            />
          }
        >
          {/* {this.state.data.map((d, i) => (
                  <VictoryScatter
                  style={this.state.colors[i] }
                  size={4}
                  data={d}
                  labels={({ datum }) => `(${datum.x},${datum.y})` }
                />   
                  ))} */}
          {this.props.data.map((d, i) => (
            <VictoryLine
              key={i}
              data={d}
              style={{
                data: {
                  stroke: this.props.colors[i].color
                }
              }}
              x={this.handleSwitch()}
              y="y"
            >
            </VictoryLine>

          ))}
        </VictoryChart>

        {/* Mini gráfico */}
        <VictoryChart
          // domain={{ x: [1,this.props.data.map(
          //   (dataset) => Math.max(...dataset.map((d) => d.x))
          // )]}}
          minDomain={{ x: 1 }}
          minDomain={{ y: 0 }}
          maxDomain={{ y: (this.props.maximaY * 1.1) }}
          padding={{ top: 0, left: 50, right: 50, bottom: 30 }}
          width={1350} height={150} //scale={{ x: "time" }}
          containerComponent={
            <VictoryBrushContainer
              brushDimension="x"
              brushDomain={this.state.zoomDomain}
              onBrushDomainChange={this.handleZoom.bind(this)}
            />
          }
        >
          <VictoryAxis
          //tickFormat={[0,this.state.maximaX[0]]}
          />
          {this.state.data.map((d, i) => (
            <VictoryLine
              key={i}
              data={d}
              style={{
                data: {
                  stroke: this.props.colors[i].color
                }
              }}
              x={this.handleSwitch()}
              y="y"
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