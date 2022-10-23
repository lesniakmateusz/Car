public class Main {
    public static void main(String[] args) {

        Car car = new Car(1,"Honda","Civic",2007,1.8,217000,"benzyna","Japonia","niebieski");

        System.out.println(car.toString());

        car.setId(2);
        car.setMarka("Honda");
        car.setModel("Accord");
        car.setRok_produkcji(2001);
        car.setPojemnosc_silnika(1.8);
        car.setPrzebieg(200000);
        car.setPaliwo("benzyna");
        car.setKraj_pochodzenia("Japonia");
        car.setKolor("czarny");
        System.out.println(car.toString());

        car.setId(3);
        car.setMarka("Toyota");
        car.setModel("Corolla");
        car.setRok_produkcji(2001);
        car.setPojemnosc_silnika(1.8);
        car.setPrzebieg(200000);
        car.setPaliwo("benzyna");
        car.setKraj_pochodzenia("Japonia");
        car.setKolor("czerwony");
        System.out.println(car.toString());


    }
}