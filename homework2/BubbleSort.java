package ibu.edu.homework2;

public class BubbleSort {
	static boolean swapped; 
	public static void sort(Comparable[] elements) {
		for (int i=0; i<elements.length; i++) {
			for (int j=1; j<elements.length; j++) {
				if(elements[j-1].compareTo(elements[j]) < 0) {
					swap(elements, j - 1, j );
				}
			}
			if (swapped == false) {
				break;
			}
		}
		
	}

	public static void swap (Comparable[] elements, int a, int b) {
		Comparable t = elements[a];
		elements[a] = elements[b];
		elements[b] = t;
		swapped = true; 
	}
}