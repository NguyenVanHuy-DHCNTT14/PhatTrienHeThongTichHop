package quanlive;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


public class Server {
    public static void main(String args[]) throws NotBoundException {

        try {
            LocateRegistry.createRegistry(2007);
            
            // Sign in rmiregistry
            dichvu Impl=(dichvu)
            		Naming.lookup("rmi://localhost:8080/huynguyen");
            
            System.out.println(">>>>>INFO: RMI Server started!!!!!!!!");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
