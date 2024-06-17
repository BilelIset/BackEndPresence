package tn.isetsf.presence;

<<<<<<< HEAD
=======
import org.hibernate.type.descriptor.java.CalendarTimeJavaType;
>>>>>>> e12e2df1becbe218c9fecf99cb073acda856bbdb
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.isetsf.presence.Entity.Users;
<<<<<<< HEAD
import tn.isetsf.presence.Repository.UserRepo;

=======
import tn.isetsf.presence.Repository.EmploiRepo;
import tn.isetsf.presence.Repository.UserRepo;

import java.sql.Time;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

>>>>>>> e12e2df1becbe218c9fecf99cb073acda856bbdb
@SpringBootApplication
public class PresenceApplication {



	public static void main(String[] args) {

		SpringApplication.run(PresenceApplication.class, args);
<<<<<<< HEAD





	}

=======
	}


>>>>>>> e12e2df1becbe218c9fecf99cb073acda856bbdb
}
