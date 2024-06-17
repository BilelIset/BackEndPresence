package tn.isetsf.presence.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.isetsf.presence.Entity.Users;

import java.util.Optional;

<<<<<<< HEAD
public interface UserRepo extends JpaRepository<Users, Long> {
=======
public interface UserRepo extends JpaRepository<Users, Integer> {
>>>>>>> e12e2df1becbe218c9fecf99cb073acda856bbdb
    Optional<Users> findByLoginAndPassword(String login, String password);

}
