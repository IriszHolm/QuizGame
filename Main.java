public class Main {
    public static void main (String[] args){
        System.out.println("Hello World");

        // RANDOM MULTIPLE CHOICE QUIZ GAME
        // should generate randomized questions, 4 options to choose from
        // opponents who you compete with in terms of points (maybe a dashboard showing who's ranked the highest)
        // Create a User where points, name and date of birth is stored
        // Seen in a JFrame

        Users opponent = Opponent.SpawnOpponent(); // Randomly generated opponent

        System.out.println(opponent.getName() + " " + opponent.getPoints());

    }
}
