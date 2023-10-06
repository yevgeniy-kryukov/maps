package ykryukov.maps.object;

import java.util.Objects;

public class Status {
    final private String name;

    public Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Status{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Status)) return false;
        Status status = (Status) o;
        return name.equals(status.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
