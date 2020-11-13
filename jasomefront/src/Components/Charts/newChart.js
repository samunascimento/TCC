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

import { PropTypes } from 'prop-types';

const VictoryZoomVoronoiContainer = createContainer("zoom", "voronoi");

class ChartLine extends Component {

    constructor(props) {
        super(props);
        this.state = {
            data: []
        }
        this.entireDomain = this.getEntireDomain(props);
        this.state = {
            zoomedXDomain: this.entireDomain.x,
        };
        console.log('tetse')
        console.log(props);
    }

    onDomainChange(domain) {
        this.setState({
            zoomedXDomain: domain.x,
        });
    }

    /*componentDidUpdate(prevProps, prevState) {

        if (this.props.data !== prevState.data) {
            this.setState({ data: this.props.data })

            this.setState({
                zoomDomain: { x: [new Date(2019, 1, 1), new Date(2021, 1, 1)] },
            })

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
    }*/

    getEntireDomain(props) {
        const { data } = props.data;
        console.log('entrou aqui')
        console.log(props.data);
        return {
            y: [_.minBy(data, d => d.y).y, _.maxBy(data, d => d.y).y],
            //y: [_.minBy(data, d => d.y), _.maxBy(data, d => d.y)],
            x: [data[0].x, _.last(data).x]
        };
    }

    getData() {
        const { zoomedXDomain } = this.state;
        const { data } = this.props.data;
        return data.filter(
            // is d "between" the ends of the visible x-domain?
            (d) => (d.x >= zoomedXDomain[0] && d.x <= zoomedXDomain[1]));
    }

    render() {
        return (
            <VictoryChart
                domain={this.entireDomain}
                containerComponent={<VictoryZoomContainer
                    zoomDimension="x"
                    onZoomDomainChange={this.onDomainChange.bind(this)}
                />}
            >
                <VictoryScatter data={this.getData()} />
            </VictoryChart>
        );
    }
}
//ReactDOM.render(<ChartLine data={allData}/>, mountNode);
export default ChartLine;