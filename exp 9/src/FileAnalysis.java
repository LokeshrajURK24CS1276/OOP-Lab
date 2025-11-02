import java.io.*;

public class FileAnalysis {
    public static void main(String[] args) {
    	String inputFile = "C:\\Users\\LOKESHRAJ M\\OOP Lab\\data.txt";
        String reportFile = "report.txt";

        try {
            // Clear old report file
            new FileWriter(reportFile, false).close();

            System.out.println("=== Using Character Stream ===");
            analyzeUsingCharacterStream(inputFile, reportFile);

            System.out.println("\n=== Using Byte Stream ===");
            analyzeUsingByteStream(inputFile, reportFile);

            System.out.println("\n Both results saved successfully in '" + reportFile + "'.");

        } catch (IOException e) {
            System.out.println("Error initializing report file: " + e.getMessage());
        }
    }

    // ---------- CHARACTER STREAM ----------
    public static void analyzeUsingCharacterStream(String inputFile, String reportFile) {
        int charCount = 0, wordCount = 0, lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty())
                    wordCount += words.length;
            }

            // Display on console
            System.out.println("Characters: " + charCount);
            System.out.println("Words     : " + wordCount);
            System.out.println("Lines     : " + lineCount);

            // Append report
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(reportFile, true))) {
                bw.write("=== Report using Character Stream ===\n");
                bw.write("Total Characters: " + charCount + "\n");
                bw.write("Total Words     : " + wordCount + "\n");
                bw.write("Total Lines     : " + lineCount + "\n");
                bw.write("------------------------------------\n");
            }

        } catch (IOException e) {
            System.out.println("Error (Character Stream): " + e.getMessage());
        }
    }

    // ---------- BYTE STREAM ----------
    public static void analyzeUsingByteStream(String inputFile, String reportFile) {
        int charCount = 0, wordCount = 0, lineCount = 0;
        StringBuilder content = new StringBuilder();

        try (FileInputStream fis = new FileInputStream(inputFile)) {
            int b;
            while ((b = fis.read()) != -1) {
                charCount++;
                content.append((char) b);
            }

            String text = content.toString();
            String[] lines = text.split("\r?\n");
            lineCount = lines.length;

            for (String line : lines) {
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty())
                    wordCount += words.length;
            }

            // Display on console
            System.out.println("Characters: " + charCount);
            System.out.println("Words     : " + wordCount);
            System.out.println("Lines     : " + lineCount);

            // Append report
            try (FileOutputStream fos = new FileOutputStream(reportFile, true)) {
                String report = "=== Report using Byte Stream ===\n" +
                                "Total Characters: " + charCount + "\n" +
                                "Total Words     : " + wordCount + "\n" +
                                "Total Lines     : " + lineCount + "\n" +
                                "------------------------------------\n";
                fos.write(report.getBytes());
            }

        } catch (IOException e) {
            System.out.println("Error (Byte Stream): " + e.getMessage());
        }
    }
}
