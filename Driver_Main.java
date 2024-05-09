package Music;

import java.util.Scanner;

public class Driver_Main {
	static{
		System.out.println(Main.BrightYellow+"✩ ♬  ₊˚. 🎧 ⋆☾⋆ ⁺ ₊ ✧    ✩ ♬  ₊˚. 🎧 ⋆☾⋆ ⁺ ₊ ✧  🎧 Welcome to world of Audio 🎧  ✩ ♬  ₊˚. 🎧 ⋆☾⋆ ⁺ ₊ ✧    ✩ ♬  ₊˚. 🎧 ⋆☾⋆ ⁺ ₊ ✧"+Main.Reset);

	}
	
	public static void main(String[] args) {

		System.out.println();
	System.out.println("🪶 Choose Option among 🪶 ");
	System.out.println("  1.Home Page");
	System.out.println("  2.Search");
	System.out.println("  3.Category");
	System.out.println("  4.Subscription");
	System.out.println("  5.Login");
	Scanner sc =new Scanner(System.in);	
	
	System.out.println("✍ 𝐸𝓃𝓉𝑒𝓇 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓃𝓊𝓂𝒷𝑒𝓇");
	int a=sc.nextInt();
	Home hm=new Home();
		switch (a) {
		case 1: {
			
			hm.Home_page();
			break;
			
		}
    case 2: {
			
			hm.search();
			break;
			
		}
    case 3: {
		
		hm.catgeory();;
		break;
		
	}
    case 4: {
		
		hm.Subscription();
		break;
		
	}
    case 5: {
		
		hm.login();
		main(null);
		break;
		
	}
		default:
			System.err.println("              ❌ 𝒴𝑜𝓊 𝒽𝒶𝓋𝑒 𝓈𝑒𝓁𝑒𝒸𝓉𝑒𝒹 𝐼𝓃𝓋𝒶𝓁𝒾𝒹 𝒪𝓅𝓉𝒾𝑜𝓃 ❌"); 
			main(args);
		}
	
		
	
		
		

	}

}
