package first.lab.part1;

import first.lab.part2.Dog;

public class Main {

    public static void main(String[] args) {


    //  Part 1:

        Shape myShape = new Shape() {
            public void draw(){
                System.out.println("Drawing the shape");
            }
        };
        myShape.draw();

    //  Part 2:

        Dog dog = new Dog();
        dog.speak();


    }


}
