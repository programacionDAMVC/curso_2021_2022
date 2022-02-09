package teoria.ejemplo1;

public class TestVehiculos {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("ford fiesta", 4, 5,
                "javier gonzález");
        mostrarVehiculo(vehiculo);

        Vehiculo coche = new Coche("mercedes benz", 5, "luisa perales",
                TipoVehiculo.ELECTRICO, true);
        mostrarVehiculo(coche);

        Vehiculo moto = new Motocicleta("kawasaki", 2, "felipe miñambres",
                TipoCarnet.A1, 500);
        mostrarVehiculo(moto);

    }

    private static void mostrarVehiculo(Vehiculo vehiculo) {
        System.out.println(vehiculo);
    }
}
