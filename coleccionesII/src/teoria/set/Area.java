package teoria.set;

import java.util.HashSet;
import java.util.Set;

public class Area {

    private Set<Town> towns;  // NO permite duplicados (hashCode equals necesario)

    public Area(Set<Town> towns) {
        this.towns = towns;
    }

    public Area() {
        towns = new HashSet<>();
    }

    public Set<Town> getTowns() {
        return towns;
    }

    public boolean addCity (Town town)  {
        return towns.add(town);
    }

    public boolean removeCity(Town town) {
        return towns.remove(town);
    }

    public boolean findCity(Town town) {
        return towns.contains(town);
    }
}
