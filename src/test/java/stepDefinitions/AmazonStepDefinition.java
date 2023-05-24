package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPage = new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {

        amazonPage.searchBox.sendKeys("Nutella", Keys.ENTER);
    }

    @And("sonuclarin Nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {

        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains("Nutella"));

    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici Java icin arama yapar")
    public void kullanici_java_icin_arama_yapar() {
        amazonPage.searchBox.sendKeys("Java", Keys.ENTER);
    }
    @Then("sonuclarin Java icerdigini test eder")
    public void sonuclarin_java_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains("Java"));
    }

    @Then("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.searchBox.sendKeys("iphone",Keys.ENTER);

    }

    @And("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains("iphone"));
    }
    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String istenenKelime) {
        amazonPage.searchBox.sendKeys(istenenKelime + Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String istenenKelime) {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains(istenenKelime));

    }

    @Given("kullnici {string} sayfasinda")
    public void kullniciSayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye){
        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //yazdirma isine yarar
        }
    }

    @And("url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String istenenKelime) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(istenenKelime));
    }
}
