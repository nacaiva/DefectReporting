package sx.internship.defectreporting.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sx.internship.defectreporting.model.Severity;

public interface SeverityService {
	/**
	 * Count per severity.
	 * @return Array of Count objects for each Severity.
	 */
	Count[] count();

	@Setter
	@Getter
	@NoArgsConstructor
	@AllArgsConstructor
	public class Count {
		Severity severity;
		Long count;
	}
}
