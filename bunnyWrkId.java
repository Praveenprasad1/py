class bunnyWrkId {
    static int N = 15;
    public static void main (String[] args) {
        System.out.println("Working.");
        solution();
    }

    static void solution () {
        System.out.println("From Solution()");
        int initVal = 1;
        int[][] arr = new int[N][N];
        arr[0][0] = initVal;
        for (int i = 1; i < N; i++) {
            // Init data seeding
            //initVal += i;
            arr[0][i] = i + arr[0][i - 1] + 1;
        }
        testDisp(arr, 1);
        for (int i = 1; i < N; i++)
            for (int j = 0; j < N - i; j++) {
                arr[i][j] = arr[i - 1][j + 1] - 1;
            }
        System.out.println("Displaying full bunny workshop:");
        revDisp(arr, N);
    }
    static void testDisp (int[][] arr, int uptoRow) {
        for (int row = 0; row < uptoRow; row++) {
            for (int col = 0; col < N - row; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
    static void revDisp (int[][] arr, int uptoRow) {
        for (int row = uptoRow - 1; row >= 0; row--) {
            for (int col = 0; col < N - row; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}