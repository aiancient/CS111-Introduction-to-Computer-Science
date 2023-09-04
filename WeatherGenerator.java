public class WeatherGenerator {

    static final int WET = 1; 
    static final int DRY = 2; 
    
    
    static final int[] numberOfDaysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

   
    public static int[] oneMonthGenerator(double longitute, double latitude, 
    int month, double[][] drywet, double[][] wetwet) {

        int rowPos = 0;
        for(int i = 0; i < drywet.length; i++) {
            if ( drywet[i][0] == longitute && drywet[i][1] == latitude ) {
                rowPos = i;
            }

        }

        

        int[] oneMonth = new int[numberOfDaysInMonth[month-2]];

        double dayOne = StdRandom.uniform();
        if (dayOne <= 0.49) {
            oneMonth[0] = 1; 
        } else { 
            oneMonth[0] = 2; 
        }

        for (int i = 1; i < oneMonth.length; i++) { 

            int prevDay = oneMonth[i-1]; 
            double currentDay = StdRandom.uniform();

            if (prevDay==1) {
                if (currentDay <= wetwet[rowPos][month]) {
                    oneMonth[i] = 1;
                } else {
                    oneMonth[i] = 2;
                }

            }
            else if (prevDay==2) {
                if (currentDay <= drywet[rowPos][month]) {
                    oneMonth[i] = 1;
                } else {
                    oneMonth[i] = 2;
                }

            }
                
        }
        return oneMonth; 
    }

    
    public static int numberOfWetDryDays (int[] forecast, int mode) {
        
        int sum = 0;

        for ( int i = 0; i < forecast.length; i++) {
            if ( forecast[i] == mode ) {
                sum += 1;
            }
        }
        return sum;
    }

   
    public static int lengthOfLongestSpell (int[] forecast, int mode) {

        int longestSpell = 0;
        int count = 0;

        for ( int i = 0; i < forecast.length; i++ ) {
            if (forecast[i] == mode) {
                count += 1;

            } else {
                if(count > longestSpell) {
                    longestSpell = count;
                }
                count = 0;
            }


            
        }
        if (mode == 1) {
        System.out.println("The Value of Wet Longest Spell is: " + longestSpell);
        }

        if (mode == 2) {
            System.out.println("The Value of Dry Longest Spell is: " + longestSpell);
            }
        return longestSpell;


    }

    
    public static void readTransitionProbabilities ( double[][] arrayToFill, 
    int numberOfLocations ) {
        int row = 0;
        while (row < numberOfLocations) {
            arrayToFill[row][0] = StdIn.readDouble();  // Longitute
            arrayToFill[row][1] = StdIn.readDouble();  // Latitude
            arrayToFill[row][2] = StdIn.readDouble();  // January
            arrayToFill[row][3] = StdIn.readDouble();  // February
            arrayToFill[row][4] = StdIn.readDouble();  // March
            arrayToFill[row][5] = StdIn.readDouble();  // April
            arrayToFill[row][6] = StdIn.readDouble();  // May
            arrayToFill[row][7] = StdIn.readDouble();  // June
            arrayToFill[row][8] = StdIn.readDouble();  // July
            arrayToFill[row][9] = StdIn.readDouble();  // August
            arrayToFill[row][10] = StdIn.readDouble(); // Septmber
            arrayToFill[row][11] = StdIn.readDouble(); // October
            arrayToFill[row][12] = StdIn.readDouble(); // November
            arrayToFill[row][13] = StdIn.readDouble(); // December
            row += 1;
        }
    }

    
    public static void populateTransitionProbabilitiesArrays(double[][] drywet, 
    double[][] wetwet, int numberOfLocations) {

        // Read transition probabilities that reflects how often the weather
        // changes from wet to dry into 2D array drywet.
        // The first line on the file has number of locations (lines)
        StdIn.setFile("drywet.txt");
        readTransitionProbabilities(drywet, numberOfLocations);

        // Read transition probabilities that reflects that the weather remains 
        // wet from one day to the next into 2D array wetwet.
        // The first line on the file has number of locations (lines)
        StdIn.setFile("wetwet.txt");
        readTransitionProbabilities(wetwet, numberOfLocations);
    }

    /*
     *
     * Reads the files containing the transition probabilities for US locations.
     * 
     * To find 
     * 
     * Execution:
     *   java WeatherGenerator -97.58 26.02 3
     * 
     * 
     */

    public static void main (String[] args) {

        int numberOfRows    = 4001; // Total number of locations
        int numberOfColumns = 14;   // Total number of 14 columns in file 
                                    // File format: longitude, latitude, 12 months of transition probabilities
        
        // Allocate and populate arrays that hold the transition probabilities
        double[][] drywet = new double[numberOfRows][numberOfColumns];
        double[][] wetwet = new double[numberOfRows][numberOfColumns];
        populateTransitionProbabilitiesArrays(drywet, wetwet, numberOfRows);

        /*** WRITE YOUR CODE BELLOW THIS LINE. DO NOT erase any of the lines above. ***/

        // Read command line inputs 
        double longitute = Double.parseDouble(args[0]);
        double latitude  = Double.parseDouble(args[1]);
        int    month     = Integer.parseInt(args[2]);

        int[] forecast = oneMonthGenerator(longitute, latitude, month, drywet, wetwet);
        int drySpell = lengthOfLongestSpell(forecast, DRY);
        int wetSpell = lengthOfLongestSpell(forecast, WET);

        StdOut.println("There are " + forecast.length + " days in the forecast for month " + month);
        StdOut.println(drySpell + " days of dry spell.");

        for ( int i = 0; i < forecast.length; i++ ) {

            // This is the ternary operator. (conditional) ? executed if true : executed if false
            String weather = (forecast[i] == WET) ? "Wet" : "Dry";  
            StdOut.println("Day " + (i+1) + " is forecasted to be " + weather);
        }
    }
}