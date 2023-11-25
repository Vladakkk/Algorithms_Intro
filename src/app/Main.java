package app;

public class Main {
    public static void main(String[] args) {

        double[] prices = {11.98, 23.69, 34.72, 12.56, 16.38, 37.93, 19.42};

        for (int i = 0; i < prices.length; i++){
            for (int j = 1; j < (prices.length- i); ++j){
                if (prices[j - 1] > prices[j]){
                    double temp = prices[j - 1];
                    prices[j - 1] = prices[j];
                    prices[j] = temp;
                }
            }
        }

        System.out.println("Sorted data: ");
        for (double price : prices){
            System.out.print(price + " ");
        }

        double sum = 0;
        for (double price : prices) {
            sum += price;
        }
        double result = sum/ prices.length;
        System.out.printf("\nAverage price: %.3f", result);
    }
}

