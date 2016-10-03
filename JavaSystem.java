import java.util.Properties;

public class JavaSystem {
    public static void main(String[] args) {
        Properties info = System.getProperties();
        info.list(System.out);
    }
}