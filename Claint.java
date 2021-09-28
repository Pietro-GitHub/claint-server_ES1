package com.example;

import java.io.*;
import java.net.*;

public class Claint {
    String nomeServer = "nomeServer";
    int portaServer = 6789;
    Socket miosocket;
    BufferedReader tastiera;
    String stringUtente;
    String stringaRicevutaDalServer;
    DataOutputStream outVersoServer;
    BufferedReader inDalServer;

    public Socket connetti(){
        System.out.println("2 CLIENT partito in esecuzione ...");
        try{
            //per l'input da tastiera
            tastiera = new BufferedReader(new InputStreamReader(System.in));
        }
    }
}
