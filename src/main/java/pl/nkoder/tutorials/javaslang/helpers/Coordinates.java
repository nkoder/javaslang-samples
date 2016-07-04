package pl.nkoder.tutorials.javaslang.helpers;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import static java.lang.String.format;

public class Coordinates {

    public final int x;
    public final int y;

    public static Coordinates of(int x, int y) {
        return new Coordinates(x, y);
    }

    private Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Coordinates that = (Coordinates) other;
        return new EqualsBuilder()
            .append(this.x, that.x)
            .append(this.y, that.y)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(x)
            .append(y)
            .toHashCode();
    }

    @Override
    public String toString() {
        return format("(%s, %s)", x, y);
    }
}
