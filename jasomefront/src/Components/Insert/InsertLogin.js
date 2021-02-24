import React, { Component } from 'react'
import Typography from '@material-ui/core/Typography';
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';
import Select from '@material-ui/core/Select';
import MenuItem from '@material-ui/core/MenuItem';
import Alert from '@material-ui/lab/Alert';

export default class InsertLogin extends Component{

    state = {
        type: '',
        
        user: '',

        pass: ''
    }


    onSubmit(){
        const request = {
            method: 'POST',
            headers: { 'user': this.state.user, 'pass': this.state.pass, 'type' : this.state.type}
        };
        fetch('http://localhost:8080/JasomeWeb/webresources/jasome/login/', request)
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
                    <Select
                        id={this.state.type}
                        defaultValue={'SELECT'}
                        onChange={(e) => this.setState({type: e.target.value})}
                        style={{
                            width: '50%',
                            padding: '0px 0px 0px 16px'
                        }}

                    >
                        <MenuItem value={'SELECT'}>SELECIONE...</MenuItem>
                        <MenuItem value={'ADM'}>ADMINISTRADOR</MenuItem>
                        <MenuItem value={'DEV'}>DEVELOPER</MenuItem>
                        <MenuItem value={'USER'}>USER</MenuItem>
                    </Select>
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