package java8;

public class test {

    public static void main(String[] args) {

        MyInter i=new MyInter() {
            @Override
            public void sayHello() {

                System.out.println("say hello");
            }
        };
        i.sayHello();

        MyInter i1=()->System.out.println("say hello 2");
        i1.sayHello();


        MyInter2 i3= Integer::sum;

        System.out.println(i3.sum(1,2));



    }
}
