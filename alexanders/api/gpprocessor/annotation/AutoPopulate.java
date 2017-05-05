package alexanders.api.gpprocessor.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention (RetentionPolicy.RUNTIME)
@Target (ElementType.FIELD)
public @interface AutoPopulate
{
    AutoPopulationType populationType() default AutoPopulationType.AUTO_DETECT;

    String pluginID();

    Class<?> injectedClass() default AutoPopulate.class;
}
