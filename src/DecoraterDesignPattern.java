
interface Character {
    public void m1() ;


}
class Mario implements Character {
    @Override
    public void m1() {
        System.out.println("i am mario");
    }
}

class Decorater implements  Character {
    Character c ;
    Decorater ( Character type ) {
        c = type ;
    }
    @Override
    public void m1() {

    }
}
class MarioFly implements Decorater {

    MarioFly (Character c) {

    }
    @Override
    public void m1() {
        super.m1();
    }
}
public class DecoraterDesignPattern {
    public static void main(String[] args) {

    }
}
