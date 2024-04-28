class RecurringPatterns {
    public static void main(String[] args) {

    }

    public void one(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("a");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("a");
            System.out.println();
        }
    }

    public void two(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print(k);
            for (int l = i - 1; l >= 1; l--)
                System.out.print(l);
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print(k);
            for (int l = i; l >= 1; l--)
                System.out.print(l);
            System.out.println();
        }
    }

    public void three(int n) {
        int gap = -1;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print((char) (96 + j));
            for (int s = 1; s <= gap; s++)
                System.out.print(" ");
            if (i == n)
                for (int k = i; k >= 1; k--)
                    System.out.print((char) (96 + k));
            else
                for (int k = i; k >= 1; k--)
                    System.out.print((char) (96 + k));
            gap += 2;
            System.out.println();
        }
        gap -= 4;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print((char) (96 + j));
            for (int s = 1; s <= gap; s++)
                System.err.print(" ");
            if (i == n)
                for (int k = i - 1; k >= 1; k--)
                    System.out.print((char) (96 + k));
            else
                for (int k = i; k >= 1; k--)
                    System.out.print((char) (96 + k));
            gap -= 2;
            System.out.println();
        }
    }
}
