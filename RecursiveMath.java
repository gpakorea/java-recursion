// RecursiveMath.java

public class RecursiveMath {
  
  public static void main( String[] args ) {
    
    System.out.println( factorial(32) );
    
    int fibnum = 10;
    int salnum = 5;
    for( int i = 0; i<=fibnum; i++ ) {
      System.out.print( fibonacci(i) + ", " );
    }
    System.out.println();
    
    puf( 10 );
    sal( 5 );
    
    System.out.println();
    
    elvis(11);
    
    //System.out.println( "Fibonacci 10: " + fibonacci(10) );
    
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
   * sequence. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 … 
   * (it adds up the two previous numbers to get the result 
   * for the following number)
   * 
   * @link: http://introcs.cs.princeton.edu/java/23recursion/Fibonacci.java.html
   * @link: http://stackoverflow.com/questions/8965006/java-recursive-fibonacci-sequence
   */
  
  // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...
  public static int fibonacci( int n ) {
    
    if ( n == 0 ) {
      return 0;
    } 
    else if ( n == 1 ) {
      return 1;
    }
    else {
      return fibonacci(n-1) + fibonacci(n-2);
    }
    
  }
  
  // Puf function from Blue Pelican Java page 39-9 #9
  // x=10
  // {<{<{<{<{x}>}>}>}>}
  public static void puf( int n ) {
    if ( n == 1 ) {
      System.out.print( "x" );
    } else if ( n%2 == 0 ) {
      System.out.print( "{" );
      puf(n-1);
      System.out.print( "}" );
    } else {
      System.out.print( "<" );
      puf(n-1);
      System.out.print( ">" );
    }
  }
  
  // Sal function from Blue Pelican Java page 39-9 #8
  // n=5
  // 
  public static int sal( int n ) { // 5
    if ( n == 2 ) {
      return 100;
    } else if ( n == 3 ) {
      return 200;
    } else {
      return ( 2 * sal(n-1) + sal(n-2) + 1 );
    } // 2*sal(4) + sal(3) + 1)
  }   // 2* (2*sal(3) + sal(2) + 1) + (2*sal(2) + sal(1) + 1) + 1)
  
  // Blue Pelican Java 39-8 #7
  // n=11
  public static void elvis( int n ) {
    if ( n <=3 ) 
      System.out.print( n );
    else {
      elvis( n-3 ); // elvis(11), elvis(8), elvis(5), elvis(2)
      System.out.print( ">>" + ( n) );
    }
  }
  
} // END Recursive Math