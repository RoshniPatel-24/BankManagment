package combankApplicatoin;

import java.util.Date;


class SundayException extends Exception{
	
	public SundayException(String msg) {
		super(msg);
	}
	
}
public class SampalException {
	
	public static void main(String args[]) {
			try {
				
				Date obj = new Date();
				String str=obj.toString().substring(0,3);
				if(str.equalsIgnoreCase("thur")) {
					throw new SundayException("Ajj kaam nahi karenge");
				}
				int x=Integer.parseInt(args[0]);
				int y=Integer.parseInt(args[1]);
				int z=x/y;
				System.out.println(z);
			}
			
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Enetr min two argument");
				e.printStackTrace();
			}
			
			catch(NumberFormatException e) {
				System.out.println("Please enter integer");
				e.printStackTrace();
			}

			catch(ArithmeticException e) {
				System.out.println("Please Avoid second argument as Zero");
				e.printStackTrace();
			}
			catch (SundayException e) {
				System.out.println(e.getMessage());
			}
			catch (Exception e) {
				e.printStackTrace();

			}
			finally {
				System.out.println("Ab se BIke mat Chalaao");
			}
			
	}
}
