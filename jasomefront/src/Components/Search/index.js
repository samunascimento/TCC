import React, { Component } from 'react';
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableContainer from '@material-ui/core/TableContainer';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Paper from '@material-ui/core/Paper';
import Typography from '@material-ui/core/Typography';
import './style.css';

export default class extends Component{

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

    render(){

        return (
            <>
                <Typography variant='h4' style={{padding: '20px 0px 20px 16px'}}>
                    Acompanhamento
                </Typography>
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
                        </Table>
                    </TableContainer>
                </div>
            </>
        )
    }
}