package atm;

public class Handler20 extends Handler{
    @Override
    public void process(int value){
        System.out.println((value / 20) + " * 20 currency");
        Handler next = getNext();
        if (next != null){
            getNext().process(value % 20);
        }
    }
}
