class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {22,6,3,2345,34,56,8,56,35,34,67,6,3,4,7,4};
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted array = ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}