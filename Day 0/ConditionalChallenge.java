public class ConditionalChallenge {
    public static void main(String[] args) {
        
        System.out.println("--- Part 1: Temperature Converter ---");

        double temperature = 75.5;
        boolean isCold = true;

        System.out.println("The initial temperature was " + temperature + " degrees.");
        System.out.println("Therefore, it is " + isCold + " that it is cold");

        if (isCold) {
            temperature -= 15;
        }
        else if (!isCold) {
            temperature += 10;
        }

        System.out.println("The final temperature is " + temperature + " degrees.");
        
        
        // Part 2: Grade Calculator
        System.out.println("");
        System.out.println("--- Part 2: Grade Calculator ---");

        int score = 50;
        String result = "";

        if (score >= 70) {
            result = "passed";
        }

        else if (score < 70) {
            result = "failed";
        }

        System.out.println("Score: " + score + ", Result: " + result);

        
        // Part 3: Season Determiner
        System.out.println("");
        System.out.println("--- Part 3: Season Determiner ---");
        
        int temperature2 = 76;
        String season = "";

        if (temperature2 > 80) {
            season = "Summer";
        }

        else if (temperature2 >= 60 && temperature2 <= 80) {
            season = "Spring";
        }

        else if (temperature2 >= 40 && temperature2 <= 59) {
            season = "Fall";
        }

        else if (temperature2 < 40) {
            season = "Winter";
        }

        System.out.println(season);

        System.out.println("Temperature: " + temperature + ", Season: " + season);

        // Part 4: Number Classifier
        System.out.println("");
        System.out.println("--- Part 4: Number Classifier ---");
        
        int number = 0;
        String result2 = "";
        String size = "Small";

        if (number > 0) {
            result = "Positive";
        }
        
        else if (number < 0) {
            result = "Negative";
        }

        else if (number == 0) {
            result = "Zero";
        }

        if(number > 100) {
            size = "Large";
        }

        else if(number < -100) {
            size = "Very Negative";
        }

        System.out.println("Number: " + number + ", Classification: " + result + ", Size: " + size);

    }
}