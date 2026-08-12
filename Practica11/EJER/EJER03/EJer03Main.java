package Practica11.EJER.EJER03;
import Practica11.ACT.ACT03.*;
public class EJer03Main {

    public static void main(String[] args) {

        HashO<String> hash = new HashO<>(7);

        // Insertar elementos
        hash.insert(10, "Juan");
        hash.insert(17, "Ana");
        hash.insert(24, "Luis");
        hash.insert(31, "Rosa");
        hash.insert(5, "Pedro");
        hash.insert(12, "Carla");

        // Mostrar tabla
        System.out.println("tabla hash");
        hash.showTable();

        // Buscar clave 24
        System.out.println("\nbuscar 24");
        Register<String> reg = hash.search(24);

        if (reg != null) {
            System.out.println("Clave encontrada.");
            System.out.println("Nombre: " + reg.getData());
            System.out.println("Índice de la tabla: " + (24 % 7));

            // Si insertas al final de la lista es el nodo 3.
            // Si insertas al inicio será el nodo 2.
            System.out.println("Nodo de la lista: 3 (si la inserción fue al final)");
        } else {
            System.out.println("Clave no encontrada.");
        }

        // Eliminar clave 17
        System.out.println("\nelimina 27");

        if (hash.delete(17)) {
            System.out.println("Clave eliminada correctamente.");
        } else {
            System.out.println("La clave no existe.");
        }

        // Mostrar tabla nuevamente
        System.out.println("\nnueva tabla");
        hash.showTable();
    }
}