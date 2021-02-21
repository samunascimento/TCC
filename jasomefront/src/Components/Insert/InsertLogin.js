import React, { Component } from 'react'
import Typography from '@material-ui/core/Typography';
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';
import axios from 'axios';

export default class InsertLogin extends Component{

    state = {
        type: '',
        
        user: '',

        pass: ''
    }


    onSubmit(){
        const requestOptions = {
            method: 'POST',
            headers: { 'user': this.state.user, 'pass': this.state.pass, 'type' : this.state.type},
            body: JSON.stringify({ title: 'React POST Request Example' })
        };
        fetch('http://localhost:8080/JasomeWeb/webresources/jasome/login/', requestOptions)
            .then(response => response.json())
    }

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
                </div>
                <div style={{display:'flex', padding: '30px 0px 0px 16px'}}>
                    <Typography variant='h6'>
                        Senha:
                    </Typography>
                    <TextField 
                        id={this.state.pass}
                        name={this.state.pass}
                        onInput={(e) => this.setState({pass: e.target.value})}
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
                        Type:
                    </Typography>
                    <TextField 
                        id={this.state.type}
                        name={this.state.type}
                        onInput={(e) => this.setState({type: e.target.value})}
                        type="text"
                        placeholder="Tipo"
                        style={{
                            width: '50%',
                            padding: '0px 0px 0px 10px'
                        }}
                    />
                </div>
                <div style={{ margin: '30px 0px 0px 16px',}}>
                    <Button color='primary' variant='contained' size='medium' type='submit' onClick={() => this.onSubmit()}>
                        Cadastrar
                    </Button>
                </div>
            </>
        );
    }

}