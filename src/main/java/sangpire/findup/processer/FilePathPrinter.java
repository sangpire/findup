package sangpire.findup.processer;

import sangpire.findup.Processer;

import java.io.File;

public class FilePathPrinter implements Processer {

    @Override
    public void start() {
        System.out.println("START File Path Printing...");
    }

    @Override
    public void put(File file) {
        String fileMetaInfos =String.format("[%s] %s\n", file.isDirectory() ? "d" : "-" ,  file.getAbsolutePath());
        System.out.print(fileMetaInfos);
    }

    @Override
    public void finish() {
        System.out.println("FINISHED File Path Printing...");
    }
}
