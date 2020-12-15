import React, { Component } from 'react'
import { BrowserRouter, Switch, Route } from 'react-router-dom'
import { NotFound } from './Errors'
import Projects from './Projects'
import Layout from './Layout'
import ListMetric from './Metric'
import Home from './Home';

export default class extends Component {
  state = {
    projects: []
  }

  async componentDidMount() {
    const projects = await (await fetch(`nameProject`)).json()
    console.log(projects);
    this.setState({ projects })
  }
  render() {
    const { projects } = this.state

    return <BrowserRouter>
      <Layout projects={projects}>
        <Switch>
          <Route exact path="/" component={Home} />
          <Route exact path="/metric" component={ListMetric}/>
          <Route path="/projects" render={
            props => <Projects {...props} projects={projects} />
          } />
          <Route component={NotFound} />
        </Switch>
      </Layout>
    </BrowserRouter>
  }
}
