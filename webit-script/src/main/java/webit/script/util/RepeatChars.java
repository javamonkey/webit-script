package webit.script.util;

/**
 *
 * @author Zqq
 */
public class RepeatChars implements CharSequence {

    private final char c;
    private final int length;

    public RepeatChars(char c, int length) {
        this.c = c;
        this.length = length;
    }

    public int length() {
        return length;
    }

    public char charAt(int index) {

        return c;
    }

    public CharSequence subSequence(int start, int end) {
        //Note: without Check
        return new RepeatChars(c, end - start);
    }

    public char[] toChars() {
        int len = length;
        char[] chars = new char[len];
        for (int i = 0; i < len; i++) {
            chars[i] = c;
        }
        return chars;
    }

    @Override
    public String toString() {
        return String.valueOf(toChars());
    }
}
