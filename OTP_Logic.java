package Music;

import java.util.Random;
import java.util.Scanner;



public class OTP_Logic {
	static boolean payment=false;
	static int otp;
	
	
	public int generate_otp() 
	{
		int otp_init=9999;
		Random r=new Random();
		int otp=r.nextInt(otp_init);
		while(otp<999)
		{
			otp=r.nextInt(otp_init);
		}
		
		
		return otp;
	}
	public void validateOTP() 
{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the otp displayed on the screen");
		System.out.println("=======================================");
		
		int enter_otp = s.nextInt();
		System.out.println("=======================================");
		if(enter_otp==otp)
	{//enter_otp start
			System.out.println("Total price is " + Home.totalprice);
			mobile_logic mb=new mobile_logic();
			
			mb.mobile();
//		if(count==0)
//		{
//			
//			mb.mobile();
//			count++;
//			
//		}
//		else if (count==1) 
//		{
//			mb.mobile();
//			count++;
//		} 
//		else if (count==2) 
//		{
//			mb.mobile();
//			count++;
//		} 
//		else 
//		{
//			if(count==3)
//			{
//				System.err.println("Payment declined");
//			}
//			
//		}
	
		
	}////enter_otp start
		else
		{
			
				System.err.println("Enter valid OTP");
				int o1 = s.nextInt();
				if(o1==otp)
				{
					System.out.println("Enter amount");
					double price = s.nextDouble();
					double returns;
					if (Home.totalprice == price) 
					{
						
						System.out.println("Total price is " + Home.totalprice);
						
								payment=true;
						System.out.println("                                       Payment SucessFull");
					}
				}
				
			
		}
	



//===============
}

		

}
	
