package com.wordpress.galvanicristian.util;

import javax.swing.JOptionPane;


public final class MessageBox {
    public static void show(String msg, String title) {
        JOptionPane.showMessageDialog(null,msg,title,JOptionPane.INFORMATION_MESSAGE);
    }
    public static void show(String msg) {
        JOptionPane.showMessageDialog(null,msg,"INFO",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void alert(String msg) {
        JOptionPane.showMessageDialog(null,msg,"ALERT",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void warning(String msg) {
        JOptionPane.showMessageDialog(null,msg,"WARNING",JOptionPane.WARNING_MESSAGE);
    }
    public static void error(String msg) {
        JOptionPane.showMessageDialog(null,msg,"ERROR",JOptionPane.ERROR_MESSAGE);
    }
}

