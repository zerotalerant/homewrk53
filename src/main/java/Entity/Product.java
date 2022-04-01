package Entity;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "product_name", nullable = false)
    String name;

    @Column(name = "product_suitability")
    String fresh;

    @Column(name = "product_price")
    Integer price;

    @ManyToMany
    @JoinColumn(name = "categories_id", nullable = false)
    List<Category> categories;
}
