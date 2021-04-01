import React, { Component } from 'react';
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TextField from '@material-ui/core/TextField';
import TableCell from '@material-ui/core/TableCell';
import TableContainer from '@material-ui/core/TableContainer';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Paper from '@material-ui/core/Paper';
import Typography from '@material-ui/core/Typography';
import './style.css';
import axios from 'axios';
import Button from '@material-ui/core/Button';

export default class extends Component{

    state = {

        user: '',

        projectMetrics: [],

        id: -1

    }

    /*
    <TableBody>
        {rows.map((row) => (
            <StyledTableRow key={row.name}>
            <StyledTableCell component="th" scope="row">
            {row.name}
            </StyledTableCell>
                <StyledTableCell align="right">{row.data}</StyledTableCell>
                <StyledTableCell align="right">{row.data}</StyledTableCell>
                <StyledTableCell align="right">{row.data}</StyledTableCell>
                <StyledTableCell align="right">{row.data}</StyledTableCell>
            </StyledTableRow>
        ))}
    </TableBody>
    */

    onSubmit(){
        if(!this.state.user == ''){
            axios.get('/insert/login/get/'+this.state.user)
            .then((data) => {
                if(data.data === true){
                    axios.get('/insert/login/getData/'+this.state.user)
                    .then((data) => {
                        this.setState({id: data.data})
                        axios.get('/insert/projects/getProjects/'+this.state.id)
                        .then((res) => {
                            const data = this.state.projectMetrics
                            res.data.map((values) => {
                                data.push(values)
                            })
                            this.setState({projectMetrics: data})
                        })
                    })
                }else alert('Usuário inexistente.');
            })
        }else alert('Campo vazio.');
    }

    render(){

        return (
            <>
                <Typography variant='h4' style={{padding: '20px 0px 20px 16px'}}>
                    Acompanhamento
                </Typography>
                <div style={{display:'flex', padding: '20px 50px 50px 16px'}}>
                    <Typography variant='h6'>
                        Nome do usuário:
                    </Typography>
                    <TextField 
                        id={this.state.user}
                        name={this.state.user}
                        onInput={(e) => this.setState({user: e.target.value})} 
                        type="text"
                        placeholder="Usuário"
                        style={{
                            width: '50%',
                            padding: '0px 0px 0px 10px'
                        }}
                    />
                    <Button color='primary' variant='contained' size='medium' type='submit' onClick={() => this.onSubmit()}>
                        Buscar
                    </Button>
                </div>
                <div style={{padding: '20px 16px 0px 16px'}} >
                    <TableContainer component={Paper}>
                        <Table>
                            <TableHead>
                                <TableRow>
                                    <TableCell align="right">ID</TableCell>
                                    <TableCell align="right">SOUCE DIR</TableCell>
                                    <TableCell align="right">PROJECT NAME</TableCell>
                                    <TableCell align="right">STATUS</TableCell>
                                    <TableCell align="right">USER ID</TableCell>
                                </TableRow>
                            </TableHead>
                            <TableBody>
                                {this.state.projectMetrics.map((fields) => {
                                    console.log(fields.data)
                                    return (
                                        <TableCell>{fields.data}</TableCell>
                                    )
                                    
                                })}
                            </TableBody>
                        </Table>
                    </TableContainer>
                </div>
            </>
        )
    }
}