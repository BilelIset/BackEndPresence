package tn.isetsf.presence.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.isetsf.presence.CalculDate;
import tn.isetsf.presence.Entity.Emploi;
import tn.isetsf.presence.Repository.EmploiRepo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@RestController
@RequestMapping("/empljour")
public class EmploiDuJourController {
    @Autowired
    EmploiRepo emploiRepo;
    CalculDate calculDate=new CalculDate();
    int calendar=Calendar.YEAR;
    @GetMapping(value = "/getempljour",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Emploi> chargerEmploiJours(){

        return null;
    }
}/*private int idEmploisJours;
private String annees;
private String semestre;
private  String jour;
private String Seance;
private String salle;
private String enseignant;
private String niveaux;
private String matiere;
private String par15;
*/