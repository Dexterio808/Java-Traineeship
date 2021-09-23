package nl.belastingdienst.fundamentals.h1;

public class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void client1() {
        Client client1 = new Client("Jan");
        Client client2 = new Client("Piet");
        client2 = client1;
        client2.name = "Joris";
        System.out.println(client1.name);


    }
}