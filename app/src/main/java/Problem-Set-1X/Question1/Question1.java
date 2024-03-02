public class Question1 {

    public static void main(String[] args) {
        System.out.println(addTime(6, 30, 4, 45));
        System.out.println(addTime(0, 20, 0, 30));
        System.out.println(addTime(0, 40, 0, 30));
        System.out.println(addTime(1, 30, 1, 31));
        System.out.println(addTime(6, 30, 4, 45));
    }

    static String addTime(int hour1, int min1, int hour2, int min2){
        int min = min1 + min2;
        return String.format("%d hours %d minutes", hour1 + hour2 + min/60, min%60);
    }
}
