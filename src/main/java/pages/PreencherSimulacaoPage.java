package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PreencherSimulacaoPage extends BasePage{

    @FindBy(id = "valorAplicar")
    private WebElement valorAplicarTextField;
    @FindBy(id = "valorInvestir")
    private WebElement valorInvestirTextField;
    @FindBy(id = "tempo")
    private WebElement tempoTextField;
    @FindBy(id = "rentabilidade")
    private WebElement rentabilidadeTextField;
    @FindBy(xpath = "//*[@id=\"formInvestimento\"]/div[7]/ul/li[2]/button")
    private WebElement simularButton;

    @FindBy(xpath = "//span[text()=\"Meses\"]")
    private WebElement mesesList;

    @FindBy(partialLinkText = "Anos")
    private WebElement anosLink;


    public PreencherSimulacaoPage(WebDriver driver) {
        super(driver);
    }

    public PreencherSimulacaoPage clicarAnos(){
        anosLink.click();
        return  this;
    }


    public PreencherSimulacaoPage clicarMesesList(){
        mesesList.click();
        return  this;
    }

    public PreencherSimulacaoPage preencherValorAplicar(String valorAplicar) {
        valorAplicarTextField.sendKeys(valorAplicar);
        return this;
    }


    public PreencherSimulacaoPage preencherValorInvestir(String valorInvestir) {
        valorInvestirTextField.sendKeys(valorInvestir);
        return this;
    }


    public PreencherSimulacaoPage preencherTempo(String tempo) {
        tempoTextField.sendKeys(tempo);
        return this;
    }

    public PreencherSimulacaoPage limparRentabilidade() {
        rentabilidadeTextField.clear();
        return this;
    }

    public PreencherSimulacaoPage preencherRentabilidade(Double rentabilidade) {
        rentabilidadeTextField.sendKeys(rentabilidade.toString());
        return this;
    }


    public PreencherSimulacaoPage clicarSimular() {
        simularButton.click();
        return this;
    }


}
