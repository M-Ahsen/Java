public class BooleanValue {
    private boolean x ;

    private int convert() {
        return x ? 1 : 0;
    }

    public static void main(String[] args) {
        BooleanValue object = new BooleanValue();
        boolean y = true;
        System.out.println(y);
        System.out.println(object.x);
        System.out.println(object.convert());
    } 
}