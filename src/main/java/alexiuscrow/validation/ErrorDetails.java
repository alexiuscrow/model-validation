package alexiuscrow.validation;

public class ErrorDetails {
    private String field;
    private String message;

    public ErrorDetails() {
    }

    public ErrorDetails(String field, String message) {
        this.field = field;
        this.message = message;
    }

    public ErrorDetails(String message) {
        this.message = message;
    }


    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format(
                "\n\t\t[field : %s, message : %s]",
                getField(),
                getMessage()
        );
    }
}
