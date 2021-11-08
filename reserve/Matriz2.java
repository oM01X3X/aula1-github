package reserve;

import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		

		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int vect[][] = new int[m][n];
		
		for(int i = 0 ; i < vect.length; i++) {
			for(int j = 0; i<vect[i].length; j++) {
				vect[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("informe o valor x: ");
		int x = sc.nextInt();
		
		for(int i = 0; i<vect.length; i++) {
			for(int j=0; j<vect[i].length; j++) {
				if(vect[i][j] == x) {
					System.out.println("position " + i + "," + j + " : ");
					if(j > 0) {
						System.out.println("left: " + vect[i][j-1]);
					}
					if(i > 0) {
						System.out.println("up: " + vect[i - 1][j]);
					}
					if(j < vect[i].length-1) {
						System.out.println("right: " + vect[i][j+1]);
					} 
					if(i < vect.length-1) {
						System.out.println("down: " + vect[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}
}
