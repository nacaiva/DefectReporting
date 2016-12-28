package sx.internship.defectreporting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sx.internship.defectreporting.model.Defect;
import sx.internship.defectreporting.model.DefectRepository;

@RestController
public class DefectReportingRestController {
	@Autowired
	DefectRepository defectRepository;

	@GetMapping("/defect-reporting")
	public List<Defect> showDefects() {
		return defectRepository.findAll();
	}
}
