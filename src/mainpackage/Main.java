package mainpackage;

public class Main {
	
	public static void main(String[] args) {
		
		Napisy napisy = new Napisy();
		Obliczenia obliczenia = new Obliczenia();
		
		napisy.ekranPowitalny();
		napisy.autor();
		napisy.wprowadzDane();
		
		obliczenia.wzorNaP();
		
		obliczenia.wypiszWynikP();
	}

}
