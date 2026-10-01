class Remove9 {
    public static void main(String[] args) {
        int N = 80;
        int ans = 0;
        int place = 1;
        while (N > 0) {
            int digit = N % 9;
            ans = ans + digit * place;
            N = N / 9;
            place = place * 10;
        }
        System.out.println(ans);
    }
}