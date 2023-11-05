import java.nio.file.Paths;

public class Path {

	public static void main(String[] args) {
		java.nio.file.Path filePath = Paths.get("C:\\Users\\Joshua\\Desktop\\Something\\test.txt");
		
		int count = filePath.getNameCount();
		
		System.out.println(filePath.toString());
		System.out.println(filePath.getName(count - 1));
		System.out.println(count);
	}

}
