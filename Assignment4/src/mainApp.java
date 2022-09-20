import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.util.Scanner;
import java.util.Stack;

public class mainApp {
    public static void main(String[] arg) throws Exception {
        final File folderPath = new File("./newfolder/");
        Stack<folder> stack = new Stack<>();
        lifoFolder(folderPath, stack);
        System.out.println("Your folder Add to LIFO");
        userInputAndSearch(folderPath);
    }
    private static void userInputAndSearch(File folderPath) {
        Scanner newUserInputObject = new Scanner(System.in);
        System.out.println("Type 'File' or 'Folder' for Search what you want: ");
        String userInputFileOrFolder = newUserInputObject.nextLine().toLowerCase();
        if (userInputFileOrFolder.equals("file")) {
            System.out.println("Type 'Number' for search by file number or 'Name' for search by file name: ");
            String userInputFileNumberOrFileName = newUserInputObject.nextLine().toLowerCase();
            if (userInputFileNumberOrFileName.equals("number")) {
                System.out.println("Sorry, Search by file number is under constructor");
                //String fileNumber;
                //System.out.println("Enter File Number: ");
                //fileNumber = newUserInputObject.nextLine();
                //searchByFileNumber();
                System.out.println("Search By File Number");
            } else if (userInputFileNumberOrFileName.equals("name")) {
                String fileName;
                System.out.println("Enter Folder name: ");
                fileName = newUserInputObject.nextLine();
                searchByFileName(folderPath, fileName);
                System.out.println("Search By File Name");
            } else {
                System.out.println("You type wrong content, Please try again!");
            }
        } else if (userInputFileOrFolder.equals("folder")) {
            String folderName;
            System.out.println("Enter Folder name: ");
            folderName = newUserInputObject.nextLine();
            searchByFolderName(folderPath, folderName);
            System.out.println("Search By Folder Name");
        } else {
            System.out.println("You type wrong content, Please try again!");
        }
    }
    private static void lifoFolder(File folderPath, Stack<folder> stack) throws IOException {
        File[]folderList = folderPath.listFiles();
        assert folderList != null;
        for (File folder : folderList) {
            BasicFileAttributes createdDate = Files.readAttributes(folder.toPath(), BasicFileAttributes.class);
            FileOwnerAttributeView ownerOfTheFolder = Files.getFileAttributeView(folder.toPath(), FileOwnerAttributeView.class);
            String typeOfTheFiles = Files.probeContentType(folder.toPath());

            folder newFolderObject1 = new folder(folder.getName(),
                    createdDate.creationTime().toString(),
                    ownerOfTheFolder.getOwner().toString(),
                    typeOfTheFiles);

            stack.push(newFolderObject1);
        }
    }
    private static void searchByFolderName(File folderPath, String folderName){

        String[] folderList = folderPath.list();  // store all names with same name // with/without extension
        int folderCount = 0;
        if (folderList == null) {
            System.out.println("Empty directory.");
        }
        else {
            // Linear search in the array
            for (String foldname : folderList) {
                if (foldname.equalsIgnoreCase(folderName)) {
                    System.out.println(foldname + " found");
                    folderCount = 1;
                }
            }
        }
        if (folderCount == 0) {
            System.out.println("File Not Found");
        }
    }
    private static void searchByFileName(File folderPath, String fileName){
        file fileSearch = new file();
        fileSearch.fileSearchMethod( folderPath, fileName );
        int count = fileSearch.getResult().size();
        if(count == 0){
            System.out.println("\nNo Result found!");
        }else {
            System.out.println("\nFound " + count + " result\n");
            for (String printResults : fileSearch.getResult()) {
                System.out.println("Found: " + printResults);
            }
        }
    }
}


//        final File folderPath = new File("./newfolder/");
//        File folderList[] = folderPath.listFiles();
//        Stack<folder> stack = new Stack<>();
//
////        tray newTrayObject1 = new tray(folderList.toString());
////        tray newHashObject1 = new tray
//        //userInputAndSearch(folderPath);
//
//        for (File folder : folderList) {
//
//            BasicFileAttributes createdDate = Files.readAttributes(folder.toPath(), BasicFileAttributes.class);
//            FileOwnerAttributeView ownerOfTheFolder = Files.getFileAttributeView(folder.toPath(), FileOwnerAttributeView.class);
//            String typeOfTheFiles = Files.probeContentType(folder.toPath());
//
//            System.out.println(folder.toPath());
//
//            tray newTrayObject1 = new tray(folder.toPath());
//
//            folder newFolderObject1 = new folder(folder.getName(),
//                    createdDate.creationTime().toString(),
//                    ownerOfTheFolder.getOwner().toString(),
//                    typeOfTheFiles);
//
//            stack.push(newFolderObject1);
//        }
//    }
//}
            //stack.push(folder.toPath().toString());

//            Stack<folder> stack = new Stack<folder>(folder.getName(),
//            Stack<File> stack = new Stack<>();
//            folder.getName(),
//                    createdDate.creationTime(),
//                    ownerOfTheFolder.getOwner(),
//                    typeOfTheFiles);
//            stack.push(folder);

//            System.out.println(stack);
//            System.out.println(newFolderObject1.getNameOfTheFolder());
//            System.out.println(newFolderObject1.getCreatedDate());
//            System.out.println(newFolderObject1.getOwnerOfTheFolder());
//            System.out.println(newFolderObject1.getTypeOfTheFiles());

