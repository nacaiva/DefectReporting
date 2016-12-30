package sx.internship.defectreporting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sx.internship.defectreporting.model.DefectRepository;
import sx.internship.defectreporting.model.SeverityRepository;

@Service
public class SeverityServiceImpl implements SeverityService {
	@Autowired DefectRepository defectRepository;
	@Autowired SeverityRepository severityRepository;

	@Override
	@Transactional
	public Count[] count() {
		return severityRepository.findAll().stream()
				.map(severity -> new Count(severity, defectRepository.countBySeverity(severity)))
				.toArray(Count[]::new);
	}
}
