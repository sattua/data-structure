import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Graph Data Structure!");

        Node parent = new Node();
        parent.setValue("parent");

        List<Node> children = NodeFactory.createNodes(parent, 4);

        for (int i = 0; i < children.size(); i++) {
            System.out.println(children.get(i).toString());
        }

    }
}
