package cis44project;

public class Stock implements Comparable<Stock>{
    private String name;
    private String ticker;
    private double price;
    private int numberOfShares;

    public Stock()
    {
        name = "";
        ticker = "";
        price = 0.0;
    }

    public Stock(String name, String ticker, double price, int numberOfShares)
    {
        this.name = name;
        this.ticker = ticker;
        this.price = price;
        this.numberOfShares = numberOfShares;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getTicker()
    {
        return ticker;
    }

    public int getNumberOfShares()
    {
        return numberOfShares;
    }

    public void setTicker(String ticker)
    {
        this.ticker = ticker;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    public void setShares(int numberOfShares)
    {
        this.numberOfShares = numberOfShares;
    }

    public double getEquity()
    {
        return price * numberOfShares;
    }
    public int compareTo(Stock other)
    {
        if(this.equals(other))
            return 0;
        else if(getPrice() > other.getPrice())
            return 1;
        else
            return -1;
    } // the lower the value, the higher the priority

    @Override
    public String toString()
    {
        String str = "";
        str += this.name + " " + this.ticker + "   $" + this.price;
        return str;
    }
}
