public class TFibSeries {
    public static void main(String args[]) {

    boolean check = true; 
    int a = 0; 
    int b = 1; 

    while(check == true)
    {
        int sum = a+b;
        System.out.println(sum); 
        a = b; 
        b = sum; 

        if(a > 100)
        {
            break;
        }
    }
    
}

}
