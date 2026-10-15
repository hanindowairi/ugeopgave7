/* Scanner scan;
    public int promptNumber(String msg) {
        try {
            System.out.println(msg);
            return Integer.parseInt(scan.nextLine());

        } catch (InputMismatchException e) {
            System.out.println("Error! Try again");
        } return promptNumber(msg);
    }



import java.util.ArrayList;
private ArrayList<String> items;

public String getItem(ArrayList<String> items, int index) {
    if(index < 0 || index >= items.size()){
        throw new IllegalArgumentException("Indeks " + index + " is out of range 0-" + (items.size()-1));
    }
    return items.get(index);
}

 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public ArrayList readLines(String path)throws FileNotFoundException {
    ArrayList lines = new ArrayList<>();
        Scanner scan = new Scanner(new File(path));
        while (scan.hasNextLine()) {
            lines.add(scan.nextLine());
        }
        scan.close();
    return lines;
}

void main() {
    /* Drinks drinks = new Drinks();
    drinks.setPrice(25.0);

    try{
        drinks.setPrice(-5.0);
    } catch(IllegalArgumentException e){
        System.out.println(e.getMessage());

    }

    */
   /* ArrayList<String> items = new ArrayList<>();
try {
    System.out.println(getItem(items,5));    
} catch (IllegalArgumentException e){
    System.out.println(e.getMessage());
}

    */


}


