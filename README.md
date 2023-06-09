# sistema-cursos-webapp
Proyecto Full-stack de un sistema web de cursos con dos roles

## Tecnologias utilizadas:

1. Java y SptrinBoot
2. JWT (Jason Web Token)
3. PostgreSQL
4. Angular (Angular Material y Bootstrap)
5. Docker


## Descripción
Un proyecto web que cuenta con dos tipos de roles de usuario, el rol ADMIN tiene acceso a la interfaz donde se pueden agregar, editar y eliminar cursos.

El usuario que tiene rol NORMAL, tiene acceso a la interfaz de cursos, donde solo podrá ver los cursos registrados en la API.
El sistema cuenta con encriptación de contraseñas y JWT para la validacion de inicio de sesion

Tambien cuenta con un apartado de registro de usuarios donde se puede crear un usuario nuevo con el rol NORMAL para tener acceso a los cursos disponibles.

## Imagenes del sistema (interfaces básicas)

Formulario de registro
![Registro de usuarios](/images/registro.png)

Formulario de inicio de sesión
![login](/images/login.png)

Interfaz de usuario del administrador
![Interfaz del administrador](/images/admin.png)

Interfaz curso agregado
![Agregar nuevo curso](/images/add-curso.png)

Interfaz de usuario del usuario normal
![Interfaz de usuario normal](/images/user-normal.png)