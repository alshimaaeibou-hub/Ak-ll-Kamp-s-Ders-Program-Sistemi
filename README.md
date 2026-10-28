# Smart Campus Schedule System (Akıllı Kampüs Ders Programı)

## 📌 Proje Hakkında
Bu proje, Nesneye Yönelik Programlama (OOP) ilkeleri ve tasarım desenleri kullanılarak geliştirilmiş bir akıllı kampüs ders programı yönetim sistemidir. Konsol üzerinden çalışır ve verilerin kalıcı olmasını sağlar.

## 🛠️ Kullanılan Teknolojiler ve Prensipler
* **Dil:** Java
* **Geliştirme Ortamı:** IntelliJ IDEA
* **Tasarım Desenleri (Design Patterns):** Singleton, Factory Pattern
* **Testler:** Unit Tests (8 adet başarılı birim testi)

## 📁 Sınıf Yapısı (Classes)
1. **Course:** Ders bilgilerini tutar (Kod, Ad, Kredi, Tür).
2. **Instructor:** Akademisyen bilgilerini tutar.
3. **Classroom:** Sınıf ve kapasite bilgilerini tutar.
4. **ScheduleManager:** Singleton desenine göre tasarlanmış ders programı yönetim sınıfı.
5. **CourseFactory:** Nesne üretimini yöneten Factory desen sınıfı.
6. **DataManager:** Verilerin dosyaya kalıcı olarak kaydedilmesini ve okunmasını sağlar.
7. **Main:** Programın çalıştırıldığı ana sınıf.
8. **SmartCampusTest:** Sistem testlerinin yapıldığı birim test sınıfı.

## ▶️ Projenin Çalıştırılması
1. Projeyi IntelliJ IDEA üzerinde açın.
2. `Main.java` dosyasını çalıştırarak konsol çıktısını gözlemleyin.
3. `SmartCampusTest.java` dosyasını çalıştırarak 8 adet birim testinin başarıyla çalıştığını doğrulayın.
