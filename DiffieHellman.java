class DiffieHellman {
    public static void main(String args[]) {
        int q = 23; // COMMON_PRIME_NUMBER
        int a = 5; // PRIMITIVE_ROOT
        int Xa = 4; // Alice PRIVATE_KEY
        int Xb = 3; // Bob PRIVATE_KEY
        double aliceSends = (Math.pow(a, Xa)) % q;
        double bobComputes = (Math.pow(aliceSends, Xb)) % q;
        double bobSends = (Math.pow(a, Xb)) % q;
        double aliceComputes = (Math.pow(bobSends, Xa)) % q;
        double sharedSecret = (Math.pow(a, (Xa * Xb))) % q;
        System.out.println(
                "simulation of Diffie-Hellman key exchange algorithm\n---------------------------------------------");
        System.out.println("Alice Sends : " + aliceSends);
        System.out.println("Bob Computes : " + bobComputes);
        System.out.println("Bob Sends : " + bobSends);
        System.out.println("Alice Computes : " + aliceComputes);
        System.out.println("Shared Secret : " + sharedSecret);
        /* shared secrets should match and equality is transitive */
        if ((aliceComputes == sharedSecret) && (aliceComputes == bobComputes))
            System.out.println("Success: Shared Secrets Matches! " + sharedSecret);
        else
            System.out.println("Error: Shared Secrets does not Match");
    }
}
