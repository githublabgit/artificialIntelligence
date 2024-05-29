package edu.umd.cs.findbugs.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.annotation.Nonnull;
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
@Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes4.dex */
public @interface UnknownNullness {
}
