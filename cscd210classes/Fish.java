package cscd210classes;

public class Fish implements Comparable<Fish>
{
   //FINISHED
   //Initialized the variable
   private String family;
   private String species;
   private double weight;
   private int tagID;
   
   
   //FINISHED
   //Pass the values in params into the variables 
   public Fish(final String family, final String species, final double weight, final int tagID)
   {
      if(family == null || family.isBlank() || species == null || species.isBlank() || weight <= 0 || tagID <= 0)
         throw new IllegalArgumentException("Bad params Fish");
      
      this.family = family;
      this.species = species;
      this.weight = weight;
      this.tagID = tagID;
   }
   
   
   //FINISHED
   //this method returns weight when referenced
   public double getWeight(){return this.weight;}
   
   //this method returns family when referenced
   public String getFamily(){return this.family;}

   //this method returns species when referenced
   public String getSpecies(){return this.species;}

   //this method returns tagID when referenced
   public int getTagID(){return this.tagID;}
   
   
   //FINISHED
   //this method sets weight if weight > 0
   public void setWeight(final double weight)
   {
      if(weight < 0)
         throw new IllegalArgumentException("Bad parameters setweight");
      this.weight = weight;
   }
   
   
   //FINISHED
   /*This method returns true if this == obj, returns false if obj == null, 
     returns false if obj is not an instanceof Fish,
     returns true if the this family is equals another family, 
     this species equals another species this tagID equals another tagID, 
     and this weight is equals to another weight false otherwise
   */
   @Override
   public boolean equals(final Object obj)
   {
      if(obj == this) return true;
      if(obj == null) return false;
      if(!(obj instanceof Fish)) return false;
      Fish another = (Fish)obj;
      
      return this.family.equals(another.family) && this.species.equals(another.species) && this.tagID == another.tagID && Double.valueOf(this.weight) ==  another.weight;
   }
   
   
   //FINISHED
   /*The hashCode method adds the int from calling the Strings 
     hashCode for species and family, added to the Double hashCode 
     for weight added to the tagID.
     @Override willcheck for overriding between the two classes which 
     have the same class but different params. (reference Overriding)
   */
   @Override
   public int hashCode()
   {
      return this.family.hashCode() + this.species.hashCode() + Double.hashCode(weight) + tagID;
   
   }
   
   //FINISHED
   /*The compareTo method first compares by fish species. 
     If the species are the same then it compares by fish family. 
     If the fish family are the same, then compares by tagID
     Returns int The value 0 if the argument another is equal to this fish;
     a value less than 0 if this fish is less than the Fish argument; 
     and a value greater than 0 if this Fish is greater than the Fish argument.
     @Override willcheck for overriding between the two classes which 
     have the same class but different params. (reference Overriding)
   */
   @Override
   public int compareTo(final Fish another )
   {
      if(Fish[].class == null)
         throw new IllegalArgumentException("Bad parameters compareTo");  
         
      int res = this.family.compareTo(another.family);
      if(res != 0)
         return res;
      
      res = this.species.compareTo(another.species);
      if(res != 0)
         return res;
         
      return this.tagID - another.tagID;
   }
   
   //FINISHED
   /*Returns the species, family, tagID, and weight in proper format
     @Override willcheck for overriding between the two classes which 
     have the same class but different params. (reference Overriding)
   */
   @Override
   public String toString()
   {
      String temp = this.species + " " + this.family + " - " + this.tagID + " - "+ this.weight;
      return temp;
   }

}
   //FINISHED
   /*This hashCode adds all the hashCodes together for all the private 
     strings in the class and then the number of books.
     @Override willcheck for overriding between the two classes which 
     have the same class but different params. (reference Overriding)
   */