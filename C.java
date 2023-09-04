public class C {
    public static void main(String args[]) 
    {
        String weekDay = args[0]; 
        double temperatureF = Double.parseDouble(args[1]); 
        int scale = Integer.parseInt(args[2]); 

        if (scale == 1) 
        {
            double result = (temperatureF - 32) * 5/9 + 273.15; 
            System.out.println(weekDay + "temperature in Kelvin is " + result); 
        }

        else if (scale == 2)
        {
            double result = (temperatureF - 32) * 5/9; 
            System.out.println(weekDay + "temperature in Celcius is " + result); 
        }

        else 
        {
            System.out.println("Incorrect"); 
        }
    }
    
}
