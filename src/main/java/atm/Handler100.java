package atm;

public class Handler100 extends Handler{
    @Override
    public void process(int value){
        System.out.println((value / 100) + " * 100 currency");
        Handler next = getNext();
        if (next != null){
            getNext().process(value % 100);
        }
    }
}
