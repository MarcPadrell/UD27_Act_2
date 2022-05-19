package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.ICientificosDAO;
import es.http.service.dto.Cientificos;

@Service
public class CientificosServiceImpl implements ICientificosService{
	
	@Autowired
	ICientificosDAO iCientificoDAO;

	@Override
	public List<Cientificos> listarCientificos() {
		return iCientificoDAO.findAll();
	}

	@Override
	public Cientificos guardarCientifico(Cientificos cientifico) {
		// TODO Auto-generated method stub
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public Cientificos cientificosXID(String dni) {
		// TODO Auto-generated method stub
		return iCientificoDAO.findById(dni).get();
	}

	@Override
	public Cientificos actualizarCientificos(Cientificos cientifico) {
		// TODO Auto-generated method stub
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public void eliminarCientificos(String dni) {
		// TODO Auto-generated method stub
		iCientificoDAO.deleteById(dni);
	}

}
