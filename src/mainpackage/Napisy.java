package mainpackage;

import java.util.Scanner;

public class Napisy{
	
	public int a, b, c;
	public int wa;
	public int wb;
	
	public void ekranPowitalny(){
		System.out.println("");
		System.out.println("Witaj w programie!");
		System.out.println("");
		System.out.println("------------------");
	}
	public void autor(){
		System.out.println("");
		System.out.println("Autor: Kacper Jakóbczak");
		System.out.println("");
		System.out.println("Licencja: Open Source");
		System.out.println("");
		System.out.println("GitHub: kacper1030");
		System.out.println("");
	}
	public void wprowadzDane(){
		System.out.println("");
		System.out.println("Spersonalizuj swoje równanie");
		System.out.println("");
		System.out.println("Wprowadz a");
		
		wpisDoZmiennejA();		// nastepuje wpis do zmiennej a
		
		System.out.println("Wprowadz b");
		
		wpisDoZmiennejB();		// nastepuje wpis do zmiennej b
		
		System.out.println("Wprowadz c");
		
		wpisDoZmiennejC();		// nastepuje wpis do zmiennej c
	}
	public void wpisDoZmiennejA(){ 	// wczytuje dane do zmiennej a
		int wa;
		Scanner odczyt = new Scanner(System.in);
		a = odczyt.nextInt();
		System.out.println("Wpisano pomyślnie");
		System.out.println("");
		wa = a;
	}
	public void wpisDoZmiennejB(){		// wczytuje dane do zmiennej b
		Scanner odczyt = new Scanner(System.in);
		int wb;
		b = odczyt.nextInt();
		System.out.println("Wpisano pomyślnie");
		System.out.println("");
		wb = b;
	}
	public void wpisDoZmiennejC(){		// wczytuje dane do zmiennej c
		Scanner odczyt = new Scanner(System.in);
		int wc;
		c = odczyt.nextInt();
		System.out.println("Wpisano pomyślnie");
		System.out.println("");
		wc = c;
	}
	
	
}
