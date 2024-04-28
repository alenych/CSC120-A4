// Engine class represents the locomotive engine, storing information about its fuel type, level, etc.
public class Engine{

    /* Attributes of the class engine */
    private Fueltype Fuel;
    private double currentFuel;
    private double maxFuel;


    /* 
    *Constructor that assigns values to the attributes 
    * @param Fuel: the fuel type
    * @param currentFuel: the current fuel level
    * @param maxFuel: the max level of fuel
    */
    public Engine(Fueltype Fuel, double maxFuel){
        this.Fuel = Fuel;
        this.currentFuel = maxFuel;
        this.maxFuel = maxFuel;
    }


    /*
     * Method returns the fuel type
     * @ return : fuel type
     */
     public FuelType getFuelType(){
        return Fuel;
     }

     /*
     * Method returns the trains current fuel levels
     * @ return : current fuel levels in the engine
     */
    public  double getcurrentFuel(){
        return currentFuel;
    }

    /*
     * Method returns the maximum fuel level the engine can store
     * @ return : max fuel storage
     */
    public double getmaxFuel(){
        return maxFuel;
    }


    /*
     * Method refuels the engine by setting current engine levels to the max fuel capacity
     * @ return: none(void)
     */
    public void refuel(){
        this.currentFuel = this.maxFuel;

    }


    /*
     * Method removes 5 fuel from the engines current fuel level and determins if the engine can work or not
     * @ return : 
     */
    public void go(){
        this.currentFuel = this.currentFuel - 5;
        if (this.currentFuel <= 0 ) {
            System.out.println("Out of fuel!");
        }
        else{
            System.out.println("Fuel Remaining: " + this.currentFuel);
        }
        }
    

public static void main(String[] args) {
    Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
    while (myEngine.go()) {
        System.out.println("Choo choo!");
     }
    System.out.println("Out of fuel.");
    myEngine.refuel();
    }



