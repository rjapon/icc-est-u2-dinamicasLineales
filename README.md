# Práctica: Estructuras Dinamicas Lineales

## Datos del Estudiante

- **Nombre:** Richard Javier Japón Lituma
- **Curso:** Estructuras de Datos

---

## 1. Implementación de estructuras dinamicas lineales

**Fecha:** [08/06/2026]
**Descripción:** En esta clase se muestra el uso de las estructuras de datos LinkedList, Queue y Stack, así como un ejercicio para invertir una cadena de texto utilizando una pila.

Ejercicio 1: Invertir un string utilizando una pila

## Captura del codigo de implementacion del ejercicio 1:

![Captura de codigo de implementacion E1](<src/Assets/Captura de pantalla 2026-06-08 085830.png>)

## Captura de la salida en consola:

![Captura de la salida en consola E1](<src/Assets/Captura de pantalla 2026-06-10 080644.png>)

## 2. Ejercicio Palíndromo

**Fecha:** [10/06/2026]

**Descripción:** Se realizo la practica de para verificar si una palabra es palindromo o no, se utilizo el mismo metodo de invertir la palabra pero se comparo con la original para verificar si es un palindromo o no.

### Método implementado

```java
public boolean esPalindromo(String texto) {
    // Implementación del método
    Deque<Character> pila = new ArrayDeque<>();

        for (char letra : texto.toCharArray()) {
            pila.push(letra);
        }

        String invertido = "";

        while (!pila.isEmpty()) {
            invertido += pila.pop();
        }

        return texto.equals(invertido);
}


## Captura de la salida en consola:

![Captura de la salida en consola E2](<src/Assets/Captura de pantalla 2026-06-10 081224.png>)

```
