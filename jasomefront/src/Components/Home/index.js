import React, { Component } from 'react'
import Typography from '@material-ui/core/Typography';
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';

export default class Home extends Component{

    render(){
        return(
            <>
            <div>
                <Typography variant='h4' style={{
                    padding: '16px 0px 0px 16px'
                }}>
                    Cadastro de Projeto
                </Typography>
            </div>
            <div style={{display:'flex', padding: '100px 0px 0px 16px'}}>
                <Typography variant='h6'>
                    Caminho para o projeto:
                </Typography>
                <TextField 
                    id="project" 
                    type="text"
                    placeholder="Projeto"
                    style={{
                        width: '50%',
                        padding: '0px 0px 0px 10px'
                    }}
                />
            </div>
            <div style={{ margin: '30px 0px 0px 16px',}}>
                <Button color='primary' variant='contained' size='medium'>
                    Cadastrar
                </Button>
            </div>
            </>
        );
    }

}