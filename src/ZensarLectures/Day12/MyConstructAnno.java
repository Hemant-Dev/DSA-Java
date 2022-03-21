package ZensarLectures.Day12;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.CONSTRUCTOR)
public @interface MyConstructAnno {

    String value() default "";

}
