package tn.isetsf.presence.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor@NoArgsConstructor
public class EmploiDuJour {
    @Id
    @GeneratedValue
    private int idEmploisJours;
    private String annees;
    private String semestre;
    private  String jour;
    private String Seance;
    private String salle;
    private String nomSalle;
    private String enseignant;
    private String niveaux;
    private String matiere;
    private String par15;
    private String date;


}
