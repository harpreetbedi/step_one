package intro;

public class Namaste {
	void instanceNamaste() {
		
	       System.out.println("Namaste");
	  }

	public static void main(String[] args) {
		System.out.println("Namaste");
		//instanceNamaste();
		Namaste na=new Namaste();
		na.instanceNamaste();
		Namaste_1 h= new Namaste_1("Namaste_2");
		h.instanceNamaste();
		System.out.println(h.getStr());
				
	}

}
