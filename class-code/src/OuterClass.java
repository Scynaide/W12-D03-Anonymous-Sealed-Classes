public class OuterClass {

    private int outerNum = 10;

    int outerNumDefault = 20;

    public void outerMethod(){
        System.out.println("Hello from the outer methoed");
    }

    class InnerClass{

        public void showData(){
            int innerNum = 30;

            System.out.println("outerNum: " + outerNum);

            System.out.println("outerNumDefault: " + outerNumDefault);

            System.out.println("innerNum: " + innerNum);


        }
    }
}
