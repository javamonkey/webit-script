
package webit.script.core.ast;

/**
 *
 * @author Zqq
 */
public abstract class StatmentPart {
    public int line;
    public int column;
    
    public StatmentPart() {
    }
    
    public StatmentPart(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public StatmentPart setPosition(int line,int column) {
        this.line = line;
        this.column = column;
        return this;
    }
    
    
    public abstract Statment pop();
}
