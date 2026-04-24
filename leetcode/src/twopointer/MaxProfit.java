package twopointer;

public class MaxProfit {
	public static void main(String[] args) {
		int[] prices = {7, 1, 5, 3, 6, 4};
		System.out.println(maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices) {
		
		int minPrice = Integer.MAX_VALUE;
		int maxProfit=0;
		int profit=0;
		for(int price:prices) {			
			if(price< minPrice) {
				minPrice = Math.min(price, minPrice);				
			}else {
				profit = price-minPrice;
				maxProfit = Math.max(maxProfit, profit);
			}
			
		}
		return maxProfit;
		
	}

}
