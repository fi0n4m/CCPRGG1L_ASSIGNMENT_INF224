public class Assignment2 { 

    public static void main(String[] args) throws Exception{ 

        

     // 1. Use a while loop to print your FIRST NAME three times.

        int count1 = 3; 

        

        while (count1 != 0){ 

            System.out.println("FIONA ADELYN"); 

            count1--; 

     } 

        

     // 2. Use a do-while loop to print your MIDDLE NAME four times. 

        int count2 = 0; 

        

        do { System.out.println("BULILAN"); 

              count2++; 

     }  while (count2 != 4); 

     

     // 3. Use a for loop to print your SURNAME five times. 

     for (int count3 = 5; count3 != 0; count3--){ 

         System.out.println("MARTINEZ"); 

     } 

     

     // 4. Create a char array that consists all of the characters of your FIRST NAME and use a for loop to print each character of your FIRST NAME. 

     char[] firstnameCharacters = { 'F', 'I', 'O', 'N', 'A', 'A', 'D', 'E', 'L', 'Y', 'N' }; 

     for (int count4 = 0; count4 < firstnameCharacters.length; count4++){ 

         System.out.println(firstnameCharacters[count4]);

     } 

  
        
     // 5. Use a for loop to print the char array of your FIRST NAME in REVERSE order. 
    for (int count5 = 10; count5 >= 0; count5--){ 
        System.out.println(firstnameCharacters[count5]);
  }

  } 
}
