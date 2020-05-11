package kg.attractor.onlineshop.config.product;


import kg.attractor.onlineshop.config.brand.Brand;
import kg.attractor.onlineshop.config.category.Category;
import lombok.*;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE) @NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 128)
    private String name;

    @Column(length = 128)
    private String image;

    @Column
    private float price;

    @ManyToOne
    private Brand brand;

    @ManyToOne
    private Category category;

    @Column
    private int qty;


}