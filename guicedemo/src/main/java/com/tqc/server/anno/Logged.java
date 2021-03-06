package com.tqc.server.anno;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by tangqingchang on 2017/12/24.
 */
@Retention(RetentionPolicy.RUNTIME)
@BindingAnnotation
public @interface Logged {
}
