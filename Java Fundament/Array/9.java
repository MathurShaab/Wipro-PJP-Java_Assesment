public class Main {
    public static void main(String[] args) {
        int[] numbers = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();

        ArrayList withoutTen = new ArrayList();
        for (int number : numbers) {
            if (number != 10)
                withoutTen.add(number);
        }

        while (numbers.length > withoutTen.size()) {
            withoutTen.add(0);
        }
        withoutTen.forEach(x -> System.out.print(x + " "));
    }
}