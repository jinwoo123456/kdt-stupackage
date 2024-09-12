package helpers;
import java.io.FileReader;
import java.io.File;
import java.util.Scanner;

public class Readfile {

    // 파일존재확인메소드
    public String file_path = "";

    public static void isfileExists() {
        File file = new File("C:\\workspace\\algo\\ALGO\\src");

        Scanner scanner = new Scanner(System.in);
        if (file.exists()) {
            System.out.println("파일이 존재합니다.");

        } else {
            System.out.println("파일이 존재하지 않습니다.");
            scanner.nextInt();
            System.out.println("파일을 생성할까요? (y/n)");
            if (scanner.next().equals("y")) {
                try {
                    file.createNewFile();
                    System.out.println("파일이 생성되었습니다.");
                } catch (Exception e) {
                    e.getStackTrace();
                }
            }
        }

    }

    public void GetMineFile() {
        File directory = new File("C:\\workspace");
        // Implement the method logic here
        if (directory.("Mine")) {  ////여기아직수정안함
            System.out.println("Mine: " + directory);

        }

    }

    public static boolean isMineFile(String fileNames) {
        return fileNames.contains("Mine");
    }

    public static void main(String[] args) {
        String[] fileNames = { "MineSweeper.java", "MineSweeperTest.java", "MineSweeperTest2.java" };
        String[] notMineFiles = new String[fileNames.length];
        String[] mineFiles = new String[fileNames.length];

        for (int i = 0; i < fileNames.length; i++) {
            if (isMineFile(fileNames[i]) == false) {
                notMineFiles[i] = fileNames[i];
            } else {
                mineFiles[i] = fileNames[i];
            }
        }
        GetMineFile(directory);
        System.out.println("Hello, World!");
        for (int i = 0; i < notMineFiles.length; i++) {
            System.out.println("mine이 없는 파일 = " + notMineFiles[i]);
        }
        for (int i = 0; i < mineFiles.length; i++) {
            System.out.println("mine이 있는 파일 = " + mineFiles[i]);
        }

    }

}
