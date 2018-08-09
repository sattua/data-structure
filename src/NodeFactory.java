import java.util.ArrayList;
import java.util.List;

public class NodeFactory {

    static List<Node> createNodes(Node parent, int amount) {
        List<Node> temp = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            temp.add(new Node(parent, "child " + i));
        }
        return temp;
    }
}
