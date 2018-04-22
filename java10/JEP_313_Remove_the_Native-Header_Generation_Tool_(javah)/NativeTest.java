public class NativeTest {

    static {
        System.loadLibrary("hello");
    }

    private native void sayHello();

    public static void main(String[] args) {
        new NativeTest().sayHello();
    }
}