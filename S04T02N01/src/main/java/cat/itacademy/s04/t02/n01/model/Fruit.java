package cat.itacademy.s04.t02.n01.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.util.Objects;

@Entity
@Table(name = "fruits")
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotBlank(message = "Please add the name")
    private String name;
    @Min(value = 1, message = "The value must be 1 or more")
    private int quantity;

    public Fruit(Integer id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public Fruit(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Fruit() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Fruit fruit = (Fruit) object;
        return Objects.equals(getId(), fruit.getId()) && getQuantity() == fruit.getQuantity() && Objects.equals(getName(), fruit.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getQuantity());
    }
}
