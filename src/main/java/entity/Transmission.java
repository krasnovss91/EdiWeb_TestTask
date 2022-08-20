package entity;

import javax.persistence.*;

@Entity
@Table(name = "transmissions")
public class Transmission {
    @Id
    @Column(name = "transmission_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "type")
    private String type;

    @Column(name = "serialNumber")
    private Integer serialNumber;
}
