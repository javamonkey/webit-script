package webit.script.util.collection;

import java.util.Enumeration;

/**
 *
 * @author Zqq
 */
public class EnumerationIterAdapter<E> extends AbstractIter<E> {

    private final Enumeration<E> enumeration;

    public EnumerationIterAdapter(Enumeration<E> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    protected E _next() {
        return enumeration.nextElement();
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }
}
