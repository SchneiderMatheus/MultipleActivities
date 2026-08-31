package application;

import java.util.Scanner;

public class BinaryConverter {
    
    public static int BinaryConverter(String str) {
    int result = 0;
    int length = str.length();

    for(int i = 0; i < length; i++){ 
      char bit = str.charAt(i);
      result = result * 2 + (bit - '0');
    }
    return result;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(BinaryConverter(s.nextLine()));
    s.close(); 
  }
}
