package lab7.question1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FactorialServiceImpl extends UnicastRemoteObject implements FactorialService {

    protected FactorialServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public long calculateFactorial(int number) throws RemoteException {
        if (number < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer");
        }

        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }

        return result;
    }
}
