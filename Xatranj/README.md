

# Xatranj

enunciado: https://eduardsorita.notion.site/Xatranj-cf939e5b8ddd436796941b3e0f8083fb
Este proyecto implementa el juego Xatranj, un antiguo precursor del ajedrez moderno. El objetivo es crear una versión jugable del juego que permita a dos usuarios competir entre sí desde la consola.

## Reglas del Juego

El Xatranj sigue reglas similares al ajedrez moderno, pero con algunas diferencias notables. Algunas de las reglas importantes incluyen:

- Representación de piezas mediante letras, con mayúsculas para las piezas blancas y minúsculas para las negras.
- Turnos alternativos, comenzando con las blancas.
- Finalización de la partida cuando uno de los reyes es capturado o un jugador queda con solo el rey.
- Movimientos específicos para cada tipo de pieza, incluyendo el movimiento de peones, caballos, torres, etc.

## Estructura del Proyecto

El proyecto consta de las siguientes clases principales:

- **Xatranj**: Clase principal que inicia el juego y controla el flujo del mismo.
- **Tauler**: Clase que representa el tablero de juego y gestiona las posiciones de las piezas.
- **Fitxa**: Clase base abstracta para las piezas del juego, con subclases para cada tipo de pieza (por ejemplo, Ruhk, Faras, Elefant, etc.).
- **Piezas Individuales**: Heredan de Fitxa y aplican su lógica

## Instrucciones de Uso

Para ejecutar el juego, simplemente inicia la clase `Xatranj` desde tu IDE o terminal de la siguiente manera:

```bash
java Xatranj
