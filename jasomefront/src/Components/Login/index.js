import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import Typography from '@material-ui/core/Typography';
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';
import axios from 'axios';
import App from '../App';

export default class extends Component{

    state = {
        user: '',

        pass: '',

        dadosCripto: {
            alg : "aes-256-ctr",
            pwd : "abcdabcd"
        }
    }

    cryptoPassword(senha){
        const crypto = require("crypto");
        const cipher = crypto.createCipher(this.state.dadosCripto.alg, this.state.dadosCripto.pwd);
        return cipher.update(senha, 'utf8', 'hex');
    }

    onSubmit(){
        if(this.state.user === '' || this.state.pass === '')
            alert("Há campos vazios.")
        else {
            axios.get(`/insert/login/get/`+this.state.user)
            .then((data) => {
                if(data.data === false)
                    alert("Usuário inexistente.")
                else{
                    let password =  this.cryptoPassword(this.state.pass)
                    fetch(`/login`, {
                        method: 'GET',
                        headers: { 'user': this.state.user, 'pass': password}
                    }).then((data) => {
                        if(data.data === false)
                            alert("Senha incorreta.")
                        else{
                            alert('Login efetuado.')
                            ReactDOM.render(<App />, document.getElementById('root'));
                        }
                    })
                }
            })
        }
    }

    render(){
        return (
            <>
                <div style={{display:'flex', padding: '100px 0px 0px 16px', marginLeft: '43rem'}}>
                    <Typography variant='h3' style={{color: 'blue'}}>
                        Jasome Web
                    </Typography>
                </div>
                <div style={{display:'flex', padding: '100px 0px 0px 16px', marginLeft: '40rem', marginTop: '4rem'}}>
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
                            width: '30%',
                            padding: '0px 0px 0px 10px'
                        }}
                    />
                </div>
                <div style={{display:'flex', padding: '30px 0px 0px 16px', marginLeft: '40rem'}}>
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
                            width: '30%',
                            padding: '0px 0px 0px 10px'
                        }}
                    />
                </div>
                <div style={{ margin: '30px 0px 0px 16px', marginLeft: '50rem', marginTop: '2rem'}}>
                    <Button color='primary' variant='contained' size='medium' type='submit' onClick={() => this.onSubmit()}>
                        Fazer Login
                    </Button>
                </div>
            </>
        )
    }
}