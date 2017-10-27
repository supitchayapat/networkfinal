package client.window;

import client.login.Login;

import java.io.*;
import java.net.Socket;

public class Listenner implements Runnable {
    private static final String HASCONNECTED = "has connected";
    private Socket socket;
    public String hostname;
    public int port;
    public static String username;
    public Window controller;
    private static ObjectOutputStream objectOutputStream;
    private InputStream inputStream;
    private ObjectInputStream objectInputStream;
    private OutputStream outputStream;

    public Listenner(String hostname, int port, String username, String picture, Window controller) {
        this.hostname = hostname;
        this.port = port;
        Listenner.username = username;
        this.controller = controller;
    }


    @Override
    public void run() {
        try {
            socket = new Socket( hostname, port );
            Login.getInstance().showScene();
            outputStream = socket.getOutputStream();
            objectOutputStream = new ObjectOutputStream( outputStream );
            inputStream = socket.getInputStream();
            objectInputStream = new ObjectInputStream( inputStream );
        } catch (IOException e) {
            Login.getInstance().showErrorDialog( "Could not connect to server" );

        }
    }
}

