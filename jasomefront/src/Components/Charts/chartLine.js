import React, { Component} from 'react';
import {VictoryChart,VictoryZoomContainer,VictoryLine,VictoryBrushContainer,VictoryAxis,VictoryTheme} from 'victory'

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

 class ChartLine extends Component {

  constructor(props) {
    super(props);
    this.state = {
        data : this.props.data,
        // data:[
        //   [{ x: 1, y: 1 }, { x: 2, y: 2 }, { x: 3, y: 3 }, { x: 4, y: 4 }],
        //   [{ x: 1, y: 400 }, { x: 2, y: 350 }, { x: 3, y: 300 }, { x: 4, y: 250 }],
        //   [{ x: 1, y: 75 }, { x: 2, y: 85 }, { x: 3, y: 95 }, { x: 4, y: 100 }]
        // ],
        metric : false
    };

    console.log(this.state.data)


    this.maxima = this.state.data.map(
        (dataset) => Math.max(...dataset.map((d) => d.y))
      );
    this.xOffsets = [50, 200, 350];
    this.tickPadding = [ 0, 0, -15 ];
    this.anchors = ["end", "end", "start"];
    this.colors = ["black", "red", "blue"];
  }

  componentDidUpdate(prevProps, prevState) {
    // Uso típico, (não esqueça de comparar as props):
    if (this.props.data !== prevState.data) {
      this.setState({data: this.props.data})
      this.setState({cont: this.state.cont + 1}) 
      this.setState({metric: true})
      console.log(this.state.data)
    }
  }


  handleZoom(domain) {
    this.setState({selectedDomain: domain});
  }

  handleBrush(domain) {
    this.setState({zoomDomain: domain});
  }

  render() {
    // if (!this.state.metric) {
    //   return <span>Loading...</span>;
  // }
    return (
      <div>
        <VictoryChart
          theme={VictoryTheme.material}
          width={600} height={600}
          domain={{ y: [0, 1] }}
          animate={{
            duration: 1000,
            onLoad: { duration: 100 }
          }}
          containerComponent={
            <VictoryZoomContainer responsive={false}
              zoomDimension="x"
              zoomDomain={this.state.zoomDomain}
              onZoomDomainChange={this.handleZoom.bind(this)}
            />
          }
        >
         <VictoryAxis />
          {this.state.data.map((d, i) => (
            <VictoryAxis dependentAxis
              key={i}
              offsetX={this.xOffsets[i]}
              style={{
                axis: { stroke: this.colors[i] },
                ticks: { padding: this.tickPadding[i] },
                tickLabels: { fill: this.colors[i], textAnchor: this.anchors[i] }
              }}
              // Use normalized tickValues (0 - 1)
              tickValues={[0,0.25, 0.5, 0.75, 1]}
              // Re-scale ticks by multiplying by correct maxima
              tickFormat={(t) => t * this.maxima[i]}
            />
          ))}
          {this.state.data.map((d, i) => (
            <VictoryLine
              key={i}
              data={d}
              style={{ data: { stroke: this.colors[i] } }}
              // normalize data
              y={(datum) => datum.y / this.maxima[i]}
            />
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