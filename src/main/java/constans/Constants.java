package constans;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.platform.commons.util.PackageUtils;

import static com.codeborne.selenide.Selenide.$x;

public class Constants {

	public class DOMAINS_URL{
		public static final String LOGIN_URL = "https://www.ebesucher.com/login";
	}

	public class EMAILS_AND_PASSWORDS{
		public static final String USERNAME = "sserjioss";
		public static final String PASS = "S1481206t";
	}

	public class BUTTONS{
		public static final String surfNowButton = "//a[text()='Surf now']";
//		private final SelenideElement surfNowButton = $x("//a[text()='Surf now']");
	}

}
