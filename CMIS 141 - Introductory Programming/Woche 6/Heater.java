public class Heater {
    
    private int settings;
    private boolean powerOn;
    
    public Heater(){
        
        this(0,false);
    }
    
    public Heater(int settings, boolean powerOn){
        this.settings = settings;
        this.powerOn = powerOn;
    }
    
    public Heater(int settings){
        this(settings,false);
        this.settings = settings;
    }
   
    public Heater(boolean powerOn){
        this(0,powerOn);
        this.powerOn = powerOn;
    }
    
    public int getSettings(){
        return this.settings;
    }
    public boolean getPowerOn(){
        return this.powerOn;
    }
}
