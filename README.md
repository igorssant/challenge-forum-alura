# Chalenge Java Back-end - Fórum Alura - API REST

## Sumário
* [O Desafio](#o-desafio)
* [Finalidade do sistema](#os-requisitos)
* [Tecnologias Utilizadas](#tecnologias-utilizadas)
* [Os Requisitos](#os-requisitos)
* [Configuração do Banco de Dados MySQL](#criando-o-banco-de-dados)

## O Desafio
Desenvolver uma API RESTful utilizando Spring Boot.

## Finalidade do Sistema
* Criar um novo tópico
* Atualizar um tópico
* Deletar um tópico
* Mostrar todos os tópicos criados
* Mostrar um tópico específico

## Tecnologias Utilizadas
* Java
* Spring Boot V. 3.1.4
* Token JWT
* JPA - Spring Data
* MySQL - SGBD
* Swagger UI
* BCrypt Password
* Spring Security
* IntelliJ IDEA - IDE

## Os Requisitos
* Java 17 ou superior
* MySQL

## Configuração do Banco de Dados MySQL
### Criando o Banco de Dados
``` sql
    CREATE DATABASE ForumAlura;  
```

### As tabelas:
O arquivo de criação das tabelas se encontra pelo nome de ***bancoDeDados.sql***.
* tbl_usuario
* tbl_autor
* tbl_estado_topico
* tbl_curso
* tbl_topico