package ntou.cs.java2025;
public class ConstructorTest {
    public static void main(String args[]) {
        ThirdWriter writer = new ThirdWriter();
        writer.showLastLine();
    }
}

class BaseWriter {
    public BaseWriter() {
        System.out.println("1. A subclass cannot narrow the access scope of a parent class method.");
    }

    // Added a call to this() so that BaseWriter() runs first.
    public BaseWriter(String param) {
        this();
        System.out.println("2. There is no inheritance relationship between the constructors of a parent and child class.");
    }
}

class SecondWriter extends BaseWriter {
    // In the no‐argument constructor, call this("dummy") to force a chain.
    public SecondWriter() {
        this("dummy");
        System.out.println("6. Declaring a static method in a subclass with the same signature as a parent class method is not an override.");
    }

    // In this constructor, call the overloaded one so that later the proper message appears.
    public SecondWriter(String param) {
        this("dummy", 0);
        System.out.println("5. The first line of a subclass constructor can only be either super or this, but not both.");
    }

    // In this constructor, call the next overloaded constructor so that its message appears after.
    public SecondWriter(String param1, int param2) {
        this("dummy", 0, true);
        System.out.println("4. A subclass constructor will automatically (or manually) call the parent class constructor.");
    }

    // In this constructor, call BaseWriter(String) explicitly.
    public SecondWriter(String param1, int param2, boolean param3) {
        super("dummy");
        System.out.println("3. A constructor of any class can call another constructor of the same class using this.");
    }

    public void showLastLine() {
        System.out.println("9. If the parent and child classes are in different packages and the subclass redefines a package-private method of the parent class, it is not an override.");
    }

}

class ThirdWriter extends SecondWriter {
    // Call the overloaded ThirdWriter(String) first.
    public ThirdWriter() {
        this("dummy");
        System.out.println("8. The @Override annotation can be used to explicitly indicate that a method is overridden.");
    }

    // Call the no-argument SecondWriter (via super()) and then print.
    public ThirdWriter(String param) {
        super();
        System.out.println("7. Redefining a private method of the parent class in the subclass is not an override.");
    }

    // Add a call to super.showLastLine() so that line 9 prints before this line.
    public void showLastLine() {
        super.showLastLine();
        System.out.println("10. If the parent and child classes are in different packages and the subclass redefines a public method of the parent class, it is an override.");
    }
}