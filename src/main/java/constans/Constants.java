package constans;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Constants {

	public class DOMAINS_URL{
		public static final String LOGIN_URL = "https://my.airslate.com/login";
	}

	public class EMAILS_AND_PASSWORDS{
		public static final String SERJIOS_EMAIL = "serjios@ukr.net";
		public static final String SERJIOS_WRONG_EMAIL = "serjios2@ukr.net";
		public static final String EMAIL_WITHOUT_DOG_CHARACTER = "serjiosukr.net";
		public static final String EMAIL_WITH_SPACES_BEFORE_AND_AFTER = "     serjios@ukr.net     ";
		public static final String SERJIOS_PASS = "1481206t";
		public static final String SERJIOS_WRONG_PASS = "1481206T";
	}

}
