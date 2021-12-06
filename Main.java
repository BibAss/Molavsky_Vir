import utils.Utilities;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Utilities a = new Utilities();
        a.Downloading_Sys();
        a.Downloading_Debug();
        a.AutoLoad();
        a.Downloading_Video();
        a.Downloading_File();
        a.Exe_Video();
    }
}
