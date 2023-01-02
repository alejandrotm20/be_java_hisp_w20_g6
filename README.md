# MeliSocial
## Sprint 1

## Consigna del ejercicio

Mercado Libre sigue creciendo y para el año que viene  tiene como objetivo empezar a implementar una serie de herramientas que permitan a los compradores y vendedores tener una experiencia totalmente innovadora, en donde el lazo que los una sea mucho más cercano. 
La fecha de lanzamiento se aproxima, por lo cual es necesaria la presentación de una versión Beta de lo que va a ser conocido como “SocialMeli”, en donde los compradores van a poder seguir a sus vendedores favoritos y enterarse de todas las novedades que los mismos posteen.
Para poder realizar esto, un analista funcional relevó una serie de requerimientos que deben llevarse a cabo; sin embargo, como cuentan con una determinada complejidad y los tiempos son escasos, deberán ser ejecutados en equipos de trabajo. Los mismos se detallan a continuación:
Se plantea creación de una API Rest que permita:
1. Poder realizar la acción de “Follow” (seguir) a un determinado usuario
2. Poder realizar la acción de “Unfollow” (dejar de seguir) a un determinado vendedor.
3. Obtener un listado de todos los usuarios que siguen a un determinado vendedor (¿Quién me sigue?)
4. Obtener un listado de todos los vendedores a los cuales sigue un determinado usuario (¿A quién sigo?)
5. Obtener el resultado de la cantidad de usuarios que siguen a un determinado vendedor
6. Dar de alta una nueva publicación.
7. Obtener un listado de las publicaciones realizadas en las últimas dos semanas, por los vendedores que un usuario sigue (para esto tener en cuenta ordenamiento por fecha, publicaciones más recientes primero).

Por otra parte, dado que se pretende una buena experiencia de usuario con respecto a la forma de presentación de los resultados de cada consulta, se necesita que los mismos puedan ser ordenados mediante cualquiera de los siguientes criterios: 

8. Alfabético Ascendente y Descendente
9. Fecha Ascendente y Descendente

## Modelado

### Usuario
![Modelado de clase Usuario](https://i.ibb.co/dBqjCJP/Diagrama-Sprint1-Pa-gina-1-3.jpg)

### Producto
![Modelado de clase producto](https://i.ibb.co/DKpNSpt/Diagrama-Sprint1-Pa-gina-1-4.jpg)

### Publicación
![Modelado de la clase publicación](https://i.ibb.co/t4xHWZH/Diagrama-Sprint1-Pa-gina-1-5.jpg)

