package alexiuscrow.validation.validators;

import alexiuscrow.validation.ServiceException;

public interface Validator<T> {
    String WRONG_VALUE_MSG = "Wrong value";
    String OBJ_VALIDATION_ERR_MSG = "Object validation error";

    void loadAndValidate(T object) throws ServiceException;
    T copyAndValidate(T primaryObject, T copiedObject) throws ServiceException;
}
