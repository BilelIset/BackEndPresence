package tn.isetsf.presence.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tn.isetsf.presence.CalculDate;
import tn.isetsf.presence.Entity.EmploiDuJour;
import tn.isetsf.presence.Entity.Salle;
import tn.isetsf.presence.Repository.EmploiJourRepo;
import tn.isetsf.presence.Repository.SalleRepo;

import java.util.ArrayList;
import java.util.List;

@RestController

public class SalleController {
    @Autowired
    SalleRepo salleRepo;
    CalculDate calculDate=new CalculDate();

    @GetMapping(value = "/salle",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Salle> getSalle(){

        return salleRepo.findAll();

    }
    @GetMapping(value = "/date",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getDateJour(@RequestParam String date){
        return "(NB: Le premier Jour de la semaine est Lundi qui correspond a 1 et dimanche est 7) \n\n La date : "+date+" correspond a : "+calculDate.dateJourMapping(date);
    }

}
