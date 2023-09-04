public class CheckDigit {
    public static void main(String [] args) 
    {
        long number = Long.parseLong(args[0]); 
        long reminder = 0; 
        int firstSum = 0; 
        int secondSum = 0; 
        int finalSum = 0; 

        for (int i = 1; number > 0; i++)
        {
            reminder = number % 10; 

            if (i % 2 != 0)
            {
                firstSum += reminder; 
            }

            else if (i % 2 == 0)
            {
                secondSum += reminder; 
            }

            number /= 10; 

        }
        
        firstSum = firstSum % 10; 
        secondSum = (3*(secondSum % 10)) % 10; 

        finalSum = (firstSum + secondSum) % 10; 

        System.out.println(finalSum); 

    }

}
