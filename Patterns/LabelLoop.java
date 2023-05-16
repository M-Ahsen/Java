class LabelLoop {
    public static void main(String args[]) {
    System.out.println("Print decreasing stars using Label Loop: ");
    int i,j;
    Loop1:
        for(i=1;i<=5;i++) {
            System.out.println("");
	        for(j=1;j<=5;j++) {
                System.out.print("* ");
	            if(i==j) {
	                continue Loop1;
                }
            }
        }
    }   
}