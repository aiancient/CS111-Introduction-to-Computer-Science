public class FindDuplicate { 

    public static void main(String [] args)  {

       boolean isDuplicate = false; 
    

       int[] intArray = new int[args.length];
       
       for (int b = 0; b < args.length; b++)
       {
           intArray[b] = Integer.parseInt(args[b]); 
       }
       
       for (int i = (intArray.length - 1); i > 0; i--)
        {

            for (int j = i - 1; j>= 0; j--)
            {
                if (intArray[i] == intArray[j])
                {
                    isDuplicate = true; 
                    break; 
                }
            }
        }

        StdOut.println(isDuplicate); 
        

    } 

}