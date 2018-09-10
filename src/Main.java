import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Integer AVG_INDENTATION = 4;

    public static void main(String[] args) {
        Scanner scnner = new Scanner(System.in);
        System.out.println("Graph Data Structure!");
        String entry = "";
        final Node root= new Node("IAmTheRoot", null, "Primer Nodo");
        String spaceStr = "";
        Integer indentation = 0;
        Integer tempIndentation = 0;
        Node tempNode;

        while(!entry.equals("bye")) {
            System.out.println("...");
            System.out.println("Type any of the following commands:");
            printBlanks(2, true);
            System.out.println("   -Type (1) if you want to view the structure.");
            System.out.println("   -Type (2) Add new node to structure. (binary tree):");
            System.out.print("   -Type (bye) if you want stop this program..");
            entry = scnner.nextLine();

            if (entry.equals("1")) {
                printBlanks(3, true);

                //Prints root
                indentation = getLeftIndentation(root)+ AVG_INDENTATION;
                printStyledNode(indentation, root);
                System.out.println("");
                printNodePipes(indentation, root.toString().length());
                System.out.println("");

                tempNode = root;
                while(tempNode != null) {
                    //print left
                    if (tempNode.getLeftNode() != null) {
                        printStyledNode(indentation, tempNode.getLeftNode());
                    }

                    //print right
                    if (tempNode.getLeftNode() != null) {
                        tempIndentation = tempNode.toString().length() - tempNode.getLeftNode().toString().length() - AVG_INDENTATION;
                        printStyledNode( tempIndentation, tempNode.getRightNode());
                    }

                    System.out.println("");

                    if (tempNode.getLeftNode() != null) {
                        printNodePipes(indentation, tempNode.getLeftNode().toString().length());
                    }
                    if (tempNode.getRightNode() != null) {
                        printNodePipes(tempIndentation, tempNode.getRightNode().toString().length());
                    }

                    System.out.println("");

                    tempNode = tempNode.getLeftNode();
                    indentation = indentation - AVG_INDENTATION;
                }
            }
            if (entry.equals("2")) {
                tempNode = getNextAvailableNode(root);

                System.out.print(" - Add a value to this new node: ");
                entry = scnner.nextLine();
                tempNode.setValue(entry);

                System.out.print(" - Want to add an ID? (optional): ");
                entry = scnner.nextLine();
                tempNode.setId(entry);
            }
        }
    }

    static void printStyledNode(Integer indentation, Node node) {
        printBlanks(indentation, false);
        if (node == null) {
            System.out.print("[ NULL ]");
        }
        else {
            System.out.print(node.toString());
        }
    }

    static void printNodePipes(Integer indentation, Integer nodeStrLength) {
        printBlanks(indentation, false);
        System.out.print("|");
        printBlanks(nodeStrLength-2, false); // minus2 coz the pies take space too
        System.out.print("|");
    }

    static public void printBlanks(Integer count, Boolean isNewLine) {

        for (int j = 0; j < count; j++) {
            if (isNewLine) {
                System.out.println(" ");
            } else {
                System.out.print(" ");
            }
        }
    }

    static public String getBlanks(Integer count, Boolean isNewLine) {
        String identationStr = "";
        for (int j = 0; j < count; j++) {
            if (isNewLine) {
                identationStr += "\n";
            } else {
                identationStr += " ";
            }
        }
        return identationStr;
    }

    static Node getNextAvailableNode(Node node) {
        Node tempNode = node;
        while(true) {
            if (tempNode.getLeftNode() == null) {
                tempNode.setLeftNode(new Node());
                return tempNode.getLeftNode();
            } else if(tempNode.getRightNode() == null) {
                tempNode.setRightNode(new Node());
                return tempNode.getRightNode();
            } else {
                tempNode = tempNode.getLeftNode();
            }
        }
    }

    static Integer getLeftIndentation(Node node) {
        Integer indentation = 1;
        Node tempNode = node;
        while(true) {
            if (tempNode.getLeftNode() == null) {
                break;
            } else {
                indentation++;
            }
            tempNode = tempNode.getLeftNode();
        }

        return indentation * AVG_INDENTATION; // fours spaces per node found
    }

}
