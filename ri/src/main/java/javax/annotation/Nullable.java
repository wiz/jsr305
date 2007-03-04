package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.annotation.meta.QualifierNickname;
import javax.annotation.meta.When;

@Documented
@QualifierNickname
@Nonnull(when=When.UNKNOWN)
public @interface Nullable {
    ElementType[] applyTo() default {};

}
