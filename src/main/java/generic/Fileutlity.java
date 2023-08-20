package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class Fileutlity {
	public String readdatafromproperty(String key) throws IOException {
		FileInputStream fis =new FileInputStream(Ipath.Filepath);
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		}
}
