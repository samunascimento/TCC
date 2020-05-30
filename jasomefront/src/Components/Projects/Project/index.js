// import React, { Fragment } from 'react'
// import Button from '@material-ui/core/Button';
// import { Link, Route } from 'react-router-dom'
// import { NotFound } from '../../Errors'
// import Text from './Text'

import React from 'react';
import Button from '@material-ui/core/Button';
import Menu from '@material-ui/core/Menu';
import MenuItem from '@material-ui/core/MenuItem';
import Fade from '@material-ui/core/Fade';
import Checkbox from '@material-ui/core/Checkbox';
import FormGroup from '@material-ui/core/FormGroup';
import FormControlLabel from '@material-ui/core/FormControlLabel';
import Grid from '@material-ui/core/Grid';


export default function Project() {

  const [state, setState] = React.useState({
    checkedA: false
  });


  const [anchorEl, setAnchorEl] = React.useState(null);
  const open = Boolean(anchorEl);

  const handleClick = (event) => {
    setAnchorEl(event.currentTarget);
  };

  const handleChange = (event) => {
    setState({ ...state, [event.target.name]: event.target.checked });
  };

  const handleClose = () => {
    setAnchorEl(null);
  };

  return (
    <div>
      <div>
        <Grid container spacing={10}>
          <Grid item xs={2}>
            <Button aria-controls="fade-menu" variant="contained" color="primary" aria-haspopup="true" onClick={handleClick}>
              Version
          </Button>
            <Menu
              id="fade-menu"
              anchorEl={anchorEl}
              keepMounted
              open={open}
              onClose={handleClose}
              TransitionComponent={Fade}
            >
              <FormGroup>
                <FormControlLabel
                  control={<Checkbox checked={state.checkedA} onChange={handleChange} name="checkedA" color="primary" />}
                  label="tloc"
                />
              </FormGroup>
            </Menu>
          </Grid>
          <Grid item xs={2}>
            <Button aria-controls="fade-menu" variant="contained" color="primary" aria-haspopup="true" onClick={handleClick}>
              Package
          </Button>
            <Menu
              id="fade-menu"
              anchorEl={anchorEl}
              keepMounted
              open={open}
              onClose={handleClose}
              TransitionComponent={Fade}
            >
              <FormGroup>
                <FormControlLabel
                  control={<Checkbox checked={state.checkedA} onChange={handleChange} name="checkedA" color="primary" />}
                  label="tloc"
                />
              </FormGroup>
            </Menu>
          </Grid>
          <Grid item xs={2}>
            <Button aria-controls="fade-menu" variant="contained" color="primary" aria-haspopup="true" onClick={handleClick}>
              Class
          </Button>
            <Menu
              id="fade-menu"
              anchorEl={anchorEl}
              keepMounted
              open={open}
              onClose={handleClose}
              TransitionComponent={Fade}
            >
              <FormGroup>
                <FormControlLabel
                  control={<Checkbox checked={state.checkedA} onChange={handleChange} name="checkedA" color="primary" />}
                  label="tloc"
                />
              </FormGroup>
            </Menu>
          </Grid>
          <Grid item xs={2}>
            <Button aria-controls="fade-menu" variant="contained" color="primary" aria-haspopup="true" onClick={handleClick}>
              Method
          </Button>
            <Menu
              id="fade-menu"
              anchorEl={anchorEl}
              keepMounted
              open={open}
              onClose={handleClose}
              TransitionComponent={Fade}
            >
              <FormGroup>
                <FormControlLabel
                  control={<Checkbox checked={state.checkedA} onChange={handleChange} name="checkedA" color="primary" />}
                  label="tloc"
                />
              </FormGroup>
            </Menu>
          </Grid>
        </Grid>
      </div>
      <div>
        <h1>GRÁFICO</h1>
      </div>
    </div>
  );
}











// export default ({ match: { url}, name, born, deceased, description, image, texts }) =>
//   <Fragment>
//     <h1>primeiro teste</h1>

//     <img src={image} alt={name} style={{maxWidth: 300}}/>

//     <h1>{name}</h1>

//     <h3>
//       {born} &mdash; {deceased}
//     </h3>

//     <p>
//       {description}
//     </p>

//     <ul>
//       {texts.map(({ id, title }) =>
//         <li key={id}>
//           <Link to={`${url}/texts/${id}`}>
//             {title}
//           </Link>
//         </li>
//       )}
//     </ul>


//     <Route path={`${url}`} render={() => <div>Home</div>} />/>
//       props => {
//         const text = texts.find(({ id }) => id === props.match.params.textId)

//          if (! text) {
//            return <NotFound/>
//          }

//          return <Text {...text} />
//         return (
//           <h1>primeiro teste</h1>
//         )
//       }
//     } />

//   </Fragment>