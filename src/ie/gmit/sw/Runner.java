package ie.gmit.sw;

public class Runner {

		public static void main(String[] args) throws Throwable{
//			AbstractCypher cypher = new SymmetricCypher("AES",128,"AES/ECB/PKCS5Padding");
			AbstractCypher cypher = new SymmetricCypher("DES",56,"DES/ECB/PKCS5Padding");
			
		
			byte[] s = cypher.encrypt(new String("Attack the castle wall at dawn").getBytes("UTF-8"));		
			System.out.println(new String(s));
			System.out.println(new String(cypher.decrypt(s)));
		}
}
