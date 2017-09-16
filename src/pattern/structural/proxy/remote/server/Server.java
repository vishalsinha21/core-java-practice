package pattern.structural.proxy.remote.server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server implements Hello {

    @Override
    public String sayHello(String name) throws RemoteException {
        return "Hello, " + name;
    }

    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.codebase", "file:/Users/vishalsinha/Documents/practice_workspace/core-java-practice/out/production/core-java-practice/pattern/structural/proxy/server/");

            Hello service = new Server();
            Hello stub = (Hello) UnicastRemoteObject.exportObject(service, 0);
            Registry registry = LocateRegistry.getRegistry();

            registry.bind("hello", stub);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }

    }
}
