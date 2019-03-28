import java.util.ArrayList;

public class TestPattern {

    //has a
    //arrayList
    //needle jam rate

    ArrayList<TestStitch> stitches = new ArrayList<>();
    protected double jamRate;

    {
        jamRate = 0;
    }

    //behavior


    public void pattern() {
        for (int i = 0; i < stitches.size(); i++) {
            stitches.get(i).sew();
            System.out.println(stitches.get(i));
        }

    }
}

