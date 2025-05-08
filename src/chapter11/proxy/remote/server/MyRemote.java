package chapter11.proxy.remote.server;

import java.rmi.Remote;

public interface MyRemote extends Remote {

    String sayHello() throws java.rmi.RemoteException;
}
