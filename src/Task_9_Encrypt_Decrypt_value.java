public class Task_9_Encrypt_Decrypt_value {


    public static void main(String[] args) {

        /*
        If you want to send some Encrypted value to anyone so just do the casting method

        Also below we do Decryption of that encryption method

        Simply Just do the opposite
         */


        // For Encryption
       char alpha = 'D';

       char assign=(char) (alpha + 5);
        System.out.println("The encryption of alpha is : "+ assign );

        // For Decryption

        System.out.println("The Decryption of alpha is : "+ (char) (assign - 5) );
    }
}
