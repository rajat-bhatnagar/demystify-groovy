package com.thoughtworks.groovy.reflection;

public class LibraryVO {
	private int location;
	private String subject;
	
	public LibraryVO(int location, String subject) {
		super();
		this.location = location;
		this.subject = subject;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "LibraryVO [location=" + location + ", subject=" + subject + "]";
	}
	
	
}
