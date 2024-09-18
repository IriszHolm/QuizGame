import java.util.*;

public class Main {
    public static void main(String[] args) {

        // RANDOM MULTIPLE CHOICE QUIZ GAME
        // should generate randomized questions, 4 options to choose from
        // opponents who you compete with in terms of points (maybe a dashboard showing who's ranked the highest)
        // Create a User where points, name and date of birth is stored
        // Seen in a JFrame
        // STORED IN DATABASE: name, points, date of birth, maybe the questions themselves.


        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the capital of Finland?", new String[]{"Berlin", "Madrid", "Helsinki", "Ankara"}, 2));
        questions.add(new Question("What is the capital of England?", new String[]{"Amsterdam", "Stockholm", "Paris", "London"}, 3));
        questions.add(new Question("What is the capital of India?", new String[]{"Santiago", "New Delhi", "Prague", "Cairo"}, 1));

        // Initialize game variables
        boolean quizGameRunning = true;
        Scanner intInput = new Scanner(System.in);
        Users opponent = Opponent.SpawnOpponent(); // Randomly generated opponent
        Users player = new Player("Iris", 0);

        // Shuffle questions to ensure random order
        Collections.shuffle(questions);
        int qIndex = 0;
       //System.out.println("Welcome " + player.getName() + " to the quiz\nPlease answer the following questions:");

        System.out.println("Welcome to the quiz\nPlease answer the following questions:`\n");

        while (quizGameRunning && qIndex < questions.size()) {
            Question currentQuestion = questions.get(qIndex); //starts with the first question in the array

            // Display the question and options
            System.out.println("Question: " + currentQuestion.getQuestion());
            String[] options = currentQuestion.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            // User input
            System.out.print("Enter the option number of your answer (1-" + options.length + "): \n");
            int answerIndex = intInput.nextInt() - 1; // zero-based index

            if (answerIndex >= 0 && answerIndex < options.length) {
                // Check if the answer is correct
                if (answerIndex == currentQuestion.getCorrectAnswerIndex()) {
                    System.out.println("Correct!");
                    player.increasePoints(); // Add points for a correct answer
                } else {
                    System.out.println("Wrong! The correct answer was: " + options[currentQuestion.getCorrectAnswerIndex()]);
                }

                System.out.println("Your current score: " + player.getPoints());

                // Move to the next question
                qIndex++;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        if (qIndex == questions.size()) {
            System.out.println("Congratulations! You have answered all questions.");
        } else {
            System.out.println("Game over! Your final score: " + player.getPoints());
        }

        intInput.close();
    }
}



