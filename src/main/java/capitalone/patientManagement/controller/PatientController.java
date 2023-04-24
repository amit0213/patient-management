package capitalone.patientManagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class PatientController {
	@GetMapping("/showAll")
	public String testPage(){
		return "Hello";
	}

	@GetMapping("/showDate")
	public String getDate(){
		return new Date().toString();
	}


}
