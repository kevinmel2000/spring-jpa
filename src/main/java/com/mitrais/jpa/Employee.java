package com.mitrais.jpa;

import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="emp_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long empId;
	@Column(name="first_name", nullable = false)
	private String firstName;
	@Column(name="last_name", nullable =false)
	private String lastName;
	@Column(name="gender", nullable = false)
	private String gender;
	@Column(name="dob")
	private Date dob;
//	@OneToMany(mappedBy="employee", cascade=CascadeType.ALL)
//	private Set<OfficeLocation> officeLocations;
}
