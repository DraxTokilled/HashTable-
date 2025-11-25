# HashTable en Java

Este proyecto implementa una tabla hash simple en Java que utiliza listas para manejar las colisiones mediante el método de "encadenamiento" (chaining).

## Descripción

El programa lee números enteros desde un archivo de entrada (`entrada_hash.txt`), los almacena en una tabla hash y luego muestra el contenido de la tabla en un archivo de salida (`salida_hash.txt`). La función de hash utiliza el operador módulo para distribuir los valores entre las diferentes posiciones de la tabla.

## Estructura

- **Tamaño de la tabla:** 10 posiciones
- **Colisiones:** Se manejan usando `ArrayList` en cada posición de la tabla
- **Archivo de entrada:** Se espera que exista un archivo llamado `entrada_hash.txt` donde cada línea sea un número entero
- **Archivo de salida:** El resultado se guarda en un archivo llamado `salida_hash.txt` que muestra el contenido final de la tabla hash

## Ejecución

1. Crea un archivo llamado `entrada_hash.txt` en el mismo directorio que el programa y coloca en él los números enteros que deseas insertar, uno por línea.
   
   Ejemplo de `entrada_hash.txt`:
   ```
   15
   23
   7
   32
   11
   ```

2. Compila el programa:
   ```sh
   javac hash.java
   ```

3. Ejecuta el programa:
   ```sh
   java hash
   ```

4. Revisa el archivo `salida_hash.txt` para ver la tabla hash creada. También aparecerá un mensaje en consola confirmando que el proceso ha finalizado.

## Ejemplo de salida

Supongamos que el archivo de entrada contiene los valores `15`, `23`, `7`, `32`, y `11`. El archivo `salida_hash.txt` tendría una salida similar a:

```
=== TABLA HASH ===

0 -> []
1 -> [11]
2 -> [32]
3 -> []
4 -> []
5 -> [15]
6 -> []
7 -> [7]
8 -> []
9 -> [23]
```

## Notas

- Asegúrate de que el archivo `entrada_hash.txt` exista y tenga los datos antes de ejecutar el programa.
- El programa usa escritura y lectura básica de archivos. No maneja errores de formato en el archivo de entrada.

## Autor

Proyecto desarrollado por [DraxTokilled](https://github.com/DraxTokilled).
