package teoria.set;

public class Town {

    private String city;
    private String country;
    private double latitude;
    private double longitude;

    public Town(String city, String country, double latitude, double longitude) {
        this.city = city;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Town() {
    }

    @Override
    public String toString() {
        return String.format("%S,%S,%.2f,%.2f", city, country, latitude, longitude);
    }
    //hashCode e equals, criterio dos ciudades son igulales
    //si tienen igual longitud y latitud
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Town town = (Town) o;

        if (Double.compare(town.latitude, latitude) != 0) return false;
        return Double.compare(town.longitude, longitude) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(latitude);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(longitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

}
