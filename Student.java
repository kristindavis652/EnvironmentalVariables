public class Student {
    private String name;
    private int idNumber;
    private static int nextIdNumber = 100000;
    private int credits;
    private double gpa;

    public Student(String name, int credits, double gpa) {
        this.name = name;
        this.credits = credits;
        this.gpa = gpa;
        this.idNumber = nextIdNumber;
        nextIdNumber++;
    }


    public String getClassStanding() {
        if (this.credits <= 30) {
            return "Freshman";
        } else if (this.credits <= 60) {
            return "Sophomore";
        } else if (this.credits <= 90) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

        public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }
    //getClassStanding
    //setCredits
    //setGPA

    public static void main(String args[]) {
        Student me = new Student("Doug Shook", 120, 4.0);
        Student somebodyElse = new Student ("Franklin", 0, 1.5);
        System.out.println(me.getClassStanding());
        System.out.println(somebodyElse.getClassStanding());
    }

    public String toString() {
        return this.name + " " + this.idNumber;
    }
}
