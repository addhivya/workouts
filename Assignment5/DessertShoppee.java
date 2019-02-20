package Assignment5;

import java.util.*;

public class DessertShoppee {
    final static float TAX_RATE = 15.29f;
    public static String STORE_NAME = "M&M Dessert Shoppe";
    public static int NAME_SIZE = 23;
    public static int WIDTH = 3;

    public static String cents2dollarsAndCentsmethod(int cent) {
        return String.format("%.2f", cent * 0.01);
    }

    public static String convertStringBasedOnSize(final String string) {
        int originalLength = string.length();
        int sizeOfRemainingString = string.length();
        StringBuilder result = new StringBuilder();

        int lastIndex = 0;
        while(sizeOfRemainingString > NAME_SIZE) {
            int getLastSpaceInRange = getLastSpace(string, lastIndex, lastIndex+NAME_SIZE);
            result.append(string.substring(lastIndex, getLastSpaceInRange));
            result.append("\n");
            sizeOfRemainingString = originalLength - getLastSpaceInRange + 1;
            lastIndex = getLastSpaceInRange + 1;
        }
        result.append(string.substring(lastIndex));
        return result.toString();
    }

    public static String convertBasedOnWidth(String name, String value) {
        StringBuilder result = new StringBuilder();
        int lastLineLength = getLastLineOfString(name).length();
        for(int i=lastLineLength; i<=NAME_SIZE; i++) {
            result.append(" ");
        }
        for(int i = 0; i< WIDTH; i++) {
            result.append("\t");
        }
        result.append(value);
        return result.toString();
    }

    public static String getLastLineOfString(String string) {
        String[] strings = string.split("\n");
        return strings[strings.length-1];
    }

    public static int getLastSpace(String string, int start, int end) {
        if(string.endsWith(" ")) {
            return end-1;
        }
        for(int i=end; i>start ; i--) {
            if(string.charAt(i) == ' ') {
                return i;
            }
        }
        //If full word print as such.
        return end-1;
    }

    public static String printHeadingCentre()
    {
        int totalLength=NAME_SIZE+4*WIDTH+4;

       int headLength= STORE_NAME.length();
        int frontspace=(totalLength-headLength)/2;
        StringBuilder space=new StringBuilder();
        for(int i=0;i<frontspace;i++)
        space.append(" ");
        space.append(STORE_NAME);
        space.append("\n");
        for(int i=0;i<frontspace;i++)
            space.append(" ");
        int length=STORE_NAME.length();
        for(int i=0;i<length;i++)
        space.append("-");

        return space.toString();

    }

}
