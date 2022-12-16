package atm;

public class Handler5 extends Handler{
    @Override
    public void process(int value){
        System.out.println((value / 5) + " * 5 currency");
        Handler next = getNext();
        if (next != null){
            getNext().process(value % 5);
        }
    }
}
