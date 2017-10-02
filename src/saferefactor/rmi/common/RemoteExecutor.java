/*
 * This file is a part of the RMI Plugin for Eclipse tutorials.
 * Copyright (C) 2002-7 Genady Beryozkin
 */
package saferefactor.rmi.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * This is the generic remote printer inteface. It has methods to
 * submit print jobs, query their status. Querying the printer status
 * is also possible using the {@link #getPrinterStatus()} method.
 * 
 * @author Genady Beryozkin, rmi-info@genady.net
 */
public interface RemoteExecutor extends Remote {

    
    public final static String NAME = "target-server"; 
    
    <T> T executeTask(Task<T> t) throws RemoteException;

	void exit() throws RemoteException;
    
//    public void shutdown() throws RemoteException;
    
    
}