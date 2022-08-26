package excelReadWrite;

import java.io.IOException;

public class ExlWriteRead extends ExlReadWriteUtil {

	public static void main(String[] args) throws IOException {
		ExlWriteRead re = new ExlWriteRead();
		re.write(0, 0, 0,"mayur");
		re.write(0, 0, 1, "10/Jan");
		re.write(0, 0, 2, 1996);
		
		System.out.println((re.readString(0, 0, 0)));
		System.out.println(re.readString(0, 0, 1));
		//System.out.println(re.readNumeric(0, 0, 2));
	}
	
}
