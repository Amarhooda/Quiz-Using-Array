import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] questions = {
                "What is the Largest country in world?",
                "Which country have the biggest population in the world?",
                "India is on which place according to land?",
                "How many continents are there in the world?",
                "Which is the biggest continent?",
                "How many oceans are there?"
        };
        String [][] options = {
                {"1. India","2. Russia","3. USA","4. China"},
                {"1. China","2. USA","3. Indonesia","4. India"},
                {"1. Second","2. Seventh","3. Fifth","4. Tenth"},
                {"1. 2","2. 4","3. 7","4. 8"},
                {"1. North America","2. Africa","3. Asia","4. Europe"},
                {"1. 5","2. 3","3. 6","4. 9"}
        };
        int [] answers = {2,4,2,3,3,1};

        int score = 0;
        int guess;

        System.out.println("This is a simple quiz!\nEnter the number of the option from 1,2,3,4");

        for(int i=0;i<questions.length;i++){
            System.out.println(questions[i]);

            for(String option:options[i]){
                System.out.println(option);
            }
            System.out.println("-------------------");
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess==answers[i]){
                System.out.println("-------------------");
                System.out.println("Your answer is Correct!");
                System.out.println("-------------------");
                score++;
            }
            else{
                System.out.println("-------------------");
                System.out.println("Your answer is Wrong!");
                System.out.println("-------------------");
            }
            System.out.println("Your Total is "+score+" out of "+options.length);
        }

    }
}