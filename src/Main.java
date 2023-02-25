public class Main {
    public static void main(String[] args) {
        Car Mers = new Car("G-Vagon",2000,20000,BodyType.VNEDOROZHNIK);
        System.out.println(Mers+" "+Mers.bodyTypeIdentification()+" "+Mers.determinationoYearOfManufacture()+"-жыл");
        System.out.println("*******************");
        Car Daewoo = new Car("Matiz",2003,3500,BodyType.HATCHBEK);
        System.out.println(Daewoo+" "+Daewoo.bodyTypeIdentification()+" "+Daewoo.determinationoYearOfManufacture()+"-жыл");
        System.out.println("*******************");
        Car Honda = new Car("CR-V",2013,7500,BodyType.KROSSOVER);
        System.out.println(Honda+" "+Honda.bodyTypeIdentification()+" "+Honda.determinationoYearOfManufacture()+"-жыл");
        System.out.println("*******************");
        Car Tesla = new Car("Tesla",2020,75000,BodyType.SEDAN);
        System.out.println(Tesla+" "+Tesla.bodyTypeIdentification()+" "+Tesla.determinationoYearOfManufacture()+"-жыл");
        System.out.println("***********************");
        Car Opel = new Car("Zafira",1999,2548,BodyType.UNIVERSAL);
        System.out.println(Opel+" "+Opel.bodyTypeIdentification()+" "+Opel.determinationoYearOfManufacture()+"-жыл");


    }
}