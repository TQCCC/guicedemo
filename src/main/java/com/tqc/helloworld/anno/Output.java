package com.tqc.helloworld.anno;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by tangqingchang on 2017/12/23.
 */
@Retention(RetentionPolicy.RUNTIME)
@BindingAnnotation
public @interface Output {
}
