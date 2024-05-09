package Music;

import java.util.Scanner;

public class GoBack_feature extends Home
{
public void Hp_podcast() 
{
	
	Scanner sc =new Scanner(System.in);
	   System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
	   int hp_choice=sc.nextInt();
	   switch (hp_choice) {
	case 1:
	{
		System.out.println();
		System.out.println("🎙️ The List Of Podcast 🎙️");
		System.out.println();
		System.out.print("1.The Diary Of A CEO    ");
		System.out.println("2.The Joe Rogan Experience");
		System.out.print("3.On Purpose with Jay Shetty   ");
		System.out.print("4.Huberman Lab   ");
		System.out.print("5.Go Back");
		System.out.println();
		 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
		int hp_podcast=sc.nextInt();
		if(hp_podcast==1)
		{
			System.out.println();
			System.out.println("You have selected : 𝙏𝙝𝙚 𝘿𝙞𝙖𝙧𝙮 𝙊𝙛 𝘼 𝘾𝙀𝙊");
			System.out.println("Description : ");
			System.out.println("A few years ago I was a broke, university dropout, at 18 I built an\nindustry leading social media marketing company, and at 27 I resigned as CEO.");
			
			On_Off play_in=new Muisc_palying_logic();
			
			
			System.out.println("1.𝑷𝒍𝒂𝒚   2.𝑷𝒂𝒖𝒔𝒆   3.𝑺𝒕𝒐𝒑   4.𝑹𝒆𝒂𝒑𝒆𝒂𝒕 5.𝑮𝒐 𝑩𝒂𝒄𝒌 6.𝒅𝒐𝒘𝒏𝒍𝒐𝒂𝒅");
		
			 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
				int play=sc.nextInt();
				if(play==1)
				{
					System.out.println("⏮  🎶  ⏭");
					play_in.play_on_off();
				}
				else if(play==2)
				{
					System.out.println("⏮  ⏸️  ⏭");
					play_in.play_on_off();
				}
				else if (play==3)
				{
					System.out.println("⏮  ▶  ⏭");
					play_in.play_on_off();
				}
				else if (play==4) 
				{
					if (Home.mobno==0)
					{
						signup();
						
					}
					
					if(Home.mobno!=0)
					{
						if(PaymentGateway.payment!=true)
						{
						Subscription();
						}
						else
						{
							System.out.println(" 🔁 ");
							play_in.play_on_off();
						}
						
                     main(null);
                     
						
						
					}
				
				
				}
				else if (play==5) 
				{
					
					Home_page();
				}
				else if(play==6)
				{
					if (Home.mobno==0)
					{
						signup();
						
					}
					
					if(Home.mobno!=0)
					{
						if(PaymentGateway.payment!=true)
						{
						Subscription();
						}
						else
						{
							System.out.println(" 📥 Dowloaded Completed 📥");
							play_in.play_on_off();
						}
						
                     main(null);
                     
						
						
					}
					
				}
				else 
				{
				System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");	
				play_in.play_on_off();
				}
			
		}
		//
		else if (hp_podcast==2) 
		
		{
		
			System.out.println();
			System.out.println("You have selected : 𝙏𝙝𝙚 𝙅𝙤𝙚 𝙍𝙤𝙜𝙖𝙣 𝙀𝙭𝙥𝙚𝙧𝙞𝙚𝙣𝙘𝙚");
			System.out.println("Description : ");
			System.out.println("The official podcast of comedian Joe Rogan.");
			
			On_Off play_in=new Muisc_palying_logic();
			
			
			System.out.println("1.𝑷𝒍𝒂𝒚   2.𝑷𝒂𝒖𝒔𝒆   3.𝑺𝒕𝒐𝒑   4.𝑹𝒆𝒂𝒑𝒆𝒂𝒕 5.𝑮𝒐 𝑩𝒂𝒄𝒌 6.𝒅𝒐𝒘𝒏𝒍𝒐𝒂𝒅");
		
			 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
				int play=sc.nextInt();
				if(play==1)
				{
					System.out.println("⏮  🎶  ⏭");
					play_in.play_on_off();
				}
				else if(play==2)
				{
					System.out.println("⏮  ⏸️  ⏭");
					play_in.play_on_off();
				}
				else if (play==3)
				{
					System.out.println("⏮  ▶  ⏭");
					play_in.play_on_off();
				}
				else if (play==4) 
				{
					if (Home.mobno==0)
					{
						signup();
						
					}
					
					if(Home.mobno!=0)
					{
						if(PaymentGateway.payment!=true)
						{
						Subscription();
						}
						else
						{
							System.out.println(" 🔁 ");
							play_in.play_on_off();
						}
						
                     main(null);
                     
						
						
					}
				
				}
				else if (play==5) 
				{
					
					Home_page();
				}
				else if(play==6) {


					if (Home.mobno==0)
					{
						signup();
						
					}
					
					if(Home.mobno!=0)
					{
						if(PaymentGateway.payment!=true)
						{
						Subscription();
						}
						else
						{
							System.out.println(" 📥 Dowloaded Completed 📥");
							play_in.play_on_off();
						}
						
                     main(null);
                     
						
						
					}
						
					
				
					
				}
				else 
				{
				System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");	
				play_in.play_on_off();
				}
		
					
		}
		
		//3====================
		else if (hp_podcast==3) 
		{
			
			System.out.println();
			System.out.println("You have selected : 𝙊𝙣 𝙋𝙪𝙧𝙥𝙤𝙨𝙚 𝙬𝙞𝙩𝙝 𝙅𝙖𝙮 𝙎𝙝𝙚𝙩𝙩𝙮");
			System.out.println("Description : ");
			System.out.println("I’m Jay Shetty host of On Purpose the worlds #1 Mental Health podcast\nand I’m so grateful you found us.");
			
			On_Off play_in=new Muisc_palying_logic();
			
			
			System.out.println("1.𝑷𝒍𝒂𝒚   2.𝑷𝒂𝒖𝒔𝒆   3.𝑺𝒕𝒐𝒑   4.𝑹𝒆𝒂𝒑𝒆𝒂𝒕 5.𝑮𝒐 𝑩𝒂𝒄𝒌 6.𝒅𝒐𝒘𝒏𝒍𝒐𝒂𝒅");
		
			 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
				int play=sc.nextInt();
				if(play==1)
				{
					System.out.println("⏮  🎶  ⏭");
					play_in.play_on_off();
				}
				else if(play==2)
				{
					System.out.println("⏮  ⏸️  ⏭");
					play_in.play_on_off();
				}
				else if (play==3)
				{
					System.out.println("⏮  ▶  ⏭");
					play_in.play_on_off();
				}
				else if (play==4) 
				{
					if (Home.mobno==0)
					{
						signup();
						
					}
					
					if(Home.mobno!=0)
					{
						if(PaymentGateway.payment!=true)
						{
						Subscription();
						}
						else
						{
							System.out.println(" 🔁 ");
							play_in.play_on_off();
						}
						
                     main(null);
                     
						
						
					}
				
					
					
				}
				else if (play==5) 
				{
					
					Home_page();
				}
				else if (play==6) 
				{
					

					if (Home.mobno==0)
					{
						signup();
						
					}
					
					if(Home.mobno!=0)
					{
						if(PaymentGateway.payment!=true)
						{
						Subscription();
						}
						else
						{
							System.out.println(" 📥 Dowloaded Completed 📥");
							play_in.play_on_off();
						}
						
                     main(null);
                     
						
						
					}
					
				}
				else 
				{
				System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");	
				play_in.play_on_off();
				}
			
			
		}
		//==============4
		else if (hp_podcast==4)
		{
			
			System.out.println();
			System.out.println("You have selected : 𝙃𝙪𝙗𝙚𝙧𝙢𝙖𝙣 𝙇𝙖𝙗");
			System.out.println("Description : ");
			System.out.println("Huberman Lab discusses neuroscience — how our brain and its connections\nwith the organs of our body control our perceptions,\nour behaviors, and our health.");
			
			On_Off play_in=new Muisc_palying_logic();
			
			
			System.out.println("1.𝑷𝒍𝒂𝒚   2.𝑷𝒂𝒖𝒔𝒆   3.𝑺𝒕𝒐𝒑   4.𝑹𝒆𝒂𝒑𝒆𝒂𝒕 5.𝑮𝒐 𝑩𝒂𝒄𝒌 6.𝒅𝒐𝒘𝒏𝒍𝒐𝒂𝒅");
		
			 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
				int play=sc.nextInt();
				if(play==1)
				{
					System.out.println("⏮  🎶  ⏭");
					play_in.play_on_off();
				}
				else if(play==2)
				{
					System.out.println("⏮  ⏸️  ⏭");
					play_in.play_on_off();
				}
				else if (play==3)
				{
					System.out.println("⏮  ▶  ⏭");
					play_in.play_on_off();
				}
				else if (play==4) 
				{
					if (Home.mobno==0)
					{
						signup();
						
					}
					
					if(Home.mobno!=0)
					{
						if(PaymentGateway.payment!=true)
						{
						Subscription();
						}
						else
						{
							System.out.println(" 🔁 ");
							play_in.play_on_off();
						}
						
                     main(null);
                     
						
						
					}
				
				}
				else if (play==5) 
				{
					
					Home_page();
				}
				else if (play==6) 
				{
					

					if (Home.mobno==0)
					{
						signup();
						
					}
					
					if(Home.mobno!=0)
					{
						if(PaymentGateway.payment!=true)
						{
						Subscription();
						}
						else
						{
							System.out.println(" 📥 Dowloaded Completed 📥");
							play_in.play_on_off();
						}
						
                     main(null);
                     
						
						
					}
					
				}
				else 
				{
				System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");	
				play_in.play_on_off();
				}
			
		}
		else if (hp_podcast==5)
		{
			Home_page();
			
		}
		else
		{
			//go back Logic
			System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");
		   Hp_podcast();
		}
		
		
		break;
	}
	
	
	
	case 2:
	{
		System.out.println();
		System.out.println("🎶 The List Of Music 🎶");
		System.out.println();
		System.out.print("1.Perfect   ");
		System.out.println("2.Who says");
		System.out.print("3.Easy on me  ");
		System.out.print("4.Scars To your beautiful  ");
		System.out.print("5.Go Back");
		System.out.println();
		 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
		int hp_podcast=sc.nextInt();
		if(hp_podcast==1)
		{
			System.out.println();
			System.out.println("You have selected : 𝙋𝙚𝙧𝙛𝙚𝙘𝙩");
			System.out.println("Singer name : 𝙀𝙙 𝙎𝙝𝙚𝙚𝙧𝙖𝙣 ");
           System.out.println("Launched date: 2017 ");			
			On_Off play_in=new Muisc_palying_logic();
			
			
			System.out.println("1.𝑷𝒍𝒂𝒚   2.𝑷𝒂𝒖𝒔𝒆   3.𝑺𝒕𝒐𝒑   4.𝑹𝒆𝒂𝒑𝒆𝒂𝒕 5.𝑮𝒐 𝑩𝒂𝒄𝒌 6.𝒅𝒐𝒘𝒏𝒍𝒐𝒂𝒅");
		
			 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
				int play=sc.nextInt();
				if(play==1)
				{
					System.out.println("⏮  🎶  ⏭");
					play_in.play_on_off();
				}
				else if(play==2)
				{
					System.out.println("⏮  ⏸️  ⏭");
					play_in.play_on_off();
				}
				else if (play==3)
				{
					System.out.println("⏮  ▶  ⏭");
					play_in.play_on_off();
				}
				else if (play==4) 
				{
					if (Home.mobno==0)
					{
						signup();
						
					}
					
					if(Home.mobno!=0)
					{
						if(PaymentGateway.payment!=true)
						{
						Subscription();
						}
						else
						{
							System.out.println(" 🔁 ");
							play_in.play_on_off();
						}
						
                     main(null);
                     
						
						
					}
				
				}
				else if (play==5) 
				{
					
					Home_page();
				}
				else if (play==6) 
				{
					

					if (Home.mobno==0)
					{
						signup();
						
					}
					
					if(Home.mobno!=0)
					{
						if(PaymentGateway.payment!=true)
						{
						Subscription();
						}
						else
						{
							System.out.println(" 📥 Dowloaded Completed 📥");
							play_in.play_on_off();
						}
						
                     main(null);
                     
						
						
					}
					
				}
				else 
				{
				System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");	
				play_in.play_on_off();
				}
			
		}
		//
		else if (hp_podcast==2) 
		
		{
		
		
			System.out.println();
			System.out.println("You have selected : 𝑾𝒉𝒐 𝑺𝒂𝒚𝒔");
			System.out.println("Singer name : 𝑺𝒆𝒍𝒆𝒏𝒂 𝑮𝒐𝒎𝒆𝒛 ");
           System.out.println("Launched date: 2011 ");	
			
			On_Off play_in=new Muisc_palying_logic();
			
			
			System.out.println("1.𝑷𝒍𝒂𝒚   2.𝑷𝒂𝒖𝒔𝒆   3.𝑺𝒕𝒐𝒑   4.𝑹𝒆𝒂𝒑𝒆𝒂𝒕 5.𝑮𝒐 𝑩𝒂𝒄𝒌 6.𝒅𝒐𝒘𝒏𝒍𝒐𝒂𝒅");
		
			 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
				int play=sc.nextInt();
				if(play==1)
				{
					System.out.println("⏮  🎶  ⏭");
					play_in.play_on_off();
				}
				else if(play==2)
				{
					System.out.println("⏮  ⏸️  ⏭");
					play_in.play_on_off();
				}
				else if (play==3)
				{
					System.out.println("⏮  ▶  ⏭");
					play_in.play_on_off();
				}
				else if (play==4) 
				{
					if (Home.mobno==0)
					{
						signup();
						
					}
					
					if(Home.mobno!=0)
					{
						if(PaymentGateway.payment!=true)
						{
						Subscription();
						}
						else
						{
							System.out.println(" 🔁 ");
							play_in.play_on_off();
						}
						
                     main(null);
                     
						
						
					}
				
				}
				else if (play==5) 
				{
					
					Home_page();
				}
				else if (play==6) 
				{
					

					if (Home.mobno==0)
					{
						signup();
						
					}
					
					if(Home.mobno!=0)
					{
						if(PaymentGateway.payment!=true)
						{
						Subscription();
						}
						else
						{
							System.out.println(" 📥 Dowloaded Completed 📥");
							play_in.play_on_off();
						}
						
                     main(null);
                     
						
						
					}
					
				}
				else 
				{
				System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");	
				play_in.play_on_off();
				}
		
					
		}
		
		//3====================
		else if (hp_podcast==3) 
		{
			
			System.out.println();
			System.out.println("You have selected : 𝒆𝒂𝒔𝒚 𝒐𝒏 𝒎𝒆");
			System.out.println("Singer name : 𝑨𝒅𝒆𝒍𝒆 ");
           System.out.println("Launched date: 2021 ");	
			On_Off play_in=new Muisc_palying_logic();
			
			
			System.out.println("1.𝑷𝒍𝒂𝒚   2.𝑷𝒂𝒖𝒔𝒆   3.𝑺𝒕𝒐𝒑   4.𝑹𝒆𝒂𝒑𝒆𝒂𝒕 5.𝑮𝒐 𝑩𝒂𝒄𝒌 6.𝒅𝒐𝒘𝒏𝒍𝒐𝒂𝒅");
		
			 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
				int play=sc.nextInt();
				if(play==1)
				{
					System.out.println("⏮  🎶  ⏭");
					play_in.play_on_off();
				}
				else if(play==2)
				{
					System.out.println("⏮  ⏸️  ⏭");
					play_in.play_on_off();
				}
				else if (play==3)
				{
					System.out.println("⏮  ▶  ⏭");
					play_in.play_on_off();
				}
				else if (play==4) 
				{
					if (Home.mobno==0)
					{
						signup();
						
					}
					
					if(Home.mobno!=0)
					{
						if(PaymentGateway.payment!=true)
						{
						Subscription();
						}
						else
						{
							System.out.println(" 🔁 ");
							play_in.play_on_off();
						}
						
                     main(null);
                     
						
						
					}
				
				}
				else if (play==5) 
				{
					
					Home_page();
				}
				
				else if (play==6) {

					if (Home.mobno==0)
					{
						signup();
						
					}
					
					if(Home.mobno!=0)
					{
						if(PaymentGateway.payment!=true)
						{
						Subscription();
						}
						else
						{
							System.out.println(" 📥 Dowloaded Completed 📥");
							play_in.play_on_off();
						}
						
                     main(null);
                     
						
						
					}
					
					
				}
				else 
				{
				System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");	
				play_in.play_on_off();
				}
			
			
		}
		//==============4
		else if (hp_podcast==4)
		{
			
			System.out.println();
			System.out.println();
			System.out.println("You have selected : 𝑺𝒄𝒂𝒓𝒔 𝒕𝒐 𝒀𝒐𝒖𝒓 𝑩𝒆𝒂𝒖𝒕𝒊𝒇𝒖𝒍");
			System.out.println("Singer name : 𝑨𝒍𝒆𝒔𝒔𝒊𝒂 𝑪𝒂𝒓𝒂");
           System.out.println("Launched date: 2015 ");	
			On_Off play_in=new Muisc_palying_logic();
			
			
			System.out.println("1.𝑷𝒍𝒂𝒚   2.𝑷𝒂𝒖𝒔𝒆   3.𝑺𝒕𝒐𝒑   4.𝑹𝒆𝒂𝒑𝒆𝒂𝒕 5.𝑮𝒐 𝑩𝒂𝒄𝒌 6.𝒅𝒐𝒘𝒏𝒍𝒐𝒂𝒅");
		
			 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
				int play=sc.nextInt();
				if(play==1)
				{
					System.out.println("⏮  🎶  ⏭");
					play_in.play_on_off();
				}
				else if(play==2)
				{
					System.out.println("⏮  ⏸️  ⏭");
					play_in.play_on_off();
				}
				else if (play==3)
				{
					System.out.println("⏮  ▶  ⏭");
					play_in.play_on_off();
				}
				else if (play==4) 
				{
					if (Home.mobno==0)
					{
						signup();
						
					}
					
					if(Home.mobno!=0)
					{
						if(PaymentGateway.payment!=true)
						{
						Subscription();
						}
						else
						{
							System.out.println(" 🔁 ");
							play_in.play_on_off();
						}
						
                     main(null);
                     
						
						
					}
				
				}
				else if (play==5) 
				{
					
					Home_page();
				}
				else if (play==6) {

					if (Home.mobno==0)
					{
						signup();
						
					}
					
					if(Home.mobno!=0)
					{
						if(PaymentGateway.payment!=true)
						{
						Subscription();
						}
						else
						{
							System.out.println(" 📥 Dowloaded Completed 📥");
							play_in.play_on_off();
						}
						
                     main(null);
                     
						
						
					}
					
					
				}
				else 
				{
				System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");	
				play_in.play_on_off();
				}
			
		}
		else if (hp_podcast==5)
		{
			Home_page();
			
		}
	
		else
		{
			//go back Logic
			System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");
		   Hp_podcast();
		}
		
		
		
		break;
	}
	
	
	case 3:
	{
		System.out.println();
		System.out.println("👸🏼 The List Of Disney Album 👸🏼");
		System.out.println();
		System.out.print("1.Disney Hits   ");
		System.out.println("2.Disney Baby");
	
		System.out.print("3.Disney Sing-Alongs  ");
		System.out.print("4.Go Back");
		System.out.println();
		 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
		int hp_album=sc.nextInt();
		
		switch (hp_album) {
		case 1: {
			System.out.println();
			System.out.println("🎶 The List Of Disney Hits 🎶");
			System.out.println();
			System.out.print("1.Love Is an Open Door  ");
			System.out.println("2.Something What I Want");
			System.out.print("3.Steal The Show ");
			
			System.out.println();
			 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
			int hp_podcast=sc.nextInt();
			if(hp_podcast==1)
			{
				System.out.println();
				System.out.println("You have selected : 𝑳𝒐𝒗𝒆 𝑰𝒔 𝒂𝒏 𝑶𝒑𝒆𝒏 𝑫𝒐𝒐𝒓");
				System.out.println("Movie :𝑭𝒓𝒐𝒛𝒆𝒏 ");
				System.out.println("Artists: 𝑺𝒂𝒏𝒕𝒊𝒏𝒐 𝑭𝒐𝒏𝒕𝒂𝒏𝒂, 𝑲𝒓𝒊𝒔𝒕𝒆𝒏 𝑩𝒆𝒍𝒍");
				
				On_Off play_in=new Muisc_palying_logic();
				
				
				System.out.println("1.𝑷𝒍𝒂𝒚   2.𝑷𝒂𝒖𝒔𝒆   3.𝑺𝒕𝒐𝒑   4.𝑹𝒆𝒂𝒑𝒆𝒂𝒕 5.𝑮𝒐 𝑩𝒂𝒄𝒌 6.𝒅𝒐𝒘𝒏𝒍𝒐𝒂𝒅");
			
				 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
					int play=sc.nextInt();
					if(play==1)
					{
						System.out.println("⏮  🎶  ⏭");
						play_in.play_on_off();
					}
					else if(play==2)
					{
						System.out.println("⏮  ⏸️  ⏭");
						play_in.play_on_off();
					}
					else if (play==3)
					{
						System.out.println("⏮  ▶  ⏭");
						play_in.play_on_off();
					}
					else if (play==4) 
					{

						if (Home.mobno==0)
						{
							signup();
							
						}
						
						if(Home.mobno!=0)
						{
							if(PaymentGateway.payment!=true)
							{
							Subscription();
							}
							else
							{
								System.out.println(" 🔁 ");
								play_in.play_on_off();
							}
							
	                     main(null);
	                     
							
							
						}
					
					}
					else if (play==5) 
					{
						
						Home_page();
					}
					else if (play==6) 
					{
						

						if (Home.mobno==0)
						{
							signup();
							
						}
						
						if(Home.mobno!=0)
						{
							if(PaymentGateway.payment!=true)
							{
							Subscription();
							}
							else
							{
								System.out.println(" 📥 Dowloaded Completed 📥");
								play_in.play_on_off();
							}
							
	                     main(null);
	                     
							
							
						}
						
					}
					else 
					{
					System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");	
					play_in.play_on_off();
					}
				
			}
			//
			else if (hp_podcast==2) 
			
			{
			
				System.out.println("You have selected : 𝑺𝒐𝒎𝒆𝒕𝒉𝒊𝒏𝒈 𝑾𝒉𝒂𝒕 𝑰 𝑾𝒂𝒏𝒕");
				System.out.println("Movie :𝑻𝒂𝒏𝒈𝒍𝒆𝒅 ");
				System.out.println("Artists: 𝑮𝒓𝒂𝒄𝒆 𝑷𝒐𝒕𝒕𝒆𝒓");
				
				On_Off play_in=new Muisc_palying_logic();
				
				
				System.out.println("1.𝑷𝒍𝒂𝒚   2.𝑷𝒂𝒖𝒔𝒆   3.𝑺𝒕𝒐𝒑   4.𝑹𝒆𝒂𝒑𝒆𝒂𝒕 5.𝑮𝒐 𝑩𝒂𝒄𝒌 6.𝒅𝒐𝒘𝒏𝒍𝒐𝒂𝒅");
			
				 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
					int play=sc.nextInt();
					if(play==1)
					{
						System.out.println("⏮  🎶  ⏭");
						play_in.play_on_off();
					}
					else if(play==2)
					{
						System.out.println("⏮  ⏸️  ⏭");
						play_in.play_on_off();
					}
					else if (play==3)
					{
						System.out.println("⏮  ▶  ⏭");
						play_in.play_on_off();
					}
					else if (play==4) 
					{
						if (Home.mobno==0)
						{
							signup();
							
						}
						
						if(Home.mobno!=0)
						{
							if(PaymentGateway.payment!=true)
							{
							Subscription();
							}
							else
							{
								System.out.println(" 🔁 ");
								play_in.play_on_off();
							}
							
	                     main(null);
	                     
							
							
						}
					
					}
					else if (play==5) 
					{
						
						Home_page();
					}
					else if (play==6) 
					{
						

						if (Home.mobno==0)
						{
							signup();
							
						}
						
						if(Home.mobno!=0)
						{
							if(PaymentGateway.payment!=true)
							{
							Subscription();
							}
							else
							{
								System.out.println(" 📥 Dowloaded Completed 📥");
								play_in.play_on_off();
							}
							
	                     main(null);
	                     
							
							
						}
						
					}
					else 
					{
					System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");	
					play_in.play_on_off();
					}
			
						
			}
			
			//3====================
			else if (hp_podcast==3) 
			{
				
				System.out.println();
				System.out.println("You have selected : 𝑺𝒕𝒆𝒂𝒍 𝑻𝒉𝒆 𝑺𝒉𝒐𝒘");
				System.out.println("Movie :𝑬𝒍𝒆𝒎𝒆𝒏𝒕𝒂𝒍 ");
				System.out.println("Artists: 𝑳𝒂𝒖𝒗");
				
				On_Off play_in=new Muisc_palying_logic();
				
				
				System.out.println("1.𝑷𝒍𝒂𝒚   2.𝑷𝒂𝒖𝒔𝒆   3.𝑺𝒕𝒐𝒑   4.𝑹𝒆𝒂𝒑𝒆𝒂𝒕 5.𝑮𝒐 𝑩𝒂𝒄𝒌 6.𝒅𝒐𝒘𝒏𝒍𝒐𝒂𝒅");			
				 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
					int play=sc.nextInt();
					if(play==1)
					{
						System.out.println("⏮  🎶  ⏭");
						play_in.play_on_off();
					}
					else if(play==2)
					{
						System.out.println("⏮  ⏸️  ⏭");
						play_in.play_on_off();
					}
					else if (play==3)
					{
						System.out.println("⏮  ▶  ⏭");
						play_in.play_on_off();
					}
					else if (play==4) 
					{
						if (Home.mobno==0)
						{
							signup();
							
						}
						
						if(Home.mobno!=0)
						{
							if(PaymentGateway.payment!=true)
							{
							Subscription();
							}
							else
							{
								System.out.println(" 🔁 ");
								play_in.play_on_off();
							}
							
	                     main(null);
	                     
							
							
						}
					
					}
					else if (play==5) 
					{
						
						Home_page();
					}
					else if (play==6) 
					{
						

						if (Home.mobno==0)
						{
							signup();
							
						}
						
						if(Home.mobno!=0)
						{
							if(PaymentGateway.payment!=true)
							{
							Subscription();
							}
							else
							{
								System.out.println(" 📥 Dowloaded Completed 📥");
								play_in.play_on_off();
							}
							
	                     main(null);
	                     
							
							
						}
						
					}

					else 
					{
					System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");	
					play_in.play_on_off();
					}
				
				
			}
	
		break;
		
		}
		
		case 2: {
			
			System.out.println();
			System.out.println("🎶 The List Of Disney Baby 🎶");
			System.out.println();
			System.out.print("1.A Whole New World  ");
			System.out.println("2.Beauty and the Beast");
			System.out.print("3.Hakuna Matata ");
			
			System.out.println();
			 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
			int hp_podcast=sc.nextInt();
			if(hp_podcast==1)
			{
				System.out.println();
				System.out.println("You have selected : 𝑨 𝑾𝒉𝒐𝒍𝒆 𝑵𝒆𝒘 𝑾𝒐𝒓𝒍𝒅");
				System.out.println("Movie :𝑭𝒓𝒐𝒛𝒆𝒏 ");
				System.out.println("Artists: 𝑺𝒂𝒏𝒕𝒊𝒏𝒐 𝑭𝒐𝒏𝒕𝒂𝒏𝒂, 𝑲𝒓𝒊𝒔𝒕𝒆𝒏 𝑩𝒆𝒍𝒍");
				
				On_Off play_in=new Muisc_palying_logic();
				
				
				System.out.println("1.𝑷𝒍𝒂𝒚   2.𝑷𝒂𝒖𝒔𝒆   3.𝑺𝒕𝒐𝒑   4.𝑹𝒆𝒂𝒑𝒆𝒂𝒕 5.𝑮𝒐 𝑩𝒂𝒄𝒌 6.𝒅𝒐𝒘𝒏𝒍𝒐𝒂𝒅");			
				 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
					int play=sc.nextInt();
					if(play==1)
					{
						System.out.println("⏮  🎶  ⏭");
						play_in.play_on_off();
					}
					else if(play==2)
					{
						System.out.println("⏮  ⏸️  ⏭");
						play_in.play_on_off();
					}
					else if (play==3)
					{
						System.out.println("⏮  ▶  ⏭");
						play_in.play_on_off();
					}
					else if (play==4) 
					{
						if (Home.mobno==0)
						{
							signup();
							
						}
						
						if(Home.mobno!=0)
						{
							if(PaymentGateway.payment!=true)
							{
							Subscription();
							}
							else
							{
								System.out.println(" 🔁 ");
								play_in.play_on_off();
							}
							
	                     main(null);
	                     
							
							
						}
					
					}
					else if (play==5) 
					{
						
						Home_page();
					}
					else if (play==6) 
					{
						

						if (Home.mobno==0)
						{
							signup();
							
						}
						
						if(Home.mobno!=0)
						{
							if(PaymentGateway.payment!=true)
							{
							Subscription();
							}
							else
							{
								System.out.println(" 📥 Dowloaded Completed 📥");
								play_in.play_on_off();
							}
							
	                     main(null);
	                     
							
							
						}
						
					}
					else 
					{
					System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");	
					play_in.play_on_off();
					}
				
			}
			//
			else if (hp_podcast==2) 
			
			{
			
				System.out.println("You have selected : 𝑩𝒆𝒂𝒖𝒕𝒚 𝒂𝒏𝒅 𝒕𝒉𝒆 𝑩𝒆𝒂𝒔𝒕");
				System.out.println("Movie :𝑩𝒆𝒂𝒖𝒕𝒚 𝒂𝒏𝒅 𝒕𝒉𝒆 𝑩𝒆𝒂𝒔𝒕 ");
				System.out.println("Artists: 𝑮𝒂𝒓𝒚 𝑻𝒓𝒐𝒖𝒔𝒅𝒂𝒍𝒆, 𝑲𝒊𝒓𝒌 𝑾𝒊𝒔𝒆");
				
				On_Off play_in=new Muisc_palying_logic();
				
				
				System.out.println("1.𝑷𝒍𝒂𝒚   2.𝑷𝒂𝒖𝒔𝒆   3.𝑺𝒕𝒐𝒑   4.𝑹𝒆𝒂𝒑𝒆𝒂𝒕 5.𝑮𝒐 𝑩𝒂𝒄𝒌 6.𝒅𝒐𝒘𝒏𝒍𝒐𝒂𝒅");
			
				 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
					int play=sc.nextInt();
					if(play==1)
					{
						System.out.println("⏮  🎶  ⏭");
						play_in.play_on_off();
					}
					else if(play==2)
					{
						System.out.println("⏮  ⏸️  ⏭");
						play_in.play_on_off();
					}
					else if (play==3)
					{
						System.out.println("⏮  ▶  ⏭");
						play_in.play_on_off();
					}
					else if (play==4) 
					{
						if (Home.mobno==0)
						{
							signup();
							
						}
						
						if(Home.mobno!=0)
						{
							if(PaymentGateway.payment!=true)
							{
							Subscription();
							}
							else
							{
								System.out.println(" 🔁 ");
								play_in.play_on_off();
							}
							
	                     main(null);
	                     
							
							
						}
					
					}
					else if (play==5) 
					{
						
						Home_page();
					}
					else if (play==6) 
					{
						

						if (Home.mobno==0)
						{
							signup();
							
						}
						
						if(Home.mobno!=0)
						{
							if(PaymentGateway.payment!=true)
							{
							Subscription();
							}
							else
							{
								System.out.println(" 📥 Dowloaded Completed 📥");
								play_in.play_on_off();
							}
							
	                     main(null);
	                     
							
							
						}
						
					}
					else 
					{
					System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");	
					play_in.play_on_off();
					}
			
						
			}
			
			//3====================
			else if (hp_podcast==3) 
			{
				
				System.out.println();
				System.out.println("You have selected : 𝑯𝒂𝒌𝒖𝒏𝒂 𝑴𝒂𝒕𝒂𝒕𝒂");
				System.out.println("Movie :𝑻𝒉𝒆 𝑳𝒊𝒐𝒏 𝑲𝒊𝒏𝒈 ");
				System.out.println("Artists: 𝑱𝒐𝒔𝒆𝒑𝒉 𝑾𝒊𝒍𝒍𝒊𝒂𝒎𝒔, 𝑵𝒂𝒕𝒉𝒂𝒏 𝑳𝒂𝒏𝒆, 𝑱𝒂𝒔𝒐𝒏 𝑾𝒆𝒂𝒗𝒆𝒓, 𝑬𝒓𝒏𝒊𝒆 𝑺𝒂𝒃𝒆𝒍𝒍𝒂");
				
				On_Off play_in=new Muisc_palying_logic();
				
				
				System.out.println("1.𝑷𝒍𝒂𝒚   2.𝑷𝒂𝒖𝒔𝒆   3.𝑺𝒕𝒐𝒑   4.𝑹𝒆𝒂𝒑𝒆𝒂𝒕 5.𝑮𝒐 𝑩𝒂𝒄𝒌 6.𝒅𝒐𝒘𝒏𝒍𝒐𝒂𝒅");
			
				 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
					int play=sc.nextInt();
					if(play==1)
					{
						System.out.println("⏮  🎶  ⏭");
						play_in.play_on_off();
					}
					else if(play==2)
					{
						System.out.println("⏮  ⏸️  ⏭");
						play_in.play_on_off();
					}
					else if (play==3)
					{
						System.out.println("⏮  ▶  ⏭");
						play_in.play_on_off();
					}
					else if (play==4) 
					{
						if (Home.mobno==0)
						{
							signup();
							
						}
						
						if(Home.mobno!=0)
						{
							if(PaymentGateway.payment!=true)
							{
							Subscription();
							}
							else
							{
								System.out.println(" 🔁 ");
								play_in.play_on_off();
							}
							
	                     main(null);
	                     
							
							
						}
					
					}
					else if (play==5) 
					{
						
						Home_page();
					}
					else if (play==6) 
					{
						

						if (Home.mobno==0)
						{
							signup();
							
						}
						
						if(Home.mobno!=0)
						{
							if(PaymentGateway.payment!=true)
							{
							Subscription();
							}
							else
							{
								System.out.println(" 📥 Dowloaded Completed 📥");
								play_in.play_on_off();
							}
							
	                     main(null);
	                     
							
							
						}
						
					}
					else 
					{
					System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");	
					play_in.play_on_off();
					}
				
				
			}
	
		
			
			break;
			}
		case 3: {
			
			System.out.println();
			System.out.println("🎶 The List Of Disney Sing-Alongs 🎶");
			System.out.println();
			System.out.print("1.We Don't Talk About Bruno ");
			System.out.println("2.Part of Your World");
			System.out.print("3.How Far I'll Go ");
			
			System.out.println();
			 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
			int hp_podcast=sc.nextInt();
			if(hp_podcast==1)
			{
				System.out.println();
				System.out.println("You have selected : 𝑾𝒆 𝑫𝒐𝒏'𝒕 𝑻𝒂𝒍𝒌 𝑨𝒃𝒐𝒖𝒕 𝑩𝒓𝒖𝒏𝒐");
				System.out.println("Movie :𝑬𝒏𝒄𝒂𝒏𝒕𝒐 ");
				System.out.println("Artists:  𝑬𝒏𝒄𝒂𝒏𝒕𝒐 - 𝑪𝒂𝒔𝒕, 𝑨𝒅𝒂𝒔𝒔𝒂, 𝑹𝒉𝒆𝒏𝒛𝒚 𝑭𝒆𝒍𝒊𝒛, 𝑴𝒂𝒖𝒓𝒐 𝑪𝒂𝒔𝒕𝒊𝒍𝒍𝒐,\n𝑪𝒂𝒓𝒐𝒍𝒊𝒏𝒂 𝑮𝒂𝒊𝒕á𝒏, 𝑫𝒊𝒂𝒏𝒆 𝑮𝒖𝒆𝒓𝒓𝒆𝒓𝒐, 𝑺𝒕𝒆𝒑𝒉𝒂𝒏𝒊𝒆 𝑩𝒆𝒂𝒕𝒓𝒊𝒛");
				
				On_Off play_in=new Muisc_palying_logic();
				
				
				System.out.println("1.𝑷𝒍𝒂𝒚   2.𝑷𝒂𝒖𝒔𝒆   3.𝑺𝒕𝒐𝒑   4.𝑹𝒆𝒂𝒑𝒆𝒂𝒕 5.𝑮𝒐 𝑩𝒂𝒄𝒌 6.𝒅𝒐𝒘𝒏𝒍𝒐𝒂𝒅");

			
				 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
					int play=sc.nextInt();
					if(play==1)
					{
						System.out.println("⏮  🎶  ⏭");
						play_in.play_on_off();
					}
					else if(play==2)
					{
						System.out.println("⏮  ⏸️  ⏭");
						play_in.play_on_off();
					}
					else if (play==3)
					{
						System.out.println("⏮  ▶  ⏭");
						play_in.play_on_off();
					}
					else if (play==4) 
					{
						if (Home.mobno==0)
						{
							signup();
							
						}
						
						if(Home.mobno!=0)
						{
							if(PaymentGateway.payment!=true)
							{
							Subscription();
							}
							else
							{
								System.out.println(" 🔁 ");
								play_in.play_on_off();
							}
							
	                     main(null);
	                     
							
							
						}
					
					}
					else if (play==5) 
					{
						
						Home_page();
					}
					else if (play==6) 
					{
						

						if (Home.mobno==0)
						{
							signup();
							
						}
						
						if(Home.mobno!=0)
						{
							if(PaymentGateway.payment!=true)
							{
							Subscription();
							}
							else
							{
								System.out.println(" 📥 Dowloaded Completed 📥");
								play_in.play_on_off();
							}
							
	                     main(null);
	                     
							
							
						}
						
//					===@#$%^&*&&&&&&&
					}
					else 
					{
					System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");	
					play_in.play_on_off();
					}
				
			}
			//
			else if (hp_podcast==2) 
			
			{
			
				System.out.println("You have selected : 𝑷𝒂𝒓𝒕 𝒐𝒇 𝒀𝒐𝒖𝒓 𝑾𝒐𝒓𝒍𝒅");
				System.out.println("Movie :𝑻𝒉𝒆 𝑳𝒊𝒕𝒕𝒍𝒆 𝑴𝒆𝒓𝒎𝒂𝒊𝒅 ");
				System.out.println("Artists: 𝑱𝒐𝒅𝒊 𝑩𝒆𝒏𝒔𝒐𝒏, 𝑾𝒂𝒍𝒕 𝑫𝒊𝒔𝒏𝒆𝒚");
				
				On_Off play_in=new Muisc_palying_logic();
				
				
				System.out.println("1.𝑷𝒍𝒂𝒚   2.𝑷𝒂𝒖𝒔𝒆   3.𝑺𝒕𝒐𝒑   4.𝑹𝒆𝒂𝒑𝒆𝒂𝒕 5.𝑮𝒐 𝑩𝒂𝒄𝒌 6.𝒅𝒐𝒘𝒏𝒍𝒐𝒂𝒅");
			
				 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
					int play=sc.nextInt();
					if(play==1)
					{
						System.out.println("⏮  🎶  ⏭");
						play_in.play_on_off();
					}
					else if(play==2)
					{
						System.out.println("⏮  ⏸️  ⏭");
						play_in.play_on_off();
					}
					else if (play==3)
					{
						System.out.println("⏮  ▶  ⏭");
						play_in.play_on_off();
					}
					else if (play==4) 
					{
						if (Home.mobno==0)
						{
							signup();
							
						}
						
						if(Home.mobno!=0)
						{
							if(PaymentGateway.payment!=true)
							{
							Subscription();
							}
							else
							{
								System.out.println(" 🔁 ");
								play_in.play_on_off();
							}
							
	                     main(null);
	                     
							
							
						}
					
					}
					else if (play==5) 
					{
						
						Home_page();
					}
					else if (play==6) 
					{
						

						if (Home.mobno==0)
						{
							signup();
							
						}
						
						if(Home.mobno!=0)
						{
							if(PaymentGateway.payment!=true)
							{
							Subscription();
							}
							else
							{
								System.out.println(" 📥 Dowloaded Completed 📥");
								play_in.play_on_off();
							}
							
	                     main(null);
	                     
							
							
						}
						
					}
					else 
					{
					System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");	
					play_in.play_on_off();
					}
			
						
			}
			
			//3====================
			else if (hp_podcast==3) 
			{
				
				System.out.println();
				System.out.println("You have selected : 𝑯𝒐𝒘 𝑭𝒂𝒓 𝑰'𝒍𝒍 𝑮𝒐");
				System.out.println("Movie :𝑴𝒐𝒂𝒏𝒂");
				System.out.println("Artists:𝑨𝒖𝒍𝒊ʻ𝒊 𝑪𝒓𝒂𝒗𝒂𝒍𝒉𝒐 ");
				On_Off play_in=new Muisc_palying_logic();
				
				
				System.out.println("1.𝑷𝒍𝒂𝒚   2.𝑷𝒂𝒖𝒔𝒆   3.𝑺𝒕𝒐𝒑   4.𝑹𝒆𝒂𝒑𝒆𝒂𝒕 5.𝑮𝒐 𝑩𝒂𝒄𝒌 6.𝒅𝒐𝒘𝒏𝒍𝒐𝒂𝒅");
			
				 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
					int play=sc.nextInt();
					if(play==1)
					{
						System.out.println("⏮  🎶  ⏭");
						play_in.play_on_off();
					}
					else if(play==2)
					{
						System.out.println("⏮  ⏸️  ⏭");
						play_in.play_on_off();
					}
					else if (play==3)
					{
						System.out.println("⏮  ▶  ⏭");
						play_in.play_on_off();
					}
					else if (play==4) 
					{
						if (Home.mobno==0)
						{
							signup();
							
						}
						
						if(Home.mobno!=0)
						{
							if(PaymentGateway.payment!=true)
							{
							Subscription();
							}
							else
							{
								System.out.println(" 🔁 ");
								play_in.play_on_off();
							}
							
	                     main(null);
	                     
							
							
						}
					
					}
					else if (play==5) 
					{
						
						Home_page();
					}
					else if (play==6) 
					{
						

						if (Home.mobno==0)
						{
							signup();
							
						}
						
						if(Home.mobno!=0)
						{
							if(PaymentGateway.payment!=true)
							{
							Subscription();
							}
							else
							{
								System.out.println(" 📥 Dowloaded Completed 📥");
								play_in.play_on_off();
							}
							
	                     main(null);
	                     
							
							
						}
						
					}
					else 
					{
					System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");	
					play_in.play_on_off();
					}
				
				
			}
	
		
	
			
			
			
			
			
			
			break;
			}
		case 4: {
			
			break;
			}
		case 5: {
			Home_page();
			break;
			}
		default:
			System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");
			   Hp_podcast();		}
		
		
		
		break;
	}
	
	
	case 4:
	{
		System.out.println("4");
//		Home_page();
main(null);
	}
	default:
		System.err.println("𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃");
		Home_page();
		
	}
	  
	
	
	
	
}

}
