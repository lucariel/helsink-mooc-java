
import containers.*;

public class Main {

    public static void main(String[] args) {
        ContainerHistory m = new ContainerHistory();
        m.add(99);
        m.add(100);
        System.out.println(m.greatestFluctuation());
    }
}
