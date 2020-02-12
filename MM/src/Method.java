import java.util.Scanner;

public class Method {
	
	private static Scanner keyboard;//библиотека Scanner



		
		
		
		public static void printMM () {
			
			keyboard = new Scanner (System.in);
			System.out.println("Insert number greater than 2 and smaller than 10000:");
			
			int N = keyboard.nextInt();
			
			if(N%2==1 && N>2 && N<=9999) {
				
				
				
				for (int i = 0; i <= N; i++) {  
					for (int j = 0; j<N*10; j++) { 
						
						
//						if(i+j==N || i+j==N*3 || i+j==6*N || i+j==8*N || i-j==-N || i-j==-N*3 || i-j==-N*6 || i-j==-N*8 ) {
//							System.out.print("*");
//						} //1st starline
//						else if(i+j==2*N-1 || i+j==4*N-1 || i+j==7*N-1 || i+j==9*N-1 || j-i==2*N-1 || j-i==4*N-1 || j-i==7*N-1 || j-i==9*N-1 ) {
//							System.out.print("*");
//						}  //last starline
						 if(i+j >= N && i+j <= 2*N-1 || i+j >= 6*N && i+j <= 7*N-1 || i+j >= 3*N && i+j <= 4*N-1 || i+j >= 8*N && i+j <= 9*N-1  || j-i >= N && j-i <= 2*N-1 || j-i >= 6*N && j-i <= 7*N-1 || j-i >= 3*N && j-i <= 4*N-1 || j-i >= 8*N && j-i <= 9*N-1 ) {
							System.out.print("*"); //inner starline
						} else {
							System.out.print("-");
						}
					}
					if(i<=N) {
						System.out.println();	
					}
					
			
				}
				
			}	else {
				System.out.print("Числото трябва да е нечетно!");
			}
		}
				

	
	}

