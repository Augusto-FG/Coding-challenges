/*ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.

If the function is passed a valid PIN string, return true, else return false.

Examples (Input --> Output)
"1234"   -->  true
        "12345"  -->  false
        "a234"   -->  false*/

public class ATMmachines {
    static String pin = "1234";
    public static boolean validatePin(String pin) {
        int cantidadDigitos = pin.length();
        if ((cantidadDigitos == 4 || cantidadDigitos == 6) && pin.matches("\\d+")) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(validatePin("1234"));  // Debería imprimir true
        System.out.println(validatePin("a234"));  // Debería imprimir false
    }
}
