import java.security.*;
import java.math.*;

public class sha1 {
    public static void main(String[] a) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA1");

            System.out.println("Algorithm=" + md.getAlgorithm());
            System.out.println("Provider=" + md.getProvider());
            System.out.println("ToString=" + md.toString());

            String input = "jwdh";
            md.update(input.getBytes());
            byte[] output = md.digest();

            String aa = new BigInteger(1, output).toString(16).toUpperCase();
            System.out.println(String.format("SH1(%s) = %s", input, aa));

        } catch (Exception e) {

        }
    }
}
