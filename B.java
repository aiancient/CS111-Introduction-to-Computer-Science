public class B {
    public static void main(String [] args) 
    { 

        int length = Integer.parseInt(args[0]); 
        int[][] nums = new int[length][length]; 

        System.out.println("Original 2D array:"); 

        for (int r = 0; r<length; r++)
        {
            for (int c = 0; c<length; c++)
            {
                nums[r][c] = 5; 
                System.out.print(nums[r][c] + " ");
            }

            System.out.println();
        }

        System.out.println("Changed 2D array:"); 

        for (int r = 0; r<length; r++)
        {
            for (int c = 0; c<length; c++)
            {
                if (c>r)
                {
                     nums[r][c] = 1; 
                    System.out.print(nums[r][c] + " ");
                }
                
                else if (r>c)
                {
                    nums[r][c] = 0; 
                    System.out.print(nums[r][c] + " ");  
                }
                
                else 
                {
                    nums[r][c] = 5; 
                     System.out.print(nums[r][c] + " ");
                }    
            }

            System.out.println();
        }

       
    }
}
