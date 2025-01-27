public class SearchInString {
    public static void main(String[] args) {
        String str = "Rutuja Patil";
        System.out.println((found(str, 'u')));
        present(str, 't');
    }
    public static boolean found(String str, char ch) {
        if(str.length()==0) {
            return false;
        }
        for(int i=0; i<str.length(); i++) {
            if(ch == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    public static void present(String str, char ch) {
        if(str.length()==0) {
            return;
        }
        for(int i=0; i<str.length(); i++) {
            if(ch == str.charAt(i)) {
                System.out.printf("Character at position %s is %s \n", i,ch);
            }
        }
    }
}
