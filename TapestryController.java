public class TapestryController {
    public static void main(String[] args) {

        Pattern crossStitchWigglePattern = new CrossStitchWigglePattern();
        Pattern zigZagLinesPattern = new ZigZagLinesPattern();
        Pattern baublePattern = new BaublePattern();
        Pattern blockyBaublePattern = new BlockyBaublePattern();
        Pattern brokenWigglePattern = new BrokenWigglePattern();

        patternBlock(crossStitchWigglePattern, 3,8);
        patternBlock(zigZagLinesPattern, 3, 8);
        patternBlock(baublePattern, 3, 8);
        patternBlock(blockyBaublePattern, 3, 8);
        patternBlock(brokenWigglePattern, 3, 8);
        System.out.println("\n" + "\n");
        patternBlock(crossStitchWigglePattern, 8,6);
        patternBlock(zigZagLinesPattern, 8, 6);
        patternBlock(baublePattern, 8, 6);
        patternBlock(blockyBaublePattern, 8, 6);
        patternBlock(brokenWigglePattern, 8, 6);



    }
    private static void patternBlock(Pattern patterns, int rows, int width) {

        for (int r = 0; r < rows; r++) {
            System.out.println(" ");
            for (int w = 0; w < width; w++) {
                patterns.pattern();
            }
        }
    }

}


