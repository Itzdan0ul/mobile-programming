# Comprensión: Views, Button, Inputs e Imágenes

### Instrucciones

**_Nota_**: *Para realizar este actividad es necesario continuar con el ejercicio realizado en clase y seguir las siguientes instrucciones.*

1. Cambiar de color de los siguientes elementos:
   - El background del layout en un tono azul.
   - Las letras del `TextView` y `Button` color gris (usar el atributo `textColor`).
2. El contenido de un `Button` es su texto. Aumentar el espacio del botón en 8dp verticalmente y 16dp horizontalmente.
3. Cuando el usuario pulse el botón, este debe deshabilitarse (atributo enabled tipo booleano) y el texto debe hacerse invisible (atributo `visibility` con valores `View.VISIBLE`, `View.INVISIBLE`  y `View.GONE`)
4. Crear una aplicación cuya interfaz tenga el siguiente diseño:
<p align="center">
  <img src=".github/app.png" width="200" height="auto" title="UI Example" />
</p>
5. Cuando el usuario pulse ACEPTAR, deberán existir los siguientes dos casos.
   
   a) Ningún campo está vacío: se mostrará una imagen con una palomita verde en señal de autenticación correcta.

   b) Uno o todos los campos están vacíos: se mostrará una imagen con una paloma roja en señal de error de autenticación.