public class SingletonClasss {

        private SingletonClasss(){}

        public static SingletonClasss getmain(){
            SingletonClasss m=new SingletonClasss();
            return m;
        }

    public static void main(String[] args) {

        SingletonClasss m1=new SingletonClasss();
        System.out.println(m1);



    }


}