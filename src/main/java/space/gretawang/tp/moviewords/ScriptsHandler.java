package main.java.space.gretawang.tp.moviewords;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ScriptsHandler {
    public static void main(String[] args) {
        try {
            List<String> scriptLines = FileUtils.readLines(new File("C:\\Users\\leandev\\Downloads\\Kung.Fu.Panda.2008.720p.BrRip.x264.YIFY.srt"), "UTF-8");
            for (String line : scriptLines) {
                if (StringUtils.isNumeric(line) || StringUtils.isEmpty(line) || line.contains(":")) {
                    continue;
                }
                FileUtils.write(new File("C:\\Users\\leandev\\Desktop\\Test.txt"), line+"\n", "UTF-8", true);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
