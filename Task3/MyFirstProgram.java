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
class MySecondClass {
    private int Param1, Param2;
    public int getParam1(){
        return this.Param1;
    }
    public int getParam2(){
        return this.Param2;
    }
    public void setParam1(int NewParam){
        this.Param1 = NewParam;
    }
    public void setParam2(int NewParam){
        this.Param2 = NewParam;
    }
    //
    public MySecondClass(){}
    public MySecondClass(int Par1, int Par2){
        Param1 = Par1;
        Param2 = Par2;
    }
    public int MaxParam(){
        if (Param1 > Param2) {
            return Param1;
        }
        return Param2;
    }
}
