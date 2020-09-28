# ConsultaViaCep
Mini sistema web que faz consulta de endereços através do CEP usando a API publica ViaCEP.

# Motivação
Fiz esse projeto para praticar a integração de API Restful com tecnologias do Spring(Spring MVC, Sring Boot e etc).

## Começando

Para executar o projeto, será necessário instalar os seguintes programas:

- [JDK 8:](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)
- [Maven 3.6.3:](http://mirror.nbtelecom.com.br/apache/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip)
- [Spring Tool Suite:](https://spring.io/tools)

## Desenvolvimento

Para iniciar o desenvolvimento, é necessário clonar o projeto do GitHub num diretório de sua preferência:

```shell
cd "diretorio de sua preferencia"
git clone https://github.com/ivanilsonaraujojr/ConsultaViaCep.git
```
### Construção

Para construir o projeto com o Maven, executar os comando abaixo:

```shell
mvn clean install
```

O comando irá baixar todas as dependências do projeto e criar um diretório *target* com os artefatos construídos, que incluem o arquivo jar do projeto. Além disso, serão executados os testes unitários, e se algum falhar, o Maven exibirá essa informação no console.

## Configuração

Para executar o projeto, é necessário utilizar o STS, para que o mesmo identifique as dependências necessárias para a execução no repositório.m2 do Maven. Uma vez importado o projeto, basta rodar a classe "ConsultarcepApplication" e o Spring Boot irá ligar um servidor localhost na porta 8080.
