package h3;

public class Mensch {
	public String name = "Peter";
	public int gebJahr = 2005;
	public int alter = 100;
	
	public void setName(String pName) {
		name = pName;
	}
	public void setGebJahr(int pGebJahr) {
		gebJahr = pGebJahr;
	}
	public void setAlter() {
		alter = 2025-gebJahr;
	}
	public String getName() {
		return name;
	}
	public int getGebJahr() {
		return gebJahr;
	}
	public int GetAlter() {
		return alter;
	}

}
