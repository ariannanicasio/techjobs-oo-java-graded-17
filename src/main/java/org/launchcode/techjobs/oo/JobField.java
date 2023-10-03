package org.launchcode.techjobs.oo;

import java.util.Objects;

abstract class JobField {
        public int id;
        public static int nextId = 1;
        public String value;

    public JobField() {
        this.id = nextId;
        nextId++;
    }

    @Override
    public String toString() {
        return value;
    }
    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType that)) return false;
        return getId() == that.getId() && Objects.equals(getValue(), that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getValue());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
