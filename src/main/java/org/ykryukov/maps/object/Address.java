package org.ykryukov.maps.object;

import lombok.*;
import lombok.experimental.NonFinal;

@Value
class Address implements Cloneable {
    int id;

    String street;

    @NonFinal
    String house;

    public void setHouse(String house) {
        this.house = house;
    }

    @Override
    public Address clone() {
        try {
            Address clone = (Address) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
