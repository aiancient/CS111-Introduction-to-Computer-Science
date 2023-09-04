public class R {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6}}; 
        int[] a = new int[arr.length]; 

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                    a[i] = arr[i][j]; 
            }
        }

    
    }
