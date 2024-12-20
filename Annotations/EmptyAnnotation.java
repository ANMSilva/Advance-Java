package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // for class type
public @interface EmptyAnnotation {

    /**
     * This is an empty annotation that have no metadata
     * */

    /**
     * @Retention(RetentionPolicy.RUNTIME) – Indicates when the annotation will be retained. This annotation will be retained at runtime.
     * @Retention(RetentionPolicy.SOURCE) – This annotation will be retained only during compile time.
     * @Target(ElementType.TYPE) – Indicates where this annotation can be applied. In this case, it can be applied to classes, interfaces, or enums.
     **/

}
