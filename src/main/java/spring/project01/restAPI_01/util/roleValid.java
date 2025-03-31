package spring.project01.restAPI_01.util;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = roleValidator.class)
public @interface roleValid {
    String name();
    String message() default "role invalid";
    Class<?>[] groups() default {};
    Class<? extends Enum<?>> enumClass() ;
    Class<? extends Payload>[] payload() default {};
}
