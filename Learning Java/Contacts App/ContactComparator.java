/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts.app;

import java.util.Comparator;

/**
 *
 * @author kritikasenthil
 */
public class ContactComparator implements Comparator<Contact> {

    @Override
    public int compare(Contact o1, Contact o2) {
        return o1.getCompareString().compareToIgnoreCase(o2.getCompareString());
        /*
         int c=o1.getLname().compareToIgnoreCase(o2.getLname());
         if (c!=0){
             return c;
         }
         return o1.getFname().compareToIgnoreCase(o2.getFname());
         */
    }

}
