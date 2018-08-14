package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;
    private String firstName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Education education;
    private String passport;
    private String city;
    private int age;
}
