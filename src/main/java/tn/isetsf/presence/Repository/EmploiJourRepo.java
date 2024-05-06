package tn.isetsf.presence.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.isetsf.presence.Entity.EmploiDuJour;

public interface EmploiJourRepo extends JpaRepository<EmploiDuJour,Integer> {
}
