interface Bank {  
    float rateOfInterest();  
}  

class MCB implements Bank {  
    public float rateOfInterest() {return 9.15f;
    }  
}  

class HBL implements Bank {  
    public float rateOfInterest() {return 9.7f;
    }  
}  

class Q_3 {  
    public static void main(String[] args) {  
        Bank b;
        b=new MCB();  
        System.out.println("MCB: "+b.rateOfInterest());
        b=new HBL();  
        System.out.println("HBL: "+b.rateOfInterest());  
    }
}  