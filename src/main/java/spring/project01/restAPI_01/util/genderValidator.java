package spring.project01.restAPI_01.util;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;

public class genderValidator implements ConstraintValidator<genderValid, Enum<?>> {
    private enumGender[] genders;
    @Override
    public void initialize(genderValid constraintAnnotation) {
        this.genders = constraintAnnotation.anyOf();
    }

    @Override
    public boolean isValid(Enum<?> value, ConstraintValidatorContext context) {
        return value ==null || Arrays.asList(genders).contains(value);
    }
}
