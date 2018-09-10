import java.util.ArrayList;
import java.util.List;

public class NodeFactory {

    static List<Node> createNodes(Node parent, String idPre, int amount) {
        List<Node> temp = new ArrayList<>();
        Node tempNode;
        /*for (int i = 0; i < amount; i++) {
            tempNode = new Node(idPre + "_" + i, parent, "child " + i);
            temp.add(tempNode);
            parent.addChild(tempNode);
        }*/

        return temp;
    }
}
