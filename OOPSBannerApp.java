import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    static Map<Character, String[]> bannerMap = new HashMap<>();

    public static void main(String[] args) {

        bannerMap.put('O', new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        });

        bannerMap.put('P', new String[]{
                "******  ",
                "*     * ",
                "******  ",
                "*       ",
                "*       "
        });

        bannerMap.put('S', new String[]{
                " *****  ",
                "*       ",
                " *****  ",
                "      * ",
                " *****  "
        });

        displayBanner("OOPS");
    }

    public static void displayBanner(String text) {

        for (int i = 0; i < 5; i++) {
            for (char ch : text.toCharArray()) {
                System.out.print(bannerMap.get(ch)[i] + " ");
            }
            System.out.println();
        }
    }
}