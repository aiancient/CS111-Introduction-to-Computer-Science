public class TMinMax {
    public static void main(String args[]) {

        int[] array = {10,20,5,50,2}; 
        int min = array[0]; 
        int max = array[0]; 

        for(int i = 0; i < array.length; i++)
        {
            if (array[i] >= max)
            {
                max = array[i]; 
            }

            else if(array[i] <= min)
            {
                min = array[i]; 
            }
        }

        System.out.println("Min: " + min); 
        System.out.println("Max: " + max);
    }
}
