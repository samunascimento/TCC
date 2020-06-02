// App.js
/*
import React, { useEffect, useState } from 'react';
import BarChart from './../../Charts/chart';

// const data = 	[
// 	[{'x':1,'y':6},{'x':2,'y':5},{'x':3,'y':18},{'x':4,'y':10},{'x':5,'y':2},{'x':6,'y':24},{'x':7,'y':13},{'x':8,'y':3}],
//   [{'x':1,'y':7},{'x':2,'y':5},{'x':3,'y':9},{'x':4,'y':5},{'x':5,'y':1},{'x':6,'y':11},{'x':7,'y':8},{'x':8,'y':6}],
//   [{'x':1,'y':2},{'x':2,'y':3},{'x':3,'y':1},{'x':4,'y':3},{'x':5,'y':0},{'x':6,'y':5},{'x':7,'y':3},{'x':8,'y':3}],
//   [{'x':1,'y':2},{'x':2,'y':0},{'x':3,'y':2},{'x':4,'y':2},{'x':5,'y':1},{'x':6,'y':2},{'x':7,'y':5},{'x':8,'y':1}],
//   [{'x':1,'y':0},{'x':2,'y':0},{'x':3,'y':0},{'x':4,'y':0},{'x':5,'y':1},{'x':6,'y':1},{'x':7,'y':0},{'x':8,'y':1}]
// ];
var i = 0;

function App() {
    const [data, setData] = useState([]);

    useEffect(() => {
        changeData();
    }, []);

    const changeData = () => {
      const data = 	[
        [{'x':1,'y':6},{'x':2,'y':5},{'x':3,'y':18},{'x':4,'y':10},{'x':5,'y':2},{'x':6,'y':24},{'x':7,'y':13},{'x':8,'y':3}],
        [{'x':1,'y':7},{'x':2,'y':5},{'x':3,'y':9},{'x':4,'y':5},{'x':5,'y':1},{'x':6,'y':11},{'x':7,'y':8},{'x':8,'y':6}],
        [{'x':1,'y':2},{'x':2,'y':3},{'x':3,'y':1},{'x':4,'y':3},{'x':5,'y':0},{'x':6,'y':5},{'x':7,'y':3},{'x':8,'y':3}],
        [{'x':1,'y':2},{'x':2,'y':0},{'x':3,'y':2},{'x':4,'y':2},{'x':5,'y':1},{'x':6,'y':2},{'x':7,'y':5},{'x':8,'y':1}],
        [{'x':1,'y':0},{'x':2,'y':0},{'x':3,'y':0},{'x':4,'y':0},{'x':5,'y':1},{'x':6,'y':1},{'x':7,'y':0},{'x':8,'y':1}]
      ];
    }


    return (

      <div>
        <div className="App">
            <BarChart width={600} height={400} data={data} />
        </div>
        </div>
    );
}

export default App;


*/



import React, { useEffect , useState} from 'react';
import Button from '@material-ui/core/Button';
import Menu from '@material-ui/core/Menu';
import MenuItem from '@material-ui/core/MenuItem';
import Fade from '@material-ui/core/Fade';
import Checkbox from '@material-ui/core/Checkbox';
import FormGroup from '@material-ui/core/FormGroup';
import FormControlLabel from '@material-ui/core/FormControlLabel';
import Grid from '@material-ui/core/Grid';
import BarChart from './../../Charts/chart';


export default function Project() {

  //const [data, setData] = useState([]);

  const [state, setState] = React.useState({
    checkedA: false
  });

  const data = 	[
    [{'x':1,'y':6},{'x':2,'y':5},{'x':3,'y':18},{'x':4,'y':10},{'x':5,'y':2},{'x':6,'y':24},{'x':7,'y':13},{'x':8,'y':3}],
    [{'x':1,'y':7},{'x':2,'y':5},{'x':3,'y':9},{'x':4,'y':5},{'x':5,'y':1},{'x':6,'y':11},{'x':7,'y':8},{'x':8,'y':6}],
    [{'x':1,'y':2},{'x':2,'y':3},{'x':3,'y':1},{'x':4,'y':3},{'x':5,'y':0},{'x':6,'y':5},{'x':7,'y':3},{'x':8,'y':3}],
    [{'x':1,'y':2},{'x':2,'y':0},{'x':3,'y':2},{'x':4,'y':2},{'x':5,'y':1},{'x':6,'y':2},{'x':7,'y':5},{'x':8,'y':1}],
    [{'x':1,'y':0},{'x':2,'y':0},{'x':3,'y':0},{'x':4,'y':0},{'x':5,'y':1},{'x':6,'y':1},{'x':7,'y':0},{'x':8,'y':1}]
  ];

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
          <Grid item xs={2}>
          <Button variant="contained">
            Gerar gráfico
          </Button>
          </Grid>
        </Grid>
      </div>
      <div>
        <h1>GRÁFICO</h1>
        <div className="App">
            <BarChart width={600} height={400} data={data} />
        </div>
      </div>
    </div>
  );
}








/*

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
*/