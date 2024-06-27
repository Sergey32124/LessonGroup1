package DZ.group01.CollectionSet.Dz2;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
public class Auto {
    private String color;
    private Double price;
 private String marka;
 private String model;
 private Integer year;
 private List<String> items;

    public Auto(String color, Double price, String model, String marka, Integer year) {
        this.color = color;
        this.price = price;
        this.model = model;
        this.marka = marka;
        this.year = year;
        this.items= new ArrayList<>();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Objects.equals(color, auto.color) && Objects.equals(price, auto.price) && Objects.equals(marka, auto.marka) && Objects.equals(model, auto.model) && Objects.equals(year, auto.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, price, marka, model, year);
    }
}
