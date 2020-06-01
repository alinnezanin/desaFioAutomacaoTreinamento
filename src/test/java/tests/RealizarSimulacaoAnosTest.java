package tests;


import entities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PreencherSimulacaoPage;
import pages.ResultadoSimulacaoPage;

//@Listeners(TM4JTestNGListener.class)
public class RealizarSimulacaoAnosTest extends BaseTest {

    @Test
    public void deveRealizarSimulacao() throws InterruptedException {

        PreencherSimulacaoPage page = new PreencherSimulacaoPage(getDriver());
        ResultadoSimulacaoPage pageResultado = new ResultadoSimulacaoPage(getDriver());

        String tempo  = "3";
        page.preencherValorAplicar("1000000");
        page.preencherValorInvestir("20000");
        page.clicarMesesList();
        page.clicarAnos();
        page.preencherTempo(tempo);
        page.limparRentabilidade();
        page.preencherRentabilidade(4.00);
        page.clicarSimular();


        Assert.assertEquals(pageResultado.capturaValorGuardadoLabelText(),"R$ 10.600", "Valor incorreto");
        Assert.assertEquals(pageResultado.capturaEmLabelText(),"Em "+tempo+" meses você terá guardado", "Valor incorreto");







    }







}
