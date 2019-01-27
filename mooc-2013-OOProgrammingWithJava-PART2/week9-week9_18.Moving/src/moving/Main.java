package moving;

import moving.logic.Packer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moving.domain.*;
public class Main {

    public static void main(String[] args) {
        Box a = new Box(3);
        Item b = new Item("cosa", 2);
        System.out.println(a.getVolume());
        a.addThing(b);

        

    }

}
