#############  EJERCICIO E2E  ###############
Realizar una prueba funcional automatizada (Prueba E2E) de un flujo de compra en la página
https://www.saucedemo.com/ que incluya:
• Autenticarse con el usuario: standard_user y password: secret_sauce
• Agregar dos productos al carrito
• Visualizar el carrito
• Completar el formulario de compra
• Finalizar la compra hasta la confirmación: “THANK YOU FOR YOUR ORDER”

#############  REQUISITOS  ###############
Para ejecutar el proyecto es necesario tener instalado lo siguiente:
    - Sistemas operativos para desplegar el proyecto (Windows10, Linux o MacOS)
    - IDE IntelliJ version 2022.1
    - Gradle 8.0, se lo puede instalar dentro del S.0 (variables de entorno) o unicamente en el proyecto.
    - JDK versión 17+, se lo puede instalar dentro del S.0 o unicamente en el proyecto.

## Ejecucion
- Para ejecutar el proyecto
        1. Abrir el IDE IntellijIdea
        2. Abrir el proyecto de donde se encuentre descargado.
        3. Esperar unos minutos para que se descargen las despendencias (gradle)
        4. Una vez que el proyecto haya completado el paso anterior hay que ubicarse en la siguiente ruta java/com/practica/runners/Runner.java y hacer clic derecho para ejecutar la clase con la opcion Run 'Runner'
        5. Ya finalizada la ejecucion se crea el Reporte Serenity que se encuentra el la ruta target/serenity/index.html
        6. El proyecto ha sido creado con escenarios Online para poder modificar los datos de entrada para simular diferentes escenarios.

