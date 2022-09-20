import java.io.IOException;
public class folder {
    private String nameOfTheFolder;
    private String createdDate;
    private String ownerOfTheFolder;
    private String typeOfTheFiles;
    public folder(String nameOfTheFolder, String createdDate, String ownerOfTheFolder, String typeOfTheFiles) throws IOException {
        this.setNameOfTheFolder(nameOfTheFolder);
        this.setCreatedDate(createdDate);
        this.setOwnerOfTheFolder(ownerOfTheFolder);
        this.setTypeOfTheFiles(typeOfTheFiles);
    }

    public String getNameOfTheFolder() {
        return nameOfTheFolder;
    }

    public void setNameOfTheFolder(String nameOfTheFolder) throws IOException {
       this.nameOfTheFolder = nameOfTheFolder;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getOwnerOfTheFolder() {
        return ownerOfTheFolder;
    }

    public void setOwnerOfTheFolder(String ownerOfTheFolder) {
        this.ownerOfTheFolder = ownerOfTheFolder;
    }

    public String getTypeOfTheFiles() {
        return typeOfTheFiles;
    }

    public void setTypeOfTheFiles(String typeOfTheFiles) {
        this.typeOfTheFiles = typeOfTheFiles;
    }
}

