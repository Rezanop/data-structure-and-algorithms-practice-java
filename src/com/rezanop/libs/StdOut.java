package com.rezanop.libs;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

/**
 * This class provides methods for printing strings and number o standard output.
 * It behaves like the Stdout default library with few technical differences
 */
public final class StdOut {

    // Force Unicode UTF-8 encoding, otherwise it would be system dependant
    private static final String CHARSET_NAME = "UTF-8";

    // assume language = English, country = US for consistency with StdIn
    private static final Locale LOCALE = Locale.US;

    // send output here
    private static PrintWriter out;

    // This is an anonymous function that is called before invoking any methods
    static {
        try {
            out = new PrintWriter(new OutputStreamWriter(System.out, CHARSET_NAME), true);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    // No Instantiation is needed
    private StdOut(){}

    /**
     * Terminates the current line by printing the line-separator string.
     */
    public static void println() { out.println();}

    /**
     * Prints an object to the output stream then terminates the line.
     * @param object The object to print
     */
    public static void println(Object object) { out.println(object);}

    /**
     * Prints a boolean to the output stream then terminates the line.
     * @param bool The boolean to print
     */
    public static void println(boolean bool) { out.println(bool);}

    /**
     * Prints a character to the output stream then terminates the line.
     * @param character The character to print
     */
    public static void println(char character) { out.println(character);}

    /**
     * Prints an integer number to the output stream then terminates the line.
     * @param integerNumber The integer number to print
     */
    public static void println(int integerNumber) { out.println(integerNumber);}

    /**
     * Prints a short number to the output stream then terminates the line.
     * @param shortNumber The short number to print
     */
    public static void println(short shortNumber) { out.println(shortNumber);}

    /**
     * Prints a long number to the output stream then terminates the line.
     * @param longNumber The long number to print
     */
    public static void println(long longNumber) { out.println(longNumber);}
    /**
     * Prints a double number to the output stream then terminates the line.
     * @param doubleNumber The double number to print
     */
    public static void println(double doubleNumber) { out.println(doubleNumber);}

    /**
     * Prints a float number to the output stream then terminates the line.
     * @param floatNumber The float number to print
     */
    public static void println(float floatNumber) { out.println(floatNumber);}

    /**
     * Prints a byte to the output stream then terminates the line.
     * @param singleByte The byte to print
     */
    public static void println(byte singleByte) { out.println(singleByte);}

    /**
     * Flushes standard output.
     */
    public static void print() { out.flush();}

    /**
     * Prints an object to the output then flushes the stream.
     * @param object The object to print
     */
    public static void print(Object object) {
        out.print(object);
        out.flush();
    }

    /**
     * Prints a boolean to the output then flushes the stream.
     * @param bool The boolean to print.
     */
    public static void print(boolean bool) {
        out.print(bool);
        out.flush();
    }

    /**
     * Prints a character to the output then flushes the stream.
     * @param character The character to print
     */
    public static void print(char character) {
        out.print(character);
        out.flush();
    }

    /**
     * Prints an integer number to the output then flushes the stream.
     * @param integerNumber The integer number to print
     */
    public static void print(int integerNumber) {
        out.print(integerNumber);
        out.flush();
    }

    /**
     * Prints a short number to the output then flushes the stream.
     * @param shortNumber The short number to print
     */
    public static void print(short shortNumber) {
        out.print(shortNumber);
        out.flush();
    }

    /**
     * Prints a long number to the output then flushes the stream.
     * @param longNumber The long number to print.
     */
    public static void print(long longNumber) {
        out.print(longNumber);
        out.flush();
    }

    /**
     * Prints a float number to the output then flushes the stream.
     * @param floatNumber The float number to print.
     */
    public static void print(float floatNumber) {
        out.print(floatNumber);
        out.flush();
    }

    /**
     * Prints a double number to the output then flushes the stream.
     * @param doubleNumber The float number to print.
     */
    public static void print(double doubleNumber) {
        out.print(doubleNumber);
        out.flush();
    }

    /**
     * Prints a single byte to the output then flushes the stream.
     * @param singleByte The single byte to print.
     */
    public static void print(byte singleByte) {
        out.print(singleByte);
        out.flush();
    }

    /**
     * Prints a formatted string to the standard output, using the specified format string and arguments,
     * then flashes the output.
     * @param format The format string
     * @param args The arguments to fill the format string
     */
    public static void printf(String format, Object ...args) {
        printf(LOCALE, format, args);
    }

    /**
     * Prints a formatted string to the standard output, using the specified format string, locale and arguments,
     * then flashes the output.
     * @param locale The chosen locale
     * @param format The format string
     * @param args The arguments to fill the format string
     */
    public static void printf(Locale locale, String format, Object ...args) {
        out.printf(locale, format, args);
        out.flush();
    }

    /**
     * Small Units tests for some methods
     * @param args - The command-line arguments
     */
    public static void main(String[] args) {

        // write to stdout
        StdOut.println("Test");
        StdOut.println(17);
        StdOut.println(true);
        StdOut.printf("%.6f\n", 1.0/7.0);    }
}
