package Comprable;

import java.util.Arrays;

public class EmpDriver {
    public static void main(String[] args) {
        Emp e1 = new Emp("Amit", 101, 25);
        Emp e2 = new Emp("Vijay", 102, 30);
        Emp e3 = new Emp("Ravi", 103, 22);
        Emp[] e = { e1, e2, e3 };
        Arrays.sort(e);
        System.out.println(Arrays.toString(e));
    }
}