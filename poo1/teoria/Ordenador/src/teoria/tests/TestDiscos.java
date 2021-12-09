package teoria.tests;

import teoria.constructores.Disco1;
import teoria.constructores.Disco2;
import teoria.constructores.Disco3;

public class TestDiscos {
    public static void main(String[] args) {
        Disco1 disco1 = new Disco1();
        disco1.setMarca("Kingston");
        disco1.setCapacidad(1);
        System.out.println(disco1);

        Disco2 disco2 = new Disco2("Samsug", 2);
        disco2.setCapacidad(3); //cambio la capacidad del disco
        System.out.println(disco2);

        Disco3 disco3_1 = new Disco3("Seagate", 4);
        disco3_1.setCapacidad(3);
        System.out.println(disco3_1);
        Disco3 disco3_2 = new Disco3();
        disco3_2.setCapacidad(4);
        disco3_2.setMarca("Toshiba");
        System.out.println(disco3_2);
        Disco3 disco3_3 = new Disco3("Winchester");
        System.out.println(disco3_3);
    }
}
