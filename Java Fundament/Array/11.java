public class Main {
    public static void main(String[] args) {
        int[] numbers = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        boolean flag = true;
        for (int num : numbers) {
            if (num != 1 && num != 4) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}