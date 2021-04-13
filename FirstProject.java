import java.util.Scanner;

public class  FirstProject
{
   public static void main(String[] args)
   {
      // Variable Dec
   int gpu = 0;
   double pscore = 0.0;
   double multiplier = 0.0;
   int core = 0;
   int cpu = 0;
   int computer = 0;
   String resolution = "";
   Scanner keyboard = new Scanner(System.in);
   Scanner input = new Scanner(System.in);
   
   String header = "Computer Hardware Graphics Quality Recommendation Tool";
        System.out.println(header);
   String Choice;
   
   // Ask the user to enter amount of computers
   
   System.out.println("How many computers are being processed?");
   computer = input.nextInt();
   
   do {  
   // Ask the user to enter the clock speed (in Megahertz) of their graphics card (GPU).
      System.out.println("Enter GPU Clock Speed: "); //This is an indicator of how fast their graphics card is.
   
   gpu = input.nextInt();
   // Ask the user to enter the clock speed (in Megahertz) of their graphics card (CPU).
   System.out.println("Enter CPU Clock Speed: "); //This is an indicator of how fast their CPU is.
   cpu = input.nextInt();
   
   // Ask the user to enter the amount of processor cores.
   System.out.println("Enter the amount of (CPU) Processor cores: "); //This is an indicator of how many cores in their CPU.  
   core = input.nextInt();
    
   // User picks resolution based off 4 different number choices: 1,2,3,4. 
   System.out.println(" Pick your resolution:\n 1. 1280 x 720\n 2. 1920 x 1080\n 3. 2560 x 1440\n 4. 3840 x 2160");
   int choice = input.nextInt();
   
   // Assigns multiplier variables to user inputed choices.
  
   if (choice == 1)
   {
   multiplier = 1;
   resolution = "1280 x 720";
   }
   else if (choice == 2)
   {
   multiplier = .75;
   resolution = "1920 x 1080";
   }
   else if (choice == 3)
   {
   multiplier = .55;
   resolution = "2560 x 1440";
   }
   else if (choice == 4)
   {
   multiplier = .35;
   resolution = "3840 x 2160";
   }
   
   
   // Prompts user with message of total score after multiply
   pscore = ((5 * gpu) + (core * cpu)) * multiplier;
   System.out.println("You have a performance score of: " + pscore);
   
   // Lists Recommended graphics quality when score falls under specific threshholds
   if (pscore > 17000)
   System.out.println(" Recommended Graphics Quality: Ultra");
   else if (pscore > 15000 && pscore <= 17000)
   System.out.println(" Recommended Graphics Quality: High");
   else if (pscore > 13000 && pscore <= 15000)
   System.out.println(" Recommended Graphics Quality: Medium");
   else if (pscore > 11000 && pscore <= 13000)
   System.out.println(" Recommended Graphics Quality: Low");
   else if (pscore <= 11000)
   System.out.println(" Recommended Graphics Quality: Unable to play");
     
   System.out.println(" GPU Clock Speed: " + gpu + " MHz" + "\n" +
   " CPU Clock Speed: " + cpu + " MHz" + "\n" +
   " CPU Cores: " + core + "\n" +
   " Resolution Choice: " + resolution + "\n");
   computer--;
   
   }
      while (computer > 0);
   
   }
}