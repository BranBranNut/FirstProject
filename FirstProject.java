import java.util.Scanner;

public class  FirstProject
{
   public static void main(String[] args)
   {
   // Variable Dec
   int gpu = 0;
   int core = 0;
   int cpu = 0;
   // Ask the user to enter the clock speed (in Megahertz) of their graphics card (GPU).
   Scanner input = new Scanner(System.in);
   System.out.println("Enter GPU Clock Speed: "); //This is an indicator of how fast their graphics card is.
   
   gpu = input.nextInt();
   // Ask the user to enter the clock speed (in Megahertz) of their graphics card (CPU).
   System.out.println("Enter CPU Clock Speed: "); //This is an indicator of how fast their CPU is.
   cpu = input.nextInt();
   
   // Ask the user to enter the amount of processor cores.
   System.out.println("Enter the amount of (CPU) Processor cores: "); //This is an indicator of how many cores in their CPU.  
   core = input.nextInt();
    
    
   System.out.println(" Pick your resolution:\n 1. 1280 x 720\n 2. 1920 x 1080\n 3. 2560 x 1440\n 4. 3840 x 2160");
   int choice = input.nextInt();
   
   }
}