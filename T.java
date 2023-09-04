public class T { 

    public static void main(String [] args)  {
        int n = Integer.parseInt(args[0]); 
        int i = 1; 
        int j; 
        while (i < n) {
            for (j = 1; j<n; j++)
            {
                if (j % i == 0)
                    System.out.print(j + " "); 
                else 
                    System.out.print(0 + " "); 
            }

            System.out.println(); 
            i++; 
        }

        System.out.println("There are " + i + " rows and " + j + " columns"); 

    } 

}
