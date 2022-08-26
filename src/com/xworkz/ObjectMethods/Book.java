package com.xworkz.ObjectMethods;

public class Book {

	String subject;
	String syllabus;
	int price;
	int yearOfPublication;

	public Book() {
		System.out.println("No Parameters");
	}

	public Book(String subject, String syllabus, int price, int yearOfPublication) {

		this.subject = subject;
		this.syllabus = syllabus;
		this.price = price;
		this.yearOfPublication = yearOfPublication;
		System.out.println("With Parameters");

	}

	@Override
	public String toString() {
		// return super.toString(); // o/p - com.xworkz.ObjectMethods.Book@2d5
		// return "D"; // o/p - D
		return "Book [Subject = " + this.subject + ", Syllabus = " + this.syllabus + ", Price = " + this.price
				+ ", Year of Publication = " + this.yearOfPublication;
	}

	@Override
	public int hashCode() {
		return super.hashCode(); // o/p - hashcode of particular object
		// return 725; // o/p - 725
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			System.out.println("Object is null equal is not possible");
			return false;
		}

		if (obj instanceof Book) {
			System.out.println("Object is instance of Book and can execute equals method");

			Book castedb = (Book) obj;
			String castedSubject = castedb.subject;
			String castedSyllabus = castedb.syllabus;
			int castedPrice = castedb.price;
			int castedYearofPublication = castedb.yearOfPublication;

			if (this.subject == castedSubject && this.syllabus == castedSyllabus && this.price == castedPrice
					&& this.yearOfPublication == castedYearofPublication) {
				System.out.println("Both objects are equal");
				return true;
			} else {
				System.out.println("Both the objects are not equal");
				return false;
			}
		} else {
			System.out.println("Not an instance of Book");
			return false;
		}
	}
}
