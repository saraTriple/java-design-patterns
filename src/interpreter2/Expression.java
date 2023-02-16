package src.interpreter2;

import java.util.List;

public interface Expression {

    List<String> interpret(Context context);
}
