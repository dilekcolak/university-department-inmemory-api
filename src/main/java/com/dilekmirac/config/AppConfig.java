package com.dilekmirac.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dilekmirac.model.UniversityDepartment;

@Configuration
public class AppConfig {
	
	@Bean
	public List<UniversityDepartment> departmentList() {
		
		List<UniversityDepartment> departmentList = new ArrayList<>();
		
		departmentList.add(new UniversityDepartment(1,"Boğaziçi Üniversitesi", "Mühendislik Fakültesi", "Bilgisayar Mühendisliği", "Sayısal", 560.12, 1234, 80, "İstanbul", true));
        departmentList.add(new UniversityDepartment(2,"ODTÜ", "Mühendislik Fakültesi", "Elektrik-Elektronik Mühendisliği", "Sayısal", 555.78, 1500, 90, "Ankara", true));
        departmentList.add(new UniversityDepartment(3,"İTÜ", "Mimarlık Fakültesi", "Mimarlık", "Sayısal", 510.45, 3200, 100, "İstanbul", true));
        departmentList.add(new UniversityDepartment(4,"Hacettepe Üniversitesi", "Sağlık Bilimleri Fakültesi", "Diş Hekimliği", "Sayısal", 530.23, 2200, 70, "Ankara", true));
        departmentList.add(new UniversityDepartment(5,"Bilkent Üniversitesi", "İktisadi ve İdari Bilimler Fakültesi", "İşletme", "Eşit Ağırlık", 495.67, 5000, 60, "Ankara", false));
        departmentList.add(new UniversityDepartment(6,"Koç Üniversitesi", "Hukuk Fakültesi", "Hukuk", "Eşit Ağırlık", 540.89, 1800, 50, "İstanbul", false));
        departmentList.add(new UniversityDepartment(7,"Sabancı Üniversitesi", "Mühendislik ve Doğa Bilimleri Fakültesi", "Endüstri Mühendisliği", "Sayısal", 515.34, 3400, 65, "İstanbul", false));
        departmentList.add(new UniversityDepartment(8,"Ege Üniversitesi", "Fen Fakültesi", "Biyoloji", "Sayısal", 420.12, 17000, 90, "İzmir", true));
        departmentList.add(new UniversityDepartment(9,"Dokuz Eylül Üniversitesi", "İktisadi ve İdari Bilimler Fakültesi", "İktisat", "Eşit Ağırlık", 405.67, 19000, 100, "İzmir", true));
        departmentList.add(new UniversityDepartment(10,"Ankara Üniversitesi", "Hukuk Fakültesi", "Hukuk", "Eşit Ağırlık", 530.45, 2100, 80, "Ankara", true));
        departmentList.add(new UniversityDepartment(11,"Yıldız Teknik Üniversitesi", "Mühendislik Fakültesi", "Makine Mühendisliği", "Sayısal", 480.23, 6000, 120, "İstanbul", true));
        departmentList.add(new UniversityDepartment(12,"Marmara Üniversitesi", "İlahiyat Fakültesi", "İlahiyat", "Sözel", 390.45, 23000, 150, "İstanbul", true));
        departmentList.add(new UniversityDepartment(13,"İzmir Yüksek Teknoloji Enstitüsü", "Mühendislik Fakültesi", "Bilgisayar Mühendisliği", "Sayısal", 500.67, 4000, 40, "İzmir", true));
        departmentList.add(new UniversityDepartment(14,"TOBB ETÜ", "İktisadi ve İdari Bilimler Fakültesi", "Uluslararası İlişkiler", "Eşit Ağırlık", 470.23, 7000, 30, "Ankara", false));
        departmentList.add(new UniversityDepartment(15,"Bahçeşehir Üniversitesi", "Mühendislik Fakültesi", "Yazılım Mühendisliği", "Sayısal", 460.12, 7500, 40, "İstanbul", false));
        departmentList.add(new UniversityDepartment(16,"Galatasaray Üniversitesi", "İktisadi ve İdari Bilimler Fakültesi", "İşletme", "Eşit Ağırlık", 520.45, 2500, 35, "İstanbul", true));
        departmentList.add(new UniversityDepartment(17,"İstanbul Üniversitesi", "Fen Fakültesi", "Matematik", "Sayısal", 410.34, 20000, 80, "İstanbul", true));
        departmentList.add(new UniversityDepartment(18,"Akdeniz Üniversitesi", "Sağlık Bilimleri Fakültesi", "Hemşirelik", "Sayısal", 400.12, 22000, 110, "Antalya", true));
        departmentList.add(new UniversityDepartment(19,"Atatürk Üniversitesi", "Edebiyat Fakültesi", "Tarih", "Sözel", 380.78, 25000, 90, "Erzurum", true));
        departmentList.add(new UniversityDepartment(20,"Çukurova Üniversitesi", "Mühendislik Fakültesi", "İnşaat Mühendisliği", "Sayısal", 450.23, 9000, 85, "Adana", true));
        departmentList.add(new UniversityDepartment(21,"Boğaziçi Üniversitesi", "Mühendislik Fakültesi", "Elektrik-Elektronik Mühendisliği", "Sayısal", 545.20, 1600, 85, "İstanbul", true));
        departmentList.add(new UniversityDepartment(22,"Boğaziçi Üniversitesi", "Mühendislik Fakültesi", "İnşaat Mühendisliği", "Sayısal", 530.10, 2100, 90, "İstanbul", true));
        departmentList.add(new UniversityDepartment(23,"Boğaziçi Üniversitesi", "İktisadi ve İdari Bilimler Fakültesi", "İşletme", "Eşit Ağırlık", 520.00, 2800, 70, "İstanbul", true));
        departmentList.add(new UniversityDepartment(24,"ODTÜ", "Mühendislik Fakültesi", "Bilgisayar Mühendisliği", "Sayısal", 558.50, 1300, 75, "Ankara", true));
        departmentList.add(new UniversityDepartment(25,"ODTÜ", "Fen-Edebiyat Fakültesi", "Matematik", "Sayısal", 500.40, 4000, 50, "Ankara", true));
        departmentList.add(new UniversityDepartment(26,"ODTÜ", "İktisadi ve İdari Bilimler Fakültesi", "İşletme", "Eşit Ağırlık", 510.30, 3000, 60, "Ankara", true));
        departmentList.add(new UniversityDepartment(27,"İTÜ", "Mühendislik Fakültesi", "Elektrik-Elektronik Mühendisliği", "Sayısal", 540.75, 1700, 90, "İstanbul", true));
        departmentList.add(new UniversityDepartment(28,"İTÜ", "Mühendislik Fakültesi", "Çevre Mühendisliği", "Sayısal", 470.00, 8000, 70, "İstanbul", true));
        departmentList.add(new UniversityDepartment(29,"Hacettepe Üniversitesi", "Edebiyat Fakültesi", "İngiliz Dili ve Edebiyatı", "Dil", 440.00, 10000, 60, "Ankara", true));
        departmentList.add(new UniversityDepartment(30,"Hacettepe Üniversitesi", "Sağlık Bilimleri Fakültesi", "Fizyoterapi ve Rehabilitasyon", "Sayısal", 510.00, 3000, 70, "Ankara", true));
        departmentList.add(new UniversityDepartment(31,"Bilkent Üniversitesi", "Mühendislik Fakültesi", "Bilgisayar Mühendisliği", "Sayısal", 565.00, 1100, 45, "Ankara", false));
        departmentList.add(new UniversityDepartment(32,"Bilkent Üniversitesi", "Mühendislik Fakültesi", "Elektrik-Elektronik Mühendisliği", "Sayısal", 560.00, 1200, 40, "Ankara", false));
        departmentList.add(new UniversityDepartment(33,"Koç Üniversitesi", "Mühendislik Fakültesi", "Bilgisayar Mühendisliği", "Sayısal", 570.50, 1000, 30, "İstanbul", false));
        departmentList.add(new UniversityDepartment(34,"Koç Üniversitesi", "İktisadi ve İdari Bilimler Fakültesi", "Ekonomi", "Eşit Ağırlık", 530.00, 2500, 35, "İstanbul", false));
        departmentList.add(new UniversityDepartment(35,"Ege Üniversitesi", "Mühendislik Fakültesi", "Gıda Mühendisliği", "Sayısal", 430.00, 15000, 80, "İzmir", true));
        departmentList.add(new UniversityDepartment(36,"Ege Üniversitesi", "Fen Fakültesi", "Kimya", "Sayısal", 400.00, 18000, 90, "İzmir", true));
        departmentList.add(new UniversityDepartment(37,"Dokuz Eylül Üniversitesi", "Mühendislik Fakültesi", "Jeoloji Mühendisliği", "Sayısal", 390.00, 22000, 60, "İzmir", true));
        departmentList.add(new UniversityDepartment(38,"Dokuz Eylül Üniversitesi", "İktisadi ve İdari Bilimler Fakültesi", "İşletme", "Eşit Ağırlık", 410.00, 16000, 70, "İzmir", true));
        departmentList.add(new UniversityDepartment(39,"Galatasaray Üniversitesi", "Hukuk Fakültesi", "Hukuk", "Eşit Ağırlık", 540.00, 1700, 30, "İstanbul", true));

	    return departmentList;
	}
}
