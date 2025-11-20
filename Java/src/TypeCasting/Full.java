package TypeCasting;


class A {
    void m1() {
        System.out.println("m1 method of class A");
    }
}

class B extends A {
    // ✅ Overriding (same method as parent)
    @Override
    void m1() {
        System.out.println("m1 method of class B (Overridden)");
    }

    // 🚀 New method — not present in A
    void m2() {
        System.out.println("m2 method of class B (New Method)");
    }
}

public class Full {
    public static void main(String[] args) {
        // ---------------------------
        // 🕐 Late Binding (Runtime)
        // ---------------------------
        A a1 = new B();   // upcasting
        a1.m1();           // ✅ calls B’s overridden m1() (runtime decision)
        // a1.m2();        // ❌ compile-time error (A doesn’t have m2())

        // ---------------------------
        // 🕓 Early Binding (Compile Time)
        // ---------------------------
        B b1 = new B();    // normal object
        b1.m1();           // calls B’s m1()
        b1.m2();           // ✅ calls B’s own method (visible because reference type = B)

        // ---------------------------
        // 🔽 Downcasting (optional)
        // ---------------------------
        B b2=(B)a1;
        b2.m2();// ✅ works (a1 actually refers to a B object)
    }
}

