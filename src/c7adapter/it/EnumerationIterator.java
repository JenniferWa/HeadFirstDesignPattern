package c7adapter.it;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator{ 
    Enumeration en ;

    public EnumerationIterator(Enumeration en) {
        this.en = en;
    }
    

    @Override
    public boolean hasNext() {
        return en.hasMoreElements();
    }

    @Override
    public Object next() {
        return en.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}