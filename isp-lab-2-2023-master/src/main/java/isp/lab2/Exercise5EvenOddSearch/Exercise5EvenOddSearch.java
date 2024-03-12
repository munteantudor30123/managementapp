package isp.lab2.Exercise5EvenOddSearch;

public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {

        String[] numbersStr = input.split(",");
        int[] numbers = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i].trim());
        }

        // Find the largest even number and the smallest odd number along with their positions
        int largestEven = Integer.MIN_VALUE;
        int smallestOdd = Integer.MAX_VALUE;
        int largestEvenPosition = -1;
        int smallestOddPosition = -1;


        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num % 2 == 0 && num > largestEven) {
                largestEven = num;
                largestEvenPosition = i;
            } else if (num % 2 != 0 && num < smallestOdd) {
                smallestOdd = num;
                smallestOddPosition = i;
            }
        }

        return new int[] { largestEven, largestEvenPosition, smallestOdd, smallestOddPosition };
    }


    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        int[] result = findEvenOdd(input);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
