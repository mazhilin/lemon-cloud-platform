package com.lemon.cloud.core.annotation;

import java.lang.annotation.*;

/**
 * @author marklin
 */
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
