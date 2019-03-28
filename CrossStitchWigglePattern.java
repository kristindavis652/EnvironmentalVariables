public class CrossStitchWigglePattern extends Pattern {

    public void pattern() {


        Stitch smallCrossStitch = new SmallCrossStitch();
        Stitch largeCrossStitch = new LargeCrossStitch();

        Stitch[] stitches = new Stitch[10];
        stitches[0] = smallCrossStitch;
        stitches[1] = largeCrossStitch;
        stitches[2] = smallCrossStitch;
        stitches[3] = largeCrossStitch;
        stitches[4] = smallCrossStitch;
        stitches[5] = largeCrossStitch;
        stitches[6] = smallCrossStitch;
        stitches[7] = largeCrossStitch;
        stitches[8] = smallCrossStitch;
        stitches[9] = largeCrossStitch;

        boolean needleJam = (Math.random() < 0.40d);
        if (needleJam) {
            for (int i = 0; i < (stitches.length/2); i++) {
                stitches[i].sew();
            }

        } else for (int i = 0; i < stitches.length; i++) stitches[i].sew();


            }


        }


