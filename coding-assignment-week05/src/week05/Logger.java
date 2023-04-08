package week05;

/*
 * 1. Create an interface named Logger
 */
public interface Logger {

  /*
   * 2. Add two void methods to the Logger interface, each should take a String as an argument.
   * a. Log 
   * b. Error
   */
  public void log(String str);

  public void error(String str);

}
