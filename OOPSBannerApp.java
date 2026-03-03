class BannerPattern {

    String[] bannerLines = {
            String.join(" ", " *****  ", " *****  ", " ****** ", " *****  "),
            String.join(" ", "*     * ", "*     * ", "*     * ", "*       "),
            String.join(" ", "*     * ", "*     * ", "******  ", " *****  "),
            String.join(" ", "*     * ", "*     * ", "*       ", "      * "),
            String.join(" ", " *****  ", " *****  ", "*       ", " *****  ")
    };

    void display() {
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}

public class OOPSBannerApp {

    public static void main(String[] args) {
        BannerPattern banner = new BannerPattern();
        banner.display();
    }
}