/*
 * This file is a part of the RMI Plugin for Eclipse tutorials.
 * Copyright (C) 2002-7 Genady Beryozkin
 */
package saferefactor.rmi.server;

import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.security.AccessControlException;

import saferefactor.rmi.common.RemoteExecutor;
import saferefactor.rmi.common.Task;

/**
 * This is a simulation of a printer server. Note that in real application,
 * server level synchronization may be needed.
 * 
 * @author Genady Beryozkin, rmi-info@genady.net
 */
public class RemoteExecutorImpl implements RemoteExecutor {

	/**
	 * The printer name
	 */
	private String name;

	/**
	 * Constant serialVersionUID is needed for serialization interoperability if
	 * this file is compiled with different compilers.
	 */
	private static final long serialVersionUID = 5885886202424414094L;

	/**
	 * Default constructor that only copies the printer's name. The super
	 * constructor also exports the remote object.
	 */
	public RemoteExecutorImpl(String name) throws RemoteException {
		
		this.name = name;
	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: java " + RemoteExecutorImpl.class
					+ " <server id>");
			return;
		}

		try {
			System.setSecurityManager(new RMISecurityManager());
			RemoteExecutorImpl remoteExecutorImpl = new RemoteExecutorImpl(
					args[0]);
			RemoteExecutor exportObject = (RemoteExecutor) UnicastRemoteObject
					.exportObject(remoteExecutorImpl, 0);
			Registry registry = LocateRegistry.getRegistry();
			
			registry.rebind(args[0], exportObject);
			System.out.println("Server " + remoteExecutorImpl.name + " loaded!");
		} catch (RemoteException e) {
			System.err.println("Something wrong happended on the remote end");
			e.printStackTrace();
			System.exit(-1); // can't just return, rmi threads may not exit
		} catch (AccessControlException e) {
			System.err.println("Something wrong happended on the remote end");
			e.printStackTrace();
			System.exit(-1); // can't just return, rmi threads may not exit
		}
		System.out.println("The server " + args[0]+ " is ready");
	}

	@Override
	public <T> T executeTask(Task<T> t) throws RemoteException {
		try {
			return t.execute();
		} catch (NotBoundException e) {
			throw new RemoteException(e.getMessage());
		}
	}
	
	
	@Override
	public void exit() throws RemoteException
	{
	    try{
	        // Unregister ourself
	        Naming.unbind(name);

	        // Unexport; this will also remove us from the RMI runtime
	        UnicastRemoteObject.unexportObject(this, true);

	        System.out.println("ExecutorServer " + this.name + " exiting.");
//	        System.exit(0);
	    }
	    catch(Exception e){
	    	e.printStackTrace();
//	    	System.exit(-1);
	    }
	}

}
