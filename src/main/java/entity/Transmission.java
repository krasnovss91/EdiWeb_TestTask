package entity;

import javax.persistence.*;

@Entity
@Table(name = "transmissions")
public class Transmission {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
