/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypt;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author ROBIN
 */
public class AESCrypto {
    
 static final String ALGO = "AES";
 byte[] keyValue;

public AESCrypto(String key){
    keyValue = key.getBytes();
}

    AESCrypto() {
    }

public String encrypt (String Data) throws Exception{
    Key key = generateKey();
    Cipher c = Cipher.getInstance(ALGO);
    c.init(Cipher.ENCRYPT_MODE, key);
    byte[] encVal = c.doFinal(Data.getBytes());
    String encryptedValue = new BASE64Encoder().encode(encVal);
    return encryptedValue;
}

public String decrypt (String encryptedData) throws Exception{
    Key key = generateKey();
    Cipher c = Cipher.getInstance(ALGO);
    c.init(Cipher.DECRYPT_MODE, key);
    byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
    byte[] decValue = c.doFinal(decordedValue);
    String decryptedValue = new String(decValue);
    return decryptedValue;
}



    public Key generateKey() {
        Key key = new SecretKeySpec(keyValue, ALGO);
        return key;
    }

            
}
    
    
    
    

