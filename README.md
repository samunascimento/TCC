# Merge Nature
![](https://img.shields.io/badge/Language-Java-green)
![](https://img.shields.io/badge/platforms-Linux%20%7C%20Windows-lightgrey)

 
Repositório para manutenção e armazenamento dos códigos criados para o projeto de iniciação científica: "A Natureza do Merge de Software".  
 
Sendo os bolsistas : [Luan Reis Ciribelli](https://github.com/LuanCiribelli) e [João Pedro Lima](https://github.com/joaop-c-lima). 
 
O orientador : [Gleiph Ghiotto Lima](https://github.com/gleiph).
 
Com contribuição de : [Heleno Campos](https://github.com/helenocampos).
 
 
## Para a execução do programa utilizando o sistema gráfico: 
 
```
$ Rodar o arquivo "MNFrame"
```
 
## Para execução do programa utilizando o terminal, windows ou linux:
 
```
$ cd "../MergeNature/Core/target/"
```
```
$ java -jar Core-1.0-SNAPSHOT-jar-with-dependencies.jar
```
Com os seguintes parâmetros: 
 
 -c,  Number of context lines,
 -db  Save in the Database,
 -r,  Repository path,
 -s,  Save path.
 
 Por exemplo: 
 
 ```
$ java -jar Core-1.0-SNAPSHOT-jar-with-dependencies.jar -r "../Github/Mergenature" -s "../Github"
```
 
## Observações: 
 
<ul>
  <li>Apesar do exemplo, <b>não se deve usar o programa na Repositório onde o projeto está sendo executado!</b></li>
  <li>Os arquivos serão salvos num formato especial de gson nomeado de : ".mntr".</li>
  <li>O terminal só aceita salvar ou em "mntr" ou no banco de dados por vez.</li>
  <li>O programa faz análises de projetos em: Java, C++, Python e C#.</li>
  <li>O programa necessita do git instalado e funcional.</li>
</ul>
