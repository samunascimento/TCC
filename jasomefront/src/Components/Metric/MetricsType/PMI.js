import React, { Component } from 'react'
import {  List } from '@material-ui/core'
import ExpandLess from '@material-ui/icons/ExpandLess';
import ExpandMore from '@material-ui/icons/ExpandMore';
import ListItem from '@material-ui/core/ListItem';
import ListItemText from '@material-ui/core/ListItemText';
import Collapse from '@material-ui/core/Collapse';

export default class PMI extends Component {
  state = {
    openMetrics: false
  }

  handleClick = () => {
    const openMetrics = !this.state.openMetrics;
    this.setState({ openMetrics })
  }

  render() {
    const { openMetrics } = this.state

    return(
      <>  
       <ListItem button onClick={this.handleClick}>
          <ListItemText>PMI (Número de métodos públicos herdados)</ListItemText>
            {openMetrics ? <ExpandLess /> : <ExpandMore />}
        </ListItem>
        <Collapse in={openMetrics} timeout="auto" unmountOnExit>
            <List component="div" disablePadding>
              <ListItem button>
                <ListItemText>
                Número de métodos herdados (mas não substituídos) que são públicos (classe)
                </ListItemText>
              </ListItem>
            </List>
        </Collapse>
      </>
    )
  }
}