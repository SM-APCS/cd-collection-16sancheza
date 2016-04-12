/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdcollection;
import cdcollection.CD;
import cdcollection.CdCollection;
import java.util.LinkedList;
/**
 *
 * @author Alex
 */
public class CDList {
    
    private LinkedList<CD> linkedlist = new LinkedList<CD>();
    private int countCDs;
    public void CDList()
    {
        linkedlist = null;
        countCDs = 0;
    }
    
    public void getList(CD[] Disks)
    {
       for(int i = 0; i < Disks.length; i++)
       {
           linkedlist.add(Disks[i]);
           countCDs++;
       }
    }
    
    public String toString()
    {
        String result;
        result = linkedlist.toString();
        return result;
    }
}
