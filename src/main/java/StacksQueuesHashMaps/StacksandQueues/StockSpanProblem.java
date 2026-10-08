/*Stock Span Problem
Problem: For each day in a stock price array, calculate the span (number of consecutive days the price was less than or equal to the current day's price).
        Hint: Use a stack to keep track of indices of prices in descending order.
 Author: Prakhar Khare
 Date: 6-10-2026
 */
package StacksQueuesHashMaps.StacksandQueues;
// Main class
public class StockSpanProblem {

    // Method to calculate stock span
    public static int[] calculateSpan(int[] prices) {

        int n = prices.length;

        // Array to store the span of each day
        int[] span = new int[n];

        // Stack to store indices
        int[] stack = new int[n];

        // Top of stack
        int top = -1;

        // First day's span is always 1
        span[0] = 1;
        stack[++top] = 0;

        // Process remaining days
        for (int i = 1; i < n; i++) {

            // Remove indices whose prices are
            // less than or equal to current price
            while (top >= 0
                    && prices[stack[top]] <= prices[i]) {

                top--;
            }

            // If stack is empty, all previous prices
            // are less than or equal to current price
            if (top == -1) {

                span[i] = i + 1;

            } else {

                // Distance between current day and
                // previous greater price
                span[i] = i - stack[top];
            }

            // Push current day's index
            stack[++top] = i;
        }

        return span;
    }

    public static void main(String[] args) {

        // Stock prices for each day
        int[] prices = {
                100, 80, 60, 70, 60, 75, 85
        };

        // Calculate stock spans
        int[] span = calculateSpan(prices);

        System.out.println("Stock Prices and Spans:");

        for (int i = 0; i < prices.length; i++) {

            System.out.println(
                    "Day " + (i + 1)
                            + " | Price: " + prices[i]
                            + " | Span: " + span[i]
            );
        }
    }
}
