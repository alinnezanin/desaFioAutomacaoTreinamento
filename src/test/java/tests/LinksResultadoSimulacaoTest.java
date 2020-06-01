package tests;


import entities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PreencherSimulacaoPage;
import pages.ResultadoSimulacaoPage;

//@Listeners(TM4JTestNGListener.class)
public class LinksResultadoSimulacaoTest extends BaseTest {

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

        pageResultado.clicarAgenciaMaisProxima();
        Assert.assertEquals("https://www.sicredi.com.br/site/localizar-agencia", driver.getCurrentUrl());

        page.voltar();
        page.clicarSimular();

        pageResultado.clicarExperimentarPoupanca();
        Assert.assertEquals("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/", driver.getCurrentUrl());

        page.voltar();






        //   pageResultado.clicarExperimentarPoupanca();






    }







}
