package tn.isetsf.presence.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.isetsf.presence.Entity.EmploiDuJour;

import java.util.List;

public interface EmploiJourRepo extends JpaRepository<EmploiDuJour,Integer> {
    @Query("SELECT e.date FROM EmploiDuJour e WHERE e.date = :date1")
    List<String> verifChargemntEmploi(String date1);
    @Query("SELECT e FROM EmploiDuJour e WHERE e.date=:date1 AND e.Seance=:seanceencours OR e.Seance=:seancedouble")
    List<EmploiDuJour> chargerSeanceEnCour(String date1,String seanceencours,String seancedouble);
}
