package lang.wrapper;

public class AutoBoxingMain {

    public static void main(String[] args) {

        //Primitive -> Integer
        int  value = 7;
        Integer boxedValue = Integer.valueOf(value);

        //Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue:" + boxedValue);
        System.out.println("unboxedValue: " + unboxedValue);

        //Auto-Boxing(Primitive -> Integer)
        int value2 = 10;
        Integer boxedValue2 = value2;

        //Auto-Unboxing(Wrapper -> Primitive)
        int unboxedValue2 = boxedValue2;

        System.out.println("boxedValue2: " + boxedValue2);
        System.out.println("unboxedValue2: " + unboxedValue2);
    }
}
