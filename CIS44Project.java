
package cis44project;


public class CIS44Project
{

    public static void main(String[] args)
    {
        FullStockList fullStockList = new FullStockList();
        //fullStockList.sortByTicker();
        StockQueue stockQueue = new StockQueue();
        stockQueue.enqueue(fullStockList.getStockList()[0]);
        stockQueue.enqueue(fullStockList.getStockList()[1]);
        stockQueue.enqueue(fullStockList.getStockList()[2]);
        stockQueue.enqueue(fullStockList.getStockList()[3]);
        stockQueue.enqueue(fullStockList.getStockList()[4]);
        stockQueue.enqueue(fullStockList.getStockList()[5]);

        System.out.println(stockQueue.getFront());

        System.out.println(stockQueue.dequeue());
        System.out.println(stockQueue.dequeue());
        System.out.println(stockQueue.dequeue());
        System.out.println(stockQueue.dequeue());
        System.out.println(stockQueue.dequeue());
    }

}