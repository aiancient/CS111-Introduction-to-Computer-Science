public class ValidateTriangle {
    public static void main(String [] args) 
    {
        int angle1 = Integer.parseInt(args[0]);
        int angle2 = Integer.parseInt(args[1]);
        int angle3 = Integer.parseInt(args[2]);

        int sum = angle1 + angle2 + angle3; 

        if (sum == 180 && angle1 > 0 && angle3 > 0 && angle3 >0)
        {
            if (angle1 == angle2 && angle1 == angle3)
            {
                System.out.println("Equilateral triangle"); 
            }

            else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) 
            {
                System.out.println("Isosceles triangle"); 
            }

            else
            {
                System.out.println("Scalene triangle");
            }
        }

        else 
        {
            System.out.println("Triangle is not valid");
        }


    }
}
