# FactoryPattern

**DESIGN PATTERN**

- Geliştirme yaparken tekrar eden problemleri deneyip onaylanıp çözüm olarak sunulan kalıplardır. 
- Amaç, okunabilirliği arttırmak, clean kod 

**FACTORY DESIGN PATTERN (CREATIONAL PATTERN)**

- Aynı abstract / interface' den türeyen nesnelerin üretiminden sorumlu yapıdır.
- Amaç, geliştirme yapılırken yeni bir feature eklerken en az dokunuş ile client' I bu duruma hiç sokmadan yapabilmek amaçlanmıştır. Kullanııcını her seçiminde kod değişikliği yapmamak için. (araba seçimi vs.)
- Birbirine benzeyen sınıfları oluştururken her seferinde new operatörünü kullanak ya da sınıflar sanki birbirinden bağımsızmış gibi kod yazılmaması için kullanılmaktadır.
- Bir sınıf oluştururken arada bir interface kullanarak kullancılacak sınıfları kümeleyerek, araya bir factory sınıfı ekleyerek kodu daha soyut hale getirmektedir.
 
