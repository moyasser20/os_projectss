import java.io.File; // to manipulate files and directories in the filesystem.

public class CLI {
    private File currentDirectory;

    public CLI()
    {
        this.currentDirectory = new File(System.getProperty("user.dir"));
    }

    public String pwd()
    {
        return  currentDirectory.getAbsolutePath();
    }



}
