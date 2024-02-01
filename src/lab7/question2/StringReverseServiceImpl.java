package lab7.question2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StringReverseServiceImpl extends UnicastRemoteObject implements StringReverseService {

    protected StringReverseServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String reverseString(String input) throws RemoteException {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }

        return new StringBuilder(input).reverse().toString();
    }
}
