package cis44project;


public class StockQueue
{
    private int frontIndex;
    private int backIndex;
    private Stock[] queue;
    private static final int maxCapacity = 1000;

    public StockQueue()
    {
        frontIndex = 0;
        backIndex = maxCapacity - 1;
        queue = new Stock[maxCapacity];
    }

    public void enqueue(Stock newEntry)
    {
        if(isFull())
            throw new ArrayIndexOutOfBoundsException();
        else
        {
            backIndex = (backIndex + 1) % queue.length;
            queue[backIndex] = newEntry;
        }
    }
    public Stock dequeue()
    {
        if(isEmpty())
            return null;
        Stock temp = queue[frontIndex];
        queue[frontIndex] = null;
        frontIndex = (frontIndex + 1) % queue.length;
        return temp;
    }

    public Stock getFront()
    {
        if(isEmpty())
            return null;
        return queue[frontIndex];
    }

    public boolean isEmpty()
    {
        return frontIndex == (backIndex + 1) % queue.length;
    }

    public boolean isFull()
    {
        return frontIndex == (backIndex + 2) % queue.length;
    }

    public void clear()
    {
        for(int i = 0; i < queue.length; i++)
            queue[i] = null;
        frontIndex = (backIndex + 1) % queue.length;
    }

    @Override
    public String toString()
    {
        String str = "";
        for(int i = frontIndex; i < queue.length; i++)
        {
            str += queue[i] + "\n";
        }
        return str;
    }
}