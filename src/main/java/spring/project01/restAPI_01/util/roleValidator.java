package spring.project01.restAPI_01.util;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;
import java.util.stream.Stream;

public class roleValidator implements ConstraintValidator<roleValid, String> {
    private List acceptedValue ;

    @Override
    public void initialize(roleValid constraintAnnotation) {
        acceptedValue = Stream.of(constraintAnnotation.enumClass().getEnumConstants())
                .map(Enum::name).toList();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value == null){
            return true;
        }
        return acceptedValue.contains(value.toString().toUpperCase());
    }
}
