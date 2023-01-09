package ch08.ex01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE) // 어디까지 살아남을 것인가 -- compile하면 사라진다.
@Target(ElementType.TYPE) // 적용 범위 -- classes, interfaces, enums
public @interface Type { //@interface가 되면 annotation이 된다.
	String name(); // attribute name
	int value(); // attribute value
}

@Retention(RetentionPolicy.CLASS) // compile 후에도 살아남는다. new 하면 사라진다.
@Target(ElementType.FIELD)
@interface Field {
	int value();
}

@Retention(RetentionPolicy.RUNTIME) // runtime시까지 살아남는다. 객체 생성 후에도 살아남는다.
@Target(ElementType.CONSTRUCTOR)
@interface Constructor {
	int value() default 0;
}

@Target(ElementType.METHOD)
@interface Method {
	
}

@Target(ElementType.PARAMETER)
@interface Param {
	
}

@Target(ElementType.LOCAL_VARIABLE)
@Annotation // example
@interface Local {
	
}

@Target(ElementType.ANNOTATION_TYPE)
@interface Annotation {
	
}

@Target({ElementType.TYPE, ElementType.FIELD}) // 중괄호로 묶어준다.
@interface Universal {
	
}