package com.atguigu.java1;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * @author Chris Jin
 * @create 2022-03-30 11:25 AM
 */
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, TYPE_PARAMETER, TYPE_USE})
public @interface MyAnnotations {
    MyAnnotation[] value();
}
