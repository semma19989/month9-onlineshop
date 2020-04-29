package kg.attractor.onlineshop.model;

import  lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 128)
    private String name;
    @Column(length = 128)
    private String image;
    @Column
    private Integer price;
    @Column
    private Integer count;
}
