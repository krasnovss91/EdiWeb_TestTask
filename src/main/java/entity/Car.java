package entity;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @Column(name = "car_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name = "carcase_id")
    private Carcase carcase;

    @OneToOne(optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name = "engine_id")
    private Engine engine;

    @OneToOne(optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name = "transmission_id")
    private Transmission transmission;
}
