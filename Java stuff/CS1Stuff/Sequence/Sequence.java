package Sequence;

public class Sequence {
   private int[] values;

   /**
      Construct a sequence of a given size.
      @param size the size to use.
   */
   public Sequence(int size)
   {
      values = new int[size];
   }

   /**
      Sets a value in the sequence to a new value.
      @param i the position to modify
      @param n the number to use for the new value.
   */
   public void set(int i, int n)
   {
      values[i] = n;
   }

   /**
      Gets a value from the sequence.
      @param i the position of the value to retrieve
      @return the number at position i.
   */
   public int get(int i)
   {
      return values[i];
   }

   /**
      Returns the number of elements in the sequence.
      @return the number at position i.
   */
   public int size()
   {
      return values.length;
   }

   public boolean equals(Sequence other){
    int counter = 0;
    if (other.size() == values.length){
            for (int i = 0; i < other.size(); i++){
        if (this.get(i) == other.get(i)){
            counter++;
            System.out.println("Match");
        }
        else{
            System.out.println("Mismatch");
        }
    }
        if (counter == other.size()){
           return true;
     }  
        else{
            return false;
      }


}   
else{
     return false;
    }
   }
}

