public class TPalindrome {

    public static void main(String args[]) {

        String word = "kayak";  
        int left = 0; 
        
        if (word.length() % 2 != 0) 
        {
            for(int right = word.length() - 1; right > word.length() /2; right--)
            { 
              if(word.charAt(right) == word.charAt(left))
             {
                   if(right == (word.length() /2) + 1)
                  {
                      System.out.println("This word is a plaindrome.");
                  }
                  left++;
                   continue; 
              }

             else
             {
                 System.out.println("The word is not a palindrome"); 
                 break; 
             }

            }

        }

        else
        {
            System.out.println("The word is not a palindrome"); 
        }
    }
    
}
