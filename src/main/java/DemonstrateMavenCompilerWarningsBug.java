import java.util.ArrayList;
import java.util.List;


public class DemonstrateMavenCompilerWarningsBug {

    public static void main(String[] args) {
        List l = new ArrayList<Number>();
        List<String> ls = l;
    }
}
