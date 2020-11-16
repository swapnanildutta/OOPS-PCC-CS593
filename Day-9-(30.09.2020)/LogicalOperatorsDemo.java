package basicjava;

public class LogicalOperatorsDemo {

    public static void main(String[] args) {
        boolean result;
        result = ((10>5) && (9<7));
        System.out.println("Logical AND = " + result); //false
        result = ((10>5) || (9<7));
        System.out.println("Logical  OR = " + result); //true
        result = !(9<7);
        System.out.println("Logical NOT = " + result); //true
    }
}
