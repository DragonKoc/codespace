package advanced.alfa.lesson3_4.work1;

import java.util.Objects;

public class Adapter extends Device {

    int speed;
    int mac;

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getMac() {
        return mac;
    }
    public void setMac(int mac) {
        this.mac = mac;
    }

    public Adapter(String serialNumber, String manufacturer, double price, int speed, int mac) {
        super(serialNumber, manufacturer, price);
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", speed = " + speed +
                ", mac = " + mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Adapter adapter = (Adapter) o;
        return speed == adapter.speed && mac == adapter.mac;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, mac);
    }

}



