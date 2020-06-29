public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] n = new int[x][y];
        solution(n, x, y);
        System.out.println(n[x - 1][y - 1]);
    }
