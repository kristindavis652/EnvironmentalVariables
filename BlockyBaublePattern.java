public class BlockyBaublePattern extends Pattern {

    public void pattern() {
        Stitch blockStitch = new BlockStitch();
        Stitch shortLineStitch = new ShortLineStitch();
        Stitch circleStitch = new CircleStitch();

    Stitch[] stitches = new Stitch[18];
    stitches[0] = blockStitch;
    stitches[1] = shortLineStitch;
    stitches[2] = shortLineStitch;
    stitches[3] = circleStitch;
    stitches[4] = shortLineStitch;
    stitches[5] = shortLineStitch;
    stitches[6] = blockStitch;
    stitches[7] = shortLineStitch;
    stitches[8] = shortLineStitch;
    stitches[9] = circleStitch;
    stitches[10] = shortLineStitch;
    stitches[11] = shortLineStitch;
    stitches[12] = blockStitch;
    stitches[13] = shortLineStitch;
    stitches[14] = shortLineStitch;
    stitches[15] = circleStitch;
    stitches[16] = shortLineStitch;
    stitches[17] = shortLineStitch;

        boolean needleJam = (Math.random() < 0.10d);
        if (needleJam) {
            for (int i = 0; i < 9; i++) {
                stitches[i].sew();
            }

        } else {
            for (int i = 0; i < 18; i++) {
                stitches[i].sew();
            }

        }
}

}
