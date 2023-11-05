import java.util.Scanner;
import java.nio.file.*;

public class PathDemo2 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String name;
		java.nio.file.Path inputPath;
		java.nio.file.Path fullPath;
		
		System.out.println("Enter a file name: ");
		name = console.nextLine();
		
		inputPath = Paths.get(name);
		fullPath = inputPath.toAbsolutePath();
		
		System.out.println("The full path is: " + fullPath);

	}

}
