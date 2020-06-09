import React, { Fragment } from 'react'
import { Link, Route } from 'react-router-dom'
import { NotFound } from '../Errors'
import Project from './Project'


export default ({ match: { url }, projects }) =>


<Fragment>
<ul>
  {projects.map(({ id, name }) =>
    <li key={id}>
      <Link to={`${url}/${id}`}>{name}</Link>
    </li>
  )}
</ul>
  
<Route exact path={url} render={
  () => <h3>Projects</h3>
}/>
<Route path={`${url}/:id`} render={      
  props => {
    const project = projects.find(({ id }) => id == props.match.params.id)
    console.log(project);
    if (!project) {
      return <NotFound />
    }

    // return <Project {...props} {...project}/>
    return <Project nameProject={project} />
  }
} />
</Fragment>










  

  