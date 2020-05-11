package kg.attractor.onlineshop.config.category;

import lombok.*;

import javax.persistence.*;

@Data @Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Entity
@Table(name = "categories")

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 128) private String name;

    @Column(length = 128) private String image;

}
