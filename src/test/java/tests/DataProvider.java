package tests;

public class DataProvider {

    @org.testng.annotations.DataProvider(name="providerPessoa")
    public static Object[][] getDataFromDataprovider() {
        return new Object[][]{
                {"Aline", "Zanin", "Doutorado", "Futebol", "Colocar Codigo Git"},
                {"Pedro", "Silva", "Doutorado", "Futebol", "Criar Report"},
        };
    }
}
