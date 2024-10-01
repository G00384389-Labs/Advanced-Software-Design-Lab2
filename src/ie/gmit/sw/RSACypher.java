package ie.gmit.sw;

import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;


import javax.crypto.Cipher;

public class RSACypher {
	private Cipher cypher;
	private KeyPair keyRing;

	public RSACypher() throws Throwable {
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
		keyGen.initialize(2048);
		keyRing = keyGen.generateKeyPair();
		cypher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

	}

	public byte[] encrypt(byte[] plainText) throws Throwable{
		cypher.init(Cipher.ENCRYPT_MODE, keyRing.getPublic());		
		return cypher.doFinal(plainText);
	}
	
	public byte[] decrypt(byte[] cypherText) throws Throwable{
		cypher.init(Cipher.DECRYPT_MODE, keyRing.getPrivate());		
		return cypher.doFinal(cypherText);
		
	}

	@SuppressWarnings("removal")
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

}
