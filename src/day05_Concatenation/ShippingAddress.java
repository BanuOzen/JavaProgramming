package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

        String name = "James King",
                buildingNumber = "11821B",
                streetName = "Jones Branch Dr",
                city = "Mc Lean",
                state = "VA",
                zipCode = "22031A";

       // System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " +zipCode);
        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;
        System.out.println(address);
    }
}
