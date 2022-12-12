package Com.Bridglabz;
import java.util.ArrayList;
import java.util.Scanner;

public class PortFolio {
	static ArrayList <StockAccountManagment> array = new ArrayList<StockAccountManagment>();

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        insertStockes();
        displayStockes();
        buyShares();
    }

    private static void insertStockes() {
        System.out.println("How much stock you want to insert ");
        int numberOfStock = scan.nextInt();
        System.out.println("Insert stock name and stock prise ");
        for (int i = 1; i <= numberOfStock; i++) {
            scan.nextLine();
            String stockName = scan.nextLine();
            int stockPrise = scan.nextInt();
            array.add(new StockAccountManagment(i, stockName, stockPrise));
        }
    }
    private static void displayStockes(){
     
        for(StockAccountManagment stock : array){
            System.out.println(stock.getNumberOfShares()+", "+stock.getStockName()+", "+stock.getSharePrize());
        }
    }
    private static void buyShares(){
        int totalValue = 0;
      
        System.out.println("How much stock buy ");
        int numberOfStock = scan.nextInt();
        String nameOfStock;
        int quantity=0;
        for (int i =1 ;i<= numberOfStock; i++){
            System.out.println("Enter "+i+ " Share Name and Quantity of Share's");
            scan.nextLine();
            nameOfStock = scan.nextLine();
            quantity = scan.nextInt();
            for (StockAccountManagment arrayStock:array ){
                if (arrayStock.getStockName().equals(nameOfStock)){
                    totalValue += (quantity * arrayStock.getSharePrize());
                }
            }
        }
        System.out.println("Total values of shares is "+totalValue);
    }
}
