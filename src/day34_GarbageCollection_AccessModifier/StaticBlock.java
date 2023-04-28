package day34_GarbageCollection_AccessModifier;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("Main Method");

    }

    static{   // runs first before
        System.out.println("Static Block 1");

    }

    static{
        System.out.println("Static Block2");
    }

    static{
        System.out.println("Static Block3");
    }



}
