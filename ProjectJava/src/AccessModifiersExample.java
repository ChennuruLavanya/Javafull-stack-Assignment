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