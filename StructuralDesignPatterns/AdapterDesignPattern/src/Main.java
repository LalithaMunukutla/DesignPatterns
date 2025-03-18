import Adaptee.PowerSocket;
import Adapter.ChargerAdapter;
import TargetInterface.MobileCharger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PowerSocket powerSocket = new PowerSocket();
        ChargerAdapter chargerAdapter = new ChargerAdapter(powerSocket);
        System.out.println(chargerAdapter.get5Volt());
    }
}