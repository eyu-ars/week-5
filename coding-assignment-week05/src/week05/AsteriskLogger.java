package week05;

/*
 * 3. Create two classes that implement the Logger interface a. AsteriskLogger b. SpacedLogger
 * 
 */
public class AsteriskLogger implements Logger {

  /*
   * 4. The log method on the AsteriskLogger should print out the String it receives between 3
   * asterisks on either side of the String (e.g. if the String passed in is “Hello”, then it should
   * print ***Hello*** to the console)
   */

  @Override
  public void log(String str) {

    // Adding asterisks before and after the string
    System.out.println("\n***" + str + "***");

    System.out.println("\n");
  }

  /*
   * 5. The error method on the AsteriskLogger should print the String it receives inside a box of
   * asterisks, with the String preceded by the word “ERROR:”. For example, if “Hello” is the
   * argument, the following should be printed:
   ******************
   *** Error: Hello***
   ******************
   * 
   */

  @Override
  public void error(String str) {

    //
    int numberOfAstrics = str.length() + 13;
    
    // Adding asterisks at the top of the string
    for (int i = 1; i <= numberOfAstrics; i++)
      System.out.print("*");
    System.out.print("\n");
    System.out.println("***" + "ERROR: " + str + "***");
    
    // Adding asterisks at the bottom of the string
    for (int i = 1; i <= numberOfAstrics; i++)
      System.out.print("*");

    System.out.println("\n");
  }

}
