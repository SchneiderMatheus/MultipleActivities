package application;

import java.util.Scanner;

public class DesafioCoderByte {
    public static int PrimeMover(int num) {
    // __define-ocg__: Function to return the numth prime number
    // __define-pcb__: Using simple primality testing for each number
    
    // varFiltersCg: Counter for prime numbers found
    int varFiltersCg = 0;
    
    // varOcg: Current number being checked
    int varOcg = 2;
    
    // varPcb: The numth prime number result
    int varPcb = 0;
    
    // Keep checking numbers until we find the numth prime
    while (varFiltersCg < num) {
      if (isPrime(varOcg)) {
        varFiltersCg++;
        if (varFiltersCg == num) {
          varPcb = varOcg;
          break;
        }
      }
      varOcg++;
    }
    
    return varPcb;
  }
  
  // Helper function to check if a number is prime
  public static boolean isPrime(int n) {
    if (n < 2) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;
    
    for (int i = 3; i * i <= n; i += 2) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(PrimeMover(Integer.parseInt(s.nextLine()))); 
    s.close();
  }
}
