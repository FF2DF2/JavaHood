package cis44project;

public class StockSort
{
    public static void selectionSort(Stock[] a, int n, SortingCategory sc)
    {
        for(int index = 0; index < n - 1; index++)
        {
            int indexOfNextSmallest = getIndexOfSmallest(a, index, n-1, sc);
            swap(a, index, indexOfNextSmallest);
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
        }
        return indexOfMin;
    }
    private static void swap(Stock[] a, int i, int j)
    {
        Stock temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}