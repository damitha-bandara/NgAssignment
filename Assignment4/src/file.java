import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class file {
    private String fileNameToSearch;
    private List<String> result = new ArrayList<String>();
    private String fileNumber;
    private String nameOfTheFile;
    private String createdDate;
    private String content;

    public void setFileNameToSearch(String folderNameToSearch) {
        this.fileNameToSearch = folderNameToSearch;
    }

    public String getFileNameToSearch() {
        return fileNameToSearch;
    }

    public List<String> getResult(){
        return result;
    }
    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getNameOfTheFile() {
        return nameOfTheFile;
    }

    public void setNameOfTheFile(String nameOfTheFile) {
        this.nameOfTheFile = nameOfTheFile;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void fileSearchMethod(File directory, String fileNameToSearch){
        setFileNameToSearch(fileNameToSearch);
        if(directory.isDirectory()){
            search(directory);
        }else {
            System.out.println(directory.getAbsoluteFile() + " is not a directory!");
        }
    }

    private void search (File file){
        if (file.isDirectory()){
            if (file.canRead()){
                for ( File temp: file.listFiles() ) {
                    if (temp.isDirectory()){
                        search(temp);
                    }else {
                        if (getFileNameToSearch().equals(temp.getName().toLowerCase())){
                            result.add(temp.getAbsoluteFile().toString());
                        }
                    }
                }
            }
            else {
                System.out.println(file.toPath() + "Permission Denied");
            }
        }
    }
}
