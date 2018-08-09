public class Node {
    String value;
    Node parentNode;

    public Node() {

    }

    public Node(Node parentNode, String value) {
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
        return "parent: " + this.parentNode.getValue() + ", value: " + this.getValue();
    }
}
