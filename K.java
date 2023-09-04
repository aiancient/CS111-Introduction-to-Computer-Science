public class K {
    public static void main(String args[]) 
    {	
        while (true)
        { 
            int op = StdIn.readInt(); 
            if (op == 1)
                StdOut.println("create aa file"); 
            else if (op == 2)
                StdOut.println("open aa file");
            else if (op == 3)
                StdOut.println("close aa file");
            else if (op == 4)
                StdOut.println("deleter aa file");
            if (op != 1 || op != 2 || op != 3 || op != 4 )
            {
                break;
            }

        }

    }

}
