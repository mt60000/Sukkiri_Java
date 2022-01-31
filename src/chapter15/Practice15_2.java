package chapter15;

public class Practice15_2 {
	public String Path(String folder, String file) {
		if (!folder.endsWith("¥¥")) {
			folder += "¥¥";
		}
		return folder + file;
	}
}
