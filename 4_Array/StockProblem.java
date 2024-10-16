class StockProblem {
  public static void main(String[] args) {
    int stock[] = {25, 45, 60, 55, 35, 20, 35, 65, 85, 90, 100, 55, 10};
    int min = stock[0], max = stock[1];
    int min_index = 0, max_index = stock.length - 1;
    for (int i = 0; i < stock.length; i++) {
      if (stock[i] > max) {
        max = stock[i];
        max_index = i;
      }
    }

    for (int j = 0; j < max_index; j++) {
      if (stock[j] < min) {
        min = stock[j];
        min_index = j;
      }
    }
    System.out.println("Maximum profit will be "+(max-min));
    System.out.println("Buy the stock at "+min_index+" minute and sell it at "+max_index+" minute..");
  }
}
