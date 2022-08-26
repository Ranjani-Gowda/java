package com.xworkz.CRUD;

public class CrudOperation {

	String[] name = new String[4];

	public void save(String name) {
		this.name[0] = name;
		this.name[1] = name;
		this.name[2] = name;
		this.name[3] = name;
	}

	public String read(String D) {
		if (D.equals(this.name[0])) {
			return this.name[0];
		}
		return null;
	}

	public String update(String name, String newName) {
		if (name.equals(this.name[0])) {
			String updatedName = this.name[0] = newName;
			return updatedName;
		}
		return null;
	}

	public String delete(String name) {
		if (name.equals(this.name[0])) {
			String deleteName = this.name[0] = null;
			return deleteName;
		}
		return null;
	}

	public static void main(String[] args) {

		CrudOperation A = new CrudOperation();
		String name1 = "Liki";
		String name2 = new String("Poorvi");
		A.save(name1);
		// A.save(name2);
		System.out.println(name1);
		System.out.println(name2);
		String read = A.read(name1);
		System.out.println("Read operation " + read);
		String updatedName = A.update("Liki", "Suri");
		System.out.println(updatedName);
		System.out.println(A.delete("Liki"));

	}

}
