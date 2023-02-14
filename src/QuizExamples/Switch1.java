package QuizExamples;

public class Switch1 {
    private static final String APPLE = "APPLE";
    private static String mango;

    public static void main(String[] args) {
        String fruit = "Berry";
        mango = "Mango";
        int i = 0;
        switch (fruit) {
            case "Mango":
                break;
            case APPLE:
                i++;
            default:
                i++;
            case "VIOLIN":
                i++;
            case "BERRY":
                ++i;
                break;
        }
        System.out.print(i);
    }
}
