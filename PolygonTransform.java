public class PolygonTransform {
    
    public static double[] copy(double[] array)
    {
        double[] unchanged = new double[array.length]; 

        for(int i = 0; i < array.length; i++)
        {
            unchanged[i] = array[i];
        }

        return unchanged; 
    }

    public static void scale(double[] x, double[] y, double alpha)
    {
        for(int i = 0; i < x.length; i++)
        {
            x[i] = alpha * x[i]; 
            y[i] = alpha * y[i];
        }

    }

    public static void translate(double[] x, double[] y, double dx, double dy)
    {

        for(int i = 0; i < x.length; i++)
        {
            x[i] += dx; 
            y[i] += dy; 
        }
    }

    public static void rotate(double[] x, double[] y, double theta)
    {
        double thetachanged = Math.toRadians(theta); 

        for(int i = 0; i < x.length; i++)
        {
            double changedX = (x[i]*Math.cos(thetachanged)) - (y[i] * Math.sin(thetachanged)); 
            double changedY = (y[i]*Math.cos(thetachanged)) + (x[i] * Math.sin(thetachanged)); 

            x[i] = changedX;
            y[i] = changedY;
        }
    }
    
    
    public static void main(String [] args) 
    {
        
    }




}