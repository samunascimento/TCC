import React, { Component } from 'react'
import { BrowserRouter, Switch, Route } from 'react-router-dom'
import { NotFound } from './Errors'
import Projects from './Projects'
import Layout from './Layout'
import ListMetric from './Metric'

export default class extends Component {
  state = {
    projects: []
  }

  async componentDidMount() {
    const projects = await (await fetch('http://localhost:56875/JasomeWeb/webresources/jasome/nameProject')).json()
    console.log(projects);
    this.setState({ projects })
  }

  render() {
    const { projects } = this.state

    return <BrowserRouter>
      <Layout projects={projects}>
        <Switch>
          <Route exact path="/" render={() => <div>Home</div>} />
          <Route exact path="/metric" component={ListMetric} />
          <Route path="/projects" render={
            props => <Projects {...props} projects={projects} />
          } />
          <Route component={NotFound} />
        </Switch>
      </Layout>
    </BrowserRouter>
  }
}
