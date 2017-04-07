package helpers;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ReadMatrixFromFile {
	private DataInputStream dis;
	private int[][] resultMatrix;
	private int widthSize;
	private int heightSize;
	private String fileName;
	
	public ReadMatrixFromFile(int width_size, int height_size, String file_name) {
		this.widthSize = width_size;
		this.heightSize = height_size;
		this.fileName = file_name;
	}
	
	public void readMatrix() {
		try{
			dis = new DataInputStream(new FileInputStream(fileName));
			
			resultMatrix = new int[widthSize][heightSize];
			
			String[] tempt1;
			for (int i = 0; i < widthSize; i++) {
				String s = dis.readLine();
				tempt1 = s.split(" ");
				
				for (int j = 0; j < heightSize; j += 1) {
					resultMatrix[i][j] = Integer.parseInt(tempt1[j]);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public int[][] getResultMatrix() {
		return resultMatrix;
	}
}
