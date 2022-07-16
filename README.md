# DSMeta
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/wferdinando/dsmeta-spring-react/blob/main/LICENCE) 

# Sobre o projeto

https://dsmeta-2022.netlify.app/

O DSmeta é uma aplicação fullstack web e mobile, desenvolvida durante a edição da **Semana DevSuperior**, evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

A aplicação consiste em uma listagem das vendas realizadas durante um periodo que pode ser especificado a critério do usuário, é possível realizar o envio de sms informando o total da venda, e em que data foi realizado.
Para o envio de SMS foi feita integração com a API da Twillio.

## Layout mobile
![Mobile 1](https://github.com/wferdinando/assets/blob/main/DSMeta/layoutMobile.jpeg)

## Layout web
![Web 2](https://github.com/wferdinando/assets/blob/main/DSMeta/layoutWeb.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Front end
- HTML / CSS / JS / TypeScript
- ReactJS
## Implantação em produção
- Back end: Heroku
- Front end web: Netlify
- Banco de dados: H2

# Como executar o projeto

## Back end
Pré-requisitos: Java 11+

```bash
# clonar repositório
git clone https://github.com/wferdinando/dsmeta-spring-react

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/wferdinando/dsmeta-spring-react

# entrar na pasta do projeto frontend 
cd frontend

# instalar dependências
yarn install

# executar o projeto
yarn dev
```

# Autor

Willyan Trautwein Ferdinando

https://www.linkedin.com/in/willyanferdinando/
