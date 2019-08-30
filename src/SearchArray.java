import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        String nameStudents[] = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the name of student: ");
        String inputName = scanner.nextLine();

        Boolean IsExit = false;
        for(int i = 0 ; i < nameStudents.length ; i++) {
            if(nameStudents[i].equals(inputName))  {
                System.out.println("Position name student in the list "+ inputName + " is "+(i+1));
                IsExit = true;
                break;
            }
        }
        if (!IsExit) {
            System.out.println("Not found " + inputName + " in the list");
        }
    }
}
