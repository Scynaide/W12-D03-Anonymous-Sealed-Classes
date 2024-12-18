package sealed;

// permits other classes to extend my class
// no other classes that are not specified can inherit

public sealed class Animal permits Cat, Dog {

    String name;

    public void speak(){
        System.out.println("generic animal speak");
    }

}
