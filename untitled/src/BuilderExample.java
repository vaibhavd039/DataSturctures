public class BuilderExample {
public static void main(String [] args)
{

    Vehicle v1=  new Vehicle.VehicleBuilder("Car",4).setAirBags(4).build();
    Vehicle v2=  new Vehicle.VehicleBuilder("Bike",2).build();
    System.out.println(v1.toString());
    System.out.println(v2.toString());
}
}
class Vehicle{
    private String Engine;
    private int wheels;
    private int airBags;

    private Vehicle(VehicleBuilder builder) {
        this.Engine = builder.engine;
        this.wheels=builder.wheels;
        this.airBags=builder.airBags;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Engine='" + Engine + '\'' +
                ", wheels=" + wheels +
                ", airBags=" + airBags +
                '}';
    }

    static class VehicleBuilder{
         String engine;
         int wheels;
         int airBags;
            public VehicleBuilder(String engine, int wheels)
            {
                this.engine=engine;
                this.wheels=wheels;

            }
            public VehicleBuilder setAirBags(int airBags)
            {
                this.airBags=airBags;
                return  this;

            }
            public Vehicle build()
            {
           return new Vehicle(this);
            }



    }

}


