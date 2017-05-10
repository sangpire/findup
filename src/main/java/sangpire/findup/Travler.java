package sangpire.findup;

import java.io.File;

/**
 * 파일을 모조리 찾아내는 폴더 여행자.
 */
public class Travler {

    private Processer processer;

    public Processer getProcesser() {
        return processer;
    }

    public void setProcesser(Processer processer) {
        this.processer = processer;
    }

    public void visit(File dir) {
        processer.start();
        visit(0, dir);
        processer.finish();
    }

    private void visit(Integer depth, File dir) {
        if (depth > 1) {
            return;
        }

        File[] childFileList = dir.listFiles();
        if (childFileList == null) {
            // No Regular Files.
            return;
        }
        for(File file: childFileList) {
            if (file.exists()) {
                processer.put(file);
                if (file.isDirectory()) {
                    visit(depth + 1, file);
                }
            }
        }
    }
}