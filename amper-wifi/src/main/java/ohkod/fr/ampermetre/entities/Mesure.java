package ohkod.fr.ampermetre.entities;

import java.io.Serializable;
import javax.persistence.Entity;


@Entity
public class Mesure implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private float courant;
    private int timestamp;
 
}