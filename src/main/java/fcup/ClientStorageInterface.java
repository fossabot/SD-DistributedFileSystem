package fcup;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientStorageInterface extends Remote {

    boolean create(String path) throws RemoteException; // creates a directory

    boolean create(String path, byte[] blob) throws RemoteException; // creates a file

    boolean del(String path) throws RemoteException;

    byte[] get(String path) throws IOException;

}
