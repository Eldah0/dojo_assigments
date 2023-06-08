class Mammal {
    protected int energyLevel;

    public Mammal() {
        this.energyLevel = 100;
    }

    public int displayEnergy() {
        System.out.println("Energy Level: " + energyLevel);
        return energyLevel;
    }
}

class Gorilla extends Mammal {
    public void throwSomething() {
        System.out.println("The gorilla has thrown something!");
        energyLevel -= 5;
    }

    public void eatBananas() {
        System.out.println("The gorilla is satisfied after eating bananas!");
        energyLevel += 10;
    }

    public void climb() {
        System.out.println("The gorilla has climbed a tree!");
        energyLevel -= 10;
    }
}

class GorillaTest {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();

        gorilla.eatBananas();
        gorilla.eatBananas();

        gorilla.climb();

        gorilla.displayEnergy();
    }
}

class Bat extends Mammal {
    public Bat() {
        this.energyLevel = 300;
    }

    public void fly() {
        System.out.println("The bat takes off and flies!");
        energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("The bat has eaten a human!");
        energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("The town is on fire due to the bat's attack!");
        energyLevel -= 100;
    }
}