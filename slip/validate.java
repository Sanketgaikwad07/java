import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // Retain the annotation at runtime so it can be accessed via reflection
public @interface Validate {
    String value() default "Validation logic";
}
