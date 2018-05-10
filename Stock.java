package cis44project;

public class Stock
{
    private String name;
    private String ticker;
    private double price;

    public Stock()
    {
        name = "";
        ticker = "";
        price = 0.0;
    }

    public Stock(String name, String ticker, double price)
    {
        this.name = name;
        this.ticker = ticker;
        this.price = price;
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

    public void setTicker(String ticker)
    {
        this.ticker = ticker;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        String str = "";
        str += this.name + " " + this.ticker + "   $" + this.price;
        return str;
    }
}