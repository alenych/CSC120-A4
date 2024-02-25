// Class passengers holds informatio about eahc passenger boarding or leaving the train car

public class Passenger {

    // Name of passenger
    private String name;

    public Passenger(String name) {
        this.name = name;
    }


    /*
     * Mthod gets the name of the passenger
     * @ return Name: name of passenger
     */
    public String passengerName(){
        return this.Name;
    }

    /* 
      * Method adds the names to the train once boarded
      * @param c: car that pass boarded
      */

    public void boardCar(Car c){
        c.addPassenger(this);
    }

    /* 
      * Method removes a passengers name after they leave
      * @param c: car that pass leaves
      */

    public void getOffCar(Car c){
        c.removePassenger(this);
    }






}

