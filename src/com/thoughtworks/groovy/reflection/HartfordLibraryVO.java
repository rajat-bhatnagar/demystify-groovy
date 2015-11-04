package com.thoughtworks.groovy.reflection;

public class HartfordLibraryVO extends LibraryVO {

	public HartfordLibraryVO(int location, String subject) {
		super(location, subject);
	}
	private int areaCode;
	public int getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}
	

}
