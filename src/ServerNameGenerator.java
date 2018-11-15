public class ServerNameGenerator {

    public static String[] nouns = {
            "jump",
            "chalk",
            "man",
            "grandmother",
            "fairies",
            "monkey",
            "bit",
            "nation",
            "bath",
            "friends"};

    public static String[] adjectives = {
            "vagabond",
            "level",
            "alleged",
            "material",
            "valuable",
            "gentle",
            "frightened",
            "nostalgic",
            "royal",
            "tasteful"};

    public static String returnRandomString(String[] strings) {
        return strings[getRandomNum(0, strings.length -1)];
    }

    public static int getRandomNum(int min, int max) {
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }

    public static void main(String[] args) {
        System.out.printf("%s %s", returnRandomString(adjectives), returnRandomString(nouns));
    }

}
