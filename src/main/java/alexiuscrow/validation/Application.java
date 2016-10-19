package alexiuscrow.validation;

import alexiuscrow.validation.validators.CallFlowValidator;

public class Application {
    public static void main(String[] args) {
        CallFlow firstCallFlow = new CallFlow(null, "FirstObj");
        CallFlow secondCallFlow = new CallFlow(2L, "SecondObj");

        CallFlowValidator validator = new CallFlowValidator();

        try {
            validator.loadAndValidate(firstCallFlow);
            secondCallFlow = validator.copyAndValidate(secondCallFlow, firstCallFlow); // Exception expected
        } catch (ServiceException expt) {
            expt.printStackTrace();
        }
    }
}
