public class Reduce {
    public static void main(String[] args) {
        int n = 150;
        int dd = getDd(n);
        System.out.println("This is how many time I did reduction is :" + dd);

    }

    private static int getDd(int n) {
        int dd =0;
        while(n != 0){
            if (n %2 == 0){
                n = n /2;
                dd++;
            }
            else {
                n = n - 1;
                dd++;
            }
        }
        return dd;
    }
}
