package sangpire.findup;

import java.io.File;

/**
 * 뭔가 기가막힌 이름이 없을까?
 */
public interface Processer {

    /**
     * 작업 시작했어요. 이제 파일 찾으러 갈 꺼예요.
     */
    void start();

    /**
     * 여기 파일이요.
     * @param file 방금 찾은 파일.
     */
    void put(File file);

    /**
     * 다 찾아 줬어요.
     */
    void finish();
}
