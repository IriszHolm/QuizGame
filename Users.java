
abstract public class Users {

    private String name;
    private int dateOfBirth;
    private int points;

    public Users(String name, int points) {
        // Encapsulated attributes
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {

        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int increasePoints() {
        int newPoints = points + 5;
        setPoints(newPoints);

        return newPoints;
    }

}
