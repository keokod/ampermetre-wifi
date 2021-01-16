package fr.ohkod.ampermetre.entites;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Mesure implements Serializable{
   
    private Long Id;
    private Float Courant;
    private int timestamp;
}
