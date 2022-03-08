import java.io.IOException;
import java.util.ArrayList;

public class saple {
	
	
	public static void main(String[] args) throws IOException {
	
	
	dataDriven d = new dataDriven();
		
		ArrayList data = d.getData("test data");
		System.out.println(data.get(3));
		
		
		
}
}