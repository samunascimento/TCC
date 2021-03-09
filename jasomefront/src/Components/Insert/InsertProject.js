import React, { Component } from 'react'
import Typography from '@material-ui/core/Typography';
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';
import axios from 'axios';

export default class InsertProject extends Component{

    state = {
        name: '',
        
        url: '',

        dirJasome: '',

        isUserIn: false,

        user: '',

        getProjectByUser: false
    }


    //ARRUMAR
    onSubmit(){
        
        if(this.state.name === '' || this.state.url === '' || this.state.dirJasome === '' || this.state.user === ''){
            alert('Há campos vazios.');
        }else {
            axios.get('/insert/login/get/'+this.state.user)
            .then((data) => {
                this.setState({ isUserIn: data.data })
                if(this.state.isUserIn === false)
                    alert('Este usuário não existe.')
                else{
                    axios.get('/insert/projects/getData/', {
                        headers: { 'user': this.state.user, 'name': this.state.name}
                    }).then((data) => {
                        this.setState({ getProjectByUser: data.data})
                        if(this.state.getProjectByUser === true)
                            alert('Este projeto já está cadastrado por este usuário.')
                        else{
                            axios.get('/insert/login/getData/'+this.state.user)
                            .then((data) => {
                                axios.post('/insert/projects/create', {
                                    headers: { 'name': this.state.name, 'url': this.state.url, 'dirJasome' : this.state.dirJasome, 'userId': data.data}
                                })
                            })
                            alert('Cadastrado com sucesso.')
                        }
                    })
                }
            })
        }
    }

    render(){
        return(
            <>
                <div>
                    <Typography variant='h4' style={{padding: '20px 0px 20px 16px'}}>
                        Cadastro de Projeto
                    </Typography>
                </div>
                <div style={{display:'flex', padding: '100px 0px 0px 16px'}}>
                    <Typography variant='h6'>
                        Nome do projeto:
                    </Typography>
                    <TextField 
                        id={this.state.name}
                        name={this.state.name}
                        onInput={(e) => this.setState({name: e.target.value})} 
                        type="text"
                        placeholder="Nome"
                        style={{
                            width: '50%',
                            padding: '0px 0px 0px 10px'
                        }}
                    />
                </div>
                <div style={{display:'flex', padding: '30px 0px 0px 16px'}}>
                    <Typography variant='h6'>
                        Caminho para o projeto:
                    </Typography>
                    <TextField 
                        id={this.state.url}
                        name={this.state.url}
                        onInput={(e) => this.setState({url: e.target.value})} 
                        type="text"
                        placeholder="Caminho para o projeto"
                        style={{
                            width: '50%',
                            padding: '0px 0px 0px 10px'
                        }}
                    />
                </div>
                <div style={{display:'flex', padding: '30px 0px 0px 16px'}}>
                    <Typography variant='h6'>
                        Caminho para o jasome:
                    </Typography>
                    <TextField 
                        id={this.state.dirJasome}
                        name={this.state.dirJasome}
                        onInput={(e) => this.setState({dirJasome: e.target.value})} 
                        type="text"
                        placeholder="Caminho para o jasome"
                        style={{
                            width: '50%',
                            padding: '0px 0px 0px 10px'
                        }}
                    />
                </div>
                <div style={{display:'flex', padding: '30px 0px 0px 16px'}}>
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
                <div style={{ margin: '30px 0px 0px 16px',}}>
                    <Button color='primary' variant='contained' size='medium' type='submit' onClick={() => this.onSubmit()}>
                        Cadastrar
                    </Button>
                </div>
            </>
        );
    }

}