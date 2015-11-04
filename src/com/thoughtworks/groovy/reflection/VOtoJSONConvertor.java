package com.thoughtworks.groovy.reflection;

import java.lang.reflect.Constructor;

public class VOtoJSONConvertor {

	public static void main(String[] args) {
		// Invoke method to get the class details
		//converter(BookVO.class);
		converter(LibraryVO.class);
	}
	// I do not know what the data type for the class is , so i Pass a ? (Question Mark)
	public static String converter(Class<?> c){
		//Dynamically find out the name, annotations, fields , methods
		System.out.println(c);
		System.out.println("class name with package :: "+c.getName());
		System.out.println("class name without package :: "+c.getSimpleName());
		
		//Finding constructors now
		Constructor<?>[] constructors = c.getConstructors();
		System.out.println("Number of constructors in groovy class :: "+constructors.length);
		//Dynamically instantiating the class
		//This is easy now as we know what to pass
		Constructor<?> constructor = constructors[0];
		//Create a new instancce once you have the constructor
		//Initialize the object
		Object object = null;
		try {
			object = constructor.newInstance(1,"Spirituality");
			System.out.println(object);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		return "returnMe";
	}

}
