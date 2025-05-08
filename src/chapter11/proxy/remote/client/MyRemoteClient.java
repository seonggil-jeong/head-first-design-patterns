package chapter11.proxy.remote.client;

import chapter11.proxy.remote.server.MyRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyRemoteClient {

    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    private void go() {

        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            service.sayHello();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
