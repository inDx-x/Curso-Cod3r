package ArraysCollections.Collections.List;

import java.util.Objects;

public class Usuario2 {

    String name;

    public Usuario2(String name) {
        this.name = name;
    }

    public String toString() {
        return "Meu nome é " + this.name + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario2 that = (Usuario2) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
