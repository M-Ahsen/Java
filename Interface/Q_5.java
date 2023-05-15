interface Printable {  
    void print();  
} 
 
interface Showable {  
    void print();  
}  
  
class Q_5 implements Printable, Showable {  
    public void print() {
        System.out.println("Hello");
    }  

    public static void main(String args[]) {  
        Q_5 obj = new Q_5();  
        obj.print();  
    }  
}  