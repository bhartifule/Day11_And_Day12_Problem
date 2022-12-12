package Com.Bridglabz;

public class StockAccountManagment {
	private String stockName;
    private int numberOfShares;
    private int sharePrize;
    private int totalValueOfStock;
    private int valueOfStock;

    public int getValueOfStock() {
        return valueOfStock;
    }

    public StockAccountManagment() {
    }

    public StockAccountManagment(int numberOfShares, String stockName, int sharePrize) {
        this.stockName = stockName;
        this.numberOfShares = numberOfShares;
        this.sharePrize = sharePrize;
    }

    public void setValueOfStock(int valueOfStock) {
        this.valueOfStock = valueOfStock;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public int getSharePrize() {
        return sharePrize;
    }

    public void setSharePrize(int sharePrize) {
        this.sharePrize = sharePrize;
    }

    public int getTotalValueOfStock() {
        return totalValueOfStock;
    }

    public void setTotalValueOfStock(int totalValueOfStock) {
        this.totalValueOfStock = totalValueOfStock;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockName='" + stockName + '\'' +
                ", numberOfShares=" + numberOfShares +
                ", sharePrize=" + sharePrize +
                ", totalValueOfStock=" + totalValueOfStock +
                ", valueOfStock=" + valueOfStock +
                '}';
    }
}
