package tn.isetsf.presence.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.isetsf.presence.Entity.Salle;

public interface SalleRepo extends JpaRepository<Salle,Integer> {
}
