import java.util.*;

class OTPGenerator {
    
    // Method to generate 6-digit OTP
    public static int generateOTP() {
        // Math.random() → [0.0,1.0)
        // Multiply by 900000 → range 0 to 899999
        // Add 100000 → ensures 6-digit always
        return 100000 + (int)(Math.random() * 900000);
    }
    
    // Method to check uniqueness of OTPs
    public static boolean areUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) {
            set.add(otp);
        }
        return set.size() == otps.length; // अगर set size और OTPs length बराबर है तो सब unique हैं
    }
    
    public static void main(String[] args) {
        int[] otps = new int[10];   // 10 बार OTP generate करेंगे
        
        System.out.println("Generated OTPs:");
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i+1) + ": " + otps[i]);
        }
        
        if (areUnique(otps)) {
            System.out.println("\n✅ All OTPs are unique.");
        } else {
            System.out.println("\n❌ Some OTPs are repeated.");
        }
    }
}
