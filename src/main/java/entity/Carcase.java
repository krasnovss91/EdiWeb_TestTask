package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "carcases")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Carcase {
    @Id
    @Column(name = "carcase_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "type")
    private String type;

    @Column(name = "color")
    private String color;

    @Column(name = "doorCount")
    private Integer doorCount;

    @Column(name = "VIN")
    private Integer VIN;
}
