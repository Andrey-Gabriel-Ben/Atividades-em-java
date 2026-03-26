//Crie a classe Forma com o método calcularArea() e, as subclasses: Quadrado e Circulo e, exibaas áreas correspondentes a cada figura.
class Forma {
    void calcularArea(double area) {

        System.out.println("A área da forma é " + area + " m²");
    }
}

class Quadrado extends Forma{

    void calcularArea(double lado) {
        double area;

        area = lado*lado;

        System.out.println("A área do quadrado de lado " + lado + "m é " + area + " m²");
    }
}

class Circulo extends Forma{

    void calcularArea(double raio ) {
        double area;

        area = Math.PI * (raio*raio);

        System.out.println("A área do circulo de raio" + raio + "m é " + area + " m²");
    }
}

public class atividade2 {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        q1.calcularArea(5);

        Circulo c1 = new Circulo();
        c1.calcularArea(5);
        

    }
}
