package org.vadim.examples;

import java.net.*;

public class WebExample1 {
    public static void main(String[] args)
            throws UnknownHostException {
        InetAddress address[] = InetAddress.getAllByName("www.championat.com");
        for(int iterator = 0; iterator < address.length; iterator++)
            System.out.println(address[iterator]);
    }
}
