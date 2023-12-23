import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int N = scanner.nextInt();

        int[] cards = new int[N];
        System.out.println("Enter the numbers on the front face of the cards:");
        for (int i = 0; i < N; i++) {
            cards[i] = scanner.nextInt();
        }

        int maxSum = findMaxSum(cards);
        System.out.println("Maximum sum of front face numbers: " + maxSum);
    }

    public static int findMaxSum(int[] cards) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        // Calculate the sum of the front face numbers without flipping any cards
        for (int i = 0; i < cards.length; i++) {
            currentSum += cards[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        // Calculate the sum of the front face numbers after flipping one or more cards
        int totalSum = 0;
        for (int i = 0; i < cards.length; i++) {
            totalSum += cards[i];
            cards[i] = -cards[i]; // Flip the card
            currentSum = 0;
            for (int j = 0; j < cards.length; j++) {
                currentSum += cards[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                if (currentSum < 0) {
                    currentSum = 0;
                }
            }
            cards[i] = -cards[i]; // Flip the card back to its original state
        }

        return Math.max(maxSum, totalSum);
    }
}

/*Explanation:
The code prompts the user to enter the number of players (N) and the numbers on the front face of the cards. It then calls the findMaxSum method to calculate the maximum sum of the front face numbers.

The findMaxSum method uses Kadane's algorithm to find the maximum sum of a subarray within the given array. It first calculates the maximum sum without flipping any cards by iterating over the array once. It keeps track of the current sum, resetting it to 0 whenever it becomes negative.

Next, it calculates the maximum sum after flipping one or more cards. It iterates over each card, flips it (by changing its sign), and recalculates the maximum sum using Kadane's algorithm again. After each iteration, it flips the card back to its original state.

Finally, it returns the maximum sum considering both cases: without flipping any cards and after flipping one or more cards.

Note: The code assumes that the input values are within the range of integers. You may need to add additional input validation if necessary.*/