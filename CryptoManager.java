/*
 * Class: CMSC203 
 * Instructor: Dr. Grinberg
 * Description: Provides methods for encrypting and decrypting strings using the Caesar 
 *              and Bellaso ciphers, with methods matching required signatures.
 * Due: 11/16/24
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Jedidiah W Dawit
 */

public class CryptoManager {

    // Check if a string is within the allowable ASCII bounds
    public static boolean isStringInBounds(String plainText) {
        for (char character : plainText.toCharArray()) {
            if (character < 32 || character > 95) {
                return false;
            }
        }
        return true;
    }

    // Encrypt a string using the Caesar Cipher
    public static String caesarEncryption(String plainText, int key) {
        if (!isStringInBounds(plainText)) {
            throw new IllegalArgumentException("String is out of bounds.");
        }
        StringBuilder encrypted = new StringBuilder();
        for (char character : plainText.toCharArray()) {
            int newChar = character + key;
            while (newChar > 95) {
                newChar -= (95 - 32 + 1);
            }
            encrypted.append((char) newChar);
        }
        return encrypted.toString();
    }

    // Decrypt a string using the Caesar Cipher
    public static String caesarDecryption(String encryptedText, int key) {
        if (!isStringInBounds(encryptedText)) {
            throw new IllegalArgumentException("String is out of bounds.");
        }
        StringBuilder decrypted = new StringBuilder();
        for (char character : encryptedText.toCharArray()) {
            int newChar = character - key;
            while (newChar < 32) {
                newChar += (95 - 32 + 1);
            }
            decrypted.append((char) newChar);
        }
        return decrypted.toString();
    }

    // Encrypt a string using the Bellaso Cipher
    public static String bellasoEncryption(String plainText, String bellasoStr) {
        if (!isStringInBounds(plainText)) {
            throw new IllegalArgumentException("String is out of bounds.");
        }
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char textChar = plainText.charAt(i);
            char keyChar = bellasoStr.charAt(i % bellasoStr.length());
            int newChar = textChar + (keyChar - 'A');
            while (newChar > 95) {
                newChar -= (95 - 32 + 1);
            }
            encrypted.append((char) newChar);
        }
        return encrypted.toString();
    }

    // Decrypt a string using the Bellaso Cipher
    public static String bellasoDecryption(String encryptedText, String bellasoStr) {
        if (!isStringInBounds(encryptedText)) {
            throw new IllegalArgumentException("String is out of bounds.");
        }
        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i < encryptedText.length(); i++) {
            char textChar = encryptedText.charAt(i);
            char keyChar = bellasoStr.charAt(i % bellasoStr.length());
            int newChar = textChar - (keyChar - 'A');
            while (newChar < 32) {
                newChar += (95 - 32 + 1);
            }
            decrypted.append((char) newChar);
        }
        return decrypted.toString();
    }
}