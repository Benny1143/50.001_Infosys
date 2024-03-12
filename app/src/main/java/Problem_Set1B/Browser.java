package Problem_Set1B;

import java.math.BigInteger;

public class Browser {
    private final int[] publicKey = new int[2]; // DO NOT CHANGE THIS DATA FIELD

    public void establishConnection(Server s) {
        s.generatePublicPrivateKey();
        publicKey[0] = s.getPublicKey()[0];
        publicKey[1] = s.getPublicKey()[1];
        // TODO 1: Generating public and private key by the server
        // TODO 2: Get the public key from the server and use it to set Browser object's public key
    }

    public BigInteger[] encryptMessage(String message) {
        BigInteger[] encryptedIntMessage = new BigInteger[message.length()];
        int i = 0;
        for(char c: message.toCharArray()){
            encryptedIntMessage[i] = BigInteger.valueOf((int)c).modPow(BigInteger.valueOf(publicKey[1]),BigInteger.valueOf(publicKey[0]));
            i++;
        }
        // Hint:
        // 1. Loop through each character of the message
        // 2. Convert to its ASCII value in integer
        // 3. Encrypt the value. Use .modPow method from BigInteger

        return encryptedIntMessage;
    }
}