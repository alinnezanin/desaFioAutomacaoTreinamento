package tests;


import entities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PreencherSimulacaoPage;
import pages.ResultadoSimulacaoPage;

import java.util.concurrent.TimeUnit;

//@Listeners(TM4JTestNGListener.class)
public class RealizarSimulacaoTest extends BaseTest {

    @Test
    public void deveRealizarSimulacao() throws InterruptedException {

        PreencherSimulacaoPage page = new PreencherSimulacaoPage(getDriver());
        ResultadoSimulacaoPage pageResultado = new ResultadoSimulacaoPage(getDriver());

        String tempo  = "3";
        page.preencherValorAplicar("1000000");
        page.preencherValorInvestir("20000");
        page.preencherTempo(tempo);
        page.limparRentabilidade();
        page.preencherRentabilidade(4.00);
        page.clicarSimular();

        Assert.assertEquals(pageResultado.capturaValorGuardadoLabelText(),"R$ 10.600", "Valor incorreto");
        Assert.assertEquals(pageResultado.capturaEmLabelText(),"Em "+tempo+" meses você terá guardado", "Valor incorreto");


        pageResultado.clicarAgenciaMaisProxima();





    }







}
