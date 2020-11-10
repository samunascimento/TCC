import React, { Component } from 'react'
import {  List } from '@material-ui/core'
import ExpandLess from '@material-ui/icons/ExpandLess';
import ExpandMore from '@material-ui/icons/ExpandMore';
import ListItem from '@material-ui/core/ListItem';
import ListItemText from '@material-ui/core/ListItemText';
import Collapse from '@material-ui/core/Collapse';

export default class AO extends Component {
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
          <ListItemText>AO (Número de atributos substituídos)</ListItemText>
            {openMetrics ? <ExpandLess /> : <ExpandMore />}
        </ListItem>
        <Collapse in={openMetrics} timeout="auto" unmountOnExit>
            <List component="div" disablePadding>
              <ListItem button>
                <ListItemText>
                Atributos na classe que substituem atributos herdados de outra forma (classe)
                </ListItemText>
              </ListItem>
            </List>
        </Collapse>
      </>
    )
  }
}