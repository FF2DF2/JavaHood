package cis44project;

public class StockSort 
{
    public static void selectionSortAscending(Stock[] a, int n, SortingCategory sc)
    {
        for(int index = 0; index < n - 1; index++)
        {
            int indexOfNextSmallest = getIndexOfSmallest(a, index, n-1, sc);
            swap(a, index, indexOfNextSmallest);
        }
    }
    
    public static void selectionSortDescending(Stock[] a, int n, SortingCategory sc)
    {
        for(int index = 0; index < n - 1; index++)
        {
            int indexOfNextLargest = getIndexOfLargest(a, index, n-1, sc);
            swap(a, index, indexOfNextLargest);
        }
    }
    
    private static int getIndexOfSmallest(Stock[] a, int first, int last, SortingCategory sc)
    {
        Stock min = a[first];
        int indexOfMin = first;
        for(int index = first + 1; index <= last; index++)
        {
            if(sc == SortingCategory.STOCKNAME)
            {
                if (a[index].getName().compareTo(min.getName()) < 0)
                {
                    min = a[index];
                    indexOfMin = index;
                }
            }
            if(sc == SortingCategory.SHARES)
            {
            		if (a[index].getNumberOfShares() < min.getNumberOfShares())
                {
                    min = a[index];
                    indexOfMin = index;
                }
            }
            if(sc == SortingCategory.STOCKPRICE)
            {
                if (a[index].getPrice() < min.getPrice())
                {
                    min = a[index];
                    indexOfMin = index;
                }
            }
            if(sc == SortingCategory.STOCKTICKER)
            {
                if (a[index].getTicker().compareTo(min.getTicker()) < 0)
                {
                    min = a[index];
                    indexOfMin = index;
                }
            }
            if(sc == SortingCategory.EQUITY)
            {
                if (a[index].getEquity() < min.getEquity())
                {
                    min = a[index];
                    indexOfMin = index;
                }
            }
        }
        return indexOfMin;
    }
    private static int getIndexOfLargest(Stock[] a, int first, int last, SortingCategory sc)
    {
        Stock max = a[first];
        int indexOfMax = first;
        for(int index = first + 1; index <= last; index++)
        {
            if(sc == SortingCategory.STOCKNAME)
            {
                if (a[index].getName().compareTo(max.getName()) > 0)
                {
                    max = a[index];
                    indexOfMax = index;
                }
            }
            if(sc == SortingCategory.SHARES)
            {
            		if (a[index].getNumberOfShares() > max.getNumberOfShares())
                {
                    max = a[index];
                    indexOfMax = index;
                }
            }
            if(sc == SortingCategory.STOCKPRICE)
            {
                if (a[index].getPrice() > max.getPrice())
                {
                    max = a[index];
                    indexOfMax = index;
                }
            }
            if(sc == SortingCategory.STOCKTICKER)
            {
                if (a[index].getTicker().compareTo(max.getTicker()) > 0)
                {
                    max = a[index];
                    indexOfMax = index;
                }
            }
            if(sc == SortingCategory.EQUITY)
            {
                if (a[index].getEquity() > max.getEquity())
                {
                    max = a[index];
                    indexOfMax = index;
                }
            }
        }
        return indexOfMax;
    }
    private static void swap(Stock[] a, int i, int j)
    {
        Stock temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
