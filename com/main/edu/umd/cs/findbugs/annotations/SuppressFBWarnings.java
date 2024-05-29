package edu.umd.cs.findbugs.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes4.dex */
public @interface SuppressFBWarnings {
    String justification() default "";

    String[] value() default {};
}
