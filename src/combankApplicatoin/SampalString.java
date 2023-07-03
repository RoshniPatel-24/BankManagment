package combankApplicatoin;
// object is super class in java

import java.util.Scanner;
//string are immutable
//stringBuffer are mutable(Variable size)
public class SampalString {

	public static void main(String[] args) {
		StringBuffer strBuf1=new StringBuffer("royal");
		Scanner obj = new Scanner(System.in);
		System.out.println(strBuf1.capacity());  //16
		strBuf1.append('t');
		String str = "Roshni-@-gmail.com";
		String str3 ="roshni";  // r----------->114(114-82=32)
		String str4 ="ROSHNI"; //  R----------->82
		String str2[]=str.split("-");
		for(int i=0;i<str2.length;i++) {
			System.out.println("This is the string " +str2[i]+" and the length of it is " + str2[i].length());
		} // end of for
		
		String str1=new String("Roshni");
		System.out.println("Enetr the string");
		str1 = obj.next();
		System.out.println("str3.eqals(str4):"+str3.equals(str4));
		System.out.println("str3.eqalsignoreCase(str4):"+str3.equalsIgnoreCase(str4));
		System.out.println("str3.compareTo(str4):" +str3.compareTo(str4));
		System.out.println("str3.compareToIgnoreCase(str1):"+ str3.compareToIgnoreCase(str4));
		System.out.println("str3.charAt(0):"+str3.charAt(0));
		System.out.println("str3.indexOf(\"R\")):"+str3.indexOf(0));
		System.out.println("str3.toUpperCase():"+ str3.toUpperCase());
		System.out.println("str3.toLowerCase():"+str3.toLowerCase());
		System.out.println("str3.substring(2):"+str3.substring(2));
		System.out.println("str3.substring(0,4):"+str3.substring(0,4));
		str3=str3.concat(str4);
		StringBuffer strBuf = new StringBuffer(str3);
		String str5=strBuf.reverse().toString();
		if(str3.equals(str5)) {
			System.out.println("Palindrome");
		} // end of id
		else {
			System.out.println("Not Palindrome");
		} //end of else
		
	}// end of main class

}// end of public class
