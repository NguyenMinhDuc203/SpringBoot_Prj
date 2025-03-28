package spring.project01.restAPI_01.util;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = EmailValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailValid {
    String message() default "invalid email format";
    Class<?>[] groups() default{};
    Class<? extends Payload>[] payload() default {};


}
