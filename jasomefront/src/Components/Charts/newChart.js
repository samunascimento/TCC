import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import _ from 'lodash';
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

const VictoryZoomVoronoiContainer = createContainer("zoom", "voronoi");
// 10000 points (10 / 0.001 = 10000) - see what happens when you render 50k or 100k
const allData = _.range(0, 10, 0.001).map(x => ({
	x: x,
  y: Math.sin(Math.PI*x/2) * x / 10
}));


class ChartLine extends React.Component {
  constructor(props) {
  	super();
    this.entireDomain = this.getEntireDomain(props);
   	this.state = {
    	zoomedXDomain: this.entireDomain.x,
    };
  }
	onDomainChange(domain) {
  	this.setState({
    	zoomedXDomain: domain.x,
    });
  }
  getData() {
  	const { zoomedXDomain } = this.state;
    const { data} = this.props;
    console.log("data aqui")
    console.log(data);
  	const filtered = data.filter(
    	(d) => (d.x >= zoomedXDomain[0] && d.x <= zoomedXDomain[1]));

    if (filtered.length > 100 ) {
      const k = Math.ceil(filtered.length / 100);
    	return filtered.filter(
      	(d, i) => ((i % k) === 0)
      );
    }
    console.log("entrou aqui")
    console.log(filtered)
    return data;
  }
  getEntireDomain(props) {
  	//const { data } = props.data;
    return {
    	y: [_.minBy(props.data, d => d.y), _.maxBy(props.data, d => d.y)],
      x: [ props.data[0].x, _.last(props.data).x ]
    };
  }
  getZoomFactor() {
    const { zoomedXDomain } = this.state;
    const factor = 10 / (zoomedXDomain[1] - zoomedXDomain[0]);
    return _.round(factor, factor < 3 ? 1 : 0);
  }
	render() {
    const renderedData = this.getData();
  	return (
    	<div>
        <VictoryChart
          //domain={this.entireDomain}
          containerComponent={<VictoryZoomContainer
            //zoomDimension="x"
            onZoomDomainChange={this.onDomainChange.bind(this)}
            //minimumZoom={{x: 1/10000}}
          />}
        >
         {renderedData.map((d, i) => (
            <VictoryLine
              key={i}
              data={d}
              style={{
                data: {
                  stroke: this.props.colors[i].color
                }
              }}
            //   x={this.handleSwitch()}
            //   y="y"
            >
            </VictoryLine>

          ))}
        </VictoryChart>
        {/* <div>
          {this.getZoomFactor()}x zoom;
          rendering {renderedData.length} of {this.props.data.length}
        </div> */}
      </div>
    );
  }
}

//ReactDOM.render(<CustomChart data={allData} 
//maxPoints={120} />, mountNode);

export default ChartLine;