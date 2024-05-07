package com.sufyan97.learn_hibernate.warganegara;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WargaNegaraService {
	@Autowired
	private WargaNegaraRepository wargaNegaraRepository;
	
	@Autowired
	private PasporRepository pasporRepository;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void Store(WargaNegara wargaNegara) {
		if(wargaNegara != null && wargaNegara.getPaspor() != null) {
			Paspor paspor = wargaNegara.getPaspor();
			pasporRepository.save(paspor);
		}
		
		wargaNegaraRepository.save(wargaNegara);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void destroy(WargaNegara wargaNegara) {
		wargaNegaraRepository.delete(wargaNegara);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void removePaspor(WargaNegara wargaNegara) {
		pasporRepository.delete(wargaNegara.getPaspor());
		wargaNegara.setPaspor(null);
	}
}
