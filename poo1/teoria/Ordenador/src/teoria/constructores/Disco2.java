package teoria.constructores;
//Esta clase usa un constructor para inicializar todos los atributos
public class Disco2 {
    //atributos
    private String marca;
    private int capacidad;

    //constructor

    public Disco2(String marca, int capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
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
        return "Disco2{" +
                "marca='" + marca + '\'' +
                ", capacidad=" + capacidad + "G " +
                '}';
    }
}
