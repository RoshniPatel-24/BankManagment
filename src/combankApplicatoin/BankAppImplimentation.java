
/*
 				Author:Roshni S. Patel
 				DOC:13 Feb 2023
 				Objective: To create Bank Apllication
 */

package combankApplicatoin;

import java.util.Scanner;
import java.util.Date;

class Bank {
			private int custID,accountNo;
			private String custName,custUserName,custPassword,maritialStatus,gender;
			private String adminUser,adminPassword;
			private float balance,deposit,withdrawl;
			
			Bank(){		//default constructor
				balance = 10000f;
				gender = "MALE";
				adminUser="admin";
				adminPassword="admin";
			}
			void depositAmount() {
				Scanner obj = new Scanner(System.in);
				System.out.println("Enetr the amount you want to deposit");
				deposit = obj.nextFloat();
				if(deposit>0) {
								balance = balance+deposit;	
								System.out.println("Deposit");
				}
				else {
					System.out.println("The deposit amount can not be less than or equal to zero");
				}	
			}	//end of depositAmount
			
			void withAmount() {
				Scanner obj = new Scanner(System.in);
				System.out.println("Enetr the withdraw ammount");
				withdrawl = obj.nextFloat();
				float tempBalance=balance-withdrawl;
				if(tempBalance<10000) {
					System.out.println("Isufficient amount");
				}
				else {
					balance=tempBalance;	
					System.out.println("Withdraw");
				}// end of else
			} // end of withdraw amount
			
			void checkBalance() {
				if(gender.equalsIgnoreCase("MALE") && maritialStatus.equalsIgnoreCase("U")) {
					System.out.println("Master"+custName+"Your balance is "+balance);
				  }
				  else if(gender.equalsIgnoreCase("MALE")&& maritialStatus.equalsIgnoreCase("M")) {
					System.out.println("Mr"+custName+"you balance is"+balance);
				 }
				  else if(gender.equalsIgnoreCase("Female")&& maritialStatus.equalsIgnoreCase("U")) {
					  	System.out.println("Miss"+custName+"Your balance is"+balance);
				}
				  else {
					  System.out.println("Mrs."+custName+"Your balance is"+balance);
				  }
			}//end of checkbalance	
			
			int loginAdmin(String uAdmin,String pAdmin) {
				if(uAdmin.equals(adminUser)&& pAdmin.equals(adminPassword)) {
					return 1;
				}
				return -1;
			}
			static void showAdminMenu() {
				System.out.println("1--------Create customer");
				System.out.println("2--------Display customer");
				System.out.println("2--------Search customer");
				System.out.println("3--------Logout");
				
			}// end of a showAdminMenu
			public void createCustomer() {
				
				Scanner obj = new Scanner(System.in);
				System.out.println("Enetr the custid");
				custID=obj.nextInt();
				System.out.println("Enter the account no");
				accountNo=obj.nextInt();
				System.out.println("Enter the customer name");
				custName=obj.next();
				System.out.println("Enter the username you want to set");
				custUserName=obj.next();
				System.out.println("Enter the password");
				custPassword=obj.next();
				System.out.println("Enter the gender");
				gender=obj.next();
				System.out.println("Enter the maritial status");
				maritialStatus=obj.next();			
				
			}
			public void displaycustomer() {

				System.out.println(custID+"\t"+accountNo+"\t"+custName+"\t"+custPassword+"\t"+balance);
			}	
			
				int LoginCustomer(String uName,String pass) {
					if(uName.equals(custName)&& pass.equals(custPassword)) {
								return 1;
					}
					return -1;
			}
				int transferMoney(Bank objBank[],int accountNumber){
					for(int i=0;i<2;i++)
					{
						if(objBank[i].accountNo==accountNumber)
							return i;
					}
					return -1;
				}
				
				float returnBalance() {
					return balance;
				}
				
			void updateBalance(float bal) {
				balance=bal;
			}
			
			static int search(Bank objBank[],int cid) {
				for(int i=0;i<2;i++) {
										if(objBank[i].custID==cid) {
											return i;
										}
				}
				return -1;
			}
		}//end of bank
			public class BankAppImplimentation{
				public static void main(String[] args) { 
					Scanner obj = new Scanner(System.in);
					Bank objBank = new Bank();
					Bank objBank1[]=new Bank[2];
					while(true) {
						
						System.out.println("1--------Admin Login");
						System.out.println("2--------Customer Login");
						System.out.println("3--------Exit");
						int choice = obj.nextInt();
						switch(choice) {
							case 1:System.out.println("Please enter the user name and password");
								String uAdmin=obj.next();
								String pAdmin=obj.next();
								if(objBank.loginAdmin(uAdmin,pAdmin)==1) {
									Bank.showAdminMenu();
									System.out.println("Enter the choice");
									int choiceAdmin=obj.nextInt();
									switch(choiceAdmin) {
												case 1: for(int i=0;i<2;i++) {
															objBank1[i]=new Bank();
															objBank1[i].createCustomer();												
															}//end of for
															break;
														
												case 2:System.out.println("cid\tacoount\tcname\tusername\tpasseord\tbalance");
														for(int i=0;i<2;i++){
																objBank1[i].displaycustomer();
															  }//display customer
														break;
														
												case 3:int cid;
													System.out.println("Enetr the id you want to search");
													cid=obj.nextInt();
													if(Bank.search(objBank1,cid)>0) {
														System.out.println("customer Exits");
													}else {
														System.out.println("customer dosn't exits");	
													}
													
													break;
													
												case 4:System.exit(0);
									}//end of admin menu
						} //
						else {
								System.out.println("Sorry user and password are wrong");	
								}
								break;
					
				 case 2:int flag=-1;
				 		System.out.println("Customer Login");
				 		System.out.println("Enter the user name and password");
				 		String cUser=obj.next();
				 		String cPassword=obj.next();
				 		for(int i=0;i<2;i++) {
				 						if(objBank1[i].LoginCustomer(cUser, cPassword)==1) {
				 							flag=i;
				 							break;
				 						}
				 		}					 
				 		if(flag>=0) {
						System.out.println("1------------Deposit");
						System.out.println("2------------Withdrawl");
						System.out.println("3------------Checkbalance");
					 	System.out.println("4------------Transfer");
						System.out.println("4------------Exit");
						System.out.println("Enetr the choice");
						int key=obj.nextInt();
						switch(key) {
									case 1:objBank.depositAmount();
										break;
									case 2:objBank.withAmount();
										break;
									case 3:objBank.checkBalance();
										break;
									
									case 4:	System.out.println("Enter the ammount you want to transfer ");
											int accountNo = obj.nextInt();
											int targetIndex = objBank1[flag].transferMoney(objBank1, accountNo);
											if(targetIndex>=0) {
												float amountTransfer;
												System.out.println("Enetr the you want to transfer");
												amountTransfer=obj.nextFloat();
												objBank1[flag].updateBalance((objBank1[flag].returnBalance())-amountTransfer);
												objBank1[targetIndex].updateBalance(objBank1[targetIndex].returnBalance()+amountTransfer);
											  } //end of if
										
											else {
													System.out.println("Target customer dosnt exits");
											   	  }
											break;	
									case 5:System.exit(0);
										break;
						} // end of switch customer login
				 		
					}
				 		else{
					 	System.out.println("The credentials are incorrect");
					
					} // end of else
					break;
				 case 3: System.exit(0);
				}//end of main
			}//end of while
		}
	}
			