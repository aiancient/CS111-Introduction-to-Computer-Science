public class L {
        int sum = 0; 
        int count = args.length; 

        int[] intArray = new int[count];
       
        for (int i = 0; i < count; i++)
        {
            intArray[i] = Integer.parseInt(args[i]); 
            sum += intArray[i]; 
        }

        System.out.println(sum + " " + (double)sum/count);

}
