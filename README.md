# Spring Boot Data Jpa Demo

This example shows usage concepts of
* [Spring Data Jpa](http://projects.spring.io/spring-data-jpa)
* [Spring Security](http://projects.spring.io/spring-security) (basic authentication with username and password to secure rest api)
* [Spring HATEOAS](http://projects.spring.io/spring-hateoas)

## Running Project
```emacs
Change database connection parameters at application.properties file
spring.datasource.username=username
spring.datasource.password=password

Security parameters
security.user.name=admin
security.user.password=secret
```
## Run with Maven using spring-boot plugin
```emacs
:spring-boot-mongo> mvn spring-boot:run
```
