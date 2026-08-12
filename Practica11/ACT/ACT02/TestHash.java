package ACT02;

public class TestHash {
    public static void main(String[] args) {

        HashC<String> hash = new HashC<>(7);
        System.out.println("insertar");
        hash.insert(5, "Cinco");
        hash.insert(12, "Doce");
        hash.insert(19, "Diecinueve");
        hash.insert(26, "Veintiséis");

        System.out.println("\nPrimera tabla hash");
        System.out.println(hash);

        // Ejecucion a
        System.out.println("Eliminar 12");
        hash.delete(12);
        System.out.println("\nSegunda tabla hash:");
        System.out.println(hash);
        System.out.println("Se elimino y la posicion quedo como eliminado");


        // Ejecucion b
        System.out.println("\nbuscar 19");

        String valor = hash.search(19);

        if (valor != null){
            System.out.println("Clave 19 encontrada\n Valor = " + valor);
        }else{
            System.out.println("Clave 19 no encontrada.");
        }   


        // Ejecucion c
        System.out.println("\ninsertar 33");
        hash.insert(33, "Treinta y tres");
        System.out.println("\nTercera tabla hash:");
        System.out.println(hash);
        System.out.println("se inserto en la posicion eliminada sin problemas");


    }
}