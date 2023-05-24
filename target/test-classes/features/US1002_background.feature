# iki Scenario olusturunuz

# her iki scenario'da ortak adım:  kullanici amazon anasayfasinda


# kullanici Nutella icin arama yapar
# sonuclarin Nutella icerdigini test eder
# sayfayi kapatir


# kullanici Java icin arama yapar
# sonuclarin Java icerdigini test eder
# sayfayi kapatir
  Feature: US1002 Kullanici Ortak Adimlari Background ile calistirir
    Background: ortak adim olani tek seferde backround altinda yazariz
      Given kullanici amazon sayfasina gider

      Scenario: TC04 Kullanici amazonda nutella aratir
        Given kullanici Nutella icin arama yapar
        Then sonuclarin Nutella icerdigini test eder
        And sayfayi kapatir

        Scenario: TC05 Kullanici Amazonda Java Aratir
          Given kullanici Java icin arama yapar
          Then sonuclarin Java icerdigini test eder
          And sayfayi kapatir
