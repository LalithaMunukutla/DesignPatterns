package Adapter;

import Adaptee.PowerSocket;
import TargetInterface.MobileCharger;

public class ChargerAdapter implements MobileCharger {
    private PowerSocket powerSocket;

    public ChargerAdapter(PowerSocket powerSocket) {
        this.powerSocket = powerSocket;
    }

    @Override
    public int get5Volt() {
        int voltage = powerSocket.get220Volt();
        return voltage/44;
    }
}
