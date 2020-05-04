package kg.attractor.onlineshop.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE) @NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Поле не должно быть пустым")
    @Size(min=5, max = 45,message = "Имя не должно быть меньше 4 и не больше 40 символов")
    @Column(length = 45)
    private String name;


    @Size(min=5, max = 45,message = "Почта не должна быть меньше 8 и не больше 40 символов")
    @Email
    @Column(length = 45)
    private String mail;

    @NotBlank(message = "Поле не должно быть пустым")
    @Size(min=5, max = 45,message = "Логин не должен быть меньше 4 и не больше 40 символов")
    @Column(length = 45)
    private String login;

    @NotBlank(message = "Поле не должно быть пустым")
    @Size(min=5, max = 45,message = "Пароль не должен быть меньше 5 и не больше 40 символов")
    @Column(length = 45)
    private String password;
}
