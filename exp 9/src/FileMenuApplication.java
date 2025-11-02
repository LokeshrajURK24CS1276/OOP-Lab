import java.io.*;
import java.util.*;

public class FileMenuApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== FILE OPERATIONS MENU =====");
            System.out.println("1. Create a new file");
            System.out.println("2. Rename a file");
            System.out.println("3. Delete a file");
            System.out.println("4. Create a directory");
            System.out.println("5. Find absolute path of a file");
            System.out.println("6. Display all file names of a directory");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                // 1. Create new file
                case 1:
                    System.out.print("Enter file name to create: ");
                    String createName = sc.nextLine();
                    File createFile = new File(createName);
                    try {
                        if (createFile.createNewFile())
                            System.out.println(" File created successfully: " + createFile.getName());
                        else
                            System.out.println(" File already exists.");
                    } catch (IOException e) {
                        System.out.println(" Error creating file: " + e.getMessage());
                    }
                    break;

                // 2. Rename file
                case 2:
                    System.out.print("Enter current file name: ");
                    String oldName = sc.nextLine();
                    System.out.print("Enter new file name: ");
                    String newName = sc.nextLine();
                    File oldFile = new File(oldName);
                    File newFile = new File(newName);
                    if (oldFile.renameTo(newFile))
                        System.out.println(" File renamed successfully.");
                    else
                        System.out.println(" Rename failed. File may not exist.");
                    break;

                // 3. Delete file
                case 3:
                    System.out.print("Enter file name to delete: ");
                    String deleteName = sc.nextLine();
                    File deleteFile = new File(deleteName);
                    if (deleteFile.delete())
                        System.out.println(" File deleted successfully.");
                    else
                        System.out.println(" Deletion failed. File may not exist.");
                    break;

                // 4. Create directory
                case 4:
                    System.out.print("Enter directory name to create: ");
                    String dirName = sc.nextLine();
                    File dir = new File(dirName);
                    if (dir.mkdir())
                        System.out.println(" Directory created successfully.");
                    else
                        System.out.println(" Failed to create directory. It may already exist.");
                    break;

                // 5. Find absolute path
                case 5:
                    System.out.print("Enter file name: ");
                    String pathName = sc.nextLine();
                    File pathFile = new File(pathName);
                    System.out.println(" Absolute Path: " + pathFile.getAbsolutePath());
                    break;

                // 6. List all files in directory
                case 6:
                    System.out.print("Enter directory name: ");
                    String listDir = sc.nextLine();
                    File list = new File(listDir);
                    if (list.isDirectory()) {
                        String[] files = list.list();
                        System.out.println("📂 Files in directory '" + listDir + "':");
                        if (files != null && files.length > 0) {
                            for (String file : files) {
                                System.out.println("  - " + file);
                            }
                        } else {
                            System.out.println("  (Directory is empty)");
                        }
                    } else {
                        System.out.println(" Directory not found or invalid path.");
                    }
                    break;

                // 7. Exit
                case 7:
                    System.out.println(" Exiting program... Thank you!");
                    break;

                // Invalid input
                default:
                    System.out.println(" Invalid choice. Please try again!");
            }

        } while (choice != 7);

        sc.close();
    }
}
