import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        System.out.println(outerClass.outerNumDefault);
        outerClass.outerMethod();

//        for an inner class to be instantiated we need an instance of the outer class
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();


//        static inner class:

        Outer.InnerStatic innerClassStatic = new Outer.InnerStatic();



//        builder pattern

        Student student = new Student.Builder()
                .setName("Hasan")
                .setCourse("Java")
                .build();

        System.out.println(student);


//        anonymous classes

        Car myCar = new Car(){
            public void start(){
                System.out.println("Car is starting");
            }
        };
        myCar.start();


        Animal myDog = new Animal("lucky"){
            public void speak(){
                System.out.println("Woof");
            }
        };

        System.out.println(myDog);



        String name = "John";
        int age = 31;
        double salary = 1000.50;

        System.out.println("My name is " + name + " and my age is " + age);

        printInfo("Mihai","Sumayya","More values");



//        String concatenation
//        String: %s
//        integer: %d
//        floating point number: %f
//        boolean: %b
//        character: %c
//        if I want to use % then double up %%


        String newString = String.format("My name is %s and my age is %d and my salary is %.1f and second string is %s %b I am at 100%%", name,age, salary,"Second String", true);

        System.out.printf("From printf my name is %s \n",name);






        System.out.println(newString);

    }

//    varags
    public static void printInfo(String... values){
        System.out.println(Arrays.toString(values));
    }


}