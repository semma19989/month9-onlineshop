package kg.attractor.onlineshop.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 128)
    private String fullName;
    @Column(length = 128)
    private String email;
    @Column(length = 128)
    private String password;
}
