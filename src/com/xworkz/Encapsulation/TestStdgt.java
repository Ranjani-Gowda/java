package com.xworkz.Encapsulation;

public class TestStdgt {

	public static void main(String[] args) {
Stdgt C = new Stdgt();
C.B();
C.setName("Anu");
C.setRollno(15);
C.setSection('D');
String name = C.getName();
System.out.println(name);
int rollno = C.getRollno();
System.out.println(rollno);
char section = C.getSection();
System.out.println(section);
}

}
