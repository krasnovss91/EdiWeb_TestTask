package entity;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @Column(name = "car_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Carcase carcase;

    @OneToOne
    private Engine engine;

    @OneToOne
    private Transmission transmission;
}
