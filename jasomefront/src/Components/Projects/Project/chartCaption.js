import React, { Component, Fragment, useState } from 'react'
import Box from '@material-ui/core/Box'
import Grid from '@material-ui/core/Grid';


import { PropTypes } from 'prop-types';

export default class caption extends Component {
    constructor(props) {
        super(props);
        this.state = {
            metricsDescriptions: this.props.metricsDescriptions,
            colors: this.props.colors,
        }
    }

    render() {

        return (
            <Box
                display="flex"

                flexDirection="row-reverse"
                p={1}
                m={1}
                bgcolor="background.paper"
                style={{ border: '2px groove black', borderRadius: '5px', marginLeft: '16px', marginRight: '0' }}
            >
                <Grid item xs={12}>
                    {this.props.metricsDescriptions.map((metric, index) => (
                        <div>
                            <div style={{ display: 'inline-block', height: '20px', width: '20px', backgroundColor: this.props.colors[index] }}></div>
                            <dt style={{ marginLeft: '10px', display: 'inline-block' }} title={metric.metricDescription}>{metric.metricName + ' (' + metric.checkMetric + ')'}</dt>
                        </div>
                    ))}
                </Grid>
            </Box>
        )
    }
}