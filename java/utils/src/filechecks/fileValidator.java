package filechecks;

import java.io.File;

public class fileValidator {
	public static boolean resolveExistingPath(String filePath) {
		File file = new File(filePath);
		String home = "F:" + File.separator + "DAW"; 

		if (filePath.contains(home)) {
			return true;
		} else {
			return false;
		}
	} // resolveExistingPath

	public static String resolveFilePath(String filePath) {
		File file = new File(filePath);

		if (file.exists()) {
			return filePath;
		} else {
			return null;
		}
	} // isFileExist

}
