package spring.project01.restAPI_01.util;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<EmailValid, String> {

    @Override
    public void initialize(EmailValid constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value == null){
            return false;
        }
        if(value.matches("^\\w{8,}@(gmail|yahoo|minhduc).(com|co|zing|vn|ducdeptrai)(.vn){0,}$")) return true;
        else{
            return false;
        }

    }
}
