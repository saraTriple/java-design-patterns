package src.command;

import java.util.ArrayList;
import java.util.List;

// The Invoker Class
public class TextFileOpsInvoker {
    private final List<TextFileOperation> operations = new ArrayList<>();

    public String executeOperation(TextFileOperation operation) {
        operations.add(operation);
        return operation.execute();
    }
}
