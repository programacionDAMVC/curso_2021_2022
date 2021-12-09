package teoria.tests;

import teoria.clases.Computer;

import java.util.ArrayList;
import java.util.Scanner;

public class TestComputer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Computer> computers = new ArrayList<>();
        Computer computer1 = new Computer();
        computer1.setRam(16);
        computer1.setCpu(3.5f);
        computer1.setMotherBoard("MSI");
        System.out.println(computer1);

        System.out.println("Introduce RAM, CPU y placa base del equipo");
        int ram = sc.nextInt();
      //  System.out.println("Introduce velocidad del procesador del equipo");
        float cpu = sc.nextFloat();
      //  System.out.print("Introduce placa base del equipo ");
        String matherB = sc.next();
        Computer computer2 = new Computer();
        computer2.setRam(ram);
        computer2.setCpu(cpu);
        computer2.setMotherBoard(matherB);
        System.out.println(computer2);

        computers.add(computer1);
        computers.add(computer2);
        System.out.println(computers);
    }
}
