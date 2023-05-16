interface Printable {  
    void print();  
} 

interface Showable extends Printable {  
    void show();  
}  

class Q_6 implements Showable {  
    public void print() {
        System.out.println("Hello");
    }
      
    public void show() {
        System.out.println("Welcome");
    }  
  
    public static void main(String args[]) {  
        Q_6 obj = new Q_6();  
        obj.print();  
        obj.show();  
    }  
}  