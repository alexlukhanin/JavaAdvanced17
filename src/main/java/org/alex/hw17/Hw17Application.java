package org.alex.hw17;

import org.alex.hw17.domain.University;
import org.alex.hw17.service.UniversityService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Hw17Application {

	public static void main(String[] args) {
		final ConfigurableApplicationContext context = SpringApplication.run(Hw17Application.class, args);
		UniversityService universityService = context.getBean(UniversityService.class);

		University university1 = new University();
		university1.setName("Colorado High College");
		university1.setAccreditationLevel("college");
		university1.setInstitutesNumber(0);
		university1.setStudentsNumber(150);
		university1.setAddress("55145, Denver,CO Augustin st 174");

		University university2 = new University();
		university2.setName("Louisiana State University");
		university2.setAccreditationLevel("university");
		university2.setInstitutesNumber(2);
		university2.setStudentsNumber(1200);
		university2.setAddress("65001, New Orleans,LA Dacota st 500");

		University university3 = new University();
		university3.setName("Oregon High Tech Academy");
		university3.setAccreditationLevel("academy");
		university3.setInstitutesNumber(12);
		university3.setStudentsNumber(4300);
		university3.setAddress("24151, Portland,OR Raimond st 19215");

		University university4 = new University();
		university4.setName("Oregon City College");
		university4.setAccreditationLevel("college");
		university4.setInstitutesNumber(0);
		university4.setStudentsNumber(199);
		university4.setAddress("24150, Portland,OR Dressons st 1520");

		University university5 = new University();
		university5.setName("New York West University");
		university5.setAccreditationLevel("university");
		university5.setInstitutesNumber(4);
		university5.setStudentsNumber(2500);
		university5.setAddress("18001, New York,NY Strantons st 1942");

		University university6 = new University();
		university6.setName("UCLA");
		university6.setAccreditationLevel("university");
		university6.setInstitutesNumber(6);
		university6.setStudentsNumber(2900);
		university6.setAddress("99125, Los Angeles,CA Regin av 1211");

		//save DB
		universityService.save(university1);
		universityService.save(university2);
		universityService.save(university3);
		universityService.save(university4);
		universityService.save(university5);
		universityService.save(university6);


		//read from DB
		System.out.println(universityService.findById((long) 2));
		System.out.println("All colleges: " + universityService.findByAccreditationLevel("college"));
		System.out.println("All universities: " + universityService.findByAccreditationLevel("university"));
		System.out.println("All academies: " + universityService.findByAccreditationLevel("academy"));

		System.out.println("Info about Louisiana State University: " + universityService.findByName("Louisiana State University"));

		System.out.println("199 students study in ... " + universityService.findByStudentsNumber(199));
		System.out.println("1200 students study in ... " + universityService.findByStudentsNumber(1200));

		System.out.println("Greater then 2000 students study in ... " + universityService.findByStudentsNumberGreaterThan(2000));

		System.out.println("0 institutes are in ... " + universityService.findByInstitutesNumber(0));
		System.out.println("12 institutes are in ... " + universityService.findByInstitutesNumber(12));




		//read all
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Output of all DB:");
		universityService.findAll().stream().forEach(System.out::println);

		//delete from DB
		System.out.println("-------------------------------------------------------------");
		universityService.deleteById((long)4);
		System.out.println("record 5 was deleted");

		// update from DB
		University forUpdate = universityService.findById((long) 5);
		forUpdate.setStudentsNumber(2520);
		universityService.update(forUpdate);

		System.out.println("-----------------------------------------------------------------");
		System.out.println("Output of all DB:");
		universityService.findAll().stream().forEach(System.out::println);

















	}

}
