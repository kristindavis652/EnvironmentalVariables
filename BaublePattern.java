public class BaublePattern extends Pattern {
    public void pattern() {
        Stitch shortLineStitch = new ShortLineStitch();
        Stitch circleStitch = new CircleStitch();

        Stitch[] stitches = new Stitch[15];
        stitches[0] = shortLineStitch;
        stitches[1] = shortLineStitch;
        stitches[2] = circleStitch;
        stitches[3] = shortLineStitch;
        stitches[4] = shortLineStitch;
        stitches[5] = circleStitch;
        stitches[6] = shortLineStitch;
        stitches[7] = shortLineStitch;
        stitches[8] = circleStitch;
        stitches[9] = shortLineStitch;
        stitches[10] = shortLineStitch;
        stitches[11] = circleStitch;
        stitches[12] = shortLineStitch;
        stitches[13] = shortLineStitch;
        stitches[14] = circleStitch;

        boolean needleJam = (Math.random() < 0d);
        if (needleJam) {
            for (int i = 0; i < 8; i++) {
                stitches[i].sew();
            }

        } else {
            for (int i = 0; i < 15; i++) {
                stitches[i].sew();
            }

        }
    }
}

