package tn.isetsf.presence.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.isetsf.presence.Entity.Salle;

public interface SalleRepo extends JpaRepository<Salle,Integer> {
}
