package ProbandoClasesPredefinidas;


public class SString {

	public static void main(String[] args) {
		 String str = "JAVA";
	      System.out.println("String = " + str);

	   // codepoint at index 1
	      int retval = str.codePointAt(1);
	   // prints character at index1 in string
	      System.out.println("Character(unicode point) codePointAt(1) = " + retval);
	      
	      
	      
	   // codepoint before index 1 i.e J
	       retval = str.codePointBefore(1);
	      // prints character before index1 in string
	      System.out.println("Character(unicode point) codePointBefore(1) = " + retval);

	      
	   // codepoint from index 1 to index 8
	    
	      retval= str.codePointCount(1, 3);
	      // prints character from index 1 to index 8
	      System.out.println("Codepoint count = " + retval);
	}

}
