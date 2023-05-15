abstract class Bank {    
    abstract int getRateOfInterest();    
} 

class MCB extends Bank {    
    int getRateOfInterest() {
        return 7;
    }    
}  

class UBL extends Bank {    
    int getRateOfInterest() {
        return 8;
    }    
}    
    
class Q_3 {    
    public static void main(String args[]){    
        Bank b;  
        b=new MCB();  
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+"%");    
        b=new UBL();  
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+"%");    
    }       
}    