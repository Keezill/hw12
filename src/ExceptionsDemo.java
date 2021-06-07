import java.util.ArrayList;
import java.util.Objects;

public class ExceptionsDemo {
    public static void main(String[] args) {
        classCastExceptionDemo();//Не нужно обрабатывать, потому что его легко исправить и понятный
        nullPointerExceptionDemo();//он является слишком частым, поэтому не обрабатывается
        numberFormatExceptionDemo();//не обрабатывается, легко исправляется
        arrayIndexOutOfBoundExceptionDemo();//не обрабатывается, встречается часто, решается легко
    }

    public static void classCastExceptionDemo() {
        Object i = new Object();
        String s = (String) i;
    }

    public static Object nullPointerExceptionDemo() {
        Object o = null;
        return o.hashCode();
    }

    private static void numberFormatExceptionDemo() {
        String s = "number";
        int i = Integer.parseInt(s);
    }

    private static void arrayIndexOutOfBoundExceptionDemo() {
        int[] array = new int[2];
        for (int i = 0; i < array.length; i++) {
            int x = array[i + 1];
        }
    }
}


