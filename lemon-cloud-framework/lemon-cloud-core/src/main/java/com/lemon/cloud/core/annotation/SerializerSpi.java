package com.lemon.cloud.core.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface SerializerSpi {
    /**
     * Value string.
     *
     * @return the string
     */
    String value() default "";
}
