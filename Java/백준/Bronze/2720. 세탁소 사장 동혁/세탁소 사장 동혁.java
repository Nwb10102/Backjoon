import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int a = 0,b = 0,c = 0,d = 0;
			while (true) {
				if(m == 0){
					break; 
				}
				
				if(m >= 25){
					while(true){
						if(m <= 24){
							break;
						}
						m -= 25;
						a++;
					}
				}

				if(m >= 10){
					while(true){
						if(m <= 9){
							break;
						}
						m -= 10;
						b++;
					}
				}

				if(m >= 5){
					while(true){
						if(m <= 4){
							break;
						}
						m -= 5;
						c++;
					}
				}

				if(m >= 1){
					while(true){
						if(m <= 0){
							break;
						}
						m -= 1;
						d++;
					}
				}

				System.out.println(a + " " + b + " " + c + " " + d);
			}
		}
	}
}