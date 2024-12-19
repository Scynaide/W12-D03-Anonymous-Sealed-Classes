package first.lab.part2;

public sealed class Animal permits Dog{

    private String name;

    public void speak() {
        System.out.println("Animal Speaking");
    }
}
