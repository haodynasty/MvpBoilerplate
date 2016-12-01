package com.blakequ.daggermyexample.view.main;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Administrator on 2016/6/27.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ForSex {
    /** The sex. */
    String value() default "";
}
