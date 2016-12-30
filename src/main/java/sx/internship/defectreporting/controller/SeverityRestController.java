package sx.internship.defectreporting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sx.internship.defectreporting.service.SeverityService;
import sx.internship.defectreporting.service.SeverityService.Count;

@RestController
public class SeverityRestController {
	@Autowired
	SeverityService severityService;

	@GetMapping("/statistics/severity")
	Count[] count() {
		return severityService.count();
	}
}
