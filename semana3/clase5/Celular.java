public class Celular {

    // atributos
    String marca;
    String modelo;
    int bateria = 100;
    int llamar;

    // metodo
    public void llamar(int numero) {
        System.out.println("Llamando al " + numero + "..... ");
        this.bateria = -5;

    }

}