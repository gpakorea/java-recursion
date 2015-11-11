// RecursionOne.java

public class RecursionOne {
  
  public static void main( String[] args ) {
    
    inception(5);
    kick(5);
    
  } // END main method
  
  public static void inception( int n ) {
    
    if( n > 0 ) {
      System.out.println( "Welcome to the dream world" );
      inception( n - 1 );
    } else {
      System.out.println( "Wake up!" );
    }
    
  } // END inception
  
  public static void kick( int n ) {
    
    if( n > 0 ) {
      for( int i=0; i<n; i++ ) {
        System.out.print( "*" );
      }
      System.out.println( "\tWake up!" );
      kick( n - 1 );
    } else {
      System.out.println( "Welcome back to reality!" );
    }
    
  } // END inception
  
} // END RecursionOne