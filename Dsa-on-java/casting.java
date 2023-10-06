public class casting {
    public static void main(String[] args){

        int a = 200;  //here modulus operation is is perform since in this type casting the byte is all about --127  if we increases the value this use the modulus operation; 
        byte k =(byte) a;
        
        
        System.out.println(k);

        float d = 7.8f;
        int t = (int) d ;

        System.out.println(t);
        
        byte m =10;
        byte n = 45;
        int result = m * n;

        System.out.println(result); // Type promotion in java 



    }
}
