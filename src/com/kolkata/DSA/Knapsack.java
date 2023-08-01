package com.kolkata.DSA;

public class Knapsack {

	public static void main(String[] args) {
		int knapsack = 10;
		int[] profit = { 5, 11, 13 };
		int[] weight = { 2, 4, 6 };
		int result = maxKanpsack(profit, weight, knapsack, true);
		System.out.println(result);
	}

	public static int maxKanpsack(int[] profit, int[] weight, int knapsack, boolean isMultiSelectionAllowed) {
		int result = 0;
		if (isMultiSelectionAllowed) {
			int length = profit.length;
			/**
			 * copyOfWeight is used to sort data of weight
			 */
			int[] copyOfWeight = new int[length];
			/**
			 * minWeight is used to get smallest weight to accumulate while loop from
			 * copyOfWeight
			 */
			int minWeight = -1;
			double[] effeciency = new double[length];
			for (int i = 0; i < length; i++) {
				effeciency[i] = (double) profit[i] / weight[i];
			}

			for (int i = 0; i < length; i++) {
				copyOfWeight[i] = weight[i];
			}

			for (int i = 0; i < length; i++) {
				for (int j = i + 1; j < length; j++) {
					/**
					 * Sorting based on efficiency and mapping weight and price with same index
					 */
					if (effeciency[i] < effeciency[j]) {
						double temp = effeciency[i];
						effeciency[i] = effeciency[j];
						effeciency[j] = temp;

						int profitTemp = profit[i];
						profit[i] = profit[j];
						profit[j] = profitTemp;

						int weightTemp = weight[i];
						weight[i] = weight[j];
						weight[j] = weightTemp;
					}
					if (copyOfWeight[i] > copyOfWeight[j]) {
						int temp = copyOfWeight[i];
						copyOfWeight[i] = copyOfWeight[j];
						copyOfWeight[j] = temp;
					}
				}
				// System.out.println(i+" " +effeciency[i]+" " +profit[i] +" " +weight[i]);
			}
			minWeight = copyOfWeight[0];
			int i = 0;
			while (knapsack >= minWeight) {
				int q = knapsack / weight[i];
				int r = knapsack % weight[i];
				result += profit[i] * q;
				knapsack = r;
				i++;
			}

			return result;
		} else {
			return result;
		}
	}

}
