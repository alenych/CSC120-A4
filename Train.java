import java.util.ArrayList;

// Class creates the train(info on passengers, car, engine, etc)
public class Train {

    private final Engine engine;
    private ArrayList<Car> cars;

    /* 
      * Method defines a trai with fuel detials , number of cars, and passenger capacity
      * @param FuelType: type of fuel engine uses
      * @param fuelCapacity: max amount of fuel that can be stored
      * @param nCars: amount of cars in train
      * @param carCapacity: max people that can be in a car
      */
    public Train(FuelType Fuel, double maxFuel, int nCars, int carCapacity){
        this.engine = new Engine(Fuel, maxFuel);
        this.cars = new ArrayList<Car>(nCars);
        for (int i = 0; i< nCars; i++){
            Car car = new Car(carCapacity);
            this.cars.add(car);
        }
    }

    /* 
      * Method gets info from engine class
      * @return engine
      */
      public Engine getEngine(){
        return this.engine;
      }

      /* 
      * Method gets info from car class
      * @return cars in train
      */
      public Car getCar(int i){
        if (i>this.cars.size()) {
            System.out.println("Train doesnt have cars");
        }
        return this.cars.get(i);
      }

      /* 
      * Method gets car capacity
      * @return Total: Total seats in train
      */
      public int getMaxCapacity(){
        int Total = 0;
        for (int i=0;i <cars.size(); i++){
            Total += cars.get(i).getCapacity();
        }
        return Total;
      }

      /* 
      * Method retunrs remaining seats
      * @return remainingSeats: amount of seats avaialbale
      */

      public int seatsRemaining(){
        int remainingSeats = 0;
        for(int i=0;i<cars.size();i++){
            remainingSeats += cars.get(i).seatsRemaining();
        }
        return remainingSeats;
      }
      
      /* 
      * Method prints out the pass names
      */
      public void printManifest(){
        for (int i=0; i<this.cars.size(); i++){
            this.cars.get(i).printManifest();
        }
      }

public static void main(String[] args) {
    Train train1 = new Train(FuelType.ELECTRIC, 100.0, 5, 30)

    train1.engine.refuel();
    System.out.println(train1.engine.getCurrentFuelLevel());

    Passenger a = new Passenger("a");
    Passenger b = new Passenger("b");
    Passenger c = new Passenger("c");
    Passenger d = new Passenger("d");

    train1.cars.get(0).addPassenger(a);
    train1.cars.get(0).addPassenger(b);
    train1.cars.get(0).addPassenger(c);
    train1.cars.get(0).addPassenger(d);

    System.out.println(train1.getMaxCapacity());
    System.out.println(train1.seatsRemaining());
    train1.printManifest();

    Car car1 = new Car(30);
    a.boardCar(car1);
    a.getOffCar(car1);







}







}
