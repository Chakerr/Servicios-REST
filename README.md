# Laboratorio-2-Servicios-REST

## Descripción del Proyecto
Este repositorio contiene la implementación de un servicio REST utilizando JEE, con el objetivo de exponer la lógica de negocio de la aplicación "Muebles los Alpes". Para facilitar las pruebas, se ha utilizado un objeto Mock que simula la funcionalidad del EJB sin necesidad de conectarse a una base de datos real.

## Tecnologías Utilizadas
- **Java EE** para la implementación del servicio REST.
- **JAX-RS** para la exposición del endpoint RESTful.
- **Mock Objects** para simular la lógica de negocio.
- **Postman** para pruebas del servicio.
- **JSON** como formato de intercambio de datos.
- **GitHub** para el control de versiones y almacenamiento del código.

## Servicio Implementado
Se ha desarrollado el siguiente servicio REST en la capa lógica (`logica.ejb`):

- **ServicioSeguridadMock**: Maneja la autenticación y autorización.

Este servicio cuenta con las operaciones **GET, POST, PUT y DELETE** para la gestión de los recursos correspondientes.

## Pruebas
Para validar la funcionalidad del servicio, se utilizaron pruebas con Postman, verificando las siguientes operaciones:
- **GET**: Recuperación de información.
- **POST**: Creación de nuevos registros.
- **PUT**: Actualización de datos existentes.
- **DELETE**: Eliminación de registros.
