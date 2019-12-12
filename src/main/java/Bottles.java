import java.io.PrintStream;

class Bottles {
    public static void main(String args[]) {
        writeLyrics(System.out);
    }

    public static void writeLyrics(PrintStream out) {
        for (int beers = 99; beers > -1; beers--) {
            if (beers == 0) {
                out.print(beers + container(beers) + " of beer on the wall,");
                out.println(beers + container(beers) + " of beer,");
                out.print(actionAfterTakeBeer(beers));
                out.println("99 bottles of beer on the wall.\r\n");
            } else if (beers == 1) {
                out.print(beers + container(beers) + " of beer on the wall,");
                out.println(beers + container(beers) + " of beer,");
                out.print(actionAfterTakeBeer(beers));
                out.println(beers - 1 + container(beers - 1) + " of beer on the wall.\r\n");
            } else if (beers == 2) {
                out.print(beers + container(beers) + " of beer on the wall,");
                out.println(beers + container(beers) + " of beer,");
                out.print(actionAfterTakeBeer(beers));
                out.println(beers - 1 + container(beers - 1) + " of beer on the wall.\r\n");
            } else {
                out.print(beers + container(beers)+ " of beer on the wall,");
                out.println(beers + container(beers) + " of beer,");
                out.print(actionAfterTakeBeer(beers));
                out.println(beers - 1 + container(beers -1) + " of beer on the wall.\r\n");
            }
        }
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
}