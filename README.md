# Spring boot with H2 and MySQL

En aquesta tasca faràs un CRUD (Create, Read, Update, Delete) amb 3 bases de dades diferents.
Aprendràs a usar correctament els verbs HTTP i a gestionar els codis de resposta.

## Exercici CRUD amb H2

Accedeix a la pàgina ->https://start.spring.io/, i genera un projecte Spring boot amb les següents característiques:

PROJECT (gestor de dependències): Maven o Gradle
LANGUAGE: Java
SPRING BOOT: La darrera versió estable

PROJECT METADATA
Group: cat.itacademy.s04.t02.n01
Artifact: S04T02N01
Name: S04T02N01
Description: S04T02N01GognomsNom
Package name: cat.itacademy.s04.t02.n01

PACKAGIN: Jar
JAVA: Mínim versió 11 

Dependències:
- Spring Boot DevTools
- Spring Web
- Spring Data JPA
- H2 Database

## Exercici CRUD amb MySQL

Accedeix a la pàgina ->https://start.spring.io/, i genera un projecte Spring boot amb les següents característiques:

PROJECT (gestor de dependències): Maven o Gradle
LANGUAGE: Java
SPRING BOOT: La darrera versió estable

PROJECT METADATA
Group: cat.itacademy.s04.t02.n02
Artifact: S04T02N02
Name: S04T02N02
Description: S04T02N02
Package name: cat.itacademy.s04.t02.n02

PACKAGIN: Jar
JAVA: Mínim versió 11

Dependències:
- Spring Boot DevTools
- Spring Web
- Spring Data JPA
- MySQL Driver

## Enunciat

Tenim una entitat anomenada "Fruita", que disposa de les següents propietats:

- int id
- String nom
- Int quantitatQuilos
  
Aprofitant l’especificació JPA, hauràs de persistir aquesta entitat a una base de dades H2 o MySQL, seguint el patró MVC. Per a això, depenent del Package principal, crearàs una estructura de packages, on ubicaràs les classes que necessitis:

- cat.itacademy.s04.t02.n01.controllers
- cat.itacademy.s04.t02.n01.model
- cat.itacademy.s04.t02.n01.services
- cat.itacademy.s04.t02.n01.repository
- cat.itacademy.s04.t02.n01.exception
- 
La classe ubicada al paquet controllers (FruitController, per exemple), haurà de ser capaç de donar resposta a les següents peticions per actualitzar i consultar informació:

- http://localhost:8080/fruit/add
- http://localhost:8080/fruit/update
- http://localhost:8080/fruit/delete/{id}
- http://localhost:8080/fruit/getOne/{id}
- http://localhost:8080/fruit/getAll
