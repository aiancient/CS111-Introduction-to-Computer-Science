public class RURottenTomatoes 
{
    public static void main(String[] args) 
    {
        
        int sum = 0; 
        int answerSum = 0;
        int colMovieIndex = 0;
        int argsLocation = 2; 
        int rowsReviewers = Integer.parseInt(args[0]);
        int columnsRatings = Integer.parseInt(args[1]); 

        int[][] newTable = new int[rowsReviewers][columnsRatings]; 

        for(int r = 0; r <= rowsReviewers - 1; r++)
        {
            for (int c = 0; c <= columnsRatings - 1; c++)
            {
                newTable[r][c] = Integer.parseInt(args[argsLocation]);
                argsLocation++; 
            }
        }

        for (int cc = 0; cc <= columnsRatings - 1; cc++)
        {
            sum = 0; 

            for (int rr = 0; rr <= rowsReviewers - 1; rr++)
            {
                sum = sum + newTable[rr][cc]; 

                if ((rr == rowsReviewers - 1) && (cc == 0))
                {
                    answerSum = sum; 
                    colMovieIndex = 0; 
                }
            }


            if (sum > answerSum)
            {
                answerSum = sum;
                colMovieIndex = cc; 
                
            }

           
        }

        System.out.println(colMovieIndex);


    




    }
}
