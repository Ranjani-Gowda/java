package com.xworkz.ControlStatements;

public class Tax {

	public static void main(String[] args) {
   int StateCode=6;
   switch(StateCode) {
   case 1: System.out.println("Karnataka State Road Tax is 100000");
   break;
   case 2: System.out.println("Tamilnadu State Road Tax is 85000");
   break;
   case 3: System.out.println("Andrapradesh State Road Tax is 75000");
   break;
   case 4: System.out.println("Mumbai State Road Tax is 50000");
   break;
   case 5: System.out.println("Delhi State Road Tax is 40000");
   break;
   default: System.out.println("Invalid State Code");
   }
	}

}
