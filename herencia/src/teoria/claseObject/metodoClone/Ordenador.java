package teoria.claseObject.metodoClone;

public class Ordenador implements Cloneable{

    private String modelo;
    private int ram;
    private int capacidadDisco;

    public Ordenador(String modelo, int ram, int capacidadDisco) {
        this.modelo = modelo;
        this.ram = ram;
        this.capacidadDisco = capacidadDisco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCapacidadDisco() {
        return capacidadDisco;
    }

    public void setCapacidadDisco(int capacidadDisco) {
        this.capacidadDisco = capacidadDisco;
    }

    @Override
    public String toString() {
        return String.format("Ordenador, modelo %S, RAM %d G, disco %d G",
                modelo, ram, capacidadDisco);
    }
    //método que amplia la RAM del ordenador
    public int ampliarRAM(int nuevaRAM) {
        this.ram = this.ram + nuevaRAM;
        //ram += nuevaRAM; otra forma de hacerlo
        return this.ram;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
