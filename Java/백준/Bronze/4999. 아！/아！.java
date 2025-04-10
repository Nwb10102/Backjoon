import java.util.*;

  public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next(); // 닥터
      String str2 = sc.next(); // 저스틴


      if(str.length() >= str2.length()){
          System.out.println("go");
      }else System.out.println("no");
    }
  }