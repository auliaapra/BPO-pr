// Aulia Putri Ramadhani
// Convert Data Type

public class P2S4ConvertDataType {
    public static short methodOne(long l){
        int i = (int) l;
        return (short)i; 
    }
    public static void main(String[] args){
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f); 
        System.out.println(d);
        }
}
