package com.thoughtworks.groovy.reflection;

//This class demonstrates how you can navigate a inheritance tree
//Note that you can only go up the tree and not down the tree
public class NavigateInheritanceTreeByReflection {
	
	public static void main(String[] args) {
		//Get the class object
		Class<?> c = HartfordLibraryVO.class;
		System.out.println("Class Name :: " +c.getName());
		//Get the superclass
		Class<?> sup = c.getSuperclass();
		System.out.println("Superclass :: "+sup.getName());
		//Find the package of superclass
		Package pac = sup.getPackage();
		System.out.println("Package of Superclass :: "+pac);
	}
	

}
