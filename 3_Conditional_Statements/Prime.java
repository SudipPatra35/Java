class Prime {
    public static void main(String[] args) {
        int n = 15;
        int i = 2;
        int flag = 0;
        if (n == 1) {
            System.out.println("Not Prime");
        }
        else {
            while (i < n) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
                i = i + 1;

            }
        }
        if (flag == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

    }
}