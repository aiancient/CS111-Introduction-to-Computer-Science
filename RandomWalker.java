public class RandomWalker 
{
    
    public static void main(String [] args) 
    {
        int steps = Integer.parseInt(args[0]); 
        int x = 0; 
        int y = 0; 
        int xChange = 0; 
        int yChange = 0; 
        
        System.out.println("(" + x + "," + y + ")"); 

        while (steps > 0)
        {

            if (steps % 2 != 0)
            {
                if (xChange == 0)
                {
                    x += 1;
                    xChange = 1; 
                }

                else 
                {
                    x -= 1; 
                    xChange = 0; 
                }
                
            }

            else if (steps % 2 == 0) 
            {
                if (yChange == 0)
                {
                    y += 1;
                    yChange = 1; 
                }

                else 
                {
                    y -= 1; 
                    yChange = 0; 
                } 
            }

            System.out.println("(" + x + "," + y + ")"); 

            steps -= 1; 
        }

        double distance = (x * x) + (y * y); 
        System.out.println("Squared distance: " + distance);
    
    }


}

