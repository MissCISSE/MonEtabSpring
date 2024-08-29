package ci.digitalacademy.monetab;

import ci.digitalacademy.monetab.models.*;
import ci.digitalacademy.monetab.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MonetabApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Autowired
	private StudentService studentService;

	@Autowired
	private AdresseService adresseService;

	@Autowired
	private TeacherService teacherService;

	@Autowired
	private FicheService ficheService;

	public static void main(String[] args) {
		SpringApplication.run(MonetabApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Adresse adresse = new Adresse();
//		adresse.setCity("Abidjan");
//		adresse.setCountry("Cote d'ivoire");
//		adresse.setStreet("Rue27");
//		adresseService.save(adresse);
////
//		User user = new User(null,"Bakus","12345", Instant.now(),adresse);
//		User user2 = new User(null,"Berthe","12345", Instant.now(),adresse);
//		userService.save(user);
//		userService.save(user);

//		Student student = new Student();
//		student.setMatricule("12128088V");
//		student.setEmail("sidiksoum@gmail.com");
//		student.setNom("Soum");
//		student.setPrenom("Abou");
//		student.setVille("Gagnoa");
//		student.setTelephone("0556479723");
//		student.setGenre("M");
//		studentService.save(student);
//
//		Student student1 = new Student();
//		student1.setMatricule("131345678K");
//		student1.setEmail("sidiklajoie@gmail.com");
//		student1.setNom("Soum");
//		student1.setPrenom("Aboubacar siriki");
//		student1.setVille("Abidjan");
//		student1.setTelephone("34558989");
//		student1.setGenre("M");
//		studentService.save(student1);
//
//		Teacher teacher = new Teacher();
//		teacher.setNom("Belko");
//		teacher.setPrenom("Diallo");
//		teacher.setMatiere("Informatique");
//		teacher.setEmail("sidikibelko@gmail.com");
//		teacher.setVacant(true);
//		teacher.setGenre("M");
//		teacher.setVille("Abidjan");
//		teacher.setTelephone("04567899903");
//		teacherService.save(teacher);

//		Teacher teacher = new Teacher();
//		FicheNote ficheNote = new FicheNote();
//
//		teacher.setMatiere("Anglais");
//		ficheNote.setNote("15");
//		ficheNote.setAnnee(Instant.now());
//
//		teacherService.save(teacher);

//		Address adresse1 = new Address();
//		Address adresse2 = new Address();
//		User user1 = new User(null,"BakusSOUM","12345", Instant.now(),adresse1);
//		User user2 = new User(null,"Berthe","12345", Instant.now(),adresse2);
//		adresseService.save(adresse1);
//		adresseService.save(adresse2);
//		userService.save(user1);
//		userService.save(user2);

		//Student student = new Student(null,"ABOU12128088V");
		//studentService.save(student);
		//Student student1 = new Student(null,"SOUM13135055V");
		//studentService.save(student1);

//		List<User>users = userService.findAll();
//		 System.out.println(users);

		//Optional<User>optionalUser = userService.findOne(3L);
		//System.out.println(optionalUser);

		//user2.setSpeudo("Bakus007");
		//userService.save(user2);

		//userService.delecte(user.getId());
//		Teacher teacher = new Teacher();
//		teacher.setMatiere("java");
//		teacherService.save(teacher);
//
//		FicheNote noteFile1 = new FicheNote();
//		noteFile1.setNote("12");
//		noteFile1.setAnnee(Instant.now());
//		noteFile1.setTeacher(teacher);
//		FicheNote noteFile2 = new FicheNote();
//		noteFile2.setNote("16");
//		noteFile2.setAnnee(Instant.now());
//		noteFile2.setTeacher(teacher);
//
//		ficheService.save(noteFile1);
//		ficheService.save(noteFile2);
//
//		Set<FicheNote> noteFiles = new HashSet<>();
//		noteFiles.add(noteFile1);
//		noteFiles.add(noteFile2);
//		teacher.setFicheNotes(noteFiles);
//
//		List<Teacher> teachers = teacherService.findAll();
//		System.out.println(teachers);
//
//		List<FicheNote> ficheNotes = ficheService.findAll();
//		System.out.println(ficheNotes);


	}
}