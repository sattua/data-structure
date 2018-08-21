import java.util.ArrayList;
import java.util.List;

public class Node {
    String id;
    String value;
    Node parentNode;
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

        return "id:" + this.id + ", value: " + this.getValue();
    }

    public List<Node> getEgdes() { return egdes; }

    public void setEgdes(List<Node> egdes) { this.egdes = egdes; }

    public String getId() { return id; }

    public String getRichId(String identation) {
        return identation + "----------\n"+identation+"|" + id + "|\n"+identation+"----------";
    }

    public void setId(String id) { this.id = id; }

    public void addChild(Node node) {
        if (this.egdes != null && this.egdes.size() > 0) {
            this.egdes.add(node);
        } else {
            this.egdes = new ArrayList<>();
            egdes.add(node);
        }
    }
}
