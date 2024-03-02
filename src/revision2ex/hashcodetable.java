package revision2ex;

import java.util.Hashtable;

public class hashcodetable {
public static void main(String[] args) {
		
		Hashtable<Integer,String> a=new Hashtable<>(10);
		a.put(101, "hello");
		a.put(102, "hi");
		a.put(103, "bye");
		a.put(104, "thanks");
		for(Integer x:a.keySet()) {
			System.out.println(x+" "+a.get(x)+""+x.hashCode());
		}
	}

}



