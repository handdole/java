package bean;

import java.util.ArrayList;

public class ConManager {
	
	static ArrayList<String> list = null;
	static ConManager con = null;
	
	private ConManager(){
		list = new ArrayList<String>();
		list.add("admin");
		list.add("root");
		list.add("manager");
	}
	
	public static ConManager getInstance() {
		if (con == null) 
			con = new ConManager();
		
		return con;
	}
	
	public String getElement(int i) {
		return list.get(i);
	}
}
