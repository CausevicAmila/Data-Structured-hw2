package ibu.edu.homework2;
import java.io.IOException;
public class main {
	public static void main(String[] args) throws IOException {
		
		IPaddress[] ipAddress = new IPaddress[100];
		ipAddress = IPaddress.readNumbers("/Users/acaus/Downloads/IP-COUNTRY-REGION-CITY-SHUFFLED/IP-COUNTRY-REGION-CITY-SHUFFLED.csv");
		BubbleSort.sort(ipAddress);
		for(int i=0;i<ipAddress.length;i++) {
			System.out.println(ipAddress[i]);
		}
		IPaddress.writeToFile("/Users/acaus/Downloads/bubblesort.csv", ipAddress);
		}
	}