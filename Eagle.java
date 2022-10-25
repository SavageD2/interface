public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff(){
        if(!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s takes off %n", this.getName());
        }
    }

    @Override
    public int ascend(int meters){
        if(this.flying){
            this.altitude = Math.max(this.altitude + meters, 325);
            System.out.printf("%s flys up up and away, at: %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }
    @Override
    public int descend(int meters){
        if(this.flying){
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.printf("%s flys down, at: %d%n", this.getName(), this.altitude);
        } 
        return this.altitude;
    }

    @Override
    public void land(){
        if(this.flying && this.altitude == 0){
            System.out.println("it landing " + this.getName());
        }else{
            System.out.println("lands on the ground " + this.getName());
        }
    }

    @Override
    public void glide(){
        if(this.flying && this.altitude == 0){
            System.out.println(" has crashed" + this.getName());
        } else{
            System.out.println("glides around " + this.getName());
        }
    }
}
