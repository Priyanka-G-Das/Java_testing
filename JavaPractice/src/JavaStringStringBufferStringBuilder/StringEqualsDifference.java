package JavaStringStringBufferStringBuilder;

public class StringEqualsDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s1="welcome";
  String s2="welcome";
  System.out.println(s1==s2);          // true
  System.out.println(s1.equals(s2));  // true
  
   String s3="Priyanka";
   String s4= new String("Priyanka");
   System.out.println(s3==s4);           /// false
   System.out.println(s3.equals(s4));     // true
   
   String s6=new String("PriyankaDas");
   String s7= new String("PriyankaDas");
   System.out.println(s6==s7);                // false
   System.out.println(s6.equals(s7));        // true
	}

}
