package entity;

import javax.persistence.*;

@Entity
@Table(name = "engines")
public class Engine {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

}
