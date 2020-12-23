package com.src;

import java.util.List;

public class University {
private Integer id;
private String name;
private List<String> coursesoffered;
public University() {
	super();
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getCoursesoffered() {
	return coursesoffered;
}
public void setCoursesoffered(List<String> coursesoffered) {
	this.coursesoffered = coursesoffered;
}
public University(Integer id, String name, List<String> coursesoffered) {
	super();
	this.id = id;
	this.name = name;
	this.coursesoffered = coursesoffered;
}

}
