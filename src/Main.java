import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnner = new Scanner(System.in);
        System.out.println("Graph Data Structure!");
        String entry = "";
        final Node primo= new Node("A", null, "Primer Nodo");

        List<Node> children = NodeFactory.createNodes(primo, "Primos",4);


        while(!entry.equals("bye")) {
            System.out.println("Type any of the following commands:");
            printBlanks(2, true);
            System.out.println(" -Type (1) if you want to view the structure.");
            System.out.println(" -Type (2) Add new node to structure.");
            System.out.println(" -Type (bye) if you want stop this program..");
            entry = scnner.nextLine();


            if (entry.equals("1")) {
                printBlanks(3, true);

                children = primo.getEgdes();
                Integer identation = (children.size() / 2) + 100;


                printBlanks(identation, false);
                for (int i =0; i < children.size(); i++) {

                    System.out.println(children.get(i).getRichId(getBlanks(identation, false)));
                    identation = identation - 15;
                }
            }

        }

    }

    static public void printBlanks(Integer count, Boolean isNewLine) {

        for (int j = 0; j < count; j++) {
            if (isNewLine) {
                System.out.println("  ");
            } else {
                System.out.print("  ");
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

}
