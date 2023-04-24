package capitalone.patientManagement.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
	
	@GetMapping("/showAll")
	public String testPage(){
		return "Hello";
	}

}
