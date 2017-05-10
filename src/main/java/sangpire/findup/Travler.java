package sangpire.findup;

import java.io.File;
import java.util.Collections;

/**
 * 파일을 모조리 찾아내는 폴더 여행자.
 */
public class Travler {

    public void visit(File dir) {
        visit(0, dir);
    }

    void visit(Integer depth, File dir) {
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
                visit(depth + 1, file);
            }
        }
    }
}