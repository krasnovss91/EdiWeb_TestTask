package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "transmissions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
