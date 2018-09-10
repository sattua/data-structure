import java.util.ArrayList;
import java.util.List;

public class Node {
    String id;
    String value;
    Node parentNode;
    Node leftNode;
    Node rightNode;
    List<Node> egdes;

    public Node() {

    }

    public Node(String id, Node parentNode, String value) {
        this.id = id;
        this.parentNode = parentNode;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getParentNode() {
        return parentNode;
    }

    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }

    public String toString() {

        return "[ id: " + this.id + " ]";
    }

    public String getId() { return id; }

    public String getRichId(String identation) {
        return identation + "----------\n"+identation+"|" + id + "|\n"+identation+"----------";
    }

    public void setId(String id) { this.id = id; }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
}
