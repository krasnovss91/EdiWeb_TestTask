package entity;

import javax.persistence.*;

@Entity
@Table(name = "engines")
public class Engine {
    @Id
    @Column(name = "engine_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "type")
    private String type;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "power")
    private Integer power;

    @Column(name = "serialNumber")
    private Integer serialNumber;
}
