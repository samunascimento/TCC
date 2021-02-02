import React, { Component } from 'react'
import Typography from '@material-ui/core/Typography';
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';

export default class InsertLogin extends Component{

    render(){

        return(
            <>
                <div>
                    <Typography variant='h4' style={{padding: '20px 0px 20px 16px'}}>
                        Cadastro de Login
                    </Typography>
                </div>
                <div style={{display:'flex', padding: '100px 0px 0px 16px'}}>
                    <Typography variant='h6'>
                        Usuário:
                    </Typography>
                    <TextField 
                        id="projectName" 
                        type="text"
                        placeholder="Usuário"
                        style={{
                            width: '50%',
                            padding: '0px 0px 0px 10px'
                        }}
                    />
                </div>
                <div style={{display:'flex', padding: '30px 0px 0px 16px'}}>
                    <Typography variant='h6'>
                        Senha:
                    </Typography>
                    <TextField 
                        id="projectPath" 
                        type="password"
                        placeholder="Senha"
                        style={{
                            width: '50%',
                            padding: '0px 0px 0px 10px'
                        }}
                    />
                </div>
                <div style={{display:'flex', padding: '30px 0px 0px 16px'}}>
                    <Typography variant='h6'>
                        Confirmação de Senha:
                    </Typography>
                    <TextField 
                        id="projectPath" 
                        type="password"
                        placeholder="Confirmação de senha"
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