import java.util.Scanner;
class Main {
private static Scanner scanner;

    public static void main(String args[])
    {
        System.out.println("#######################################################################################################################");
        System.out.println("Hello everybody !!");
        System.out.println("Welcome to the Tea House. Now you are with me and my name is Tata");
        System.out.println("i would like to tell you that in this Summer we have Green tea and Black tea as special menu");
        System.out.println("and what's even more special is that you can get green tea with ice and cream which has never been on our menu as usual");
        System.out.println("So yeah, please taste it");
        System.out.println("Please choose your mood of tea : 'Greentea' or 'Blacktea'");
         scanner = new Scanner(System.in);
         String teaType = scanner.next();
         System.out.println("You choose that : " + teaType);
    
         Tea tea = null;
         tea = new Tea();
    
         if("Greentea".equalsIgnoreCase(teaType))
         {
         tea.setTeaFactory(new GreenTea());
         }
         else if ("Blacktea".equalsIgnoreCase(teaType))
         {
         tea.setTeaFactory(new BlackTea());
         }
         System.out.println("Code of Tea has : "+ 
         tea.getTeaFactory());
         tea.gotoTea();

        Black black = new BlackBooba();
        Green green = new GreenIce();
  
        System.out.println("#######################################################################################################################");
        System.out.print("Last session you got taste Black tea with ");
        black.taste();
  
        System.out.print("Last session you got taste Green tea with ");
        green.flavor();

        Green BlackAdapter = new BlackAdapter(black); 
        System.out.print("This summer you got taste Green tea with ");
        BlackAdapter.flavor();

        System.out.println("Have a nice day!!");
        System.out.println("See you soon !!");
    }
}
