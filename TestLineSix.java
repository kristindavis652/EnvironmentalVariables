public class TestLineSix extends TestPattern {
    public void pattern() {
        TestStitch testCircleStitch = new TestCircleStitch();
        TestStitch testLargeCrossStitch = new TestLargeCrossStitch();
        TestStitch testShortLineStitch = new TestShortLineStitch();
        TestStitch testFillStitch = new TestFillStitch();
        TestStitch testZigZagStitch = new TestZigZagStitch();

        TestStitch[] stitches = new TestStitch[17];

        stitches [0] = testShortLineStitch;
        stitches [1] = testCircleStitch;
        stitches [2] = testShortLineStitch;
        stitches [3] = testShortLineStitch;
        stitches [4] = testShortLineStitch;
        stitches [5] = testLargeCrossStitch;
        stitches [6] = testLargeCrossStitch;
        stitches [7] = testLargeCrossStitch;
        stitches [8] = testShortLineStitch;
        stitches [9] = testFillStitch;
        stitches [10] = testFillStitch;
        stitches [11] = testFillStitch;
        stitches [12] = testShortLineStitch;
        stitches [13] = testZigZagStitch;
        stitches [14] = testShortLineStitch;
        stitches [15] = testShortLineStitch;
        stitches [16] = testShortLineStitch;

        for(int i = 0; i <17; i++) {
            stitches[i].sew();
        }

    }
}
