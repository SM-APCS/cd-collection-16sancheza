
package cdcollection;
import java.text.NumberFormat;
import cdcollection.CD;

/**
 * AP Computer Science
 * @author Mr. Tholking
 * 
 */
public class CdCollection {
    private CD[] collection;
    public static int count;
    private double totalCost;
    
    //Creates an initially empty collection.
    public CdCollection()
    {
        collection = new CD[100];
        count = 0;
        totalCost = 0.0;
    }
    
    
    //Adds a CD to the collection, increasing the size of the collection
    //if necessary.
    public void addCD (String title, String artist, double cost, int tracks)
    {
        if (count == collection.length)
            increaseSize();
        
        collection[count] = new CD (title, artist, cost, tracks);
        totalCost += cost;
        count++;
    }
    
    //Returns a report describing the CD collection.
    public String toString()
    {
        Sorts.selectionSort(collection);
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        String report = "***********************************\n";
        report += "My CD Collection \n\n";
        
        report += "Number of CDs: " + count + "\n";
        report += "Total cost: " + fmt.format(totalCost) + "\n";
        report += "Average cost: " + fmt.format(totalCost/count);
        
        report += "\n\nCD List: \n\n";
        
        for (int cd = 0; cd < count; cd++)
        {
            report += collection[cd].toString() + "\n";
        }
        return report;
    }
     
    
        
        //Doubles the size of the collection by creating a larger array
        //and copying the existing collection into it.
    private void increaseSize()
    {
        CD[] temp = new CD[collection.length*2];

        for (int cd = 0; cd < collection.length; cd++)
            temp[cd] = collection[cd];

        collection = temp;
    }
}
