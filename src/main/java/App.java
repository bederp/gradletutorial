import com.google.common.collect.ImmutableMap;

import static com.google.common.collect.ImmutableMap.of;

public class App {

    private static final String JAVA = "Java";

    public static void main(String[] args) {
        ImmutableMap<String, String> map = of("Java", "Coders School");

        System.out.println(map.get(JAVA));
    }
}
