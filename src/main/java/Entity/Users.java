package Entity;


import lombok.*;

import javax.persistence.*;
import java.io.StringReader;
import java.sql.Time;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String pass;

    @Column(name = "email")
    private String email;

    @Column(name = "date_of_registration")
    private LocalDateTime dateOfReg;
}