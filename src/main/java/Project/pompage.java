package Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class pompage {
	public pompage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public Workbook workbook;
	public static File filePath=new File(".\\src\\test\\resources\\Testdata\\testdata.xlsx");

	public String getData(String sheet, int row, int column) throws IOException {

		FileInputStream fis = new FileInputStream(filePath);
		workbook=WorkbookFactory.create(fis);
		Cell cell = workbook.getSheet(sheet).getRow(row).getCell(column);
		return cell.getStringCellValue();
	}
	//tour button
	@FindBy(id="list")
	private WebElement Tourbutton;
	
	@FindBy(linkText="Admin")
	private WebElement Adminbuttton;

	public WebElement getTourbutton() {
		return Tourbutton;
	}

	public WebElement getAdminbuttton() {
		return Adminbuttton;
	}
	
	//admin page
	@FindBy(name="email")
	private WebElement Usernametextfield;
	
	@FindBy(name="password")
	private WebElement passwordtextfield;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement Submitbutton;

	public WebElement getUsernametextfield() {
		return Usernametextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getSubmitbutton() {
		return Submitbutton;
	}
	//forget password
	@FindBy(linkText="Click Here")
	private WebElement forgotpassword_clickhere;
	
	@FindBy(id="email-for-pass")
	private WebElement Enter_emailid;
	
	@FindBy(xpath="//button[text()='Get OTP']")
	private WebElement getotp;
	
	@FindBy(linkText="Back to Login")
	private WebElement backtologin;

	public WebElement getForgotpassword_clickhere() {
		return forgotpassword_clickhere;
	}

	public WebElement getEnter_emailid() {
		return Enter_emailid;
	}

	public WebElement getGetotp() {
		return getotp;
	}

	public WebElement getBacktologin() {
		return backtologin;
	}
	
	//enter otp
	@FindBy(id="opt")
	private WebElement enterotp;
	
	@FindBy(name="recover-submit")
	private WebElement resetpassword;

	public WebElement getEnterotp() {
		return enterotp;
	}

	public WebElement getResetpassword() {
		return resetpassword;
	}
	
	// reset password
	@FindBy(name="password")
	private WebElement newpassword;
	
	@FindBy(name="confPassword")
	private WebElement confpassword;

	public WebElement getNewpassword() {
		return newpassword;
	}

	public WebElement getConfpassword() {
		return confpassword;
	}
	
	//add 
	
	@FindBy(xpath="//a[@href=\"addQuestion.jsp\"]")
	private WebElement add_click;
	
	@FindBy(name="question")
	private WebElement addquestions;
	
	@FindBy(name="a")
	private WebElement option1a;
	
	@FindBy(name="b")
	private WebElement option1b;
	
	@FindBy(name="c")
	private WebElement option1c;
	
	@FindBy(name="d")
	private WebElement option1d;

	

	public Workbook getWorkbook() {
		return workbook;
	}

	public WebElement getAdd_click() {
		return add_click;
	}

	public WebElement getQuestionset() {
		return Questionset;
	}

	public WebElement getSelect_questionset() {
		return select_questionset;
	}

	public WebElement getAddquestions() {
		return addquestions;
	}

	public WebElement getOption1a() {
		return option1a;
	}

	public WebElement getOption1b() {
		return option1b;
	}

	public WebElement getOption1c() {
		return option1c;
	}

	public WebElement getOption1d() {
		return option1d;
	}
	
	//radio button
	@FindBy(xpath="(//input[@type=\"radio\"])[1]")
	public WebElement answer_a;
	
	@FindBy(xpath="//input[@value=\"B\"]")
	public WebElement answer_b;
	
	@FindBy(xpath="//input[@value=\"C\"]")
	public WebElement answer_c;
	
	@FindBy(xpath="//input[@value=\"D\"]")
	public WebElement answer_d;

	public WebElement getAnswer_a() {
		return answer_a;
	}

	public WebElement getAnswer_b() {
		return answer_b;
	}

	public WebElement getAnswer_c() {
		return answer_c;
	}

	public WebElement getAnswer_d() {
		return answer_d;
	}
	
	//set
	@FindBy(xpath="//input[@value=\"1\"]")
	private WebElement set_1;
	
	@FindBy(xpath="//input[@value=\"2\"]")
	private WebElement set_2;
	
	@FindBy(xpath="//input[@value=\"3\"]")
	private WebElement set_3;

	public WebElement getSet_1() {
		return set_1;
	}

	public WebElement getSet_2() {
		return set_2;
	}

	public WebElement getSet_3() {
		return set_3;
	}
	//addbutton
	@FindBy(xpath="//input[@value=\"Add\"]")
	private WebElement ADD_button;

	public WebElement getADD_button() {
		return ADD_button;
	}
	
	//question set
	@FindBy(linkText="Questions Set")
	private WebElement Questionset;
	
	@FindBy(name="set")
	private WebElement select_questionset;
	
	//logout
	@FindBy(xpath="//a[@href=\"adminLogout.jsp\"]")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
	
	
	
	

}
