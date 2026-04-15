class Table {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number");
            return;
        }

        int n = Integer.parseInt(args[0]);

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
