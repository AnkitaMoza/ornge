package utillity1;

import java.io.FileInputStream;
import java.util.Properties;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class PrpDemo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
	}

}
