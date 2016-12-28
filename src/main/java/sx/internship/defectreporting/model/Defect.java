package sx.internship.defectreporting.model;





import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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

	private String creationDate;

	private String desription;

	@ManyToMany
	@JoinTable(
			name= "defect_version",
			joinColumns=@JoinColumn(name= "defect_id", referencedColumnName="id"),
			inverseJoinColumns= @JoinColumn(name="version_id", referencedColumnName="id"))
	private List<Version> affectedVersions;

	@ManyToOne
	@JoinColumn(name="severity_id")
	private Severity severity;
}