//            File filePath = new File(String.valueOf(folder.toPath()));
//            File FileList[] = filePath.listFiles();
//
//            System.out.println("\nFiles in " + folder + " Folder\n");
//            String[] fileNumber = folder.list();
//            System.out.println(fileNumber[0]);
//
//            for (File fileInFolder : FileList) {
//                BasicFileAttributes fileCreateDateAndTime = Files.readAttributes(folder.toPath(), BasicFileAttributes.class);
//                FileOwnerAttributeView fileOwner = Files.getFileAttributeView(folder.toPath(), FileOwnerAttributeView.class);
//                String fileType = Files.probeContentType(fileInFolder.toPath());
//                //String[]fileNumber = fileInFolder.list();
//
////                System.out.println("Name of the file: " + fileInFolder.getName());
////                System.out.println("Created date: " + fileCreateDateAndTime.creationTime());
////                System.out.println("Owner of the file: " + fileOwner.getOwner());
////                System.out.println("File Type :" + fileType);
////                System.out.println("");
//            }
            //System.out.println("");
//        }
//        for (int i =0; i < folderList.length; i++ ) {
//            System.out.println(stack.get("a")).getNameOfTheFolder());
//            final File path = new File(stack.get(i));
//            System.out.println(path);
//        }
//        System.out.println("Search Input : " + stack.search("b"));
//        }

//    private folder searchFolder(Stack saved, String fileName) {
//        Integer pos = (Integer) saved.search();
//
//        if(pos == -1)
//            System.out.println("Element not found");
//        else
//            System.out.println("Element is found at position: " + pos);
//        return null;
//    }
//}



//    private static void searchByFileName(File folderPath) throws IOException {
//        File filePath = new File(String.valueOf(folderPath.toPath()));
//        File FileList[] = filePath.listFiles();
//        System.out.println(folderPath);
//        String[] fileNumber = folderPath.list();
//        System.out.println(fileNumber[0]);
//
//        for (File fileInFolder : FileList) {
//            BasicFileAttributes fileCreateDateAndTime = Files.readAttributes(folderPath.toPath(), BasicFileAttributes.class);
//            FileOwnerAttributeView fileOwner = Files.getFileAttributeView(folderPath.toPath(), FileOwnerAttributeView.class);
//            String fileType = Files.probeContentType(fileInFolder.toPath());
//            //String[]fileNumber = fileInFolder.list();
//            System.out.println("Name of the file: " + fileInFolder.getName());
//            System.out.println("Created date: " + fileCreateDateAndTime.creationTime());
//            System.out.println("Owner of the file: " + fileOwner.getOwner());
//            System.out.println("File Type :" + fileType);
//            System.out.println("");
//        }
//    }
//    private static void userInputAndSearch(File folderPath) throws IOException {
//
//        Scanner newUserInputObject = new Scanner(System.in);
//        System.out.println("Type 'File' or 'Folder' for Search what you want: ");
//        String userInputFileOrFolder = newUserInputObject.nextLine().toLowerCase();
//        if (userInputFileOrFolder.equals("file")) {
//            System.out.println("Type 'Number' for search by file number or 'Name' for search by file name: ");
//            String userInputFileNumberOrFileName = newUserInputObject.nextLine().toLowerCase();
//            if (userInputFileNumberOrFileName.equals("number")) {
//                //searchByFileNumber();
//                System.out.println("Search By File Number");
//            } else if (userInputFileNumberOrFileName.equals("name")) {
//                searchByFileName(folderPath);
//                System.out.println("Search By File Name");
//            } else {
//                System.out.println("You type wrong content, Please try again!");
//            }
//        } else if (userInputFileOrFolder.equals("folder")) {
//            searchByFolderName(folderPath);
//            System.out.println("Search By Folder Name");
//        } else {
//            System.out.println("You type wrong content, Please try again!");
//        }
//    }
//
//    private static void searchByFolderName(File folderPath) throws IOException {
//        File folderList[] = folderPath.listFiles();          //Path into folderList array
//        stackPush(folderList);
//        for (File folder : folderList) {
//            BasicFileAttributes createdDate = Files.readAttributes(folder.toPath(), BasicFileAttributes.class);
//            FileOwnerAttributeView ownerOfTheFolder = Files.getFileAttributeView(folder.toPath(), FileOwnerAttributeView.class);
//            String typeOfTheFiles = Files.probeContentType(folder.toPath());
//            folder newFolderObject1 = new folder(folder.getName(),
//                    createdDate.creationTime(),
//                    ownerOfTheFolder.getOwner(),
//                    typeOfTheFiles);
//
////            System.out.println("Name Of The Folder\t: " + newFolderObject1.getNameOfTheFolder());
////            System.out.println("Created Date\t\t: " + newFolderObject1.getCreatedDate());
////            System.out.println("Owner Of The Folder\t: " + newFolderObject1.getOwnerOfTheFolder());
////            System.out.println("Type Of The Files\t: " + newFolderObject1.getTypeOfTheFiles());
////            System.out.println();
//        }
//    }
//    private static void stackPush(Stack<Folder> stack){
//        for (int i = 0; i < stack.size(); i++) {
//            stack.push(stack);
//        }
//    }
//}