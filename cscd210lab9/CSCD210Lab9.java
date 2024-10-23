package cscd210lab9;

import java.util.Scanner;
import cscd210classes.Fish;
import cscd210sort.SortUtils;
import cscd210methods.CSCD210Lab9Methods;

/**
 * The class that contains main. The main method will call the compareTo method of Fish in the selectionSort that takes
 * an array of type Comparable
 * @NOTE You will not write any additional methods. Only write the methods specified.
 */
public class CSCD210Lab9
{
   /**
    * The main method
    * @param args Representing an array of Strings
    */
   public static void main(String [] args) 
   {
      Fish [] myFish = null;
      int totalFish, choice;
      Scanner kb = new Scanner(System.in);
      
      totalFish = CSCD210Lab9Methods.readTotalFish(kb); // You must write 
            
      myFish = CSCD210Lab9Methods.fillArray(kb, totalFish); // You must write
            
      SortUtils.selectionSort(myFish); // calls the method that takes comparable
      
      do
      {
         choice = CSCD210Lab9Methods.menu(kb);
         
         if(choice == 1)
         {
            SortUtils.selectionSort(myFish);
            CSCD210Lab9Methods.printArray(myFish);
            
         } // end choice == 1
          
         else if(choice == 2)
         {
            myFish = CSCD210Lab9Methods.addFish(myFish, kb); // You must write
            SortUtils.selectionSort(myFish);
            CSCD210Lab9Methods.printArray(myFish);
            
         }// end else if choice == 2
         
         else if(choice == 3)
         {
            int index1 = CSCD210Lab9Methods.readIndex(0, myFish.length - 1, kb);
            int index2 = CSCD210Lab9Methods.readIndex(0, myFish.length - 1, kb);
            
            if(myFish[index2].equals(myFish[index1]))
               System.out.println("The two fish are equal");
               
            else
               System.out.println("The two fish are not equal");

         }// end else choice == 3
                  
         else
            System.out.println("Exiting");
         
      }while(choice != 4);
            
   }// end main  
   
}// end class
