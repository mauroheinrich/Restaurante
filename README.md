# Restaurante API

Este proyecto es un ejercicio integrador del curso Todo Code. Se trata de una API REST desarrollada en Spring Boot que permite gestionar un menú de un restaurante con 5 platos disponibles. Cada plato tiene un número de identificación, un nombre, un precio y una breve descripción.

## Tecnologías utilizadas
- Java 17
- Spring Boot 3.4.2
- Maven
- Lombok

## Estructura del Proyecto

### 1. `pom.xml`
Archivo de configuración de Maven que define las dependencias necesarias para el proyecto, incluyendo Spring Boot, Lombok y herramientas de desarrollo.

### 2. Controlador (`PlatoController`)
Ubicado en `ar.com.mauroheinrich.Restaurante.controller`, este controlador maneja las solicitudes HTTP relacionadas con los platos del menú. Actualmente, permite obtener información de un plato específico mediante su número.

### 3. Modelo (`Plato`)
Ubicado en `ar.com.mauroheinrich.Restaurante.modelo`, representa la entidad `Plato` con atributos como número, nombre, precio y descripción. Usa Lombok para evitar la escritura manual de getters y setters.

## Uso
Para ejecutar el proyecto:
1. Clonar el repositorio en GitHub.
2. Importarlo como un proyecto Maven en un IDE compatible.
3. Ejecutar la aplicación como un servicio Spring Boot.
4. Acceder a `http://localhost:8080/platos/{numero}` para obtener información de un plato por su número.

## Contribuciones
Las contribuciones son bienvenidas. Si encuentras errores o quieres mejorar la API, abre un issue o haz un pull request.
<h3 align="left">Conéctate conmigo:</h3>
<p align="left">
  <a href="https://twitter.com/mauroheinrich" target="_blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/twitter.svg" alt="mauroheinrich" height="30" width="40" /></a>
  <a href="https://linkedin.com/in/mauroheinrich" target="_blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linked-in-alt.svg" alt="mauroheinrich" height="30" width="40" /></a>
  <a href="https://stackoverflow.com/users/20105268/mauro-heinrich" target="_blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/stack-overflow.svg" alt="mauroheinrich" height="30" width="40" /></a>
  <a href="https://fb.com/mauroheinrich" target="_blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/facebook.svg" alt="mauroheinrich" height="30" width="40" /></a>
  <a href="https://instagram.com/mauroheinrich" target="_blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/instagram.svg" alt="mauroheinrich" height="30" width="40" /></a>
  <a href="https://discord.gg/mauroheinrich" target="_blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/discord.svg" alt="mauroheinrich" height="30" width="40" /></a>
  <a href="https://wa.me/5493436201089" target="_blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/whatsapp.svg" alt="WhatsApp" height="30" width="40" /></a>
</p>

