public class SO {
    public static void main(String [] args)  {
    
       int a = Integer.parseInt(args[0]); 
       int b = Integer.parseInt(args[1]);
       int c = Integer.parseInt(args[2]);
       int d = Integer.parseInt(args[3]);

       
         int smallest = 0; 

        if (a<=b && a<=c)
        {
            smallest = a; 
        }

        else if (b<=c && b<=a) 
        {
            smallest = b; 
        }

        else 
        {
            smallest = c; 
        }
        
        if (smallest >= d)
        {
            smallest = d; 
        }
        
        System.out.println(smallest); 
      
      
      
      
      
      
      
      
      
      
      
      
        /* int num; 

        if (b<a)
        {
            num = a; 
            a = b; 
            b = num; 
        }

        if (c<a)
        {
            num = a; 
            a = c; 
            c = num; 
        }

        if (c<b)
        {
            num = b; 
            b = c; 
            c = num; 
        }

        System.out.println(a); 

*/













        /*int num = a; 

        if (b<num)
        {
            num = b; 
        }

        else 
        {
            if (c<num)
            {
                num = c; 
            }
        }
        System.out.println(num); 

        */



       /* if (a <= b)
        {
            if (a <= c)
            {
                System.out.println(a); 
            }

            else 
            {
                System.out.println(c); 
            }
        }

        else 
        {
            if (b <= c)
            {
                System.out.println(c); 
            }

            else
            {
                System.out.println(b); 
            }
        }
            */

    }
}
