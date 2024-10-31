package Lesson_10_1;

import Lesson_10.ChildSamePackage;
import Lesson_10.ParentClass;

public class NormalUnrelatedClass {
    protected void doSth() {
        ChildSamePackage childSamePackage = new ChildSamePackage();
        childSamePackage.doSth();
    }
}
