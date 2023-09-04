public class TEorO {
    
    public static void main(String args[]) {

        int[] array = {2,5,15,12,20,17};

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 == 0)
            {
                System.out.println("The number " + array[i] + " at index " + i + " is even."); 
            }

            else
            {
                System.out.println("The number " + array[i] + " at index " + i + " is odd."); 
            }
        }
    }
}
