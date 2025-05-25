import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int set1 = sc.nextInt();
		int set2 = sc.nextInt();
		int set3 = sc.nextInt();
		int soda1 = sc.nextInt();
		int soda2 = sc.nextInt();

		int afset1 = 0;
		int afset2 = 0;
		int afset3 = 0;
		
		if(soda1 < soda2){
			afset1 = set1 + soda1 - 50;
			afset2 = set2 + soda1 - 50;
			afset3 = set3 + soda1 - 50;
		}else{
			afset1 = set1 + soda2 - 50;
			afset2 = set2 + soda2 - 50;
			afset3 = set3 + soda2 - 50;
		}

		if(afset1 <= afset2 && afset1 <= afset3){
			System.out.println(afset1);
		}else if(afset2 <= afset1 && afset2 <= afset3){
			System.out.println(afset2);
		}else System.out.println(afset3);
	}
}