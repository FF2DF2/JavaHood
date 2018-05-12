package cis44project;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FullStockList
{
    Stock[] allStocks;

    public FullStockList()
    {
        allStocks = new Stock[]
                {
                        new Stock("Alibaba Group Holding ADR",  "BABA", 188.89, 5),
                        new Stock("Bank of America",  "BAC", 29.30, 2),
                        new Stock("Pandora Media",  "P", 6.89, 16),
                        new Stock("General Electric",  "GE", 14.10, 410),
                        new Stock("Snap",  "SNAP", 10.79, 100),
                        new Stock("Ford Motor",  "F", 11.36, 70),
                        new Stock("Chesapeake Energy",  "CHK", 3.05, 2),
                        new Stock("AT&T",  "T", 32.14, 10),
                        new Stock("Southwestern Energy",  "SWN", 4.03, 6),
                        new Stock("McDermott International",  "MDR", 6.66, 45),
                        new Stock("Ambev ADR",  "ABEV", 6.33, 23),
                        new Stock("Nokia ADR",  "NOK", 6.10, 67),
                        new Stock("Sprint",  "S", 5.28, 12),
                        new Stock("Twitter",  "TWTR", 31.04, 14),
                        new Stock("Teva Pharmaceutical Industries ADR",  "TEVA", 17.83, 3),
                        new Stock("Vale ADR",  "VALE", 14.08, 2),
                        new Stock("AK Steel Holding",  "AKS", 4.53, 1),
                        new Stock("Pfizer",  "PFE", 34.84, 53),
                        new Stock("KKR",  "KKR", 23.00, 10),
                        new Stock("Wells Fargo",  "WFC", 52.41, 132),
                        new Stock("Marathon Oil",  "MRO", 19.72, 15),
                        new Stock("Petroleo Brasileiro ADR",  "PBR", 13.69, 6),
                        new Stock("Telsa Inc",  "TSLA", 301.06, 3),
                        new Stock("Weatherford International",  "WFT", 2.97, 12),
                        new Stock("Freeport-McMoRan",  "FCX", 15.42, 34),
                        new Stock("Parsley Energy Cl A",  "PE", 31.92, 22),
                        new Stock("First Data Cl A",  "FDC", 19.08, 12),
                        new Stock("J.C. Penney",  "JCP", 2.89, 11),
                        new Stock("Transocean",  "RIG", 12.08, 8),
                        new Stock("Kinder Morgan",  "KMI", 16.11, 88),
                        new Stock("Encana",  "ECA", 13.16, 134),
                        new Stock("Fluor",  "FLR", 45.76, 2),
                        new Stock("American International Group",  "AIG", 52.84, 34),
                        new Stock("Citigroup",  "C", 67.94, 56),
                        new Stock("Zayo Group Holdings",  "ZAYO", 32.97, 27),
                        new Stock("JPMorgan Chase",  "JPM", 108.43, 2),
                        new Stock("Newell Brands",  "NWL", 27.65, 14),
                        new Stock("CVS Health",  "CVS", 63.10, 3),
                        new Stock("United States Steel",  "X", 34.52, 4),
                        new Stock("Itau Unibanco Holding ADR",  "ITUB", 13.44, 2),
                        new Stock("VEREIT",  "VER", 6.94, 2),
                        new Stock("WPX Energy",  "WPX", 17.78, 45),
                        new Stock("Denbury Resources",  "DNR", 3.40, 34),
                        new Stock("Morgan Stanley",  "MS", 51.40, 27),
                        new Stock("Oracle",  "ORCL", 45.71, 10),
                        new Stock("Verizon Communications",  "VZ", 48.19, 20),
                        new Stock("Square Cl A",  "SQ", 49.10, 39),
                        new Stock("Coca-Cola",  "KO", 42.36, 10),
                        new Stock("Cleveland-Cliffs",  "CLF", 7.69, 3),
                        new Stock("Babcock&Wilcox Enterprises",  "BW", 2.65, 5),
                        new Stock("Oasis Petroleum",  "OAS", 11.22, 10),
                        new Stock("Annaly Capital Management",  "NLY", 10.35, 1),
                        new Stock("NRG Energy",  "NRG", 33.30, 1),
                        new Stock("Walt Disney",  "DIS", 101.15, 4),
                        new Stock("Exxon Mobil",  "XOM", 76.90, 5),
                        new Stock("Taiwan Semiconductor Manufacturing ADR",  "TSM", 38.59, 7),
                        new Stock("Yamana Gold",  "AUY", 2.93, 5),
                        new Stock("Blue Apron Holdings Cl A",  "APRN", 2.44, 5),
                        new Stock("Regions Financial",  "RF", 18.72, 23),
                        new Stock("Vistra Energy",  "VST", 23.01, 45),
                        new Stock("Sysco",  "SYY", 62.29, 1),
                        new Stock("CBS Cl B",  "CBS", 53.17, 3),
                        new Stock("Kinross Gold",  "KGC", 4.03, 1),
                        new Stock("MGM Resorts International",  "MGM", 31.86, 12),
                        new Stock("Hanesbrands",  "HBI", 16.81, 7),
                        new Stock("CenterPoint Energy",  "CNP", 26.39, 3),
                        new Stock("Nabors Industries",  "NBR", 7.54, 6),
                        new Stock("ENSCO",  "ESV", 5.81, 7),
                        new Stock("Procter&Gamble",  "PG", 72.43, 54),
                        new Stock("CenturyLink",  "CTL", 18.49, 3),
                        new Stock("Merck&Co",  "MRK", 57.75, 67),
                        new Stock("MetLife",  "MET", 46.23, 22),
                        new Stock("Cemex ADR",  "CX", 5.96, 23),
                        new Stock("DowDuPont",  "DWDP", 64.47, 56),
                        new Stock("Cardinal Health",  "CAH", 53.01, 34),
                        new Stock("ICICI Bank ADR",  "IBN", 8.47, 16),
                        new Stock("Host Hotels&Resorts",  "HST", 19.84, 15),
                        new Stock("Juniper Networks",  "JNPR", 25.66, 12),
                        new Stock("KeyCorp",  "KEY", 19.70, 1),
                        new Stock("Walmart",  "WMT", 87.53, 12),
                        new Stock("Shake Shack Cl A",  "SHAK", 55.95, 13),
                        new Stock("Macy's",  "M", 31.24, 12),
                        new Stock("California Resources",  "CRC", 31.58, 15),
                        new Stock("Williams",  "WMB", 26.19, 13),
                        new Stock("Boardwalk Pipeline Partners",  "BWP", 9.56, 23),
                        new Stock("Altria Group",  "MO", 56.26, 10),
                        new Stock("General Motors",  "GM", 36.71, 6),
                        new Stock("HP",  "HPQ", 21.68, 5),
                        new Stock("Vipshop Holdings ADR",  "VIPS", 15.75, 5),
                        new Stock("Devon Energy",  "DVN", 37.87, 5),
                        new Stock("Barrick Gold",  "ABX", 13.47, 13),
                        new Stock("Halliburton",  "HAL", 52.19, 20),
                        new Stock("Kroger",  "KR", 24.14, 16),
                        new Stock("Callon Petroleum",  "CPE", 13.55, 12),
                        new Stock("Newfield Exploration",  "NFX", 27.34, 15),
                        new Stock("General Mills",  "GIS", 42.54, 10),
                        new Stock("ConocoPhillips",  "COP", 66.86, 6),
                        new Stock("Hewlett Packard Enterprise",  "HPE", 17.21, 5),
                        new Stock("Bristol-Myers Squibb",  "BMY", 51.33, 3),
                        new Stock("U.S. Bancorp",  "USB", 50.34, 3),
                        new Stock("Johnson&Johnson",  "JNJ", 124.19, 1),


                }; // end allStocks declaration

    }

    public Stock[] getStockList()
    {
        return allStocks;
    } // end getStockList


    public void sortByName()
    {
        System.out.println("Sorting By Name");
        StockSort.selectionSortAscending(allStocks, allStocks.length, SortingCategory.STOCKNAME);
        showArray(allStocks);

    } // end sortByName

    public String getStockTickers()
    {
        String s = "";
        for(int i = 0; i < allStocks.length; i++)
            s += allStocks[i].getTicker() + "\n";
        return s;

    } // end getStockTickers

    public String getShares()
    {
        String s = "";
        for(int i = 0; i < allStocks.length; i++)
            s += allStocks[i].getNumberOfShares() + "\n";
        return s;

    } // end getShares

    public String getPriceOfStock()
    {
        DecimalFormat df = new DecimalFormat("#.##");
        String s = "";
        for(int i = 0; i < allStocks.length; i++)
        {
            double d = allStocks[i].getPrice();
            s += df.format(d) + "\n";
        } // end for
        return s;
    } // end getPriceOfStock

    public String getEquity()
    {
        DecimalFormat df = new DecimalFormat("#.##");
        String s = "";
        for(int i = 0; i < allStocks.length; i++)
        {
            double d = allStocks[i].getEquity();
            s += df.format(d) + "\n";
        } // end for
        return s;
    } // end getEquity

    public int getNumberOfStocks()
    {
        return allStocks.length;
    } // end getNumberOfStocks

    public void sortByPrice()
    {
        System.out.println("Sorting By Price");
        StockSort.selectionSortAscending(allStocks, allStocks.length, SortingCategory.STOCKPRICE);
        showArray(allStocks);
    } // end sortByPrice

    public void sortByTicker()
    {
        System.out.println("Sorting By Ticker");
        StockSort.selectionSortAscending(allStocks, allStocks.length, SortingCategory.STOCKTICKER);
        showArray(allStocks);
    } // end sortByTicker

    public void sortByShares()
    {
        System.out.println("Sorting By Shares");
        StockSort.selectionSortAscending(allStocks, allStocks.length, SortingCategory.SHARES);
        showArray(allStocks);
    } // end sortByShares

    public void sortByEquity()
    {
        System.out.println("Sorting By Equity");
        StockSort.selectionSortAscending(allStocks, allStocks.length, SortingCategory.EQUITY);
        showArray(allStocks);
    } // end sortByEquity

    public void sortByTickerDescending()
    {
        System.out.println("Sorting By Ticker Descending");
        StockSort.selectionSortDescending(allStocks, allStocks.length, SortingCategory.STOCKTICKER);
        showArray(allStocks);
    } // end sortByTickerDescending

    public void sortBySharesDescending()
    {
        System.out.println("Sorting By Shares Descending");
        StockSort.selectionSortDescending(allStocks, allStocks.length, SortingCategory.SHARES);
        showArray(allStocks);
    } // end sortBySharesDescending

    public void sortByEquityDescending()
    {
        System.out.println("Sorting By Equity Descending");
        StockSort.selectionSortDescending(allStocks, allStocks.length, SortingCategory.EQUITY);
        showArray(allStocks);
    } // end sortByEquityDescending

    public String getTotalEquity()
    {
        double sum = 0;
        for(int i = 0; i < allStocks.length; i++)
        {
            sum += allStocks[i].getEquity();
        }
        //DecimalFormat df = new DecimalFormat("#.##");
        //return df.format(sum);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        return numberFormat.format(sum);

    } // end getTotalEquity

    private static <T> void showArray(T[]array)
    {
        for(int i = 0; i< array.length; i++)
            System.out.println(array[i]);
    } // end showArray
} // end class
