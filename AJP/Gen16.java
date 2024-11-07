class Gen16<T> {
    T t1;

    Gen16(T t2) {
        t1 = t2;
    }

    T get() {
        return t1;
    }

    void printType() {
        System.out.println("Type: " + t1.getClass().getName());
    }

    public static void main(String args[]) {
        Gen16<Integer> g1 = new Gen16<>(10);
        System.out.println(g1.get());
        g1.printType();
        int a = g1.get();
        System.out.println("" + a);
    }
}