package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "department")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDepartment;
    private String departmentCity;
    private int countOfWorkers;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "department")
    private List<Client> clients;

    @Override
    public String toString() {
        return "Department{" +
                "idDepartment=" + idDepartment +
                ", departmentCity='" + departmentCity + '\'' +
                ", countOfWorkers=" + countOfWorkers +
                '}';
    }
}
