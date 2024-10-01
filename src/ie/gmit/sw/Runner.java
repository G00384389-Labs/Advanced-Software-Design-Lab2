package ie.gmit.sw;

public class Runner {

		public static void main(String[] args) throws Throwable{
			RSACypher cypher = new RSACypher();
			
		
			byte[] s = cypher.encrypt(new String("Attack the castle wall at dawn").getBytes("UTF-8"));		
			System.out.println(new String(s));
			System.out.println(new String(cypher.decrypt(s)).getBytes("UTF-8"));
		}
}
