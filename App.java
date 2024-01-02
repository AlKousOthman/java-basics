public class App {
    public static void main(String[] args) {
     
      String firstName = "Othman";
  
      String lastName = "Alkous";
  
      int age = 23;
      double amount = 23.45;
      boolean married = false;
      double amount2 = 20.0;
      String deposit = "Deposit";
      String withdraw = "Withdraw";
      int amount3 = 5;
      String fullName ="John doe";
      
  System.out.println(firstName);
    System.out.println(lastName);
      System.out.println(age);
      System.out.println(amount);
  
      System.out.println("The amount is " + amount2+"KD\nwould you like to "+ deposit+ " or " +withdraw+ " the am\nount?");
  
      System.out.println(amount3+ " plus " + amount3 + " makes " + (amount3 + amount3) + "");
  
      System.out.println("My name is "+ fullName.substring(0,5).toUpperCase() + " and my last name length is " + fullName.substring(5).length() + ".");
      System.out.println(fullName.charAt(5) == 'd');
      
    }
  
    
  }
