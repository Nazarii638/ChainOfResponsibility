package atm;

public class Handler50 extends Handler{
    @Override
    public void process(int value){
        System.out.println((value / 50) + " * 50 currency");
        Handler next = getNext();
        if (next != null){
            getNext().process(value % 50);
        }
    }
}
