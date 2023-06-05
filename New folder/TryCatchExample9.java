public class TryCatchExample9 {  
  
    public static void main(String[] args) {  
       
       
        try  
        {  
        int arr[]= {1,3,5,7};  
        System.out.println(arr[10]); //may throw exception   
        }

            // handling the array exception  
        catch(Exception e)  
        {  
            System.out.println(e);  
        }  





        System.out.println("Counting 1-10"); 
        for(int i=1;i<11;i++){
            System.out.print(i+"\t");
        } 
    }  
      
}  