package space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

import java.io.File;

public class FileSearch implements Runnable {
    private String initPath;
    private String fileName;

    public FileSearch(String initPath, String fileName) {
        this.initPath = initPath;
        this.fileName = fileName;
    }
    @Override
    public void run() {
        File file = new File(initPath);
        try {
            if (file.isDirectory()) {
                    directoryProcess(file);
            }
        } catch (InterruptedException e) {
            System.out.printf("%s: The search has been interrupted.", Thread.currentThread().getName());
        }
    }

    private void directoryProcess(File file) throws InterruptedException {
        File[] fileList = file.listFiles();
        if (fileList != null) {
            for(int i=0; i<fileList.length; i++) {
                if (fileList[i].isDirectory()) {
                    directoryProcess(fileList[i]);
                }else {
                    fileProcessor(fileList[i]);
                }
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
    }

    private void fileProcessor(File file) throws InterruptedException {
        if (file.getName().equals(fileName)) {
            System.out.printf("%s : %s\n", Thread.currentThread().getName(), file.getAbsolutePath());
        }

        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
    }
}
