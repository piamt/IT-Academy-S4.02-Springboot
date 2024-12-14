package cat.itacademy.s04.t02.n02.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "fruit")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Please add the name")
    private String name;
    @Column(name = "quantityKg")
    @Min(value = 1, message = "The value must be 1 or more")
    private int quantity;

    @Min(value = 1, message = "The value must be 1 or more")
    public int getQuantity() {
        return quantity;
    }

    public @NotBlank(message = "Please add the name") String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(@NotBlank(message = "Please add the name") String name) {
        this.name = name;
    }

    public void setQuantity(@Min(value = 1, message = "The value must be 1 or more") int quantity) {
        this.quantity = quantity;
    }
}
