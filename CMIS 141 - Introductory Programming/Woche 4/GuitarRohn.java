//Guitar.java
import java.awt.Color;
import java.lang.reflect.Field;
import java.util.Random;

public class Guitar {

      /**
      * these two fields are used to generate random note and duration
      */
      static char[] Note = 'A', 'B', 'C', 'D', 'E', 'F', 'G' ;
      static double[] durationValue = 0.25, 0.5, 1, 2, 4 ;
      /**
      * basic guitar attributes
      */
      private int numStrings;
      private double guitarLength;
      private String guitarManufacturer;
      private Color guitarColor;
      public Guitar() 
            /**
            * default constructor
            */
            numStrings = 6;
            guitarLength = 28.2;
            guitarManufacturer = Gibson;
            guitarColor = Color.RED;
      
      public Guitar(int numStrings, double guitarLength,
                  String guitarManufacturer, Color guitarColor) 
            /**
            * parameterized constructor
            */
            this.numStrings = numStrings;
            this.guitarLength = guitarLength;
            this.guitarManufacturer = guitarManufacturer;
            this.guitarColor = guitarColor;
      
      /**
      * required getters and setters
      */
      public static char[] getNote() 
            return Note;
      
      public static void setNote(char[] Note) 
            Guitar.Note = Note;
      
      public static double[] getdurationValue() 
            return durationValue;
      
      public static void setdurationValue(double[] durationValue) 
            Guitar.durationValue = durationValue;
      
      public int getNumStrings() 
            return numStrings;
      
      public void setNumStrings(int numStrings) 
            this.numStrings = numStrings;
      
      public double getGuitarLength() 
            return guitarLength;
      
      public void setGuitarLength(double guitarLength) 
            this.guitarLength = guitarLength;
      
      public String getGuitarManufacturer() 
            return guitarManufacturer;
      
      public void setGuitarManufacturer(String guitarManufacturer) 
            this.guitarManufacturer = guitarManufacturer;
      
      public Color getGuitarColor() 
            return guitarColor;
      
      public void setGuitarColor(Color guitarColor) 
            this.guitarColor = guitarColor;
      
      /**
      *
      * @return a string containing 16 random notes and duration
      */
      public String playGuitar() 
            int MAX = 16;
            String notes = [;
            Random random = new Random();
            for (int i = 0; i < max;="" i++)="">
                  /**
                  * please note that random.nextInt(n) will return a random number
                  * between 0 and n-1, so if we use random.nextInt(array.length), it
                  * will return a random array index
                  */
                  notes += Note[random.nextInt(Note.length)] + (
                              + durationValue[random.nextInt(durationValue.length)] + );
                  if (i == MAX - 1) 
                        notes += ];
                  else 
                        notes += , ;
                  
            
            return notes;
      
      /**
      * returns a string containing guitar info
      */
      public String toString() 
            return (numStrings: + numStrings + , length: + guitarLength
                        + , Manufacturer: + guitarManufacturer + , Color: 
                        + convertColorToString(guitarColor);
      
      /**
      * a method to fetch the color name as string, this only works with those colors defined in
      * java.awt.Color ,like Color.BLACK, Color.BLUE etc.. else, it will return the RGB color code
      */
      public static String convertColorToString(Color c) 
            for (Field f : Color.class.getFields()) 
                  try 
                        if (f.getType() == Color.class && f.get(null).equals(c)) 
                              return f.getName();
                        
                  catch (java.lang.IllegalAccessException e) 
                       
                  
            
            return c.toString();
      

//TestGuitar.java
import java.awt.Color;
public class TestGuitar 
      public static void main(String[] args) 
            /**
            * Creating a Guitar object using default constructor
            */
            Guitar guitar1=new Guitar();
            /**
            * Creating a Guitar object using default constructor
            * and setting values using setter methods
            */
            Guitar guitar2=new Guitar();
            guitar2.setNumStrings(8);
            guitar2.setGuitarLength(30.2);
            guitar2.setGuitarManufacturer(Beats);
            guitar2.setGuitarColor(Color.BLUE);
           
            /**
            * Creating a Guitar object using parameterized constructor
            */
            Guitar guitar3=new Guitar(10, 35.2, JBL, Color.GREEN);
           
            /**
            * Displaying each guitar details, and demonstrate playGuitar() method
            */
            System.out.println(guitar1.toString());
            System.out.println(Number of strings: +guitar1.getNumStrings());
            System.out.println(Length: +guitar1.getGuitarLength());
            System.out.println(Manufacturer: +guitar1.getGuitarManufacturer());
            System.out.println(Color: +Guitar.convertColorToString(guitar1.getGuitarColor()));
            System.out.println(playGuitar(): +guitar1.playGuitar());
            System.out.println();
            System.out.println(guitar2.toString());
            System.out.println(Number of strings: +guitar2.getNumStrings());
            System.out.println(Length: +guitar2.getGuitarLength());
            System.out.println(Manufacturer: +guitar2.getGuitarManufacturer());
            System.out.println(Color: +Guitar.convertColorToString(guitar2.getGuitarColor()));
            System.out.println(playGuitar(): +guitar2.playGuitar());
            System.out.println();
            System.out.println(guitar3.toString());
            System.out.println(Number of strings: +guitar3.getNumStrings());
            System.out.println(Length: +guitar3.getGuitarLength());
            System.out.println(Manufacturer: +guitar3.getGuitarManufacturer());
            System.out.println(Color: +Guitar.convertColorToString(guitar3.getGuitarColor()));
            System.out.println(playGuitar(): +guitar3.playGuitar());
           
      

=============
 
output