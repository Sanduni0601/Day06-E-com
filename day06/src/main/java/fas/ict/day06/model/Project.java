package fas.ict.day06.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int id;
	private String Pname;
	private long totalCost;
	@ManyToMany
	private List<Employee> employees;
	
}

