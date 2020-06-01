package entities;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerAdapter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import report.ReportListener;

@Listeners({ExtentITestListenerAdapter.class, ReportListener.class})
public class BaseTest {

    /*ATENÇÃO:
    ** Para Geração de relatórios foi feito o seguinte:
    * - Foi alterada a visivilidade do método getDriver para public
    * e do atributo driver para protected, isto para permitir que a classe
    * ReportListner consiga enxerga-los.
    * Também adicionado a linha @Listeners
    * que faz com que a classe de relatórios fique ouvindo as execução para
    * registrar sucesso ou erro
    * - Foi adicionado o Pacote report e a classe ReportListner
    * - em resources de testes foram adicionados extent.properties e html-config.xml
    * Foi adicionado um arquivo chamado */


    public String driverPath;
    public String url;
    protected static WebDriver driver;

    @BeforeClass
    public void preCond(){
        driverPath = "C:\\Users\\aline.zanin\\webdriver\\chrome\\83.0.4103.39\\chromedriver.exe"; //variavel que armazena o caminho do driver
        System.setProperty("webdriver.chrome.driver", driverPath);//instancia do driver
        driver = new ChromeDriver(); //instancia do navegador
        String url = "https://www.sicredi.com.br/html/ferramenta/simulador-investimento-sicredinvest/";
        driver.get(url);// abre o navegador na url especificada
        driver.manage().window().maximize();    //maximiza a tela
    }

    @AfterClass
    public void posCond(){
     driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }


}
