package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ResultadoSimulacaoPage extends BasePage{

    @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div[2]/span[1]/strong")
    private WebElement mesesText;
    @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div[2]/span[2]")
    private WebElement valorText;

    @FindBy(xpath = "//span[text()=\"R$ 10.600\"]")
    private WebElement valorGuardadoLabel;

    @FindBy(xpath = "//span[text()=\"Em \"]")
    private WebElement teraGuardadoLabel;

    @FindBy(partialLinkText = "Localize a Unidade de Atendimento mais próxima")
    private WebElement localizarAgenciaLink;

    @FindBy(partialLinkText = "Experimente o Simulador de Poupança")
    private WebElement experimentarPoupancaLink;





    public ResultadoSimulacaoPage(WebDriver driver) {
        super(driver);
    }


    public ResultadoSimulacaoPage clicarExperimentarPoupanca(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Experimente o Simulador de Poupança")));
        experimentarPoupancaLink.click();
        return this;
    }

    public ResultadoSimulacaoPage clicarAgenciaMaisProxima(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Localize a Unidade de Atendimento mais próxima")));
        localizarAgenciaLink.click();
        return this;
    }


    public  WebElement capturateraGuardadoLabel(){
        return  valorGuardadoLabel;
    }

    public  String capturaValorGuardadoLabelText(){
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()=\"R$ 10.600\"]")));
        return  valorGuardadoLabel.getText();
    }


    public  String capturaEmLabelText(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()=\"Em \"]")));
        return  teraGuardadoLabel.getText();
    }


    public String capturarMeses() {
        return mesesText.getText();
    }

    public String capturarValor() {
        return valorText.getText();
    }




}
