// This program will demonstrate the 'length' String method

public class StringStuff
{
  public static void main(String[] args)
  {
    // Declare the variables and create the String object
    String name = "Some guys name";
    int stringLength;
    
    // Calculate the length of name
    stringLength = name.length();
    
    // Display stringLength
    System.out.println("The length of the name variable is " + stringLength + ".");
    
    // Will this also work?
    System.out.println(name.length());
    
  }
}
  
