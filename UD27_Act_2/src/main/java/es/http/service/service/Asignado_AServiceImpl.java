package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IAsignado_ADAO;
import es.http.service.dto.Asignado_A;

@Service
public class Asignado_AServiceImpl implements IAsignado_AService{
	
	@Autowired
	IAsignado_ADAO iAsignado_ADAO;
	
	@Override
	public List<Asignado_A> listarAsignado_A() {
		// TODO Auto-generated method stub
		return iAsignado_ADAO.findAll();
	}

	@Override
	public Asignado_A guardarAsignado_A(Asignado_A asignado_a) {
		// TODO Auto-generated method stub
		return iAsignado_ADAO.save(asignado_a);
	}

	@Override
	public Asignado_A Asignado_AXID(int id) {
		// TODO Auto-generated method stub
		return iAsignado_ADAO.findById(id).get();
	}

	@Override
	public Asignado_A actualizarAsignado_A(Asignado_A asignado_a) {
		// TODO Auto-generated method stub
		return iAsignado_ADAO.save(asignado_a);
	}

	@Override
	public void eliminarAsignado_A(int id) {
		// TODO Auto-generated method stub
		iAsignado_ADAO.deleteById(id);
	}

}
