public class OddPosition {
	public static void main(String[] args) {
        String text = "Java is a programming language and a platform. Java is a high level, robust, object-oriented and secure programming language.Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) in the year 1995. James Gosling is known as the father of Java. Before Java, its name was Oak. Since Oak was already a registered company, so James Gosling and his team changed the name from Oak to Java.";
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ' && i % 2 == 0) {
                res.append(text.charAt(i));
            }
        }

        System.out.println("Characters at odd positions (ignoring white spaces): " + res.toString());
    }

}