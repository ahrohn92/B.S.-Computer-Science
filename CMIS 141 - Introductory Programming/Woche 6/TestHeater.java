public class TestHeater {
    public static void main(String[] args){
       
        Heater heater1 = new Heater();
        
	System.out.println("Heater #1");
        System.out.println("Power is on: " + heater1.getPowerOn());
        System.out.println("Setting is: " + heater1.getSettings());
        
        Heater heater2 = new Heater(3,true);
        
        System.out.println("Heater #2");
	System.out.println("Power is on: " + heater2.getPowerOn());
        System.out.println("Setting is: " + heater2.getSettings());
        }
}
