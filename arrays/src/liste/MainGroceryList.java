package liste;

import java.util.Scanner;

public class MainGroceryList {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                case 6:
                    quit = true;
                    break;
            }
        }
    }
    public static void printInstruction(){
        System.out.println("\n Press");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery item");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item from the list");
        System.out.println("\t 4 - To remove an item");
        System.out.println("\t 5 - To search from an item");
        System.out.println("\t 6 - To quit the application");
    }
    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.println("Enter the item number: ");
        int itemNo = scanner.nextInt();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1,newItem);
    }
    public static void removeItem(){
        System.out.println("Enter the item number you want to delete");
        int itemNo = scanner.nextInt();
        groceryList.removeGroceryItem(itemNo);
    }
    public static void searchForItem(){
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) != null){
            System.out.println("Found " + searchItem + " in our grocery list");
        }else{
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
}
