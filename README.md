# POO
# Proyecto POO - Sistema de Gestión de Usuarios y Meses

Este proyecto es una aplicación de escritorio desarrollada en Java que permite a los usuarios registrarse, iniciar sesión y visualizar una matriz de meses con sus respectivos días.

## Estructura del Proyecto

```
Main.java
usuarios.txt
Controlador/
    controlador.java
Modelo/
    Modelo.java
Vista/
    Vista.java
```

## Requisitos Previos

- Tener instalado [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) (versión 8 o superior).
- Tener configurado [Git](https://git-scm.com/).

## Clonar el Repositorio

Para clonar este repositorio desde GitHub, ejecuta el siguiente comando en tu terminal:

```bash
git clone https://github.com/tu-usuario/tu-repositorio.git
```

Asegúrate de reemplazar `tu-usuario` y `tu-repositorio` con el nombre de tu usuario y repositorio en GitHub.

## Ejecutar el Proyecto

1. Navega al directorio del proyecto:

   ```bash
   cd tu-repositorio
   ```

2. Compila los archivos `.java`:

   ```bash
   javac Main.java Controlador/controlador.java Modelo/Modelo.java Vista/Vista.java
   ```

3. Ejecuta el archivo `Main.java`:

   ```bash
   java Main
   ```

## Notas

- El archivo `usuarios.txt` se utiliza para almacenar las credenciales de los usuarios registrados. Asegúrate de que este archivo exista en el directorio raíz del proyecto.
- Si encuentras algún problema, verifica que las rutas de los archivos sean correctas y que tengas permisos de escritura en el directorio.

## Contribuciones

Si deseas contribuir a este proyecto, realiza un fork del repositorio, realiza tus cambios y envía un pull request.

## Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.
