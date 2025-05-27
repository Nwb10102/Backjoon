import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String tkn[] = str.split("/");

		int k = Integer.valueOf(tkn[0]);
		int d = Integer.valueOf(tkn[1]);
		int a = Integer.valueOf(tkn[2]);

		if(k+a < d|| d == 0){
			System.out.println("hasu");
		}else System.out.println("gosu");
	}
}