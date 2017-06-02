Instrucciones para el uso de la herramienta
===========================================================

1. Contar con Java 7 instalado.
2. Descarga el archivo .jar a ejecutar:
    * Para creación de arboles de categoras nuevos: https://github.com/mcvitanich/googleads-java-lib/blob/create-adunits/examples/dfp_axis/target/dfp-axis-examples-3.2.0-jar-with-dependencies.jar (botón "Download").
    * Para actualización de ad units para editar los tamaños: https://github.com/mcvitanich/googleads-java-lib/blob/update-adunits/examples/dfp_axis/target/dfp-axis-examples-3.2.0-jar-with-dependencies.jar
2. Contar con el archivo de autenticación en formato .json que contiene la clave de acceso a la API de DFP.
3. Copiar el contenido del archivo [ads.properties](https://github.com/mcvitanich/googleads-java-lib/blob/create-adunits/examples/dfp_axis/src/main/resources/ads.properties) y guardarlo en la carpeta de inicio/home del usuario (Por ejemplo en Windows: "C:\Users\Federico").
4. Editar el archivo ads.properties, en la linea 16:

    api.dfp.jsonKeyFilePath=INSERT_PATH_TO_JSON_KEY_FILE_HERE

    Reemplazar el valor "INSERT_PATH_TO_JSON_KEY_FILE_HERE" con la ruta completa al archivo de llave de autenticación (archivo .json) utilizando doble \ en lugar de una sola.
    Por ejemplo si el archivo se llama google_key.json y se ubica en C:\Users\Virigina\google_key.json:

    api.dfp.jsonKeyFilePath=C:\\Users\\Virginia\\google_key.json

5. Ejecutar la herramienta en la consola (en Windows: cmd, "command prompt" o "símbolo del sistema") con el comando:

    java -jar <ruta/nombre del archivo> <ruta/nombre del archivo de input>

    Por ejemplo, si el jar se llamara "dfp-create.jar" y el archivo de input "mla-test.txt" están en la carpeta de Usuario, abrir la consola en esa carpeta y ejecutar el comando:

    java -jar dfp-create.jar mla-test.txt

    ó con rutas absolutas:

    java -jar C:\Users\Virginia\dfp-create.jar C:\Users\Virginia\mla-test.txt
