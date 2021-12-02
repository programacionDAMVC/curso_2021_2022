package constructores;
//ejemplo de clase con constructor por defecto
//NO DEFINIO CONSTRUCTOR ALGUNO
public class Disco1 {
    //atributos
    private String marca;
    private int capacidad;

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
        return "Disco1{" +
                "marca='" + marca + '\'' +
                ", capacidad=" + capacidad + "G " +
                '}';
    }
}
