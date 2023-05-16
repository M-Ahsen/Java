class Arrays {
    public static void main(String args[]) {
        char[] arr1 = {'L', 'a', 'h', 'o', 'r', 'e'};
        int[] arr2 = {1, 2, 3, 4, 5,6};     
        String[] arr3 = {"L", "a", "h", "o","r","e"};   
        System.out.println(arr1);//Print valve
        System.out.println(arr2);//Print adress
        System.out.println(arr3);//Print adress
        double max = arr2[0];
        int indexOfMax = 0;
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] > max) {
                max = arr2[i];
                indexOfMax = i;
            }
        }
    System.out.println("Maximum = "+max+"\nMax arr indrx = "+indexOfMax);    
    }
}