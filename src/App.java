import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {

        //runLinkedList();
        //runQueue();
        //runStack();

        System.out.println();
        System.out.println("Ejercicio 1");
        Ejercicio1 ejercicio1 = new Ejercicio1();
        String texto = "COMPUTACION";

        String invertido = ejercicio1.invertString(texto);
        System.out.println("Texto original: " + texto);
        System.out.println("Texto invertido: " + invertido);

        System.out.println();
        System.out.println("Ejercicio 2");
        Ejercicio2 ejercicio2 = new Ejercicio2();
        String palabra1 = "radar";
        String palabra2 = "computacion";
        String palabra3 = "anilina";
        String palabra4 = "reconocer";
        String palabra5 = "hola";   

        System.out.println(ejercicio2.esPalindromo(palabra1));
        System.out.println(ejercicio2.esPalindromo(palabra2));
        System.out.println(ejercicio2.esPalindromo(palabra3));
        System.out.println(ejercicio2.esPalindromo(palabra4));
        System.out.println(ejercicio2.esPalindromo(palabra5));

    }

    private static void runLinkedList() {

        System.out.println("Lista Enlazada / Linked List");
        LinkedList<String> nombres = new LinkedList<>();
        System.out.println("Está vacía? " + nombres.isEmpty());
        System.out.println("Tamanio: " + nombres.size());

        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Diego");

        System.out.println();
        System.out.println(nombres.getFirst());
        System.out.println(nombres.get(2));
        System.out.println(nombres.getLast());

        System.out.println();
        System.out.println(nombres.peek());
        System.out.println(nombres.size());

        System.out.println();
        System.out.println(nombres.pop());
        System.out.println(nombres.size());

        // add -> agrega al final
        // peek -> devuelve el primero sin eliminar
        // pop -> devuelve el primero y lo elimina

    }

    private static void runQueue() {

        System.out.println("Queue / Colas");
        Queue<String> cola = new ArrayDeque<>();

        cola.offer("Jose");
        cola.offer("Andres");
        cola.offer("Ana");

        System.out.println(cola.isEmpty());
        System.out.println(cola.size());

        System.out.println(cola.peek());
        System.out.println(cola.size());

        System.out.println(cola.poll());
        System.out.println(cola.size());

        while (!cola.isEmpty()) {

            String cliente = cola.poll();
            System.out.println("Atendí a " + cliente);
            System.out.println(cola.size());

        }

        // offer -> agrega al final
        // peek -> devuelve el primero sin eliminar
        // poll -> devuelve el primero y lo elimina

    }

    private static void runStack() {

        System.out.println("Stack / Pilas");

        // 3 formas de instanciar pilas
        
        // 1ra forma / arrays internos
        Stack<String> pila = new Stack<>();

        pila.push("A");
        pila.push("B");
        pila.push("C");

        String elemento = pila.pop();
        System.out.println(pila.size());
        System.out.println(elemento);

        // 2da forma / arrays internos
        Deque<String> pila2 = new ArrayDeque<>();// <- recomendada
        // 3ra forma / enlazada
        Deque<String> pila3 = new LinkedList<>();

        pila2.push("a");
        pila3.push("A");

        pila.pop();
        pila.pop();

    }

}
