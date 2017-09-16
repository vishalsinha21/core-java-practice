package pattern.structural.proxy.remote.client;

import pattern.structural.proxy.remote.server.Hello;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main(String[] args) {
        Registry registry = null;
        try {
            registry = LocateRegistry.getRegistry("localhost");
            Hello hello = (Hello) registry.lookup("hello");
            System.out.println(hello.sayHello("Vishal"));

            System.out.println("server ready");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }
}
