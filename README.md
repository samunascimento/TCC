# Merge Nature
![](https://img.shields.io/badge/Language-Java-green)
![](https://img.shields.io/badge/Platforms-Linux%20%7C%20Windows-lightgrey)
 
 
Repositório para manutenção e armazenamento dos códigos criados para o projeto de iniciação científica: "A Natureza do Merge de Software".  
 
Sendo os bolsistas : [Luan Reis Ciribelli](https://github.com/LuanCiribelli) e [João Pedro Lima](https://github.com/joaop-c-lima). 
 
O orientador : [Gleiph Ghiotto Lima](https://github.com/gleiph).
 
Com contribuição de : [Heleno Campos](https://github.com/helenocampos).
 
 
## Para a execução do programa utilizando o sistema gráfico: 
 
 Baixar a última versão disponível no release e usar o comando: 
```
$  java -jar MergeNature_Gui.jar
```
Nenhum parâmetro é necessário e para as instruções do sistema gráfico, conferir a wiki.
 
## Para execução do programa utilizando o terminal, windows ou linux:
 
Baixar a última versão disponível no release e usar o comando: 
```
$ java -jar MergeNature_commandLine.jar
```
Com os seguintes parâmetros: 
 
 -c,  Number of context lines,
 -db  Save in the Database,
 -r,  Repository path,
 -s,  Save path.
 
 Exemplos:
 
 Para salvar no computador:
 ```
$ java -jar MergeNature_commandLine.jar -r "../Github/Mergenature" -s "../Github"
```
Já para salvar em um banco de Dados:
 
 ```
$ java -jar MergeNature_commandLine.jar -r "../Github/Mergenature" -db
```
O comando "db" inicialmente não precisa de nenhum comando. Mas na primeira conexão ao banco de dados ele irá pedir:
 
- Url do banco.
- Usuário dono do Banco de dados.
- Senha para se conectar ao banco.
 
Depois de fornecer esses pela primeira vez, não será necessário a repetição para acessar o banco. Caso queira se conectar a outro banco de dados, deve-se apagar o arquivo escondido chamado de ".mndbconnection".
 
## Observações: 
 
<ul>
  <li>Apesar do exemplo, <b>não se deve usar o programa na Repositório onde o projeto está sendo executado!</b></li>
  <li>Os arquivos serão salvos num formato especial de gson nomeado de : ".mntr".</li>
  <li>O terminal só aceita salvar ou em ".mntr" ou no banco de dados por vez.</li>
  <li>O programa faz análises de projetos em: Java, C++, Python e C#.</li>
  <li>O programa necessita do git instalado e funcional.</li>
  <li>O modelo de banco de dados para o programa se encontra no próprio repositório com nome de "MergeNatureDBScript.sql". Foi feito pensando no uso de "PostgresQL" </li>
</ul>
 
 ## instruições para Build:
 
 Build com linha de comando como classe criada no JAR:
 ```
$ mvn install
```
 Build com GUI como classe criada no JAR
  ```
$ mvn -Pgui install 
```
  ```
$ mvn install
```

 
