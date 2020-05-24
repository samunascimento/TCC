import React, { Component } from 'react'
import { BrowserRouter, Switch, Route } from 'react-router-dom'
import { NotFound } from './Errors'
import Writers from './Writers'
import Layout from './Layout'
import ListMetric from './Metric'

export default class extends Component {
  state = {
    writers: []
  }

  async componentDidMount() {
    const writers = await (await fetch('URL - criar um arquivo de configuraçã depois')).json()

    this.setState({ writers })
  }

  render() {
    const { writers } = this.state

    return <BrowserRouter>
      <Layout writers={writers}>
        <Switch>
          <Route exact path="/" render={() => <div>Home</div>} />
          <Route exact path="/metric" component={ListMetric} />
          <Route path="/writers" render={
            props => <Writers {...props} writers={writers} />
          } />
          <Route component={NotFound} />
        </Switch>
      </Layout>
    </BrowserRouter>
  }
}
