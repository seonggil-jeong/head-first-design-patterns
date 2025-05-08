package chapter11.proxy.remote.server.impl;

import chapter11.proxy.remote.server.MyRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import static java.rmi.Naming.rebind;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    private static final long serialVersionUID = 1L;

    protected MyRemoteImpl() throws RemoteException {
        super();
    }

    public String sayHello() {
        return "Hello, world!";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            rebind("RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
