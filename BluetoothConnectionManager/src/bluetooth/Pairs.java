package bluetooth;

import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import java.io.IOException;

public class Pairs {
    public static void main(String[] args) throws IOException {
        LocalDevice device = LocalDevice.getLocalDevice();

        RemoteDevice[] remoteDevices = device.getDiscoveryAgent().retrieveDevices(DiscoveryAgent.PREKNOWN);

        if (remoteDevices != null) {
            for (RemoteDevice d : remoteDevices) {
                System.out.println("Device Name is " + d.getFriendlyName(false));
                System.out.println("Bluetooth addres is " + d.getBluetoothAddress());
                System.out.println();
            }
        }else System.out.println("\nНет подклюенных устройств по bluetooth\n");
    }
}
