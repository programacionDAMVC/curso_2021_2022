package constructores;
//clase con varios constructores
public class Disco3 {
    //atributos
    private String marca;
    private int capacidad;

    //constructores

    public Disco3(String marca, int capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
    }

    public Disco3() {
    }

    public Disco3(String marca) {
        this.marca = marca;
        this.capacidad = 5;
    }
    //getters y setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Disco3{" +
                "marca='" + marca + '\'' +
                ", capacidad=" + capacidad + "G " +
                '}';
    }
}
