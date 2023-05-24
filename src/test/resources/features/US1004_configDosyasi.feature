
# Bir Scenario olusturunuz

# kullanici "amazonUrl" anasayfasinda
# kullanici 3 sn bekler
# url'in "amazon" icerdigini test eder
# sayfayi kapatir

  Feature: US1004 Kulanici parametre ile configiration file i kullanabilmeli
    @config
    Scenario:TC07 configiration properties dosyasindan parametre kullanimi
      Given kullnici "amazonUrl" sayfasinda
      Then kullanici 3 sn bekler
      And url'in "amazon" icerdigini test eder
      And sayfayi kapatir