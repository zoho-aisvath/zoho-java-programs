import java.util.*;
import java.io.*;
//Bank Management system 



//Customer deatils to be stpred in a class 
class Customer{
	ArrayList<Double> transaction_records_sav=new ArrayList<Double>();
	ArrayList<Double> transaction_records_cur=new ArrayList<Double>();
	private String name;
	private String username;
	private String password;
	private String address;
	private String phone;
	public double savings_balance;
	private double current_balance;
	Customer(String name,String username,String password,String address,String phone,Double savings_balance,Double current_balance){
		this.name=name;
		this.username=username;	
		this.password=password;
		this.address=address;
		this.phone=phone;		
		this.savings_balance=savings_balance;
		this.current_balance=current_balance;
		transaction_records_sav.add(savings_balance);
		transaction_records_cur.add(current_balance);
	}
	public String getpwd(){
		return password;
	}
	public double getcurbal(){
		return current_balance;
	}
	public double getsavbal(){
		return savings_balance;
	}
	public void withdrawcur(double amt){
		current_balance=current_balance-amt;		
		amt=amt*-1;
		transaction_records_cur.add(amt);
	}
	public void withdrawsav(double amt){
		savings_balance=savings_balance-amt;
		amt=amt*-1;
		transaction_records_sav.add(amt);
	}
	public void depositsav(double amt){
		savings_balance=savings_balance+amt;
		transaction_records_sav.add(amt);
	}
	public String toString(){
		System.out.println("Customer Name: "+name);
		System.out.println("Customer UserName: "+username);
		System.out.println("Customer Address: "+address);
		System.out.println("Customer Phone: "+phone);
		System.out.println("Customer current account balance: "+current_balance);
		System.out.println("Customer Savings account balance: "+savings_balance);
		return "\n";
	}
}

