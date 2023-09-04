public class LargestOfFive {
    public static void main(String [] args) 
    {
        int first = Integer.parseInt(args[0]); 
        int second = Integer.parseInt(args[1]); 
        int third = Integer.parseInt(args[2]); 
        int fourth = Integer.parseInt(args[3]); 
        int fifth = Integer.parseInt(args[4]); 
        int largest = first; 

        if (largest - second >= 0)
        {
            largest = first; 
        }

        else if (largest - second < 0)
        {
            largest = second; 
        }

         if (largest <= third)
         {
             largest = third; 
         }

         if (largest <= fourth)
        {
             largest = fourth; 
        }

        if (largest <= fifth)
        {
            largest = fifth; 
         }

        

        System.out.println(largest); 

    }
}
