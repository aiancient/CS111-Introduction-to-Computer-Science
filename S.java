public class S {

    public static void main(String args[]) {

        int[] intArray = StdIn.readAllInts(); 
        for (int i = 0; i < intArray.length; i++)
        {
            if (intArray[i] % 11 == 0)
                System.out.print("Check "); 

        }

        StdOut.println(intArray[args.length]); 
    }
    
}
