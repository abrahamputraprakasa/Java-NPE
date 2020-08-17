package site.abrahamprakasa;

public class Main {


    static String kata = "kata mutiara";
    static int[] arrayAngka;
    static int angka;
    static boolean kebenaran;
    static char karakter;
    public static void main(String[] args) {
	// write your code here
        System.out.println("default value String : " +kata);
        System.out.println("default value int    : " +angka);
        System.out.println(kata);
        kata = null;
        try {
            System.out.println(kata);
            if (arrayAngka != null){
                System.out.println("length array angka: " + arrayAngka.length);
            } else {
                System.out.println("array angka belum diinisialisasi");
            }

//            checkAge(17);
        } catch (NullPointerException e){
            System.out.println("NPE: " + e.toString());
        } catch (Exception e){
            System.out.println("Exception: " + e.toString());
        }

        System.out.println("default value boolean: " + kebenaran);
        System.out.println("default value char   :" + karakter);

    }

    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }


}
