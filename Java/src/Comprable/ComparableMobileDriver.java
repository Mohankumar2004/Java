package Comprable;

import java.util.Arrays;

public class ComparableMobileDriver {
    public static void main(String[] args) {
        ComaparableMobile c1 = new ComaparableMobile("Redmi", 4, 64, "Black");
        ComaparableMobile c2 = new ComaparableMobile("Samsung", 6, 128, "White");
        ComaparableMobile c3 = new ComaparableMobile("iPhone", 8, 256, "Red");
        ComaparableMobile[] c = { c1, c2 ,c3};
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
}