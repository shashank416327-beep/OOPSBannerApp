import java.util.HashMap;
import java.util.Map;

class BannerService {

    private Map<Character, String[]> bannerMap = new HashMap<>();

    public BannerService() {
        initializePatterns();
    }

    private void initializePatterns() {

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
    }

    public void printBanner(String text) {

        for (int i = 0; i < 5; i++) {
            for (char ch : text.toCharArray()) {
                System.out.print(bannerMap.get(ch)[i] + " ");
            }
            System.out.println();
        }
    }
}

public class OOPSBannerApp {

    public static void main(String[] args) {

        BannerService bannerService = new BannerService();
        bannerService.printBanner("OOPS");
    }
}