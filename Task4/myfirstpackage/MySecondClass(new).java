package myfirstpackage;

public class MySecondClass {
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
    public int OperOnParam(){
        return Param1|Param2;
    }
}
