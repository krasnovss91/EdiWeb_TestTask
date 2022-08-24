package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "engines")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Engine {
    @Id
    @Column(name = "engine_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type")
    private String type;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "power")
    private Integer power;

    @Column(name = "serialNumber")
    private Integer serialNumber;
}
