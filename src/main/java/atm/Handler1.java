package atm;

public class Handler1 extends Handler{
    @Override
    public void process(int value){
        System.out.println(value + " * 1 currency");
    }
}
