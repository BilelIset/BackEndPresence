package tn.isetsf.presence.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.isetsf.presence.Entity.Resp;
import tn.isetsf.presence.Entity.Users;
import tn.isetsf.presence.Repository.UserRepo;

import java.sql.SQLClientInfoException;
import java.util.Optional;
@RestController
@CrossOrigin(origins = "*")

public class UserController {

    @Autowired
   private UserRepo userRepo;
    @PostMapping(value = "/login/add",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Users addUser(@RequestBody Users users){
        try {
            userRepo.save(users);
            return users;

        }catch (Exception e){
            return null;
        }
    }

    @PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Resp logApp(@RequestBody Users user) {
        Resp res = new Resp();
        res.setAdmin(false);
        res.setStatue(false);
        System.out.println("Response créée");

        Optional<Users> us1 = userRepo.findByLoginAndPassword(user.getLogin(), user.getPassword());

        if (us1.isPresent()) {
            System.out.println("Premier if");

            if (us1.get().getIsAdmin()) {
                System.out.println("Deuxième if");
                res.setAdmin(true);
            }

            res.setStatue(true);
            return res;
        }

        return res;
    }
}

       /* ResponseEntity res=new ResponseEntity();
        res.setAdmin(false);
        res.setStatue(false);
       Optional<User> us=userRepo.findById(user.getIdUser());
        if (us.isPresent()){
            if(Objects.equals(us.get().getPassword(), user.getPassword())){
                if (us.get().getIsAdmin()){
                     res=new ResponseEntity();
                    res.setAdmin(true);
                    res.setStatue(true);
                    return res;
                } else {
                    us.get();
                     res = new ResponseEntity();
                    res.setStatue(true);
                    res.setAdmin(false);
                    return res;
                }


            }
        }
return res;
    }
}*/
