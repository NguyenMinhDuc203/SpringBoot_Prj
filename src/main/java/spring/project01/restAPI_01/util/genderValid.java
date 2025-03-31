package spring.project01.restAPI_01.util;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = genderValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface genderValid {
    enumGender[] anyOf();
    String message() default "invalid gender";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
