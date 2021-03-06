import React, { Component } from 'react'
import Typography from '@material-ui/core/Typography';
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';
import Select from '@material-ui/core/Select';
import MenuItem from '@material-ui/core/MenuItem';
import axios from 'axios';

export default class InsertLogin extends Component{

    state = {
        type: '',
        
        user: '',

        pass: '',

        isUserin: false,

        dadosCripto: {
            alg : "aes-256-ctr",
            pwd : "abcdabcd"
        }

    }

    cryptoPassword(senha){
        const crypto = require("crypto");
        const cipher = crypto.createCipher(this.state.dadosCripto.alg, this.state.dadosCripto.pwd);
        return cipher.update(senha, 'utf8', 'hex');;
    }

    onSubmit(){
        
        if(this.state.user === '' || this.state.pass === '' || this.state.type === ''){
            alert('Há campos vazios.');
        }else {
            axios.get(`/insert/login/get/`+this.state.user)
            .then((data) => {
                this.setState({ isUserin: data.data })
            if(this.state.isUserin === true)
                alert('Esse usuário já está cadastrado.')
            else{
                let password =  this.cryptoPassword(this.state.pass)
                console.log(password)
                fetch(`/insert/login/`, {
                    method: 'POST',
                    headers: { 'user': this.state.user, 'pass': password, 'type' : this.state.type}
                })
                alert('Cadastrado com sucesso.')
            }
                
            })

        }
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