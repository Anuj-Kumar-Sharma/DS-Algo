package interviewQuestions;

import java.util.*;

public class SlidingWindowMaximum {

	public static void main(String[] args) {

		Solution solution = new Solution();
		int a[] = { 4, 3, 1, 2, 5, 3, 4, 7, 1, 9 };
		int ans[] = solution.maxSlidingWindow(a, 4);

		for (int x : ans) {
			System.out.print(x + " ");
		}
	}

	static class Solution {
		public int[] maxSlidingWindow(int[] a, int k) {
			int n = a.length;

			if (n == 0) {
				return a;
			}

			Deque<Integer> dq = new LinkedList<>();
			int ans[] = new int[n - k + 1];

			int i = 0;
			for (; i < k; i++) {
				// Adding the index of element in decreasing order of the number present at the
				// index till k
				/*
				 * If a number at index 2 is greater than the number at index 1 then remove the
				 * index 1 and add 2 at the place
				 */
				/*
				 * Keep on removeing the index till the number at the index you want to insert
				 * is greater than the present index number in the dqueue
				 */
				while (!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
					dq.removeLast();
				}
				dq.addLast(i);
			}

			for (; i < n; i++) {
				// Adding the max value in first window to answer array
				ans[i - k] = a[dq.peekFirst()];

				// Chechking if the index in the queue is out of the window we are current in.
				// If yes remove the the index from the front
				while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
					dq.removeFirst();
				}

				/*
				 * Doing the same thing of chechking the value of current index is greater than
				 * the value of index present in the dequeue
				 */
				while (!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
					dq.removeLast();
				}
				dq.addLast(i);
			}

			ans[i - k] = a[dq.peekFirst()];

			// Returning the ans Array.
			return ans;
		}
	}
}
