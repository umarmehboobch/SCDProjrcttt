/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.IDBConnection;

/**
 *
 * @author Windows 10
 */
public class Main {
      public static void main(String[] args) {
          MainGUI m=new MainGUI();
          m.setSize(400,400);
          m.setVisible(true);         
}
}