package sangpire.findup;

import java.io.File;
import java.util.Collections;

/**
 * 주석 추가.
 */
public class Worker {

    File rootDir;

    public Worker(File rootDir) {
        this.rootDir = rootDir;
    }

    public void cleanUp() {
        lookupDir(0, this.rootDir);
    }

    void lookupDir(Integer depth, File dir) {
        if (depth > 1) {
            return;
        }
        String margin = String.join("", Collections.nCopies(depth, "  "));
        File[] childFileList = dir.listFiles();
        if (childFileList == null) {
            String fileMetaInfos =String.format("%sEmpty!?\n", margin);
            System.out.print(fileMetaInfos);
            return;
        }
        for(File file: childFileList) {
            
            String fileMetaInfos =String.format("%s%s - %s\n", margin, file.isDirectory() ? "d" : "-" ,  file.getAbsolutePath());
            System.out.print(fileMetaInfos);
            if (file.exists() && file.isDirectory()) {
                lookupDir(depth + 1, file);
            }
        }
    }
}