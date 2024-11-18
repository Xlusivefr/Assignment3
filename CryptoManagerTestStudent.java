/*
 * Class: CMSC203 
 * Instructor: Dr. Grinberg
 * Description: CryptoManagerTestStudent contains test cases for the CryptoManager class.
 *              It verifies the functionality of the public encryption methods.
 * Due: 11/16/24
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Jedidiah W Dawit 
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CryptoManagerTestStudent {

    @Test
    public void testCaesarEncryption() {
        // Updated to use caesarEncryption
        assertEquals("DEF", CryptoManager.caesarEncryption("ABC", 3));
        assertEquals("XYZ", CryptoManager.caesarEncryption("UVW", 3));
        assertEquals("UVW", CryptoManager.caesarDecryption("XYZ", 3)); // Corrected for caesarDecryption
    }
    
    @Test
    public void testBellasoEncryption() {
        // Updated to use bellasoEncryption
        assertEquals("ABDEF", CryptoManager.bellasoEncryption("ABCDE", "AABBB"));
        assertEquals("XY[", CryptoManager.bellasoEncryption("XYZ", "AAB"));
    }
}
