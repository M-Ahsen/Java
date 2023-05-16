public class CalYears {
    public static void main(String[] args) {
        int minutes = 80000;
        int years = minutes / (60 * 24 * 365);
        int days = (minutes % (60 * 24 * 365)) / (60 * 24);
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}