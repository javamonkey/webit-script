
package webit.script.util.collection;

/**
 *
 * @author Zqq
 */
public class CharSequenceIterAdapter extends AbstractIter<Character>{

    private final CharSequence chars;
    private final int max;
    
    
    public CharSequenceIterAdapter(CharSequence chars) {
        this.chars = chars;
        this.max = chars.length() - 1;
    }

    
    @Override
    protected Character _next() {
        return chars.charAt(_index);
    }

    public boolean hasNext() {
        return _index < max;
    }

}
