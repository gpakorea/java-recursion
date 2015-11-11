// RecursiveMath.java

public class RecursiveMath {
  
  public static void main( String[] args ) {
    
    System.out.println( factorial(32) );
    fibonacci(10);
    
  } // END main method
  
  /*
   * ASSIGNMENT 1
   * 
   * Write a new static method called factorial( int n ) 
   * that calculates and prints the factorial of any int. 
   * (Test is with 10, you should get the result 3628800)
   * 
   * // 10! = 10*9! = 10*9*8!....1!
   * // 10*9*8*7*6*5*4*3*2*1
   */
  public static long factorial( int n ) {
    if( n > 1 ) {
      n *= factorial( n-1 ); // 10! = 10*9! = 10*9*8!....1!
    } 
    return n;
  }
  
  /*
   * ASSIGNMENT 2
   * 
   * Write a new static method called fibonacci( int n ) 
   * that calculates n number of numbers in the Fibonacci 
   * sequence. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 � 
   * (it adds up the two previous numbers to get the result 
   * for the following number)
   */
  public static void fibonacci( int n ) {
    // Start with 0+1 -> 1, 1+1=2, 1+2=3, 2+3=5
    // previous answer + 2nd level previous answer = 2
    int result = 0;
    
    /*if ( n == 0 ) {
      System.out.print( "0, " );
    }*/ 
   
    if ( n > 0 ) {
       result = prev + next;
       System.out.print( result + ", " );
       fibonacci( n-1 );
    } else {
      System.out.print( "0, 1, " );
    }
    
    
    
    
  }
  
} // END Recursive Math