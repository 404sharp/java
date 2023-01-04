package ch06.ex07.case01;

// sealed 부모 클래스는 반드시 permits된 자식 클래스가 존재해야 한다.
public sealed class Pet permits Dog, Cat {

}
