import myfirstpackage.*;

class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(21, 22);
        System.out.println(o.MaxParam());
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setParam1(i);
                o.setParam2(j);
                System.out.print(o.MaxParam());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
