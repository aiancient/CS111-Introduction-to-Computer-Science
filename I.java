public class I {
    public static void main(String [] args) 
    {
        while (true)
        {
            int op = StdIn.readInt(); 
            if (op == 1) 
            {
                StdOut.println("create a file.");
            }

            else if (op == 2) 
            {
                StdOut.println("open a file.");
            }

            else if (op == 3) 
            {
                StdOut.println("close a file.");
            }

            else if (op == 1) 
            {
                StdOut.println("delete a file.");
            }

            else 
            {
                break; 
            }
        }
    }
}
