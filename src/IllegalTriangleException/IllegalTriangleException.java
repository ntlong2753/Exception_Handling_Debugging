package IllegalTriangleException;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException(String message) {
        super(message); // gọi constructor của Exception để lưu message
    }
}
