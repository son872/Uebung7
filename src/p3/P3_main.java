package p3;

public class P3_main {

	public static void main(String[] args) {
		Mensch m = new Mensch();
		
		m.setGebJahr(2007);
		m.getGebJahr();
		m.setAlter();
		m.GetAlter();
		m.setName("niklas");
		m.getName();
		
		
		System.out.println(m.gebJahr);
		System.out.println(m.alter);
		System.out.println(m.name);
		
		
		
		

	}

}
