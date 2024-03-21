# Actividad. Herencia de Clases Abstractas e Interfaces

### Instrucciones

A partir del proyecto del sistema de reserva de Viajes (`class Travel`) realiza los siguientes puntos:

1. Crear la clase International para viajes internacionales, contemplar que ahora el usuario proporciona el nombre del Pais y la Cuidad.
2. Existe un miembro en la Clase Travel que a pesar de ser abstracta, podría ser idéntico tanto en National como en International. En caso de afirmación, agrega el cuerpo en la clase abstracta y elimínala de sus hijos.
3. Debemos establecer los impuestos por país, y las ciudades a donde viajar:

    - Alemania tiene el 16% del precio total como impuesto y las ciudades disponibles son:
      - Munich, $980 por día
      - Berlín, $820 por día
      - Francfort, $850 por día
      
    - Chile cobra únicamente el 5% como impuesto y sus ciudades son:
      - Santiago, $643 por día
      - Valparaíso, $721 por día 
      
    - Canadá cobra el 10% de impuesto y las ciudades a visitar son:
      - Vancouver, $620 por día 
      - Ottawa, $680 por día 
      - Montreal, $600 por día

4. Redefinir la función `getPrice()` para que se obtenga el precio de un viaje con impuesto incluido.
5. Crear una interfaz que permita cancelar viajes. Implementarlo en la clase `NationalLowSeason`.
