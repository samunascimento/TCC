import React, { Component } from 'react'
import { BrowserRouter, Switch, Route } from 'react-router-dom'
import { NotFound } from './Errors'
import Writers from './Projects'
import Layout from './Layout'
import ListMetric from './Metric'
import Charts from '../Components/Charts'

export default class extends Component {
  state = {
    projects: []
  }

  async componentDidMount() {
    const projects = await (await fetch('http://localhost:8080/JasomeWeb/webresources/jasome/nameProject')).json()

    this.setState({ projects })
  }

  render() {
    const { projects } = this.state

    return <BrowserRouter>
      <Layout writers={projects}>
        <Switch>
          <Route exact path="/" render={() => <div>Home</div>} />
          {/* <Route exact path="/" component={Charts}/> */}
          <Route exact path="/metric" component={ListMetric} />
          <Route path="/projects" render={
            props => <Writers {...props} projects={projects} />
          } />
          <Route component={NotFound} />
        </Switch>
      </Layout>
    </BrowserRouter>
  }
}
