public class RegexUzdavinysPirmas {

    public static void main(String[] args) {

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
//        System.out.println(text);
//        text = text.replaceAll("(^L[a-z]*)(\\s+)|(\\s+)(l[a-z]*)", " **** ");
//        String pattern = "(^|\\s)([L|l])([\\s*])";
//        text = text.replaceAll(pattern, "1$****3$");
//        text = text.replaceAll("\\s", "\n");
        text = text.replaceAll("([,|.])(\\s)", "$1\n");
        System.out.println(text);
    }
}
