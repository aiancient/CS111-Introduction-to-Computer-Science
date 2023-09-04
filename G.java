public class G {
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(args[0]); 
        double x = 0.5;
        double y = 0.5; 
        double size = 0.5; 
        draw(n,x,y,size); 
    }
    
    public static void draw(int n, double x, double y, double rad)
    {
        if(n==0)
        {
            return; 
        }

        else
        {
            StdDraw.circle(x,y,rad); 
            draw(n-1,x,y,(double) rad/2); 
        }
    }
}



