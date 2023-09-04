public class P {
    public static void main(String[] args) {    
    
        String str = "Joy,101,3.45;Emily,102,3.56;Nancy,103,3.21;Jimmy,104,4.0;Sgkd,345,6.7;";
        Student[] arr = convert(str,5); 
        StdOut.println("Length: " + arr.length); 

        for(int i = 0; i < arr.length; i++)
        {
            StdOut.println(arr[i].toString());
        }


                /*
        int a = 4; 
          int b = 6; 
          int c = 0; 

          for(int i =0; i <a; i++)
          {
             c+=a;
             for(int j = 0; j<b; j++)
             {
                 c+=b; 
             }
          }

          StdOut.println(c); 
            */
        


    
    }

    public static Student[] convert(String str, int n)
    {
        Student[] array = new Student[n]; 
        String name = "";
        int id = 0; 
        double gpa = 0.0;  

        for(int i = 0; i < n; i++)
        {
            
            for(int c = 0; c < 3; c++)
            {
                int indexOfComma = str.indexOf(","); 
                int indexOfSemi = str.indexOf(";"); 

                if (c==0)
                {
                    name = str.substring(0,indexOfComma);
                    str = str.substring(indexOfComma + 1); 
                }

                else if (c==1)
                {
                    id = Integer.parseInt(str.substring(0, indexOfComma)); 
                    str = str.substring(indexOfComma + 1);
                }

                else 
                {
                    gpa = Double.parseDouble(str.substring(0,indexOfSemi)); 
                    str = str.substring(indexOfSemi + 1); 
                }
                
            }

            array[i] = new Student(name,id,gpa); 
        }

        return array;
    }
}


    
    


    



