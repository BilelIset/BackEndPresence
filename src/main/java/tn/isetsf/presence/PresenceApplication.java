package tn.isetsf.presence;

import org.hibernate.type.descriptor.java.CalendarTimeJavaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.isetsf.presence.Entity.Users;
import tn.isetsf.presence.Repository.UserRepo;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class PresenceApplication {



	public static void main(String[] args) {

		SpringApplication.run(PresenceApplication.class, args);



	}

}
