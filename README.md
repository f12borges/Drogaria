<h1 align="center">
    Drogaria
</h1>

<h4 align="center">
    Projeto criado através do curso Programação Web com Java do Professor Sergio Roberto Delfino.
</h4>

<p align="center">
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/f12borges/Drogaria">
  <img alt="Repository size" src="https://img.shields.io/github/repo-size/f12borges/Drogaria?color=yellow">
  <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/f12borges/Drogaria?color=red">    
  <img alt="License" src="https://img.shields.io/github/license/f12borges/Drogaria?color=brightgreen">
  <img alt="Stargazers" src="https://img.shields.io/github/stars/f12borges/Drogaria?style=social">
  </p>

<h4 align="center">
	⚗ PAUSADO. ⚗
</h4>


## 💻 Sobre o projeto
Este projeto tem como objetivo atender uma drogaria com as funcionalidades básicas de controle de pessoas, funcionários, clientes, fabricantes, usuários, produtos e vendas.

---

## 🔗 Pré-requisitos

Para executar o projeto, será necessário instalar os seguintes programas:

- [JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html) Necessário para executar o projeto Java.
- [Eclipse](https://www.eclipse.org/downloads/packages/release/2021-03/r/eclipse-ide-java-developers) Para importar o projeto.
- [MySQL Workbench](https://dev.mysql.com/downloads/windows/installer/8.0.html) Banco de dados utilizado no projeto.

---

## 💽 Baixando o projeto

```bash
# Escolha um diretório
cd "diretorio de sua preferencia"

# Clone este repositório
git clone https://github.com/f12borges/Drogaria
```

---

## ⏭ Executando o projeto

Passos:
1. Para executar o projeto, é necessário importa-lo utilizando o Eclipse, para que o mesmo identifique as dependências necessárias para a execução e baixe-as no repositório .m2 do Maven.

```bash
# No eclipse
File > Import > Maven > Existing Maven Porjects > Next

Em Root Directory informe o diretório onde baixou o projeto e o mesmo será apresentado para importação.

Selecione-o e clique no botão Finish.
```

2. Configurar o banco de dados.

```bash
# No Workbench
Crie um banco de dados com as informações contidas no arquivo hibernate.cfg.xml.

Altere a propriedade hbm2ddl.auto para create (apenas para primeira execução e depois volte
para validate) para que as tabelas sejam criadas no banco.

Execute o HibernateUtilTest.java com Run As JUnit Test para que as tabelas sejam criadas.
```
