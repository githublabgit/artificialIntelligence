package edu.umd.cs.findbugs.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.TYPE, ElementType.PACKAGE})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes4.dex */
public @interface DefaultAnnotation {
    Confidence confidence() default Confidence.MEDIUM;

    @Deprecated
    Priority priority() default Priority.MEDIUM;

    Class<? extends Annotation>[] value();
}
