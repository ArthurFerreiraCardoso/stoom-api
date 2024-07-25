
<div align="center">
<img src="https://github.com/user-attachments/assets/c72e9208-073d-40b1-8cd6-e975daa52f5c" width="700px" />
</div>

<h1 align="center" > Stoom <b style="color: #03A9F5;">API</b> </h1>

<h3> O que é o projeto? </h3>
<p> API REST para cadastro de produtos, categorias e marcas, desenvolvido em Java com o framework Spring.</p>

<hr>

<h3 id="sumario"> Sumário </h3>

- <a href="#requisitos"> Requisitos para rodar o projeto:</a>
  - <a href="#requisitos">Requisitos.</a>
- <a href="#como-rodar">Como rodar o projeto:</a>
   - <a href="#run"> Run.</a>
- <a href="#tecnologias">Tecnologias e recursos utilizados no projeto.</a>

<hr>

<h3 id="requisitos"> Requisitos para rodar o projeto</h3>


<h4 id="requisitos"> Requisitos:</h4>

- <a target="_blank" href="https://maven.apache.org/">Maven</a>
- <a target="_blank" href="https://openjdk.java.net/install/">Java 8</a>
- <a target="_blank" href="https://www.h2database.com/html/main.html">H2 Database</a>

<hr>

<h3 id="como-rodar">  Rodar o projeto</h3>


<h4 id="rodar"> Como Rodar:</h4> 

- Gere o <b>.jar</b> da aplicação executando o comando no terminal:
    ```shell
    mvn clean install -Dskiptests
    ```

- Para rodar o <b>.jar</b> vá até a pasta do projeto pelo terminal e rode o comando:
    ```shell
   java -jar target/store-1.0.jar
     ```

<h3 id="tecnologias"> Tecnologias e recursos utilizadas no projeto</h3>

- Java
- Banco de Dados H2 Database
- Spring Web
- Mapper
- Swagger
- Lombok
- Arquivo 'data.sql' com dados pré definidos
<hr>

<h3 id="documentacao"> Acesso a documentação da API</h3>

<h4 id="acesso"> Documentação:</h4> 

- Quando a aplicação estiver executando acesse:
    ```shell
    http://localhost:8080/swagger-ui/
    ```

<hr>
