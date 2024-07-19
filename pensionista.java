package Program;

import java.util.Locale;
import java.util.Scanner;

import Entities.Person;

public class pensionista {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Person vetor[] = new Person[10];
		
		System.out.print("How many rooms will be rented? ");
		int number = input.nextInt();
		input.nextLine();
		for(int i = 0; i < number; i++) {
			System.out.println("");
			System.out.println("Rent #" + (i+1) + ": ");
			
			System.out.print("Name: ");
			String name = input.nextLine();
			
			System.out.print("Email: ");
			String email = input.nextLine();
			
			System.out.print("Room: ");
			int n = input.nextInt();
			input.nextLine();
			vetor[n - 1] = new Person(name, email);
		}
		
		System.out.print("Busy rooms: ");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] != null) {
				System.out.println((i+1) + ": " + vetor[i]);
			}
		}
		
		input.close();
	}

}
