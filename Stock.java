package cis44project;

public class Stock
{
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

    public double getEquity()
    {
        return price * numberOfShares;
    }

    @Override
    public String toString()
    {
        String str = "";
        str += this.name + " " + this.ticker + "   $" + this.price;
        return str;
    }
}
