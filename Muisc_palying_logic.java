package Music;

import java.util.Scanner;

public class Muisc_palying_logic extends Driver_Main implements On_Off {

	@Override
	public void play_on_off() 
	{
		Home pg=new Home();
System.out.println("1.𝑷𝒍𝒂𝒚   2.𝑷𝒂𝒖𝒔𝒆   3.𝑺𝒕𝒐𝒑   4.𝑹𝒆𝒂𝒑𝒆𝒂𝒕 5.𝑮𝒐 𝑩𝒂𝒄𝒌 6.𝒅𝒐𝒘𝒏𝒍𝒐𝒂𝒅");
		Scanner sc=new Scanner(System.in);
		 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
			int play=sc.nextInt();
			if(play==1)
			{
				System.out.println("⏮  🎶  ⏭");
				play_on_off();
			}
			else if(play==2)
			{
				System.out.println("⏮  ⏸️  ⏭");
				play_on_off();
			}
			else if (play==3)
			{
				System.out.println("⏮  ▶  ⏭");
			play_on_off();
			}
			else if (play==4) 
			{

				if (Home.mobno==0)
				{
					pg.signup();
					
				}
				
				if(Home.mobno!=0)
				{
					if(PaymentGateway.payment!=true)
					{
					pg.Subscription();
					}
					else
					{
						System.out.println(" 🔁 ");
						play_on_off();
					}
					
                 main(null);
                 
					
					
				}
			
				
				
				
			}
			else if (play==5) 
			{
//				pg.Home_page();
				main(null);
			}
			
			else if (play==6) 
			{
				
				if (Home.mobno==0)
				{
					pg.signup();
					
				}
				
				if(Home.mobno!=0)
				{
					if(PaymentGateway.payment!=true)
					{
					pg.Subscription();
					}
					else
					{
						System.out.println(" 📥 Dowloaded Completed 📥");
				play_on_off();
					}
					
                 main(null);
                 
					
					
				}
			

			}
			else 
			{
			System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");	
			play_on_off();
			
			}
		
	}

}
