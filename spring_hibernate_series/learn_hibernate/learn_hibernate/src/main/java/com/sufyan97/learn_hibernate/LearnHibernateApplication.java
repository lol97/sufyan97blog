package com.sufyan97.learn_hibernate;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sufyan97.learn_hibernate.barang.Barang;
import com.sufyan97.learn_hibernate.barang.BarangService;

@SpringBootApplication
public class LearnHibernateApplication {

	
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext =	SpringApplication.run(LearnHibernateApplication.class, args);
		BarangService barangService = applicationContext.getBean(BarangService.class);
		
		//INSERT BARANG BARU
		Barang sampoBaru = new Barang("SUNSILK MASKARA BARU", new BigDecimal(1000), new BigDecimal(20));
		barangService.store(sampoBaru);
		
		//INSERT BARANG LAGI
		Barang tepungTerigu = new Barang("BOAGIRAS 1/2 Kg", new BigDecimal(35000), new BigDecimal(5));
		barangService.store(tepungTerigu);
		
		//UPDATE BARANG 
		tepungTerigu.setHargaSatuan(new BigDecimal(36000));
		barangService.update(tepungTerigu);
		
		//BACA
		Barang readSampo = barangService.read(sampoBaru.getId());
		System.out.println(readSampo.toString());
		
		//HAPUS sampo
		barangService.destroy(readSampo.getId());
	}

}
