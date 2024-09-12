package chap10;

import com.google.common.base.Function;

public class Lamda {
    public class Stu {

        int a = 0;
        int b = 2;

    }

    X x = () -> {
        System.out.println("Hello");
    };

    public static void main(String[] args) {

        Function<Integer, Integer> f = (a) -> a + 32;
        System.out.println(f.apply(5));

    }
}
