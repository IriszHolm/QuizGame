import java.util.Random;

public class Opponent extends Users {

    public Opponent(String name, int points) {
        super(name, points);
    }

    public static Users SpawnOpponent() {
        String[] opponentNames = {"Warren Buffet", "Elon Musk", "Jeff Bezos", "Mark Zuckerberg", "Steve Jobs"};
        Random rand = new Random();

        // Minimum points=100, Maximum points=0 (Randomized points for the opponent)
        int randomPoints = (int) Math.floor((Math.random() * (100 - 0 + 1))) + 0;
        String randomName = opponentNames[rand.nextInt(opponentNames.length)];

        return new Users(randomName, randomPoints) {
        };

    }
}
