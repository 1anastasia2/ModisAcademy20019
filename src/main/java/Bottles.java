import java.io.PrintStream;

class Bottles {
    public static void main(String args[]) {
        writeLyrics(System.out);
    }

    public static void writeLyrics(PrintStream out) {
        for (int beers = 99; beers > -1; beers--) {
            out.print(bottle(beers) + " of beer on the wall,");
            out.println(bottle(beers) + " of beer,");
            out.print(actionAfterTakeBeer(beers));
            out.println(bottle(beersLeft(beers)) + " of beer on the wall.\r\n");
        }
    }

    private static String bottle(int beers) {
        return beers + container(beers);
    }

    private static String actionAfterTakeBeer(int beer) {
        if (beer == 0) {
            return "Go to the store, buy some more,";
        } else {
            return "Take one down, pass it around,";
        }
    }

    private static String container(int beer) {
        if (beer == 1) {
            return " bottle";
        } else {
            return " bottles";
        }
    }

    private static int beersLeft(int beers) {
        return beers == 0 ? 99 : beers - 1;
    }
    private static String cc (int beer) {
        if (beer == 1) {
            return " bottle";
        } else {
            return " bottles";
        }
    }
}