import pkg.ModifierTest;

class Child extends ModifierTest{
    void callParetProtected(){
        System.out.println("call my parent's protected method");
        super.messageProtected();
    }
}

public class Main {
    public static void main(String[] args) {
        ModifierTest modifierTest = new ModifierTest();
        modifierTest.messageOutside();
//        modifierTest.messageInside();
//        modifierTest.messageProtected();

        Child child = new Child();
        child.callParetProtected();

    }
}