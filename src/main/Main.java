package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int edad[]= new int[] {18, 20, 15, 20, 50};
		
		// matriz
		int ejemploMatriz[][] = new int [2][3];
		
		System.out.println("Ingresa los valores de la matriz");
		for(int i = 0; i < 2; i++) { // fila
			for (int j = 0; j < 3; j++) {
				ejemploMatriz[i][j] = sc.nextInt();
			}
		}
		
		
		for(int i = 0; i < 2; i++) { // fila
			for (int j = 0; j < 3; j++) {
				System.out.print(" "+ ejemploMatriz[i][j]+ " ");
			}
			System.out.println("");
		}
		
		
			
		String nombres[] = new String[] { 
				"Cristian", 
				"José", 
				"Marlene", 
				"Nata"};
		
		// For each
		for (String nom: nombres) {
			//System.out.println(nom);
		}
		
		
		ArrayList<String> nombreArrayList = new ArrayList<String>();
		
		nombreArrayList.add("Cristian");
		nombreArrayList.add("Diana");
		nombreArrayList.add("José");
		nombreArrayList.add("Nata");
		
		/*
		 * System.out.println(nombreArrayList ); System.out.println("----------" );
		 * nombreArrayList.remove("Cristian"); System.out.println(nombreArrayList);
		 * nombreArrayList.remove(1); System.out.println(nombreArrayList );
		 * System.out.println("----------" );
		 */
		}
}
