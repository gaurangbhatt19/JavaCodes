public class Anagram {
    public static boolean isAnagram(String s1, String s2) {
        int[] arr = new int[256];
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i)]++;
            arr[s2.charAt(i)]--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "aabbcc";
        String s2 = "abcabc";
        System.out.println("Anagram: " + isAnagram(s1, s2));

    }
}