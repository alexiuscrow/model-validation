package alexiuscrow.validation;

import java.util.List;

public class ServiceException extends Exception {
    private List<ErrorDetails> errors;

    public ServiceException(String message, List<ErrorDetails> errors) {
        super(message);
        this.errors = errors;
    }

    public List<ErrorDetails> getErrors() {
        return errors;
    }
}
