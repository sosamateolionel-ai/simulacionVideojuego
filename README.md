# Simulación de Videojuego

## Descripción

Este proyecto simula una batalla entre dos personajes utilizando Programación Orientada a Objetos en Java.

En la batalla participan un **Guerrero** y un **Mago**. Cada personaje tiene puntos de vida y un poder de ataque. Los personajes se atacan por turnos hasta que uno de ellos es derrotado.

## Funcionamiento

Al comenzar el programa se crean dos personajes:

* **Guerrero:** 100 puntos de vida y 20 de poder de ataque.
* **Mago:** 80 puntos de vida y 30 de poder de ataque.

La batalla funciona mediante turnos:

1. El Guerrero ataca al Mago.
2. Se verifica si el Mago fue derrotado.
3. Si el Mago continúa con vida, ataca al Guerrero.
4. Se incrementa el número de turno.
5. El proceso continúa hasta que uno de los personajes queda derrotado.
6. Al finalizar, se muestra qué personaje ganó la batalla.

## Clase `Personaje`

La clase `Personaje` representa a cada participante de la batalla.

### Atributos

Los atributos están encapsulados utilizando `private`:

* `nombre`: nombre del personaje.
* `puntosVida`: cantidad de vida disponible.
* `poderAtaque`: cantidad de daño que puede realizar.

### Constructor

```java
public Personaje(String nombre, int puntosVida, int poderAtaque)
```

Permite crear un personaje indicando su nombre, puntos de vida y poder de ataque.

## Métodos principales

### `estaDerrotado()`

Verifica si los puntos de vida del personaje son menores o iguales a `0`.

```java
public boolean estaDerrotado()
```

Devuelve `true` si el personaje está derrotado y `false` si continúa con vida.

### `atacar(Personaje oponente)`

Permite que un personaje ataque a otro.

Antes de realizar el ataque se verifica que:

* El atacante no esté derrotado.
* El oponente no esté derrotado.

Luego se llama al método `recibirDanio()` del oponente.

### `recibirDanio(int cantidad)`

Resta los puntos de daño recibidos a los puntos de vida del personaje.

Si la vida queda por debajo de `0`, se establece en `0`.

También informa cuando un personaje queda derrotado.

### Getters

La clase utiliza getters para acceder a los atributos privados:

```java
getNombre()
getPuntosVida()
getPoderAtaque()
```

## Ejemplo de batalla

Los personajes comienzan con:

```text
Guerrero → Vida: 100 | Ataque: 20
Mago     → Vida: 80  | Ataque: 30
```

En cada turno se realizan los ataques de forma alternada.

El Guerrero realiza 20 puntos de daño al Mago, mientras que el Mago realiza 30 puntos de daño al Guerrero.

Después de varios turnos, uno de los personajes llega a `0` puntos de vida y es declarado derrotado.

## Conceptos utilizados

Este ejercicio permite practicar:

* Programación Orientada a Objetos.
* Clases y objetos.
* Constructores.
* Atributos privados.
* Encapsulamiento.
* Getters.
* Métodos.
* Parámetros de tipo objeto.
* Asociación entre objetos.
* Condicionales `if`.
* Bucle `while`.
* Uso de `break`.
* Valores booleanos.
* Simulación de turnos.
* Interacción entre objetos.

## Ejecución

<img width="506" height="762" alt="image" src="https://github.com/user-attachments/assets/8712dc45-0357-4768-afd5-eda527744d41" />

## Tecnologías utilizadas

* Java
* IntelliJ IDEA
* Git
* GitHub

## Autor

Proyecto realizado como práctica de Programación Orientada a Objetos.
