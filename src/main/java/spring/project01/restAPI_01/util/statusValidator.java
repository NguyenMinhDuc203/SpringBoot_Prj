package spring.project01.restAPI_01.util;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;

public class statusValidator implements ConstraintValidator<statusValid, Enum<?>> {
    private Pattern pattern;
    @Override
    public void initialize(statusValid constraintAnnotation) {
        try{
            pattern = Pattern.compile(constraintAnnotation.regexp());
        }
        catch (PatternSyntaxException e){

            throw new IllegalArgumentException("regex invalid");
        }

    }

    @Override
    public boolean isValid(Enum<?> value, ConstraintValidatorContext context) {
        if(value == null){
            return true;
        }
        Matcher matcher = pattern.matcher(value.name());
        return matcher.matches();
    }
}
