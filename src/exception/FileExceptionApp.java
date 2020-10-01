package exception;

import java.io.FileInputStream; //file을 읽어들이는 객체가 FileInputStream
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
	
	public static String readFile(String pathName) { // 파일 읽기
		FileInputStream file = null;
		
		try {
			file = new FileInputStream(pathName); // 생성자 호출
			byte[] bytes = new byte[1024]; // FileStream이 byte를 읽고 쓰도록 되어 있어서 byte를 사용. 읽은 데이터를 저장할 수 있는 공간을 만듦
			file.read(bytes);
			return new String(bytes); // byte배열을 String으로 변환(검색으로 찾음)
			
		} catch (IOException e) { //FileNotFoundException으로 예외를 잡았으나 그 부모인 IOException의 기능이 필요하여, IOException 하나로 처리
			System.out.println(pathName + " is not found");		
			//e.printStackTrace(); 예외가 발생하기까지의 과정을 보여줌, 가장 최근 기록부터 이전 기록 순으로 보여줌. 하지만 보기에 좋지 않음.
		} finally {
			try {
				file.close();
			} catch (Exception e) { //NullPointException이 발생하여 Exception으로 바꿈
			}
		}
		
		return null;
		
	}
	
	public static void writeFile(String pathName, String content) { //파일 쓰기
		FileOutputStream file = null;
		
		try {
			file = new FileOutputStream(pathName);
			file.write(content.getBytes());
		} catch (FileNotFoundException e) {
			System.out.println(pathName + " is not found");
		} catch (IOException e) { 									// IOException 파일을 읽거나 쓸 수 없을 때 발생하는 예외
			System.out.println("IOException 발생");
		} finally {
			try {
				file.close(); // 반드시 해줘야 한다. file.close()를 안 하면 파일이 계속 열려있는 상태.
			} catch (IOException e) { //파일을 못 닫는 경우가 있을 수도 있음
				e.printStackTrace();
			}
		}
	}
	
	
}
