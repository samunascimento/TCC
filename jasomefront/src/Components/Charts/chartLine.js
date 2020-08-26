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
          VictoryScatter } from 'victory'

import { PropTypes } from 'prop-types';

const VictoryZoomVoronoiContainer = createContainer("zoom", "voronoi");



class ChartLine extends Component {

  constructor(props) {
    super(props);
    this.state = {
      data: this.props.data,
      colors: this.props.colors,
      zoomDomain: { x: [0, this.props.data.map(
        (dataset) => Math.max(...dataset.map((d) => d.x))
      )]},
      metric: false,
      maximaY : this.props.data.map(
        (dataset) => Math.max(...dataset.map((d) => d.y))
      ),
      maximaX : this.props.data.map(
        (dataset) => Math.max(...dataset.map((d) => d.x))
      )
    };
  }

  componentDidUpdate(prevProps, prevState) {
    if (this.props.data !== prevState.data) {
      this.setState({ data: this.props.data })
      this.setState({maximaX: this.state.data.map(
        (dataset) => Math.max(...dataset.map((d) => d.x))
      )})
      this.setState({maximaY: this.state.data.map(
        (dataset) => Math.max(...dataset.map((d) => d.y))
      )})
      console.log(this.state.maximaX[0])
      console.log(this.state.maximaY[0])
    }
  }

  handleZoom(domain) {
    this.setState({ zoomDomain: domain });
  }

  render() {
    return (
      <div>
        <VictoryChart
          //domain={{ x: [0,this.state.maximaX[0]], y: [0, this.state.maximaY[0]] }}
          theme={VictoryTheme.material}
          width={1350} height={800}
          containerComponent={
            <VictoryZoomVoronoiContainer
                  zoomDomain={this.state.zoomDomain} //add
                  responsive={true}
                  //labels={({ datum }) => `(${datum.x},${datum.y})` }
                  onZoomDomainChange={this.handleZoom.bind(this)} //add
                  // labelComponent={
                  //   <VictoryTooltip
                  //     style={{ fontSize: 13 }}
                  //   />
                  // }
            />
          }
                >
        {this.state.data.map((d, i) => (
                  <VictoryScatter
                  style={this.state.colors[i] }
                  size={4}
                  data={d}
                  labels={({ datum }) => `(${datum.x},${datum.y})` }
                />   
                  ))}
          
          {this.state.data.map((d, i) => (
            <VictoryLine
              key={i}
              data={d}
              style={{
                data: {
                  stroke: this.state.colors[i]
                }
              }}
            >
            </VictoryLine>
            
          ))}
        </VictoryChart>

        {/* Mini gráfico */}
        <VictoryChart
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