package webit.script.core.ast.expressions;

import webit.script.Context;
import webit.script.core.ast.BinaryOperator;
import webit.script.core.ast.Expression;
import webit.script.core.ast.Optimizable;
import webit.script.util.ALU;

/**
 *
 * @author Zqq
 */
public final class AndOperator extends BinaryOperator implements Optimizable {

    public AndOperator(Expression leftExpr, Expression rightExpr, int line, int column) {
        super(leftExpr, rightExpr, line, column);
    }

    @Override
    public Object execute(Context context, boolean needReturn) {
        return ALU.and(leftExpr, rightExpr, context);
    }

    @Override
    public Expression optimize() {
        if (leftExpr instanceof DirectValue && rightExpr instanceof DirectValue) {
            return new DirectValue(ALU.and(((DirectValue) leftExpr).value, ((DirectValue) rightExpr).value), line, column);
        }
        return this;
    }
}
