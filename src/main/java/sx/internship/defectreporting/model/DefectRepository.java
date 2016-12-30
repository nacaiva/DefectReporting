package sx.internship.defectreporting.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DefectRepository extends JpaRepository<Defect, Long>{
	Long countBySeverity(Severity severity);
}
