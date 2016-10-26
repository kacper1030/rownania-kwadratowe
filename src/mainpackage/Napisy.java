package mainpackage;

import java.util.Scanner;

public class Napisy{
	
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
		
		wpisDoZmiennejA(0);		// nastepuje wpis do zmiennej a
		
		System.out.println("Wprowadz b");
		
		wpisDoZmiennejB(0);		// nastepuje wpis do zmiennej b
		
		System.out.println("Wprowadz c");
		
		wpisDoZmiennejC(0);		// nastepuje wpis do zmiennej c
	}
	public void wpisDoZmiennejA(int a){ 	// wczytuje dane do zmiennej a
		
		Scanner odczyt = new Scanner(System.in);
		a = odczyt.nextInt();
		System.out.println("Wpisano pomyślnie");
		System.out.println("");
	}
	public void wpisDoZmiennejB(int b){		// wczytuje dane do zmiennej b
		Scanner odczyt = new Scanner(System.in);
		b = odczyt.nextInt();
		System.out.println("Wpisano pomyślnie");
		System.out.println("");
	}
	public void wpisDoZmiennejC(int c){		// wczytuje dane do zmiennej c
		Scanner odczyt = new Scanner(System.in);
		c = odczyt.nextInt();
		System.out.println("Wpisano pomyślnie");
		System.out.println("");
	}
	
}
