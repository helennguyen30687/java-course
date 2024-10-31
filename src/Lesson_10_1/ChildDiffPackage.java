package Lesson_10_1;

import Lesson_10.ParentClass;

public class ChildDiffPackage extends ParentClass {
    @Override
    protected void fromParent() {
        super.fromParent();
    }

    public void doSth(){
        fromParent();
    }
}
