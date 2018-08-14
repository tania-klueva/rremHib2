package entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "client")
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
    private String education;
    private String passport;
    private String city;
    private int age;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "client")
    private List<Application> applications;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Department department;

}
