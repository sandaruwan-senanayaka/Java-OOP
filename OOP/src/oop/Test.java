package oop;

/**
 *
 * @author S.S Studio
 */
abstract class Gun {

    int bullet;
    static String bag; // This not inherit but can use due to static keyword

    public abstract void fire();
}

class AK47 extends Gun {

    @Override
    public void fire() {
        System.out.println("ak47 🔫 shoot");
        bullet = bullet - 1;
    }

}

class Snipper extends Gun {

    @Override
    public void fire() {
        System.out.println("snipper 🔫 shoot");
        bullet = bullet - 1;
    }

    public void zoom() {
        System.out.println("zoom 🔎");
    }
}

class Man {

    Gun gun; // Has-A Relationship (Assosiation -> Aggregation & Composition)

    void run() {
        System.out.println("Run..... 🏃‍ ️");
    }
}

public class Test {

    public static void main(String[] args) {

        AK47 aK47 = new AK47();
        aK47.bullet = 10;

        Snipper snipper = new Snipper();
        snipper.bullet = 4;

        Man man = new Man();
        man.gun = aK47; // Polymophism
        man.gun.fire();
        man.gun.bag = "Damaged";
        System.out.println(man.gun + " bullet : " + man.gun.bullet);

        man.gun = null;

        man.run();

        man.gun = snipper; // Polymophism
        //man.gun.zoom(); this is can't due to compile time polymophism
        snipper.zoom();
        man.gun.fire();
        System.out.println("Bag status : " + man.gun.bag);

    }
}
