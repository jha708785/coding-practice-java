package java8.methodreffrence;

public class test1 {

    public static void main(String[] args) {

        /*

        method refference are a special type of lambda expression
        they are dften used to create simple lambda expression by refrencing existing methods
        each time when you are using lambda expression to just referring a method you can replace
        your lambda expression with method refference.

        :: ->sign resolution operator;

        1.static
        2.instance method of particular object;
        3.Constructor


         */

        workinter w=new workinter() {
            @Override
            public void dotask() {
                System.out.println("do task");
            }
        };
        w.dotask();

        workinter w1=stff::dostufff;
        w1.dotask();


    }
}
