package saferefactor.rmi.common;

import java.rmi.NotBoundException;

public interface Task<T> {
    T execute() throws NotBoundException;
}