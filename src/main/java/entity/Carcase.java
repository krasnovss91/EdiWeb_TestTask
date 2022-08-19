package entity;

import javax.persistence.*;
@Entity
@Table(name = "carcases")
public class Carcase {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

}
