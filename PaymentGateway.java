package Music;

import java.util.Random;
import java.util.Scanner;



public class PaymentGateway extends Home implements Payment{
	static boolean payment=false;
	static int count=0;
	@Override
	public void upiPaymet()
	{
	
		System.out.println("Choose Payment Option");
		System.out.println(" 1.PhonePay");
		System.out.println(" 2.GPay");
		System.out.println(" 3.Credit card");
		System.out.println(" 4.Go Back");
		Scanner sc=new Scanner(System.in);
		int choice_Payment=sc.nextInt();
		switch (choice_Payment) {
		case 1: {
			phonePay();
			break;
			
		}
		case 2: {
			GPay();
			break;
			
		}
		
		case 3:
		{
			credit_Card();
			break;
		}
		case 4:
		{
			Home_page();
			break;
		}
		default:
			System.err.println(" ❌ 𝑬𝒏𝒕𝒆𝒓 𝒗𝒂𝒍𝒊𝒅 𝒐𝒑𝒕𝒊𝒐𝒏 𝒇𝒐𝒓 𝒑𝒂𝒚𝒎𝒆𝒏𝒕 ❌");
		}
		
		
	}

	private void GPay()
	{
		
		
		System.out.println("============================================");
		System.out.println("        💰 You have selected : 𝑮𝑷𝒂𝒚 💰");
		System.out.println("============================================");
		Scanner s = new Scanner(System.in);
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		System.out.println("       Total price is " + Home.totalprice);
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		System.out.println("Verify your registered mobile number");
		long enter_verify_no=s.nextLong();
		if(enter_verify_no==Home.mobno)
		{
           
			int a=9999;
		Random r=new Random();
		int otp=r.nextInt(a);
		while(otp<999)
		{
			otp=r.nextInt(a);
		}
	
System.out.println("( "+otp+" )");
		
		System.out.println("Enter the otp displayed on the screen");
		
		System.out.println("=======================================");
		
		int enter_otp = s.nextInt();
		System.out.println("=======================================");
		if(enter_otp==otp)
		{
			System.out.println("Enter the amount");
			int price = s.nextInt();
			
			
			if(Home.totalprice==price)
			{
				payment=true;
			System.out.println("             ✔️ Payment SucessFull ✔️");
		
			}
		}
			else
			{
				System.err.println("Enter valid OTP");
				int o1 = s.nextInt();
				if(o1==otp)
				{
					System.out.println("++++++++++++++++++++++++++++++++++++++");
					System.out.println("       Total price is " + Home.totalprice);
					System.out.println("++++++++++++++++++++++++++++++++++++++");
					System.out.println("Enter amount");
					int price = s.nextInt();
					
					if (Home.totalprice == price) 
					{
						
						
						
								payment=true;
								System.out.println("             ✔️ Payment SucessFull ✔️");
					}
				}
				
			}

			

		
		
		}
		else 
		{
			if(count==0)
			{
				count++;
			System.err.println("Enter registered Mobile number");
			
			
			long enter_verify_no1=s.nextLong();
			if(enter_verify_no1==Home.mobno)
			{
	           
				int a=9999;
			Random r=new Random();
			int otp=r.nextInt(a);
			while(otp<999)
			{
				otp=r.nextInt(a);
			}
	System.out.println("( "+otp+" )");
			
			System.out.println("enter the otp displayed on the screen");
			
			System.out.println("=======================================");
			
			int enter_otp = s.nextInt();
			System.out.println("=======================================");
			if(enter_otp==otp)
			{
				
				System.out.println("++++++++++++++++++++++++++++++++++++++");
				System.out.println("       Total price is " + Home.totalprice);
				System.out.println("++++++++++++++++++++++++++++++++++++++");
				System.out.println("Enter the amount");
				int price = s.nextInt();
				
				
				if(Home.totalprice==price)
				{
					payment=true;
					System.out.println("             ✔️ Payment SucessFull ✔️");			
				}
			}
				else
				{
					System.err.println("Enter valid OTP");
					int o1 = s.nextInt();
					if(o1==otp)
					{
						System.out.println("Enter amount");
						int price = s.nextInt();
						
						if (Home.totalprice == price) 
						{
							    System.out.println("++++++++++++++++++++++++++++++++++++++");
								System.out.println("       Total price is " + Home.totalprice);
								System.out.println("++++++++++++++++++++++++++++++++++++++");
							
							payment=true;
							System.out.println("             ✔️ Payment SucessFull ✔️");						}
					}
					
				}

				

			
			
			}
			
			else//0
			{
				if(count==1)
				{
					count++;
				System.err.println("Enter registered Mobile number");
				long enter_verify_no2=s.nextLong();
				if(enter_verify_no2==Home.mobno)
				{
		           
					int a=9999;
				Random r=new Random();
				int otp=r.nextInt(a);
				while(otp<999)
				{
					otp=r.nextInt(a);
				}
		System.out.println("( "+otp+" )");
				
				System.out.println("enter the otp displayed on the screen");
				
				System.out.println("=======================================");
				
				int enter_otp = s.nextInt();
				System.out.println("=======================================");
				if(enter_otp==otp)
				{
					System.out.println("Enter the amount");
					int price = s.nextInt();
					
					
					if(Home.totalprice<=price)
					{	
				    System.out.println("++++++++++++++++++++++++++++++++++++++");
					System.out.println("       Total price is " + Home.totalprice);
					System.out.println("++++++++++++++++++++++++++++++++++++++");
						payment=true;
						System.out.println("             ✔️ Payment SucessFull ✔️");				
					}
				}
					else
					{
						System.err.println("Enter valid OTP");
						int o1 = s.nextInt();
						if(o1==otp)
						{
							System.out.println("Enter amount");
							int price = s.nextInt();
							
							if (Home.totalprice == price) 
							{
								    System.out.println("++++++++++++++++++++++++++++++++++++++");
									System.out.println("       Total price is " + Home.totalprice);
									System.out.println("++++++++++++++++++++++++++++++++++++++");
								
								payment=true;
								System.out.println("             ✔️ Payment SucessFull ✔️");							}
						}
						
					}

					
				
				//=====
				}
				else//1
				{
					if(count==2)
					{
						count++;
						System.err.println("Enter registered Mobile number");
						long enter_verify_no3=s.nextLong();
						if(enter_verify_no3==Home.mobno)
						{
				           
							int a=9999;
						Random r=new Random();
						int otp=r.nextInt(a);
						while(otp<999)
						{
							otp=r.nextInt(a);
						}
				System.out.println("( "+otp+" )");
						
						System.out.println("enter the otp displayed on the screen");
						
						System.out.println("=======================================");
						
						int enter_otp = s.nextInt();
						System.out.println("=======================================");
						if(enter_otp==otp)
						{
							System.out.println("Enter the amount");
							int price = s.nextInt();
							
							
							if(Home.totalprice==price)
							{
								    System.out.println("++++++++++++++++++++++++++++++++++++++");
									System.out.println("       Total price is " + Home.totalprice);
									System.out.println("++++++++++++++++++++++++++++++++++++++");
								
								payment=true;
								System.out.println("             ✔️ Payment SucessFull ✔️");						
							}
						}
							else
							{
								System.err.println("Enter valid OTP");
								int o1 = s.nextInt();
								if(o1==otp)
								{
									System.out.println("Enter amount");
									int price = s.nextInt();
									
									if (Home.totalprice == price) 
									{
										    System.out.println("++++++++++++++++++++++++++++++++++++++");
											System.out.println("       Total price is " + Home.totalprice);
											System.out.println("++++++++++++++++++++++++++++++++++++++");
										payment=true;
										System.out.println("             ✔️ Payment SucessFull ✔️");
									}
								}
								
							}

							
					}
					else//2
					{
						count=0;
						if(count==0)
						{
//							System.out.println("3444");
							upiPaymet();
						}
					}
				}
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			//===============
			}
			else {
				
//			System.out.println("==");
				upiPaymet();	
			}
			
			}}}
		
		
		
		
		
		
		
	}

	private void phonePay() 
	{   System.out.println("============================================");
		System.out.println("    📱 You have selected : 𝑷𝒉𝒐𝒏𝒆 𝑷𝒂𝒚 📱");
		System.out.println("============================================");
		Scanner s = new Scanner(System.in);
		System.out.println("Total price is " + Home.totalprice);
		System.out.println("Verify your registered mobile number");
		long enter_verify_no=s.nextLong();
		if(enter_verify_no==Home.mobno)
		{
           
			int a=9999;
		Random r=new Random();
		int otp=r.nextInt(a);
		while(otp<999)
		{
			otp=r.nextInt(a);
		}
System.out.println("( "+otp+" )");
		
		System.out.println("Enter the otp displayed on the screen");
		
		System.out.println("=======================================");
		
		int enter_otp = s.nextInt();
		System.out.println("=======================================");
		if(enter_otp==otp)
		{
			System.out.println("Enter the amount");
			int price = s.nextInt();
			
			
			if(Home.totalprice==price)
			{
		        System.out.println("++++++++++++++++++++++++++++++++++++++");
				System.out.println("       Total price is " + Home.totalprice);
				System.out.println("++++++++++++++++++++++++++++++++++++++");
				payment=true;
				System.out.println("             ✔️ Payment SucessFull ✔️");		
			}
		}
			else
			{
				System.err.println("Enter valid OTP");
				int o1 = s.nextInt();
				if(o1==otp)
				{
					System.out.println("Total price is " + Home.totalprice);
					System.out.println("Enter amount");
					int price = s.nextInt();
					
					if (Home.totalprice == price) 
					{
						
						
						
								payment=true;
								System.out.println("             ✔️ Payment SucessFull ✔️");					}
				}
				
			}

			

		
		
		}
		else 
		{
			if(count==0)
			{
				count++;
			System.err.println("Enter registered Mobile number");
			
			
			long enter_verify_no1=s.nextLong();
			if(enter_verify_no1==Home.mobno)
			{
	           
				int a=9999;
			Random r=new Random();
			int otp=r.nextInt(a);
			while(otp<999)
			{
				otp=r.nextInt(a);
			}
	System.out.println("( "+otp+" )");
			
			System.out.println("enter the otp displayed on the screen");
			
			System.out.println("=======================================");
			
			int enter_otp = s.nextInt();
			System.out.println("=======================================");
			if(enter_otp==otp)
			{
				System.out.println("Enter the amount");
				int price = s.nextInt();
				
				
				if(Home.totalprice==price)
				{
					System.out.println("++++++++++++++++++++++++++++++++++++++");
					System.out.println("       Total price is " + Home.totalprice);
					System.out.println("++++++++++++++++++++++++++++++++++++++");
					payment=true;
					System.out.println("             ✔️ Payment SucessFull ✔️");			
				}
			}
				else
				{
					System.err.println("Enter valid OTP");
					int o1 = s.nextInt();
					if(o1==otp)
					{
						System.out.println("Enter amount");
						int price = s.nextInt();
						
						if (Home.totalprice == price) 

						{
							System.out.println("++++++++++++++++++++++++++++++++++++++");
							System.out.println("       Total price is " + Home.totalprice);
							System.out.println("++++++++++++++++++++++++++++++++++++++");
							
							
							payment=true;
							System.out.println("             ✔️ Payment SucessFull ✔️");						}
					}
					
				}

				

			
			
			}
			
			else//0
			{
				if(count==1)
				{
					count++;
				System.err.println("Enter registered Mobile number");
				long enter_verify_no2=s.nextLong();
				if(enter_verify_no2==Home.mobno)
				{
		           
					int a=9999;
				Random r=new Random();
				int otp=r.nextInt(a);
				while(otp<999)
				{
					otp=r.nextInt(a);
				}
		System.out.println("( "+otp+" )");
				
				System.out.println("enter the otp displayed on the screen");
				
				System.out.println("=======================================");
				
				int enter_otp = s.nextInt();
				System.out.println("=======================================");
				if(enter_otp==otp)
				{
					System.out.println("Total price is " + Home.totalprice);
					System.out.println("Enter the amount");
					int price = s.nextInt();
					
					
					if(Home.totalprice==price)
					{
						payment=true;
						System.out.println("             ✔️ Payment SucessFull ✔️");				
					}
				}
					else
					{
						System.err.println("Enter valid OTP");
						int o1 = s.nextInt();
						if(o1==otp)
						{
							System.out.println("Enter amount");
							int price = s.nextInt();
							
							if (Home.totalprice == price) 
							{
							      System.out.println("++++++++++++++++++++++++++++++++++++++");
									System.out.println("       Total price is " + Home.totalprice);
									System.out.println("++++++++++++++++++++++++++++++++++++++");

								payment=true;
								
								System.out.println("             ✔️ Payment SucessFull ✔️");
							}
						}
						
					}

					
				
				//=====
				}
				else//1
				{
					if(count==2)
					{
						count++;
						System.err.println("Enter registered Mobile number");
						long enter_verify_no3=s.nextLong();
						if(enter_verify_no3==Home.mobno)
						{
				           
							int a=9999;
						Random r=new Random();
						int otp=r.nextInt(a);
						while(otp<999)
						{
							otp=r.nextInt(a);
						}
				System.out.println("( "+otp+" )");
						
						System.out.println("enter the otp displayed on the screen");
						
						System.out.println("=======================================");
						
						int enter_otp = s.nextInt();
						System.out.println("=======================================");
						if(enter_otp==otp)
						{
							System.out.println("Enter the amount");
							int price = s.nextInt();
							
							
							if(Home.totalprice==price)
							{
								 System.out.println("++++++++++++++++++++++++++++++++++++++");
									System.out.println("       Total price is " + Home.totalprice);
									System.out.println("++++++++++++++++++++++++++++++++++++++");
								
								payment=true;
								System.out.println("             ✔️ Payment SucessFull ✔️");						
							}
						}
							else
							{
								System.err.println("Enter valid OTP");
								int o1 = s.nextInt();
								if(o1==otp)
								{
									    System.out.println("++++++++++++++++++++++++++++++++++++++");
										System.out.println("       Total price is " + Home.totalprice);
										System.out.println("++++++++++++++++++++++++++++++++++++++");
									
									System.out.println("Enter amount");
									int price = s.nextInt();
									
									if (Home.totalprice == price) 
									{
										payment=true;

										System.out.println("             ✔️ Payment SucessFull ✔️");
									}
								}
								
							}

							
					}
					else//2
					{
						count=0;
						if(count==0)
						{
//							System.out.println("3444");
							upiPaymet();
						}
					}
				}
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			//===============
			}
			else {
				
//			System.out.println("==");
				upiPaymet();	
			}
			
			}}}
		
		
	}

	@Override
	public void credit_Card() 
	{
		System.out.println("====================================================");
		System.out.println("         💳 You have Selected : Credit card 💳");
		System.out.println("====================================================");
		OTP_Logic lo=new OTP_Logic();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the card number : ");
		long card_number=sc.nextLong();
		System.out.println("Enter the CVV");
		int cvv=sc.nextInt();
		System.out.println("Enter the expiry date");
		String exp_date=sc.nextLine();
		sc.nextLine();
		OTP_Logic.otp=lo.generate_otp();
		System.out.println("Generate_Otp : ");
		System.out.println(OTP_Logic.otp);
		
		lo.validateOTP();
		
		
		
		
		
		
	}

}
