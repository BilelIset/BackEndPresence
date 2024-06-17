package tn.isetsf.presence.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue
<<<<<<< HEAD
    private Long idUser;
=======
    private int idUser;
>>>>>>> e12e2df1becbe218c9fecf99cb073acda856bbdb
    private String login;
    private String password;
    private Boolean isAdmin;


<<<<<<< HEAD
=======
    public Users(String login, String password, boolean isAdmin) {
    }
>>>>>>> e12e2df1becbe218c9fecf99cb073acda856bbdb
}
