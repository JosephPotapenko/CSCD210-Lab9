package cscd210methods;

import java.util.Scanner;
import cscd210classes.Fish;
import cscd210sort.SortUtils;

/**
 * The standard methods class 
 *
 * @NOTE You must pass all parameters as final
 */
public class CSCD210Lab9Methods
{
   /**
    * Read total Fish reads a number from the keyboard and ensures it is greater than 0
    *
    * @param kb Representing the Scanner object
    * @return int Representing the number of fish ensuring the number is greater than 0
    *
    * @throws IllegalArgumentException if kb is null
    * @NOTE You will write this method
    * @NOTE The input buffer will be cleared
    */
    public static int readTotalFish(final Scanner kb)
    {
      if(kb == null)
         throw new IllegalArgumentException("Bad params readTotalFish");
         
      System.out.print("Please enter the ammount of fish you plan to catalog: ");
      int total = Integer.parseInt(kb.nextLine()); 
      return total;  
    }
    

   /**
    * The fillArray first builds an array of Fish references based on the total.  See comments below
    *
    * @param total Representing how many items will be in the array
    * @param kb Representing the Scanner object
    *
    * @return Fish[] Representing a filled array of Fish objects
    *
    * @throws IllegalArgumentException if total &lt;=0
    *
    * @NOTE You write this method
    * @NOTE The input buffer will be cleared
    */
   public static Fish[] fillArray(final Scanner kb, final int total)
   {
      if(total <= 0)
         throw new IllegalArgumentException("Bad params fillArray");
     
     
      Fish [] myFish = new Fish[total];
     
      for(int x = 0; x < myFish.length; x++)
      {
         System.out.print("Please enter the fish family: ");
         String family = kb.nextLine();
         System.out.print("Please enter the fish species: ");
         String species = kb.nextLine();
         System.out.print("Please enter the fish weight: ");
         double weight = kb.nextDouble();
         kb.nextLine();
         System.out.print("Please enter the fish tagID: ");
         int tagID = Integer.parseInt(kb.nextLine());
         
         myFish[x] = new Fish(family, species, weight, tagID);
      }
     
     return myFish;
   }
   
   /**
    * Adds a new Fish to the array. You will prompt the user for all the fish information
    * @param myFish Representing the array to add to
    * @param kb Representing the Scanner 
    * @return myFish Representing a new fish added to the array
    *
    * @throws IllegalArgumentException if kb is null or myFish is null or myFish is &lt;0
    *
    * @NOTE You write this method
    * @NOTE The input buffer will be cleared
    */
    public static Fish [] addFish(final Fish [] myFish, final Scanner kb)
    {
      if(kb == null || myFish == null || myFish.length <= 0)
         throw new IllegalArgumentException("Bad params fillArray");  
             
      Fish[] copy = new Fish[myFish.length + 1];
      for(int x = 0; x < myFish.length; x++)
         copy[x] = myFish[x];
      System.out.print("Please enter the fish family: ");
      String family = kb.nextLine();
      System.out.print("Please enter the fish species: ");
      String species = kb.nextLine();
      System.out.print("Please enter the fish weight: ");
      double weight = kb.nextDouble();
      kb.nextLine();
      System.out.print("Please enter the fish tagID: ");
      int tagID = Integer.parseInt(kb.nextLine());
      copy[copy.length-1] = new Fish(family, species, weight, tagID);
      return copy;    
    }

   
   /**
    * The printArray method prints out each fish one fish per line
    *
    * @param myFish Representing the array of Fish
    *
    * @throws IllegalArgumentException if myFish is null or the length is &lt;0
    */
    

   public static void printArray(final Fish [] myFish)
   {
      if(myFish == null || myFish.length < 0)
         throw new IllegalArgumentException("Bad Params printArray");
         
      if(myFish.length == 0)
         System.out.println("No Fish Available");
         
         
      else
         for(Fish f: myFish)
            System.out.println(f);
   
   }
   
   /**
    * The readIndex method prompts the user to enter a number that is between the
    * startIndex and endIndex inclusive.  It ensure the value entered is &gt;= startIndex and &lt;= endIndex
    *
    * @param startIndex Representing the starting value
    * @param endIndex Representing the ending value
    * @param kb Representing the Scanner object to the keyboard
    * @return int Representing a value between startIndex and endIndex inclusive
    *
    * @throws IllegalArgumentException if startIndex is &lt; 0
    * @throws IllegalArgumentException if endIndex is &lt; 0 or &lt; startIndex
    * @throws IllegalArgumentException if kb is null
    *
    * @NOTE The input buffer will be cleared by you at the end of the method
    */    
   public static int readIndex(int startIndex, int endIndex, Scanner kb)
   {
      if(startIndex < 0 || endIndex < 0 || endIndex < startIndex || kb == null)
         throw new IllegalArgumentException("Bad Params readIndex");

      int val;
      do
      {
         System.out.print("Please enter a number between " + startIndex + " and " + endIndex + " ");
         val = Integer.parseInt(kb.nextLine());
         
      }while(val < startIndex || val > endIndex);
      
      return val;
   }// end readIndex
   
   /**
    * The menu method prompts the user to enter a value between 1 and 4 inclusive. <br>
    * 1) Print the array to the screen<br>
    * 2) Add Fish to the array<br>
    * 3) Read and index and check for equality<br>
    * 4) Quit<br>
    *
    * @param kb Representing the Scanner object to the keyboard
    * @return int Representing a number between 1 and 4 inclusive
    *
    * @throws IllegalArgumentException if kb is null
    *
    * @NOTE The input buffer will be cleared by you at the end of the method
    */    
   public static int menu(final Scanner kb)
   {
      if(kb == null)
         throw new IllegalArgumentException("Bad Params menu");
   
      int choice;
      do
      {
         System.out.println("Please choose from the following:");
         System.out.println("1) Print the array to the screen");      
         System.out.println("2) Add Fish to the array"); 
         System.out.println("3) Read and index and check for equality");           
         System.out.println("4) Quit"); 
         System.out.print("Choice --> "); 
         choice = Integer.parseInt(kb.nextLine());
      }while(choice < 1 || choice > 4);
      
      return choice;         
   }// end menu
     
}// end class