public class TestLineSeven extends TestPattern {
    public void pattern() {

        TestStitch testSmallCrossStitch = new TestSmallCrossStitch();//TestSmallCrossStitch(); is the Constructor from class TestSmallCrossStitch

        TestStitch[] stitches = new TestStitch[17]; //declare an array of type TestStitch In other words an array that will hold objects of type TestStitch

        stitches [0] = testSmallCrossStitch;
        stitches [1] = testSmallCrossStitch;
        stitches [2] = testSmallCrossStitch;
        stitches [3] = testSmallCrossStitch;
        stitches [4] = testSmallCrossStitch;
        stitches [5] = testSmallCrossStitch;
        stitches [6] = testSmallCrossStitch;
        stitches [7] = testSmallCrossStitch;
        stitches [8] = testSmallCrossStitch;
        stitches [9] = testSmallCrossStitch;
        stitches [10] = testSmallCrossStitch;
        stitches [11] = testSmallCrossStitch;
        stitches [12] = testSmallCrossStitch;
        stitches [13] = testSmallCrossStitch;
        stitches [14] = testSmallCrossStitch;
        stitches [15] = testSmallCrossStitch;
        stitches [16] = testSmallCrossStitch;

        for (int i = 0; i < 17; i++) {
            stitches[i].sew();
        }







    }
}

