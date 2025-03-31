package spring.project01.restAPI_01.util;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = statusValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface statusValid {
    String name();
    String regexp();
    String message() default "status invalid";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
