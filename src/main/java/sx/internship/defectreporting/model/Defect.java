package sx.internship.defectreporting.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Defect {
	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private Date creationDate;

	private String desription;

	@ManyToMany
	private List<Version> affectedVersions;

	@ManyToOne
	private Severity severity;
}
