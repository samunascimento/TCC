import React, { Fragment } from 'react'
import { Link, Route } from 'react-router-dom'
import { NotFound } from '../Errors'
import Project from './Project'


export default ({ match: { url }, projects }) =>
  

<Fragment>

{/* <ul>
  {projects.map(({id,name}) =>
    <li>
      <Link to={`${url}/${id}`}>{name}</Link>
    </li>
  )}
</ul> */}

<Route path={`${url}/:id`} render={() => <Project/>} />

</Fragment>





{/* <Fragment>
    <Route exact path={url} render={
      () => <ul>
      {projects.map(({ id, name }) =>
        <li key={id}>
          <Link to={`${url}/${id}`}>{name}</Link>
        </li>
      )}
    </ul>
    }/>

  <Route path={`${url}/${projects.id}`} render={() => <h1>testeee</h1> } />


  </Fragment> */}








  

  