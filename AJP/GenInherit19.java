
class A<T> {
    T a;

    A(T a1) {
        a = a1;
    }

    void showT() {
        System.out.println("a= " + a);
    }
}

class B<V, T> extends A<T> {
    V b;

    B(V b1, T a1) {
        super(a1);
        b = b1;
    }

    void ShowV() {
        super.showT();
        System.out.println("b= " + b);
    }
}

class GenInherit {
    public static void main(String args[]) {
        B<Integer, Double> o1 = new B<Integer, Double>(10, 20.0);
        o1.ShowV();
    }
}