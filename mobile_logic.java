package Music;

import java.util.Scanner;



public class mobile_logic extends PaymentGateway {

	static int count=0;
public void mobile() 
{
	
	Scanner s=new Scanner(System.in);
	System.out.println("Verify your registered mobile number");
	long enter_verify_no=s.nextLong();
	if(enter_verify_no==Home.mobno)
	{
		
		System.out.println("Enter the amount");
		double price = s.nextDouble();

		if(Home.totalprice<=price)
		{
			System.out.println("Total price is " + Home.totalprice);
			payment=true;
		System.out.println("                                       Payment SucessFull");
	
		}
		
	}	
else
{//main else
	
	
	
	
	
	
	
	
	
	
	
	System.err.println("enter valid mobile no : ");
	  if(count==0)
	  {
		  count++;
		  System.out.println("Verify your registered mobile number");
			long enter_verify_no0=s.nextLong();
			if(enter_verify_no0==Home.mobno)
			{
				
				System.out.println("Enter the amount");
				double price = s.nextDouble();

				if(Home.totalprice==price)
				{
					System.out.println("Total price is " + Home.totalprice);
					payment=true;
				System.out.println("                                       Payment SucessFull");
			
				}
				
			}
			else
			{
				System.err.println("enter valid mobile no : ");
				 if(count==1)
				  {count++;
					 System.out.println("Verify your registered mobile number");
						long enter_verify_no1=s.nextLong();
						if(enter_verify_no1==Home.mobno)
						{
							
							System.out.println("Enter the amount");
							double price = s.nextDouble();

							if(Home.totalprice<=price)
							{
								System.out.println("Total price is " + Home.totalprice);
								payment=true;
							System.out.println("                                       Payment SucessFull");
						
							}
							
						}//right
						else
						{
							System.err.println("enter valid mobile no : ");
							 if(count==2)
							  {
								 count++;
								 System.out.println("Verify your registered mobile number");
									long enter_verify_no2=s.nextLong();
									if(enter_verify_no2==Home.mobno)
									{
										
										System.out.println("Enter the amount");
										double price = s.nextDouble();

										if(Home.totalprice==price)
										{
											System.out.println("Total price is " + Home.totalprice);
											payment=true;
										System.out.println("                                       Payment SucessFull");
									
										}
										
									}
									
									
							  }
							
						}
					 
					 
				  }
				
			
				
				
			}
			

	  
	  }
	
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}//main else





}
}
