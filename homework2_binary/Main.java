package ibu.edu.homework2_binary;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import ibu.edu.homework2.IPaddress;
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner readinput = new Scanner(System.in);
		IPaddress[] ipAddress = new IPaddress[10000];
		ipAddress = IPaddress.readNumbers("/Users/acaus/Downloads/bubblesort.csv");
		
        
		System.out.println("Enter an IP address: ");
		String inputIP = readinput.nextLine();
	}
}

