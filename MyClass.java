import java.lang.reflect.*;

public class MyClass {
    private int myField;
    public String myOtherField;

    public static void main(String[] args) {
        Class<?> c = MyClass.class;
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
}
