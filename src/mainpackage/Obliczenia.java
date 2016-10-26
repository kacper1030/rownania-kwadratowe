package mainpackage;

public class Obliczenia {
	
	Napisy napisy = new Napisy();
	
	int wynikP;
	
	public void wzorNaP(){
		wynikP = ( napisy.wb) / (2 * napisy.wa);
	}
	
	public void wypiszWynikP(){	
	System.out.println(wynikP);
	}
}
