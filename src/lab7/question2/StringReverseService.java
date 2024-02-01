package lab7.question2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StringReverseService extends Remote {
    String reverseString(String input) throws RemoteException;
}
