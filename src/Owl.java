public class Owl extends Animal implements Feeding{
    @Override
    public void voice() {
        System.out.println("uhuu");
    }

    @Override
    public void feed() {
        System.out.println("catching mouse");
    }
}
