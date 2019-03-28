public class Cat {
    //has a: (these are variables)
    //name String *
    //fur int  (how many) *
    //tail boolean (has one or not)
    //ears String
    //lives int
    //birthday Date
    private String name;
    private int fur;
    private int lives;

    public Cat(String name, int fur) {
        this.lives = 9; //if you know what the number is going to be, you don't need a parameter
        this.name = name;
        this.fur = fur;
    }

    public void meow() {
        System.out.println(this.name + " says meow!" );
    }



    //can (do)
    //hunt boolean (caught something or not) (String prey)
    //void meow() *
    //play (String toy)
    //eat (String food)
    //sleep (int hours)
    //shed (int quantity) *

    public void shed (int quantity) {
        if (quantity < this.fur) {
            this.fur = this.fur - quantity;
        } else {
            this.fur = 0;
        }
    }

    public int getFur() {
        return this.fur;
    }

    public static void main(String[] args) {
        Cat franklin = new Cat("Franklin", 1000);
        franklin.meow();
        Cat sally = new Cat("Sally", 152871684);
        sally.meow();
        sally.shed(1000);
        int sallysFur = sally.getFur();
        System.out.println(sallysFur);
    }
}
