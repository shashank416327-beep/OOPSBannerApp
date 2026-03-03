public class OOPSBannerApp {

    public static void main(String[] args) {
        printBanner();
    }

    public static void printBanner() {

        String[] banner = new String[5];

        banner[0] = String.join(" ",
                " *****  ",
                " *****  ",
                " ****** ",
                " *****  ");

        banner[1] = String.join(" ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*       ");

        banner[2] = String.join(" ",
                "*     * ",
                "*     * ",
                "******  ",
                " *****  ");

        banner[3] = String.join(" ",
                "*     * ",
                "*     * ",
                "*       ",
                "      * ");

        banner[4] = String.join(" ",
                " *****  ",
                " *****  ",
                "*       ",
                " *****  ");

        for (String line : banner) {
            System.out.println(line);
        }
    }
}