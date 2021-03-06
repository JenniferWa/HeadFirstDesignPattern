package c7adapter.it;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration{
    Iterator it ;

    public IteratorEnumeration(Iterator it) {
        this.it = it;
    }

    @Override
    public boolean hasMoreElements() {
        return it.hasNext();
    }

    @Override
    public Object nextElement() {
        return it.next();
    }
    
}