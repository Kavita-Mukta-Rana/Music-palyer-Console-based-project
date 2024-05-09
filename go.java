package Music;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class go{
	public static void main(String[] args) 
	{
		
		
	HashMap h=new HashMap();

LinkedHashMap hj=new LinkedHashMap();
h.put(1, "sheela");
h.put("sheela",2 );
h.put(null, 'c');
h.put('h', "my");
System.out.println(h);

System.out.println(h.containsKey("sheela"));
if(h.containsValue(null))
{
	System.out.println("present");
}
else
{
	System.out.println("not");
}
System.out.println(h.size()-1);
System.out.println(h);
//h.clear();mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm,.//
h.remove(1);,
System.out.println(h);
	}
		
	}


