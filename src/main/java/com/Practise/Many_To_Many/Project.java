package com.Practise.Many_To_Many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Project {
	@Id
private int pid;
private String Project_Name;
@ManyToMany(mappedBy="projects")
private List<Employeee> emp;

public Project(int pid, String project_Name, List<Employeee> emp) {
	super();
	this.pid = pid;
	Project_Name = project_Name;
	this.emp = emp;
}

public Project() {
	super();
	// TODO Auto-generated constructor stub
}

public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public String getProject_Name() {
	return Project_Name;
}

public void setProject_Name(String project_Name) {
	Project_Name = project_Name;
}

public List<Employeee> getEmp() {
	return emp;
}

public void setEmp(List<Employeee> emp) {
	this.emp = emp;
}

@Override
public String toString() {
	return "Project [pid=" + pid + ", Project_Name=" + Project_Name + ", emp=" + emp + "]";
}
}
