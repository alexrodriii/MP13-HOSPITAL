package com.example.HospitalApplication;

import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NurseController {

	       
		   ArrayList<Nurse> nurses = new ArrayList<>();
		   public NurseController() {
			   
	         nurses.add(new Nurse("Alex Rodriguez", 19, "Oftalmologia", 2));
	          nurses.add(new Nurse("Dafne Ramirez", 20, "Psicologia", 7));
	           nurses.add(new Nurse("Noemi Saladie", 22, "Cirugía", 10));
		   }

	public static void main(String[] args) {
		SpringApplication.run(NurseController.class, args);
		
		
		 }
	 @GetMapping("/nurses")
		public ArrayList <Nurse> getAll(){
		
		   	    for(int i =0; i < nurses.size();i++) {
				    System.out.println(nurses.get(i));
					
		   	    
		 }
				return nurses;
				
	}

}
