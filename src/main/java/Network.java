import java.util.*;

public class Network {
    private String name;
    private ArrayList<IConnect> devices;
    private int slots;

    public Network(String name){
        this.devices = new ArrayList<IConnect>();
        this.name = name;
        this.slots = 3;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size() ;
    }

    public void connect(IConnect device){
        if(devices.size() < this.slots) {
            devices.add(device);
        }
    }

    public int getFreeSlots(){
        return this.slots - devices.size();
    }

    public void disconnectAll(){
        devices.clear();
    }
}