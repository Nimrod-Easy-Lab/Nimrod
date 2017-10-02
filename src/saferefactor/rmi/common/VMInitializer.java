package saferefactor.rmi.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


public class VMInitializer implements Runnable {

	private String serverName;
	private String classpath;
	private String binPath;
	private String saferefactorPath;
	private String policyPath;

	public VMInitializer(String serverName, String classpath, String binPath,String saferefactorPath, String policyPath) {
		this.serverName = serverName;
		this.classpath = classpath;
		this.binPath = binPath;
		this.saferefactorPath = saferefactorPath;
		this.policyPath = policyPath;
	}

	@Override
	public void run() {
		
		String s = null;
		// run rmiregistry
		try {
//			Registry registry = LocateRegistry.getRegistry("localhost");
//			if (registry == null)
//				registry = LocateRegistry.createRegistry(1099);

			
			//TODO fix classpath
			Process p = Runtime
					.getRuntime()
					.exec(new String[] {
							"java",
							"-cp",
							saferefactorPath + ":"
									+ classpath,
							"-Djava.rmi.server.codebase=file:" + binPath + " file:" + saferefactorPath + " file:"+classpath+ "/",
							"-Djava.security.policy=file:" + policyPath,
							"saferefactor.rmi.server.RemoteExecutorImpl",
							serverName });

			System.out.println("Server " + serverName + " generated with classpath: " + classpath + "!");

			BufferedReader stdInput = new BufferedReader(new InputStreamReader(
					p.getInputStream()));

			BufferedReader stdError = new BufferedReader(new InputStreamReader(
					p.getErrorStream()));

			// read the output from the command
			System.out.println("Here is the standard output of the command:\n");
			while ((s = stdInput.readLine()) != null) {
				System.out.println(s);
			}

			// read any errors from the attempted command
			System.out
					.println("Here is the standard error of the command (if any):\n");
			while ((s = stdError.readLine()) != null) {
				System.out.println(s);
			}

			
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
