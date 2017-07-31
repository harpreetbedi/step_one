package intro;

public class Namaste_1 {
	
	private String str;
	
	// constructor
	
	public Namaste_1(String string) {
		str=string;
	}

	// first step is to have get and set methods	

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	void instanceNamaste() {
		
       System.out.println(getStr());
  }
	public static void main(String[] args) {
		Namaste_1 h= new Namaste_1("Hello_World");
		h.instanceNamaste();
		h.setStr("Hello_World_2");
		h.instanceNamaste();
		

	}

}
