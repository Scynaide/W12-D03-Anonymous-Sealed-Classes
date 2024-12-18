package sealed;

//children of the sealed in class must have one of the following keywords:
// final: cannot be inherited by ANY class
// non-sealed: all other classes can inherit from the child class
// sealed: only permitted classes can inherit from the child class

public final class Cat extends Animal{

    public void speak(){
        System.out.println("Meow");
    }
}
