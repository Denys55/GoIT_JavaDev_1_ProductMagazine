package Console;

import java.util.Scanner;

public class Console {

    Scanner sc = new Scanner(System.in);

    public String readCart(){
       String s = sc.nextLine();
       sc.close();
       return s;
    }

}
