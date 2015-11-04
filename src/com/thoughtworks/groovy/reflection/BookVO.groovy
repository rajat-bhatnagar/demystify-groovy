package com.thoughtworks.groovy.reflection

class BookVO {
	String name
	String author
	int pages
	Date purchaseDate


	@Override
	public String toString() {
		return "BookVO [name=" + name + ", author=" + author + ", pages="
				+ pages + ", purchaseDate=" + purchaseDate + "]";
	}
}
