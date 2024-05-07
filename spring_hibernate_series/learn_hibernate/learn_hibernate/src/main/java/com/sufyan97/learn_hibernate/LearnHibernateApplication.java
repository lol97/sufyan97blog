package com.sufyan97.learn_hibernate;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sufyan97.learn_hibernate.barang.Barang;
import com.sufyan97.learn_hibernate.barang.BarangService;
import com.sufyan97.learn_hibernate.warganegara.Paspor;
import com.sufyan97.learn_hibernate.warganegara.WargaNegara;
import com.sufyan97.learn_hibernate.warganegara.WargaNegaraRepository;
import com.sufyan97.learn_hibernate.warganegara.WargaNegaraService;

@SpringBootApplication
public class LearnHibernateApplication {

	
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext =	SpringApplication.run(LearnHibernateApplication.class, args);
		BarangService barangService = applicationContext.getBean(BarangService.class);
		
		/*
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
		*/
		
		WargaNegaraService wargaNegaraService = applicationContext.getBean(WargaNegaraService.class);
		//NO PASPOR
		WargaNegara noPaspor = new WargaNegara();
		noPaspor.setNIK(new BigDecimal("342112222"));
		noPaspor.setNamaKTP("Bamabang");
		noPaspor.setTanggalLahir(new Date(1997, 6, 20));
		noPaspor.setTempatLahir("RiverSide");
		wargaNegaraService.Store(noPaspor);
		
		//DENGAN PASPOR
		WargaNegara pelancong = new WargaNegara();
		pelancong.setNIK(new BigDecimal("314211222211"));
		pelancong.setNamaKTP("Jasss Ha");
		pelancong.setTanggalLahir(new Date(1997, 6, 20));
		pelancong.setTempatLahir("RiverSide Water");
		
		Paspor paspor = new Paspor();
		paspor.setNoPaspor("SC111");
		paspor.setMasaBerlaku(new Date(2028, 6, 20));
		paspor.setStatus("AC");
		paspor.setWargaNegara(pelancong);
		pelancong.setPaspor(paspor);
		wargaNegaraService.Store(pelancong);
		
		//DENGAN PASPOR KEMUDIAN HAPUS
		WargaNegara pindahNegara = new WargaNegara();
		pindahNegara.setNIK(new BigDecimal("1113142112222"));
		pindahNegara.setNamaKTP("Aezakmi Aaa");
		pindahNegara.setTanggalLahir(new Date(1997, 6, 20));
		pindahNegara.setTempatLahir("Winner Ciry");
		
		Paspor pasporPindah = new Paspor();
		pasporPindah.setNoPaspor("EXS0C111");
		pasporPindah.setMasaBerlaku(new Date(2028, 6, 20));
		pasporPindah.setStatus("AC");
		pasporPindah.setWargaNegara(pindahNegara);
		pindahNegara.setPaspor(pasporPindah);
		wargaNegaraService.Store(pindahNegara);
		
		wargaNegaraService.destroy(pindahNegara);
		
		//DENGAN PASPOR KEMUDIAN HAPUS PASPOR SAJA
		WargaNegara netizenBudiman = new WargaNegara();
		netizenBudiman.setNIK(new BigDecimal("2221222222"));
		netizenBudiman.setNamaKTP("Paling Benar");
		netizenBudiman.setTanggalLahir(new Date(1997, 6, 20));
		netizenBudiman.setTempatLahir("Rain Strom");
		
		Paspor pasporHilang = new Paspor();
		pasporHilang.setNoPaspor("HILANF1111");
		pasporHilang.setMasaBerlaku(new Date(2028, 6, 20));
		pasporHilang.setStatus("AC");
		pasporHilang.setWargaNegara(netizenBudiman);
		netizenBudiman.setPaspor(pasporHilang);
		wargaNegaraService.Store(netizenBudiman);
		wargaNegaraService.removePaspor(netizenBudiman);
		
	}

}
