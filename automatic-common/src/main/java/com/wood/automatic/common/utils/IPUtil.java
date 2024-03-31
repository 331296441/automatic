package com.wood.automatic.common.utils;


import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class IPUtil {

    public static String getLocalIPAddress() throws SocketException {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface networkInterface = networkInterfaces.nextElement();
            Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
            while (inetAddresses.hasMoreElements()) {
                InetAddress inetAddress = inetAddresses.nextElement();
                if (!inetAddress.isLoopbackAddress() && inetAddress.getAddress().length == 4) {
                    return inetAddress.getHostAddress();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) throws SocketException {
        String localIPAddress = IPUtil.getLocalIPAddress();
        System.out.println(localIPAddress);
    }
}