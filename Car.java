// The car class holds information about train car passengers, removes and adds passengers from the cars, and stores info on the cars
import java.util.ArrayList;
public class Car {

    private ArrayList<Passenger> currentPassengers;
    private int carCapacity;


    /*
     * Method constrcuts cars and adds or removes passengers from them
     *  @param carCapacity: max amount of people the car can hold
     *  @param currentPassengers: the current passengers in the car
     *  @return : max capacity in the car, and seats remaining
     
     */
     public Car(int carCapacity){
        this.currentPassengers = new ArrayList<Passenger>(carCapacity);
        this.carCapacity = carCapacity;
     }


     /* 
      * Method gets the max car capacity of people on train
      * @return carCapacity
      */
      public int getCapacity(){
        return this.carCapacity;
      }

     /* 
      * Method returns the remainig seats in the car by taking the difference between car capacity and current passengers
      * @return seats remaining
      */
      public int seatsRemaining(){
        return this.carCapacity - currentPassengers.size();
      }

      /* 
      * Method adds a passenger to the train car
      * @param person : passenger 
      */
      public void addPassenger(Passenger person){
        if (this.carCapacity <= currentPassengers.size()) {
            System.out.println("Sorry, there is not enough room on this car");
            
        }
        else if (this.currentPassengers.contains(person)){
            System.out.println("This passenger is already on board");
            
        }
        else{
            currentPassengers.add(person);  
        }
        }

        /* 
      * Method removes a passenger from the car
      * @param person - passenger
      */
      public void removePassenger(Passenger person){
        if (!currentPassengers.contains(person)){
            System.out.println("This passenger is not on board");
        }
        else{
            currentPassengers.remove(person);
        }
        }


        /* 
      * Method prints names of all the passengers currently in the car
      */
      public void printManifest(){
        if (currentPassengers.size() != 0) {
            System.out.println("Current Passengers: ");
        }
        else{
            System.out.println("This car is empty");
        }

        for (int i=0; i<this.currentPassengers.size(); i++) {
            System.out.println(currentPassengers.get(i));
        }
      }

    }

        
      








