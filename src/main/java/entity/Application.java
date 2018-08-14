package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "application")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idApplication;
    private int sum;
    private String creditState;
    private String currency;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Client client;

    @Override
    public String toString() {
        return "Application{" +
                "idApplication=" + idApplication +
                ", sum=" + sum +
                ", creditState='" + creditState + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}
