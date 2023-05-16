class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

class MCB extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class UBL extends Bank {
    int getRateOfInterest() {
        return 10;
    }
}

class HBL extends Bank {
    int getRateOfInterest() {
        return 12;
    }
}

class BankInterest {
    public static void main(String[] args) {
        MCB m = new MCB();
        UBL u = new UBL();
        HBL h = new HBL();        
        System.out.println("MCB Rate of interest: " + m.getRateOfInterest());
        System.out.println("UBL Rate of interest: " + u.getRateOfInterest());
        System.out.println("HBL Rate of interest: " + h.getRateOfInterest());
    }
}