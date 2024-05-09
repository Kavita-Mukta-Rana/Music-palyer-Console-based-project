package Music;

import java.util.ArrayList;
import java.util.Scanner;

import Order_Food.PaymentGateway;

public class Home extends Driver_Main  {
	
	private String fname;
	private String lname;
	private String address;
	private String email;
	private String password;

	static long mobno;
	static int totalprice;
	public String getFname()
	{
		return fname;
	}
	public void setFname(String fname)
	{
		this.fname = fname;
	}
	
	public String getLname()
	{
		return lname;
	}
	public void setLname(String lname)
	{
		this.lname = lname;
	}
	
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public long getMobno()
	{
		return mobno;
	}
	public void setMobno()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter mobile number");
		long mobno = s.nextLong();
		if (mobno > 999999999 && mobno < 10000000000L) {
			this.mobno = mobno;
		}
		else {
			System.err.println("              (╥﹏╥) 𝑷𝒍𝒆𝒂𝒔𝒆 𝒑𝒓𝒐𝒗𝒊𝒅𝒆  𝒗𝒂𝒍𝒊𝒅 𝒎𝒐𝒃𝒊𝒍𝒆 𝒏𝒖𝒎𝒃𝒆𝒓 (╥﹏╥)");
			System.out.println();
			System.err.println("=========================");
			System.err.println("  👻    Try again   👻");
			System.err.println("=========================");
			setMobno();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void Home_page() 
	{
		System.out.println();
//		System.out.println("✩ ♬  ₊˚. 🎧 ⋆☾⋆ ⁺ ₊ ✧    ✩ ♬  ₊˚. 🎧 ⋆☾⋆ ⁺ ₊ ✧  🎧 Welcome to world of Audio 🎧  ✩ ♬  ₊˚. 🎧 ⋆☾⋆ ⁺ ₊ ✧    ✩ ♬  ₊˚. 🎧 ⋆☾⋆ ⁺ ₊ ✧");
	System.out.println();
		System.out .println("📍 Home Page 📍 ");
	System.out.println();
	
	   

	   System.out.print("1.Podcast   ");
	   System.out.print("2.Music   ");
	   System.out.print("3.Disney   ");
	   System.out.println("4.Go Back");
	     Home cc=new GoBack_feature();
	     GoBack_feature child=(GoBack_feature)cc;
	  child.Hp_podcast();
		
	}
	//
	public void search() 
	{
		Scanner sc=new Scanner(System.in);
		
		
		ArrayList a=new ArrayList();
		a.add("steal the show");
		a.add("friend like me");
		a.add("almost there");
		a.add("when will my life begin");
		a.add("into the unknown");
		a.add("i just can't wait to be king");
		a.add("speechless");
		a.add("this is me");
		System.out.println("               |===================================|");
		System.out.println("                   🔍 Enter the Songs To Search 🕵️‍♂️    ");
		System.out.println("               |===================================|");
		
		
		String input=sc.nextLine();
	
		boolean status=false;
		for(Object obj:a)
		{
			if(obj.equals(input))
			{
				status=true;
				if(status==true)
				{
					System.out.println("🎶𝑺𝒐𝒏𝒈 𝑺𝒆𝒍𝒆𝒄𝒕𝒆𝒅 : "+obj+" 🎶");
					On_Off play=new Muisc_palying_logic();
					play.play_on_off();
					
				}
				
			}
			int count =0;
			if(status==false) {
				if(count==0)
				{
				System.err.println("          ˚˖𓍢ִ✧˚.𓆝 𓆟 𓆞 𓆝 𓆟 🤨❓ 𝑺𝒐𝒏𝒈 𝒊𝒔 𝒏𝒐𝒕 𝒇𝒐𝒖𝒏𝒅 🤨❓˚˖𓍢ִ✧˚.𓆝 𓆟 𓆞 𓆝 𓆟");
				break;
				}
				}
		}
		
		
		
	}
	
	
	
	public void catgeory()
	{
		
		System.out.println("Enter the choice : ");
		Scanner sc_home1=new Scanner(System.in);
		System.out.println("  1.Bollywood 🎺");
		System.out.println("  2.Hollywood 🎷");
		System.out.println("  3.Go Back");
		
		String input12;
		System.out.println();
		System.out.println("👀 𝑺𝒆𝒂𝒓𝒄𝒉 𝒕𝒉𝒆 𝒄𝒂𝒕𝒆𝒈𝒐𝒓𝒚 👀");
		System.out.println();
		input12=sc_home1.nextLine().toLowerCase();
		ArrayList a_bh=new ArrayList();
		a_bh.add("bollywood");
		a_bh.add("hollywood");
		
		On_Off play_in=new Muisc_palying_logic();
		if(a_bh.contains(input12))
		{
			if(input12.equals("bollywood"))
			{
				System.out.println("|====================|");
				System.out.println("   Songs List are : ");
				System.out.println("|====================|");
				System.out.println("  1.Pehla Nasha");
				System.out.println("  2.Dil Hai Ke Manta Nahin");
				System.out.println("  3.ye raatein ye mausam");
				System.out.println("  4.Go Back");
				Scanner sc_home12=new Scanner(System.in);
				 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
				int a12=sc_home1.nextInt();

				switch (a12) {
				case 1: {

					System.out.println("♪♫~Selected Song :𝑷𝒆𝒉𝒍𝒂 𝑵𝒂𝒔𝒉𝒂 ♪♫~");
					play_in.play_on_off();
					break;
				}
	          case 2: {

					System.out.println("♪♫~Selected Song :𝑫𝒊𝒍 𝑯𝒂𝒊 𝑲𝒆 𝑴𝒂𝒏𝒕𝒂 𝑵𝒂𝒉𝒊𝒏♪♫~");
					play_in.play_on_off();
					break;

				}
	           case 3: {
	        	   System.out.println("♪♫~Selected Song :𝒀𝒆 𝒓𝒂𝒂𝒕𝒆𝒊𝒏 𝒚𝒆 𝒎𝒂𝒖𝒔𝒂𝒎♪♫~");
					play_in.play_on_off();
					break;

	                }
	         case 4: {
		           main(null);
	        	 
		          break;
	                     }
				default:
					System.err.println("❌ 𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃 ❌");
					catgeory();
				
				
				}
				
			}
			else if (input12.equals("hollywood")) 
			{
				System.out.println("|====================|");
				System.out.println("   Songs List are : ");
				System.out.println("|====================|");
				System.out.println("  1.Perfect");
				System.out.println("  2.Cant help falling in love with you");
				System.out.println("  3.last christmas");
				System.out.println("  4.Go Back");
				System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
				
				int a12=sc_home1.nextInt();
				
				switch (a12) {
				case 1: {
					System.out.println("♪♫~ Selected Song :𝑷𝒆𝒓𝒇𝒆𝒄𝒕 ♪♫~");
					play_in.play_on_off();
					
					break;

				}
	          case 2: {
					System.out.println("♪♫~ Selected Song :𝑪𝒂𝒏𝒕 𝒉𝒆𝒍𝒑 𝒇𝒂𝒍𝒍𝒊𝒏𝒈 𝒊𝒏 𝒍𝒐𝒗𝒆 𝒘𝒊𝒕𝒉 𝒚𝒐𝒖 ♪♫~");
					play_in.play_on_off();
					break;

				}
	           case 3: {
	        	   System.out.println("♪♫~ Selected Song :𝒍𝒂𝒔𝒕 𝒄𝒉𝒓𝒊𝒔𝒕𝒎𝒂𝒔 ♪♫~");
					play_in.play_on_off();
					break;

	                }
	         case 4: {
		           main(null);
	        
		          break;
	                     }
				default:
					System.err.println("               ❌ 𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃 ❌");
				
				
				}
				
				
				
				
				
				
			}
			else
			{
				System.err.println("              ❌ 𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃 ❌");
			}
		}
		else {
			System.err.println("                ❌ 𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃 ❌");
			catgeory();
		}
		
		
		
	}
	
	public void Subscription() 
	{
		Scanner sb=new Scanner(System.in);
		System.out.println("        🔉🔉🔉Subscription🔉🔉🔉");
		System.out.println("|************************************|");
		System.out.println("|  1) 2 Month of Premium for Rs.199 |");
		System.out.println("|  2) Mini Rs.7 plan                 |");
		System.out.println("}  3) Monthly plan for Rs.149        |");
		System.out.println("|  4) Go Back                        |");
		System.out.println("|************************************|");
		
		
		 System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
			int sb1=sb.nextInt();
			switch (sb1) {
			case 2: 
			{
				
				System.out.println("𝒀𝒐𝒖 𝒉𝒂𝒗𝒆 𝒔𝒆𝒍𝒆𝒄𝒕𝒆𝒅 𝒑𝒍𝒂𝒏 : Rs.7");
				System.out.println("|********************************|");
				System.out.println("|    ❌ Auto Repeat              | ");
				System.out.println("|    ❌ Download                 | ");
				System.out.println("|    ✔️ Payment by UPI only      |");
				System.out.println("|********************************|");
				System.out.println();
				if(Home.mobno==0)
				{
					
					System.out.println("              💁🏻 Please Create the Account First 💁🏻");
					
					signup();
				
					 Scanner GB2=new Scanner(System.in);
					 
						
						System.out.println("1.Proceed");
						System.out.println("2.Go back");
						System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
						int Go_Back1=GB2.nextInt();
						switch (Go_Back1) {
						case 1 : {
							
							Home.totalprice=7;
							Payment py=new PaymentGateway();
							py.upiPaymet();
							
							if(PaymentGateway.payment==true)
							{
							System.out.println("              🙏 Thank you 🙏");
							}
							else
							{
								System.out.println("            📲 𝙋𝙖𝙮𝙢𝙚𝙣𝙩 𝙛𝙖𝙞𝙡!!! 𝙍𝙚-𝙏𝙧𝙮 𝙛𝙤𝙧 𝙋𝙖𝙮𝙢𝙚𝙣𝙩 📲");
								py.upiPaymet();
							}
							
							
							
						}
						case 2:
						{
							Subscription();
							break;
						}
						default:
							System.err.println("Please enter valid choice :");
							Subscription();
						}
						

					
					
					
					
					
					
				break;	
					
				}
				if(Home.mobno!=0)
				{
					
					
					 Scanner GB12=new Scanner(System.in);
					 
						
						System.out.println("1.Proceed");
						System.out.println("2.Go back");
						System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
						int Go_Back1=GB12.nextInt();
						switch (Go_Back1) {
						case 1 : {
							Home.totalprice=7;
							Payment py=new PaymentGateway();
							py.upiPaymet();
							
							if(PaymentGateway.payment==true)
							{
								System.out.println("              🙏 Thank you 🙏");
							}
							else
							{
								System.out.println("              📲 𝙋𝙖𝙮𝙢𝙚𝙣𝙩 𝙛𝙖𝙞𝙡!!! 𝙍𝙚-𝙏𝙧𝙮 𝙛𝙤𝙧 𝙋𝙖𝙮𝙢𝙚𝙣𝙩 📲");
								py.upiPaymet();
							}
								
					   		
							
						}
						case 2:
						{
							Subscription();
							break;
						}
						default:
							System.err.println("Please enter valid choice :");
							Subscription();
						}
						

					
					
					
					
					
					
					
				}
				
				
			}
			case 1:
			{

				System.out.println("𝒀𝒐𝒖 𝒉𝒂𝒗𝒆 𝒔𝒆𝒍𝒆𝒄𝒕𝒆𝒅 𝒑𝒍𝒂𝒏 : Rs199");
				System.out.println("|********************************************|");
				System.out.println("|    ✔️ Auto Repeat                          | ");
				System.out.println("|    ✔️ Download                             | ");
				System.out.println("|    ✔️ Payment by UPI and Credit card only  |");
				System.out.println("|********************************************|");
			  
			  
			if(Home.mobno==0)
				{
				System.out.println("              💁🏻 Please Create the Account First 💁🏻");

					signup();
					 Scanner GB1=new Scanner(System.in);
					 
						
					System.out.println("1.Proceed");
					System.out.println("2.Go back");
					System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
					int Go_Back1=GB1.nextInt();
					switch (Go_Back1) {
					case 1 : {
						
						
						Home.totalprice=199;
						Payment py=new PaymentGateway();
						py.upiPaymet();
						
						if(PaymentGateway.payment==true)
						{
							System.out.println("              🙏 Thank you 🙏");
						}
						else
						{
							System.out.println(" 📲 𝙋𝙖𝙮𝙢𝙚𝙣𝙩 𝙛𝙖𝙞𝙡!!! 𝙍𝙚-𝙏𝙧𝙮 𝙛𝙤𝙧 𝙋𝙖𝙮𝙢𝙚𝙣𝙩 📲");
							py.upiPaymet();
						}
						
						
						
					}
					case 2:
					{
						Subscription();
						break;
					}
					default:
						System.err.println("Please enter valid choice :");
						Subscription();
					}
					
					
					
					Home.totalprice=199;
					Payment py=new PaymentGateway();
					py.upiPaymet();
					
					if(PaymentGateway.payment==true)
					{
						System.out.println("              🙏 Thank you 🙏");
					}
					else
					{
						System.out.println(" 📲 𝙋𝙖𝙮𝙢𝙚𝙣𝙩 𝙛𝙖𝙞𝙡!!! 𝙍𝙚-𝙏𝙧𝙮 𝙛𝙤𝙧 𝙋𝙖𝙮𝙢𝙚𝙣𝙩 📲");
						py.upiPaymet();
					}
					
//				break;	
					
				}
				if(Home.mobno!=0)
				{
					 Scanner GB11=new Scanner(System.in);
					 
						
						System.out.println("1.Proceed");
						System.out.println("2.Go back");
						System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
						int Go_Back1=GB11.nextInt();
						switch (Go_Back1) {
						case 1 : {
							
							Home.totalprice=199;
							Payment py=new PaymentGateway();
							py.upiPaymet();
							
							if(PaymentGateway.payment==true)
							{
								System.out.println("              🙏 Thank you 🙏");
							}
							else
							{
								System.out.println("              📲 𝙋𝙖𝙮𝙢𝙚𝙣𝙩 𝙛𝙖𝙞𝙡!!! 𝙍𝙚-𝙏𝙧𝙮 𝙛𝙤𝙧 𝙋𝙖𝙮𝙢𝙚𝙣𝙩 📲");
								py.upiPaymet();
							}
							
							
							
							
						}
						case 2:
						{
							Subscription();
							break;
						}
						default:
							System.err.println("Please enter valid choice :");
							Subscription();
						}
						

					
					
					
				}				
			}
			case 3:
			{

				System.out.println("𝒀𝒐𝒖 𝒉𝒂𝒗𝒆 𝒔𝒆𝒍𝒆𝒄𝒕𝒆𝒅 𝒑𝒍𝒂𝒏 : Rs149");
				System.out.println("|************************************|");
				System.out.println("|    ✔️ Auto Repeat                  | ");
				System.out.println("|    ❌ Download                     | ");
				System.out.println("|    ✔️ Payment by Credit card only  |");
				System.out.println("|************************************|");
				
				if(Home.mobno==0)
				{
					System.out.println("              💁🏻 Please Create the Account First 💁🏻");

					signup();
					
					 Scanner GB3=new Scanner(System.in);
					 
						
						System.out.println("1.Proceed");
						System.out.println("2.Go back");
						System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
						int Go_Back1=GB3.nextInt();
						switch (Go_Back1) {
						case 1 : {
							
							Home.totalprice=149;
							Payment py=new PaymentGateway();
							py.upiPaymet();
							
							if(PaymentGateway.payment==true)
							{
								System.out.println("              🙏 Thank you 🙏");
							}
							else
							{
								System.out.println("              📲 𝙋𝙖𝙮𝙢𝙚𝙣𝙩 𝙛𝙖𝙞𝙡!!! 𝙍𝙚-𝙏𝙧𝙮 𝙛𝙤𝙧 𝙋𝙖𝙮𝙢𝙚𝙣𝙩 📲");
								py.upiPaymet();
							}
							
							
							
							
						}
						case 2:
						{
							Subscription();
							break;
						}
						default:
							System.err.println("Please enter valid choice :");
							Subscription();
						}
						

					
					
					Home.totalprice=149;
					Payment py=new PaymentGateway();
					py.upiPaymet();
					
					if(PaymentGateway.payment==true)
					{
						System.out.println("              🙏 Thank you 🙏");
					}
					else
					{
						System.out.println("              📲 𝙋𝙖𝙮𝙢𝙚𝙣𝙩 𝙛𝙖𝙞𝙡!!! 𝙍𝙚-𝙏𝙧𝙮 𝙛𝙤𝙧 𝙋𝙖𝙮𝙢𝙚𝙣𝙩 📲");
						py.upiPaymet();
					}
					
//				break;	
					
				}
				if(Home.mobno!=0)
				{
					 Scanner GB13=new Scanner(System.in);
					 
						
						System.out.println("1.Proceed");
						System.out.println("2.Go back");
						System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
						int Go_Back1=GB13.nextInt();
						switch (Go_Back1) {
						case 1 : {
							
							Home.totalprice=149;
							Payment py=new PaymentGateway();
							py.upiPaymet();
							
							if(PaymentGateway.payment==true)
							{
								System.out.println("              🙏 Thank you 🙏");
							}
							else
							{
								System.out.println("              📲 𝙋𝙖𝙮𝙢𝙚𝙣𝙩 𝙛𝙖𝙞𝙡!!! 𝙍𝙚-𝙏𝙧𝙮 𝙛𝙤𝙧 𝙋𝙖𝙮𝙢𝙚𝙣𝙩 📲");
								py.upiPaymet();
							}
							
							
							
						}
						case 2:
						{
							Subscription();
							break;
						}
						default:
							System.err.println("Please enter valid choice :");
							Subscription();
						}
						

					Home.totalprice=149;
					Payment py=new PaymentGateway();
					py.upiPaymet();
					
					if(PaymentGateway.payment==true)
					{
						System.out.println("              🙏 Thank you 🙏");
					}
					else
					{
						System.out.println("              📲 𝙋𝙖𝙮𝙢𝙚𝙣𝙩 𝙛𝙖𝙞𝙡!!! 𝙍𝙚-𝙏𝙧𝙮 𝙛𝙤𝙧 𝙋𝙖𝙮𝙢𝙚𝙣𝙩 📲");
						py.upiPaymet();
					}
					
					
				}
	
				
			}
			case 4:
			{
			main(null);
			break;
				
			}
			default:
				System.err.println("❌ 𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃 ❌");

				
			}
			
			
	}
	
	
	public void signup()
	{
		System.out.println();
		System.out.println("|-----------------------------------------------|");
		System.out.println("             ✒️        SignUp          ✒️");
		System.out.println("|-----------------------------------------------|");
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter the First Name");
		String fname = s.nextLine();
		setFname(fname);
		System.out.println("Enter Last Name");
//		s.nextLine();
		String lname = s.nextLine();
		setLname(lname);
		System.out.println("Enter Address");
		String address = s.nextLine();
		setAddress(address);
		System.out.println("Enter Email");
		String email = s.next();
		setEmail(email);
		System.out.println("Enter Password");
		String pwd = s.next();
		setPassword(pwd);
		setMobno();
		
		if("".equals(fname) || "".equals(lname) || "".equals(pwd) )
		{
			System.out.println();
			System.err.println("𝙋𝙡𝙚𝙖𝙨𝙚 𝙞𝙩'𝙨 𝙢𝙖𝙣𝙙𝙖𝙩𝙤𝙧𝙮 𝙩𝙤 𝙛𝙞𝙡𝙡 𝙩𝙝𝙚 𝙛𝙞𝙚𝙡𝙙 ");
			System.out.println();
			signup();
			
		
		}
		else {
			System.out.println("              ✔️  Signup Sucessful!!  ✔️");
			login();
			
		}
		
		
		
		
	}
	
    public void login()
    {
    	if(fname != null ) {
    		Scanner s = new Scanner(System.in);
    		System.out.println("");
    		System.out.println("🔑 Enter Your Choice 🔑");
    		System.out.println();
    		System.out.println("  1.Login with Mobile number");
    		System.out.println("  2.Login with Email ID");
    		System.out.println();
    		System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
    		int a = s.nextInt();
    		if (a==1) {
    			System.out.println("+++++++++++++++++++++++++++++++++");
    			System.out.println("     Login with Mobile number");
    			System.out.println("+++++++++++++++++++++++++++++++++");
    			System.out.println("Enter Registered Mobile number");
    			long mobno = s.nextLong();
    			System.out.println("Enter your Password");
    			String pwd = s.next();
    			
    			if (this.mobno == mobno && this.password.equals(pwd)) {
    				System.out.println();
    				System.out.println("                    ✔️ Login Sucessful!! ✔️");
    			}else {
    				System.err.println("𝑰𝒏𝒗𝒂𝒍𝒊𝒅 𝒎𝒐𝒃𝒊𝒍𝒆 𝒏𝒖𝒎𝒃𝒆𝒓 𝒐𝒓 𝒑𝒂𝒔𝒔𝒘𝒐𝒓𝒅");
    				login();
    			}
    		}
    		else if (a==2) {
    			System.out.println("+++++++++++++++++++++++++++++++++");
    			System.out.println("     Login with Email ID");
    			System.out.println("+++++++++++++++++++++++++++++++++");
    			System.out.println("Enter Email ID");
    			String email = s.next();
    			System.out.println("Enter Password");
    			String pwd = s.next();
    			if (this.email.equals(email) && this.password.equals(pwd)) {
    				System.out.println(" ✔️ Login Sucessful!! ✔️"); 
    				System.out.println();
    			}else {
    				System.err.println("𝑰𝒏𝒗𝒂𝒍𝒊𝒅 𝒊𝒏𝒑𝒖𝒕");
    				login();
    			}
    		}else {
    			System.err.println("𝑰𝒏𝒗𝒂𝒍𝒊𝒅 𝒊𝒏𝒑𝒖𝒕");
    			login();
    		}	
    		}else {
    			if(mobno==0)
    			{
    				System.out.println();
    			System.err.println("               👩🏻‍💻 𝑭𝒊𝒓𝒔𝒕 𝒄𝒓𝒆𝒂𝒕𝒆 𝒂𝒄𝒄𝒐𝒖𝒏𝒕 𝒇𝒐𝒓 𝒍𝒐𝒈𝒊𝒏𝒊𝒏𝒈 👩🏻‍💻");
    			System.out.println();
    			signup();
    			}
    			}
    	
    	
    	
    	
    	
	}

    
    
}
