/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdcollection;



/**
 *
 * @author Alex
 */
public class Sorts{
        //Sorts the CD's in Alphabetical Order
    public static void selectionSort( CD[] collection)
    {
        int min; 
        CD temp;
        
        for (int index = 0; index < collection.length-1; index++)
        {
            min = index;
            for (int scan = index + 1; scan < collection.length; scan++)
            {
               if (collection[scan].toString().compareTo(collection[min].toString()) > 0)
                {    
                    min = scan;
                    
                    temp = collection[min];
                    collection[min] = collection[index];
                    collection[index] = temp;
                }
            }
        
        //Swap the values
        
        }
    }
}
