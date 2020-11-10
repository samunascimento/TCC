import React, { Component } from 'react'
import { Typography, List, ListSubheader } from '@material-ui/core'
import TLOC from './MetricsType/TLOC'
import RTLOC from './MetricsType/RTLOC'
import NF from './MetricsType/NF'
import NSF from './MetricsType/NSF'
import NPF from './MetricsType/NPF'
import NM from './MetricsType/NM'
import NSM from './MetricsType/NSM'
import NPM from './MetricsType/NPM'
import NOC from './MetricsType/NOC'
import NOP from './MetricsType/NOP'
import DIT from './MetricsType/DIT'
import NORM from './MetricsType/NORM'
import NMI from './MetricsType/NMI'
import NMA from './MetricsType/NMA'
import MIT from './MetricsType/MIT'
import MI from './MetricsType/MI'
import MD from './MetricsType/MD'
import MO from './MetricsType/MO'
import PMD from './MetricsType/PMD'
import PMI from './MetricsType/PMI'
import HMD from './MetricsType/HMD'
import HMI from './MetricsType/HMI'
import AIT from './MetricsType/AIT'
import AI from './MetricsType/AI'
import AD from './MetricsType/AD'
import AO from './MetricsType/AO'
import AV from './MetricsType/AV'
import AH from './MetricsType/AH'

export default class Metrics extends Component {

  render() {
    return(
      <>
      <List
          component="nav"
          aria-labelledby="listaMetricas"
          subheader={
            <ListSubheader style={{
              padding: '20px 0px 20px 16px',
              color: 'black'
            }}
            component="div" id="listaMetricas">
              <Typography variant='h4'>Métricas</Typography>
            </ListSubheader>
          }
        >
          <TLOC/>
          <RTLOC/>
          <NF/>
          <NSF/>
          <NPF/>
          <NM/>
          <NSM/>
          <NPM/>
          <NOC/>
          <NOP/>
          <DIT/>
          <NORM/>
          <NMI/>
          <NMA/>
          <MIT/>
          <MI/>
          <MD/>
          <MO/>
          <PMD/>
          <PMI/>
          <HMD/>
          <HMI/>
          <AIT/>
          <AI/>
          <AD/>
          <AO/>
          <AV/>
          <AH/>
        </List>
      </>
    )
  }
} 