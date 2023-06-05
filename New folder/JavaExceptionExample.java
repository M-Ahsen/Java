public class JavaExceptionExample{  
  public static void main(String args[]){  
   try{  
      //code that may raise exception  
      int data=100/0;
      System.out.println(data);  
   }
   catch(ArithmeticException arr) {
    System.out.println("e");
    }  
  
   System.out.println("rest of the code...");  
   System.out.println("rest of the code...");  
   System.out.println("rest of the code...");  
   System.out.println("rest of the code...");  
   System.out.println("rest of the code...");  
  }  
}  