public class ZigZagLinesPattern extends Pattern {

    public void pattern() {
        Stitch zigZagStitch = new ZigZagStitch();
        Stitch fillStitch = new FillStitch();

        Stitch[] stitches = new Stitch[12];
        stitches[0] = zigZagStitch;
        stitches[1] = zigZagStitch;
        stitches[2] = zigZagStitch;
        stitches[3] = fillStitch;
        stitches[4] = fillStitch;
        stitches[5] = fillStitch;
        stitches[6] = zigZagStitch;
        stitches[7] = zigZagStitch;
        stitches[8] = zigZagStitch;
        stitches[9] = fillStitch;
        stitches[10] = fillStitch;
        stitches[11] = fillStitch;

        boolean needleJam = (Math.random() < 0d);
        if (needleJam) {
            for (int i = 0; i < 6; i++) {
                stitches[i].sew();
            }

        } else {
            for (int i = 0; i < 12; i++) {
                stitches[i].sew();
            }

        }
    }
}
