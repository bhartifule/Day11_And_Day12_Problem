package Com.Bridglabz;
import java.util.ArrayList;
import java.util.Scanner;

public class PortFolio {
	static ArrayList <StockAccountManagment> array = new ArrayList<StockAccountManagment>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        insertStockes();
        displayStockes();
        buyShares();
    }

    private static void insertStockes() {
        System.out.println("How much stock you want to insert ..!");
        int numberOfStock = sc.nextInt();
        System.out.println("Insert stock name and stock prise  ");
        for (int i = 1; i <= numberOfStock; i++) {
            sc.nextLine();
            String stockName = sc.nextLine();
            int stockPrise = sc.nextInt();
            array.add(new StockAccountManagment(i, stockName, stockPrise));
        }
    }
    private static void displayStockes(){
        //System.out.println(array.toString());
        for(StockAccountManagment stock : array){
            System.out.println(stock.getNumberOfShares()+", "+stock.getStockName()+", "+stock.getSharePrize());
        }
    }
    private static void buyShares(){
        int totalValue = 0;
       // ArrayList <Stock> array1 = new ArrayList<Stock>();
        System.out.println("How much stock you want to buy ..!");
        int numberOfStock = sc.nextInt();
        String nameOfStock;
        int quantity=0;
        for (int i =1 ;i<= numberOfStock; i++){
            System.out.println("Enter "+i+ " Share Name and Quantity of Share's ");
            sc.nextLine();
            nameOfStock = sc.nextLine();
            quantity = sc.nextInt();
            for (StockAccountManagment arrayStock:array ){
                if (arrayStock.getStockName().equals(nameOfStock)){
                    totalValue += (quantity * arrayStock.getSharePrize());
                }
            }
        }
        System.out.println("Total values of shares is "+totalValue);
    }
}
