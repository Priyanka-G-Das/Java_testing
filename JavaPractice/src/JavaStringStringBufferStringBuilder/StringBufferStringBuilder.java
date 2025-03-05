package JavaStringStringBufferStringBuilder;

public class StringBufferStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s= "welcome"; // string is immutable
 s.concat("to bangalore");
 System.out.println(s);
 String str= s.concat("to bangalore");
 System.out.println(str);
 
 // to make it mutable use string builder and buffer
 StringBuffer sb= new StringBuffer("welcome");
 sb.append("to bangalore");
 System.out.println(sb);
 StringBuilder stb=new StringBuilder("welcome");
 stb.append("to bangalore");
 System.out.println(stb);
	}
	// 

}
