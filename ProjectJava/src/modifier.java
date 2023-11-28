// Class with public access modifier
public class modifier {
    public int publicVariable = 10; // Public variable

    public void publicMethod() {
        System.out.println("Public method");
    }
}

// Class with default (package-private) access modifier
class DefaultClass {
    int defaultVariable = 20; // Default variable

    void defaultMethod() {
        System.out.println("Default method");
    }
}

// Class with protected access modifier
class ProtectedClass {
    protected int protectedVariable = 30; // Protected variable

    protected void protectedMethod() {
        System.out.println("Protected method");
    }
}

// Class with private access modifier
class PrivateClass {
    private int privateVariable = 40; // Private variable

    private void privateMethod() {
        System.out.println("Private method");
    }
}

public class AccessModifiersExample {
    public static void main(String[] args) {
        // Accessing members of PublicClass
        PublicClass publicObj = new PublicClass();
        System.out.println("Public Variable: " + publicObj.publicVariable);
        publicObj.publicMethod();

        // Accessing members of DefaultClass
        DefaultClass defaultObj = new DefaultClass();
        System.out.println("Default Variable: " + defaultObj.defaultVariable);
        defaultObj.defaultMethod();

        // Accessing members of ProtectedClass
        ProtectedClass protectedObj = new ProtectedClass();
        System.out.println("Protected Variable: " + protectedObj.protectedVariable);
        protectedObj.protectedMethod();

        // Accessing members of PrivateClass
        PrivateClass privateObj = new PrivateClass();
        // The following lines would result in compilation errors because private members are not accessible outside the class.
        // System.out.println("Private Variable: " + privateObj.privateVariable);
        // privateObj.privateMethod();
    }
}