class Server{
	public static HashMap<String,Customer> details;
	Server(){
		details=new HashMap<String,Customer>();
		Customer a=new Customer("Aisvath","notorious1","Aisvath@333abc","Chennai","9047890904",540.00,1500.00);
		Customer b=new Customer("Adhithyan","notorious2","Adhithyan@333abc","Chennai","9047890905",13540.00,1400.00);
		Customer c=new Customer("Anuraag","notorious3","Anuraag@333abc","Chennai","9047890906",1540.00,540.00);
		Customer d=new Customer("Akhilesh","notorious4","Akhilesh@333abc","Chennai","9047890907",15400.00,456.00);
		Customer e=new Customer("Balaji","notorious5","Balaji@333abc","Chennai","9047890908",890.00,1546.00);
		details.put("notorious1",a);
		details.put("notorious2",b);
		details.put("notorious3",c);
		details.put("notorious4",d);
		details.put("notorious5",e);


	}
	public void add(String username,Customer customer){
		details.put(username,customer);
		System.out.println("Inserted one customer succesfully !");
	}
	
		
}

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);	
		boolean exit_condition=true;
		Server server=new Server();
		do{
			String password;
			double amount;		
			Customer customer;		
			
			System.out.println("\n\n\n");
		
			System.out.println("-----------------------WELCOME TO INDIAN BANK------------------------\n");
			System.out.println("1.LOGIN               2.SIGN UP             3.ADMIN            4.EXIT");
			System.out.println("Enter your choice : ");
			int ch=sc.nextInt();
			sc.nextLine();
			
			switch(ch){
				
				case 1:
					//Login page code 
					System.out.println("Login page");
					
					//Server server2=new Server();
					System.out.println("Enter Username : ");
					String user1=sc.nextLine();
					if(Server.details.containsKey(user1)){
						System.out.println("Enter password : ");
						String pwd=sc.nextLine();
						Customer test=Server.details.get(user1);	
						if(test.getpwd().equals(pwd)){
							
							System.out.println("Select your account type for the transaction : ");
							System.out.println("1. Savings account      2.Current account  ");
							int input=sc.nextInt();
							sc.nextLine();
							if(input==1){
								System.out.println("1. Withdraw    2.Deposit     3.Check Balance   4.transaction history     ");
								int ch1=sc.nextInt();
								sc.nextLine();	
								if(ch1==1){
									System.out.println("Enter the amount you wish to withdraw : ");
									
									double amt=sc.nextDouble();
									if(test.getsavbal()-amt<500){
										System.out.println("Insufficient funds");
									}	
									else{
										test.withdrawsav(amt);
										System.out.println("Succesfully withdrawn amount of RS "+amt);
										System.out.println("\n");
										System.out.println("Your current balance as of date is Rs : "+test.getsavbal());
									}
								}
								else if(ch1==2){
									System.out.println("Enter the amount you wish to deposit : ");
									
									double amt=sc.nextDouble();
									test.depositsav(amt);
									System.out.println("Succesfully deposited an amount of Rs "+amt);
									System.out.println("\n");
									System.out.println("Your current balance as of date is Rs : "+test.getsavbal());
								}
								else if(ch1==3){
									System.out.println("Your current balance is Rs : "+test.getsavbal());					
								}		
								else if(ch1==4){
									System.out.println("Your transaction history is = \n");
									System.out.println(test.transaction_records_sav);
								}
								
								else{
									System.out.println("You've entered invalid input !");
								}
							}
							else if(input==2){
								System.out.println("1. Withdraw    2.Check Balance   3.Check Transactions ");
								int ch2=sc.nextInt();
								if(ch2==1){
									System.out.println("Enter the amount you wish to withdraw : ");
									
									double amt=sc.nextDouble();
									if((test.getcurbal()-amt)<500){
										System.out.println("Insufficient funds");
									}	
									else{
										test.withdrawcur(amt);
										System.out.println("Succesfully withdrawn amount of RS "+amt);
										System.out.println("\n");
										System.out.println("Your current balance as of date is Rs: "+test.getcurbal());
									}
								}
								else if(ch2==2){
									System.out.println("Your current balance is RS : "+test.getcurbal());
								}
								else if(ch2==3){
									System.out.println("Your transaction history is =  \n");
									System.out.println(test.transaction_records_cur);
								}
								
								else{
									System.out.println("You've entered invalid input !");
								}
							}			
					
							else{
								System.out.println("You've entered wrong choice, Try again : ");
							}

						}
						else{
							System.out.println("You've entered wrong credentials !");
							break;
						}
					}
					else{
						System.out.println("There is no user with the entered username !");
					}
					
					break;





				case 2:
					System.out.println("Enter the following details correctly : ");
					System.out.println("Enter Name : ");
					String name=sc.nextLine();
					System.out.println("Enter Address : ");
					String address=sc.nextLine();
					boolean check=true;
					StringBuilder phone_number=new StringBuilder("");
					do{
						boolean correct=true;
						System.out.println("Enter Phone number : ");		
						String phone=sc.nextLine();
						char arr[]=phone.toCharArray();
						if(phone.length()!=10){
							correct=false;
							check=false;
						}
						else{
							for(int i=0;i<arr.length;i++){
								if(!Character.isDigit(arr[i])){
									correct=false;
									check=false;
									
								}
							}
							correct=true;
							check=true;
							phone_number.append(phone);
						}
						if(!correct){
							System.out.println("Enter the correct phone number !!!");
						}

					}while(!check);
					String phone=phone_number.toString();
					boolean check_name=true;
					StringBuilder user=new StringBuilder("");
					do{
						System.out.println("Enter a username :");
						String username=sc.nextLine();
						if(username.length()==0){
							check_name=false;

						}
						else{
							System.out.println("Username entered succesfully !");
							user.append(username);
							break;
						}
						if(!check_name){
							System.out.println("Enter a valid username");
						}
					}while(!check_name);
					String username=user.toString();
					System.out.println("Entered username is "+username);
					System.out.println("Set a password (minimum 8 chars; minimum 1 digit, 1 lowercase, 1 uppercase, 1 special character");
					password = sc.next();
					sc.nextLine();
					while(!password.matches((("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*_]).{8,}"))))
					{
						System.out.println("Invalid password condition. Set again :");
						password=sc.next();
					}
					System.out.print("Enter initial deposit amount: ");
					System.out.println("Ensure amount is a minimum of Rs. 500");
					amount=sc.nextDouble();		
					while((amount<500)){
						System.out.println("Invalid deposit amount entered ! ");
						System.out.println("Enter another amount !");
						amount=sc.nextDouble();
					}
					customer=new Customer(name,username,password,address,phone,amount,0.00);
					Server.details.put(username,customer);
					System.out.println("Your account has been created succesfully ! ");		
					System.out.println("An amount of Rs "+ amount+" has been deposited succesfully into your savings account");			
					break;
				

				

				case 3:
					System.out.println("Admin page");

					System.out.println("Enter admin username :");
					String adminname=sc.nextLine();
					if(adminname.equals("admin")){
						System.out.println("Enter admin password ");
						String apassword=sc.nextLine();
						if(apassword.equals("password")){
							boolean exit_c=true;
							do{
								System.out.println("1.Display Bank cash     2.Verify transactions      3.LogOut    4.View All transactions  5.View customer details");
								int input3=sc.nextInt();
								sc.nextLine();
								switch(input3){

									case 1:
										Double total=0.0;
										for(Map.Entry m: Server.details.entrySet()){
											Customer temp=(Customer)m.getValue();
											total=total+temp.getcurbal()+temp.getsavbal();
										}
										System.out.println("Total cash in bank is RS: "+total);	
										break;
									case 2:
										System.out.println("Enter customer's username : ");
										String adminip=sc.nextLine();
										
										for(Map.Entry m: Server.details.entrySet()){
											String temp=(String)m.getKey();
											if(temp.equals(adminip)){
												System.out.println("This customer's transaction history is : ");
												Customer temp1=(Customer)m.getValue();
												System.out.println("Current account :");
												System.out.println(temp1.transaction_records_cur);
												System.out.println("\n");
												System.out.println("Savings account :");
												System.out.println(temp1.transaction_records_sav);
												System.out.println("\n");
											}
										}	
										break;
	
									case 3:
										exit_c=false;
										break;

									case 4:
										System.out.println("The transaction details of all the customers are : ");
										for(Map.Entry m: Server.details.entrySet()){
											Customer temp2=(Customer)m.getValue();
											System.out.println("Customer username : "+m.getKey());
											System.out.println("Customer's current account transactions : "+temp2.transaction_records_cur);
											System.out.println("Customer's savings accoung transactions : "+temp2.transaction_records_sav);
											System.out.println("\n");
											
										}
										break;
									case 5:
										System.out.println("The customer details are : ");
										for(Map.Entry m: Server.details.entrySet()){
											Customer temp2=(Customer)m.getValue();
											System.out.println(temp2);
											System.out.println("\n");
										}
										break;
								}
							}while(exit_c);
						}
						else{
							System.out.println("Invalid credentials !");
						}
					}
					else{
						System.out.println("Access denied");
					}	
					break;
				case 4:
					exit_condition=false;
					break;
			}
		}while(exit_condition);
	}
}
