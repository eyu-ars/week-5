package week05;

/*
 * 3. Create two classes that implement the Logger interface a. AsteriskLogger b. SpacedLogger
 * 
 */
public class SpacedLogger implements Logger {


  /*
   * 6. The SpacedLogger should add spaces between each character of the String argument passed into its methods.
   * 7. If the log method received “Hello” as an argument, it should print H e l l o
   * 
   */

  @Override
  public void log(String str) {    

    System.out.println("\n" + addSpaces(str));
    System.out.println("\n");
  }


  /*
   * 8. The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e.
   * ERROR: H e l l o)
   */

  @Override
  public void error(String str) {

    // Creating sb object with initial value "ERROR: "
    StringBuilder sb = new StringBuilder("ERROR: ");
    System.out.println(sb.append(addSpaces(str)));
    System.out.println("\n");
    
  }

  /**
   * Adding a space between every character
   * @param str a string
   * @return string
   */
  private static String addSpaces(String str) {
    
    StringBuilder sb = new StringBuilder();
    for (int index = 0; index < str.length(); index++) {
      if (index == str.length() - 1) {
        sb.append(str.charAt(index));
      } else {
        sb.append(str.charAt(index) + " ");
      }
    }
    
    return sb.toString();
  }
}
