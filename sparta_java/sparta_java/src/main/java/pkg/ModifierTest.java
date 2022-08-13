package pkg;

public class ModifierTest {
    private void messsageInside(){
        System.out.println("This is private modifier");
    }
    public void messsageOutside(){
        System.out.println("This is public modifier");
        messsageInside();
    }
    protected void messageProtected(){
        System.out.println("This is protected modifier");
    }
    void messagePackagePrivate(){
        System.out.println("This is pacage private modifier");
    }
}
