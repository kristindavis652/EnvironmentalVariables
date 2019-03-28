public class Course {
    private String name;
    private int credits;
    private int numberOfSeats;
    private Student[] roster;

    public Course(String name, int credits, int numberOfSeats) {
        this.name = name;
        this.credits = credits;
        this.numberOfSeats = numberOfSeats;
        this.roster = new Student[numberOfSeats];

    }

    public void registerStudent(Student s) {
        if (numberOfSeats > 0) {
            this.roster[numberOfSeats - 1] = s;
            numberOfSeats--; //or number of seats = numberOfSeats - 1;
        }
    }
}
