package teoria.clases;

/**
 * Clase computer que represanta a ordenadores en general
 * @author Manuel Molino
 * @version 1.0.0
 */
public class Computer {
    //atributos
    private int ram;
    private float cpu;
    private String motherBoard;

    //getters y setters

    /**
     * getter del atributo ram
     * @return la cantidad de memoria ram que tiene el computador
     */
    public int getRam() {
        return ram;
    }

    /**
     * setter del atributo ram
     * @param ram cantidad de memoria a adjudicar al computador
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * getter del atributo cpu
     * @return la velocidad del procesador del computador
     */
    public float getCpu() {
        return cpu;
    }

    /**
     * setter del atributo cpu
     * @param cpu valor de la velocidad del computador
     */
    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    /**
     * getter del atributo motherBoard
     * @return el nombre de la placa base del computador
     */
    public String getMotherBoard() {
        return motherBoard;
    }

    /**
     * setter del atributo motherBoard
     * @param motherBoard nombre que tendrá la placa base del computador
     */
    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    /**
     * Método sobreescrito
     * @return cadena indicando los valores de los atributos
     */

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram + "G" +
                ", cpu=" + cpu + "GHz" +
                ", motherBoard='" + motherBoard.trim() + '\'' +
                '}';
    }
}
