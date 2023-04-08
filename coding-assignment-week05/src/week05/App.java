package week05;

/*
 * 9. Create a class named App that has a main method
 */
public class App {

  public static void main(String[] args) {

    /*
     * 10. In this class instantiate an instance of each of your logger classes that implement the
     * Logger interface
     */
    Logger astericsLogger = new AsteriskLogger();
    Logger spacedLogger = new SpacedLogger();


    /*
     * 11. Test both methods on both instances, passing in Strings of your choice
     */
    astericsLogger.log("Java");
    astericsLogger.error("Java");

    spacedLogger.log("Java");
    spacedLogger.error("Java");

  }

}
