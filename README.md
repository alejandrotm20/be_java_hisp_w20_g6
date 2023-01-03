# MeliSocial
## Sprint 1

## Miembros
* Alejandro Torres
* Augusto Díaz
* Daniel Andres Angel Rojas
* Daniela Villamizar
* David Nuñez
* Diana Parra
* Juan Carlos Ortiz
## Consigna del ejercicio

Mercado Libre sigue creciendo y para el año que viene  tiene como objetivo empezar a implementar una serie de herramientas que permitan a los compradores y vendedores tener una experiencia totalmente innovadora, en donde el lazo que los una sea mucho más cercano. 

Para poder realizar esto, un analista funcional relevó una serie de requerimientos que deben llevarse a cabo.
## Tecnologías
* Java 11
* SpringBoot 2.7.7
## Decisiones de equipo


## Modelado

### Usuario
![Modelado de clase Usuario](https://i.ibb.co/dBqjCJP/Diagrama-Sprint1-Pa-gina-1-3.jpg)

### Producto
![Modelado de clase producto](https://i.ibb.co/DKpNSpt/Diagrama-Sprint1-Pa-gina-1-4.jpg)

### Publicación
![Modelado de la clase publicación](https://i.ibb.co/t4xHWZH/Diagrama-Sprint1-Pa-gina-1-5.jpg)

<!---[Enlace al repo original](https://github.com/alejandrotm20/be_java_hisp_w20_g6)-->

## Endpoints
**US0001**:
Poder realizar la acción de "Follow" (seguir) a un determinado vendedor

| METHOD | SIGN | EJEMPLO |
|:------- | :------- | :-------|
|`POST`| `/users/{userId}/follow/{userIdToFollow}` | `/users/1/followers/count`


RESPONSE: Status code 200 - DTO | Status code 400 - DTO

RESPONSABLE: Daniela Villamizar
***
**US0002**:
Obtener el resultado de la cantidad de usuarios que siguen a un determinado vendedor

| METHOD | SIGN | EJEMPLO | 
|:-------|:-------|:-------|
|`GET`| `/users/{userId}/followers/count` | `/users/1/followers/count` |



RESPONSE:
~~~json
{
    "user_id": 1,
    "user_name": "pablito1",
    "followers_count": 35
}
~~~

Responsable: Alejandro Torres
***
**US0003**:
Obtener un listado de todos los usuarios que siguen a un determinado vendedor (¿Quién me sigue?)

| METHOD | SIGN | EJEMPLO|
|:-------|:---------------|:--------------------|
|`GET`| `/users/{userId}/followers/list` | `/users/1/followers/list`|



RESPONSE:
```json
{
    "user_id": 234,
    "user_name": "vendedor1",
    "followers": [
        {
            "user_id": 4698,
            "user_name": "usuario1"
        },
        {
            "user_id": 1536,
            "user_name": "usuario2"
        },
        {
            "user_id": 2236,
            "user_name": "usuario3"
        }
    ]
}
```
RESPONSABLE: Daniel Andres Angel Rojas
***
**US0004**: 


