package exception;

import java.io.FileInputStream; //file�� �о���̴� ��ü�� FileInputStream
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExceptionApp {

	public static void main(String[] args) {
		
		readFile("file1.txt");
		
		writeFile("file2.txt", "Youngmin\nPark");
		
		String content = readFile("file2.txt");
		System.out.println(content);
		
	}
	
	public static String readFile(String pathName) { // ���� �б�
		FileInputStream file = null;
		
		try {
			file = new FileInputStream(pathName); // ������ ȣ��
			byte[] bytes = new byte[1024]; // FileStream�� byte�� �а� ������ �Ǿ� �־ byte�� ���. ���� �����͸� ������ �� �ִ� ������ ����
			file.read(bytes);
			return new String(bytes); // byte�迭�� String���� ��ȯ(�˻����� ã��)
			
		} catch (IOException e) { //FileNotFoundException���� ���ܸ� ������� �� �θ��� IOException�� ����� �ʿ��Ͽ�, IOException �ϳ��� ó��
			System.out.println(pathName + " is not found");		
			//e.printStackTrace(); ���ܰ� �߻��ϱ������ ������ ������, ���� �ֱ� ��Ϻ��� ���� ��� ������ ������. ������ ���⿡ ���� ����.
		} finally {
			try {
				file.close();
			} catch (Exception e) { //NullPointException�� �߻��Ͽ� Exception���� �ٲ�
			}
		}
		
		return null;
		
	}
	
	public static void writeFile(String pathName, String content) { //���� ����
		FileOutputStream file = null;
		
		try {
			file = new FileOutputStream(pathName);
			file.write(content.getBytes());
		} catch (FileNotFoundException e) {
			System.out.println(pathName + " is not found");
		} catch (IOException e) { 									// IOException ������ �аų� �� �� ���� �� �߻��ϴ� ����
			System.out.println("IOException �߻�");
		} finally {
			try {
				file.close(); // �ݵ�� ����� �Ѵ�. file.close()�� �� �ϸ� ������ ��� �����ִ� ����.
			} catch (IOException e) { //������ �� �ݴ� ��찡 ���� ���� ����
				e.printStackTrace();
			}
		}
	}
	
	
}
