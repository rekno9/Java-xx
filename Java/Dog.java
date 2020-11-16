//
//

class Dog {
    int size;
    String breed;
    String name;

    void bark(int numOfBarks){
        while(numOfBarks > 0){
            System.out.println("Ruff! Ruff!");
            numOfBarks--;
        }
    }
    
    void eat(){
        System.out.println("NOMNOMNOM");
    }

    void chaseCat(){
        System.out.println("No cat nearby! ;(");
    }
}

class DogTestDrive{
    public static void main(String[] args){
        int[] nums = new int[7];

        nums[0] = 6;
        nums[1] = 19;
        nums[2] = 44;
        nums[3] = 42;
        nums[4] = 10;
        nums[5] = 20;
        nums[6] = 1;

        Dog[] myDogs = new Dog[3];

        myDogs[0] = new Dog();
        myDogs[1] = new Dog();

        Dog fido = new Dog();
        fido.name = "Fido";
        fido.name = "notFido";

        fido.bark(1);
        fido.chaseCat();

        myDogs[0] = fido;
        myDogs[1] = new Dog();
        myDogs[2] = new Dog();

        myDogs[1].name = "Roger";
        myDogs[2].name = "Epic";

        myDogs[0].size = 70;
        myDogs[1].size = 35;
        myDogs[2].size = 8;

        for(int i = 0; i < myDogs.length; i++){
            myDogs[i].bark(1);
        }

        Circle cir = new Circle(4.0);
        System.out.println(cir.Area());
        System.out.println(cir.Circumference());
    }
}
