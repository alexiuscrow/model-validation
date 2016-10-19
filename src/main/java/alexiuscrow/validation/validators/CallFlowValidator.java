package alexiuscrow.validation.validators;

import alexiuscrow.validation.CallFlow;
import alexiuscrow.validation.ErrorDetails;
import alexiuscrow.validation.ServiceException;

import java.util.List;
import java.util.Vector;

public class CallFlowValidator implements Validator<CallFlow>{

    public void loadAndValidate(CallFlow object) throws ServiceException {
        List<ErrorDetails> errors = new Vector<ErrorDetails>();

        if (object.getId() != null)
            errors.add(new ErrorDetails("id", WRONG_VALUE_MSG));

        if (object.getName() == null)
            errors.add(new ErrorDetails("name", WRONG_VALUE_MSG));

        if (!errors.isEmpty())
            throw new ServiceException(OBJ_VALIDATION_ERR_MSG, errors);
    }

    public CallFlow copyAndValidate(CallFlow primaryObject, CallFlow copiedObject) throws ServiceException {
        CallFlow result = new CallFlow(primaryObject);

        List<ErrorDetails> errors = new Vector<ErrorDetails>();

        if (copiedObject.getId() == null) {
            errors.add(new ErrorDetails("id", WRONG_VALUE_MSG));
        } else {
            result.setId(copiedObject.getId());
        }

        if (copiedObject.getName() == null) {
            errors.add(new ErrorDetails("name", WRONG_VALUE_MSG));
        } else {
            result.setName(copiedObject.getName());
        }

        if (!errors.isEmpty())
            throw new ServiceException(OBJ_VALIDATION_ERR_MSG, errors);

        return result;
    }

}
