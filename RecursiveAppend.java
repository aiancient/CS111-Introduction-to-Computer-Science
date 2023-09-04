public class RecursiveAppend {
    public static void main(String[] args) {
            StdOut.println(appendNTimes("cat", 4)); 
    }

    public static String appendNTimes(String original, int n)
    {

        if(n==0)
        {
            return original; 
        }
        if(n ==1)
        {
            String s1 = original; 
            return s1.concat(original); 
        }

        return appendNTimes(original,n-1)+original; 
    }
}
