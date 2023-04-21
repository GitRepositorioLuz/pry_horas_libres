package novedades.cont.viendo.series.service.impl;

import novedades.cont.viendo.series.entity.ContinuarViendoEntity;
import novedades.cont.viendo.series.entity.NovedadesEntity;
import novedades.cont.viendo.series.entity.SeriesEntity;
import novedades.cont.viendo.series.entity.SeriesMasVistasEntity;
import novedades.cont.viendo.series.exception.UnprocessableEntityException;
import novedades.cont.viendo.series.repository.ContinuarViendoRepository;
import novedades.cont.viendo.series.repository.NovedadesRepository;
import novedades.cont.viendo.series.repository.SeriesMasVistasRepository;
import novedades.cont.viendo.series.response.CabeceraResponse;
import novedades.cont.viendo.series.response.ContVerMessageResponse;
import novedades.cont.viendo.series.response.NovCabeceraResponse;
import novedades.cont.viendo.series.response.NovMessageResponse;
import novedades.cont.viendo.series.response.SMasVistasMessageResponse;
import novedades.cont.viendo.series.response.SeriesMsgResponse;
import novedades.cont.viendo.series.service.HorasLibresService;
import novedades.cont.viendo.series.utilitarios.Validacion;
import novedades.cont.viendo.series.vo.ContinuarViendoVO;
import novedades.cont.viendo.series.vo.NovedadesVO;
import novedades.cont.viendo.series.vo.SeriesMasVistasVO;
import novedades.cont.viendo.series.vo.SeriesVO;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class HorasLibresServiceImpl implements HorasLibresService{

	@Autowired
	private NovedadesRepository novedRepository;
	
	@Autowired
	private ContinuarViendoRepository contViendoRepository;
	
	@Autowired
	private SeriesMasVistasRepository seriesMasVistasRep;
	
	@Override
	public void insertNoved(NovedadesVO novedadVO) throws UnprocessableEntityException{
		
		try {
			LocalDateTime localDateTime = LocalDateTime.now();

			Validacion.validacionNovedad(novedadVO);
			NovedadesEntity NovedEntity =new NovedadesEntity();
			NovedEntity= this.getEntityVONovedad(novedadVO);
			NovedEntity.setFec_reg_novedad(localDateTime);
			NovedEntity.setFec_modif_novedad(localDateTime);
			
			novedRepository.save(NovedEntity);
		}
		catch(Exception e) {
			System.out.println("Error al insertar => " + e.getMessage());
		}
		
	}

	@Override
	public NovMessageResponse consultNovedad(long id) {
		NovCabeceraResponse cabResponse = new NovCabeceraResponse();
		NovMessageResponse msgResponse = new NovMessageResponse();
		NovedadesEntity novedEntity = new NovedadesEntity();
		
		novedEntity = novedRepository.getReferenceById(id);
		
			cabResponse.setCodigo(200);
			cabResponse.setIdRastreo("Exito en consulta de Novedades :"+id);
			
			msgResponse.setCabResponse(cabResponse);
			msgResponse.setMensaje("Registro consultado existe");

			msgResponse.setNovedadesVO(this.getNovedadesVO(novedEntity));
			
			return msgResponse;

	}
	
	@Override
	public NovMessageResponse modifNovedad(NovedadesVO novedadVO) {
		NovCabeceraResponse cabResponse = new NovCabeceraResponse();
		NovMessageResponse msgResponse = new NovMessageResponse();
		
		NovedadesEntity NovedEntity =new NovedadesEntity();
		NovedEntity= this.getEntityVONovedad(novedadVO);
		
		novedRepository.save(NovedEntity);
		
			cabResponse.setCodigo(200);
			cabResponse.setIdRastreo("Exito en modificacion:"+novedadVO.getId_novedad());
			
			msgResponse.setCabResponse(cabResponse);
			msgResponse.setMensaje("Registro modificado");

			msgResponse.setNovedadesVO(this.getNovedadesVO(NovedEntity));
			
			return msgResponse;
	}
	
	
	@Override
	public void deleteNovedad(long id) {
		
		try {
			System.out.println("Exito al eliminar id: " + id);
			novedRepository.deleteById(id);

		}
	
		catch(Exception e) {
			System.out.println("Error => " + e.getMessage());
		}
	}
	
	
	@Override
	public void insertContinuaVer(ContinuarViendoVO ContinuaViendoVO) throws UnprocessableEntityException {
		try {
			LocalDateTime localDateTime = LocalDateTime.now();
			Validacion.validacionSegViendo(ContinuaViendoVO);
			ContinuarViendoEntity contViendoEntity =new ContinuarViendoEntity();
			contViendoEntity= this.getEntityContVer(ContinuaViendoVO);
			contViendoEntity.setFec_reg_cont_viend(localDateTime);
			contViendoEntity.setFec_modif_cont_viend(localDateTime);
			contViendoRepository.save(contViendoEntity);
		}
		catch(Exception e) {
			System.out.println("Error al insertar => " + e.getMessage());
		}
		
	}
	
	@Override
	public ContVerMessageResponse consultContinuaVer(long id) {
		NovCabeceraResponse cabResponse = new NovCabeceraResponse();
		ContVerMessageResponse contVerMessageResponse = new ContVerMessageResponse();
		ContinuarViendoEntity contViendoEntity = new ContinuarViendoEntity();
		
		contViendoEntity = contViendoRepository.getReferenceById(id);
		
			cabResponse.setCodigo(200);
			cabResponse.setIdRastreo("Exito en consulta de Continuar Viendo :"+id);
			
			contVerMessageResponse.setCabResponse(cabResponse);
			contVerMessageResponse.setMensaje("Registro consultado existe");
			contVerMessageResponse.setContViendoVO(this.getContViendoVO(contViendoEntity));
			
			return contVerMessageResponse;
	}
	
	@Override
	public ContVerMessageResponse modifContinuarVer(ContinuarViendoVO continuaViendoVO) {
		NovCabeceraResponse cabResponse = new NovCabeceraResponse();
		ContVerMessageResponse contVermsgResponse = new ContVerMessageResponse();
		
		ContinuarViendoEntity continuarViendoEntity =new ContinuarViendoEntity();
		continuarViendoEntity= this.getEntityContVer(continuaViendoVO);
		
		contViendoRepository.save(continuarViendoEntity);
		
			cabResponse.setCodigo(200);
			cabResponse.setIdRastreo("Exito en modificacion:"+continuaViendoVO.getId_cont_viend());
			
			contVermsgResponse.setCabResponse(cabResponse);
			contVermsgResponse.setMensaje("Registro modificado");

			contVermsgResponse.setContViendoVO(this.getContViendoVO(continuarViendoEntity));
			
			return contVermsgResponse;
	}
	
	@Override
	public void deletecontViendo(long id) {
		try {
			
			contViendoRepository.deleteById(id);
			System.out.println("Exito al eliminar id: " + id);
		}
	
		catch(Exception e) {
			System.out.println("Error al eliminar Continuar Viendo=> " + e.getMessage());
		}
		
	}
	
	@Override
	public void insertSeriesMasVistas(SeriesMasVistasVO serMasVistasVO) throws UnprocessableEntityException {
		try {
			LocalDateTime localDateTime = LocalDateTime.now();
			Validacion.validacionSeriesMasVistas(serMasVistasVO);
			SeriesMasVistasEntity serMasVistasEntity =new SeriesMasVistasEntity();
			serMasVistasEntity= this.getEntitySeriesMVistas(serMasVistasVO);
			serMasVistasEntity.setFec_reg(localDateTime);
			serMasVistasEntity.setFec_modif(localDateTime);
			seriesMasVistasRep.save(serMasVistasEntity);
		}
		catch(Exception e) {
			System.out.println("Error al insertar SERIES MAS VISTAS => " + e.getMessage());
		}
		
	}

	@Override
	public SMasVistasMessageResponse consultSeriesMasVistas(long id) {
		
		NovCabeceraResponse cabResponse = new NovCabeceraResponse();
		SMasVistasMessageResponse sMasVistasMsgResponse = new SMasVistasMessageResponse();
		SeriesMasVistasEntity seriesMasVistasEnt = new SeriesMasVistasEntity();
		
		seriesMasVistasEnt = seriesMasVistasRep.getById(id);
		
			cabResponse.setCodigo(200);
			cabResponse.setIdRastreo("Exito en consulta de Continuar Viendo :"+id);
			
			sMasVistasMsgResponse.setCabResponse(cabResponse);
			sMasVistasMsgResponse.setMensaje("Registro consultado existe");
			sMasVistasMsgResponse.setSerMasVistasVO(this.getSerMasVistVO(seriesMasVistasEnt));
			
			return sMasVistasMsgResponse;
	}
	
	@Override
	public SMasVistasMessageResponse modifSerMasVistas(SeriesMasVistasVO serMasVistasVO) {
		NovCabeceraResponse cabResponse = new NovCabeceraResponse();
		SMasVistasMessageResponse sMasVistasMsgResponse = new SMasVistasMessageResponse();
		
		SeriesMasVistasEntity serMasVistasEntity =new SeriesMasVistasEntity();
		serMasVistasEntity= this.getEntitySeriesMVistas(serMasVistasVO);
		
		seriesMasVistasRep.save(serMasVistasEntity);
		
			cabResponse.setCodigo(200);
			cabResponse.setIdRastreo("Exito en modificacion:"+serMasVistasVO.getId_ser_m_vi());
			
			sMasVistasMsgResponse.setCabResponse(cabResponse);
			sMasVistasMsgResponse.setMensaje("Registro modificado");
			sMasVistasMsgResponse.setSerMasVistasVO(this.getSerMasVistVO(serMasVistasEntity));
			return sMasVistasMsgResponse;
	}

	@Override
	public void deleteSeriesMasVistas(long id) {
		try {
			
			seriesMasVistasRep.deleteById(id);
			System.out.println("Exito al eliminar id: " + id);
		}
	
		catch(Exception e) {
			System.out.println("Error al eliminar Continuar Viendo=> " + e.getMessage());
		}
		
	}
	
	private NovedadesEntity getEntityVONovedad(NovedadesVO novedadVO) {
		NovedadesEntity novedEntity = new NovedadesEntity();
		BeanUtils.copyProperties(novedadVO, novedEntity);
		return novedEntity;
	}
	private NovedadesVO getNovedadesVO(NovedadesEntity novedEntity)  {
		
		NovedadesVO novedVO=new NovedadesVO();
		BeanUtils.copyProperties(novedEntity,novedVO);
			
		return novedVO;
	}

	private ContinuarViendoEntity getEntityContVer(ContinuarViendoVO contViendoVO) {
		ContinuarViendoEntity contViendoEntity = new ContinuarViendoEntity();
		BeanUtils.copyProperties(contViendoVO, contViendoEntity);
		return contViendoEntity;
	}
	private ContinuarViendoVO getContViendoVO(ContinuarViendoEntity contViendoEntity)  {
		
		ContinuarViendoVO contViendoVO=new ContinuarViendoVO();
		BeanUtils.copyProperties(contViendoEntity,contViendoVO);
			
		return contViendoVO;
	}

	private SeriesMasVistasEntity getEntitySeriesMVistas(SeriesMasVistasVO seriesMasVistasVO) {
		SeriesMasVistasEntity serMasVistasEntity = new SeriesMasVistasEntity();
		BeanUtils.copyProperties(seriesMasVistasVO, serMasVistasEntity);
		return serMasVistasEntity;
	}
	private SeriesMasVistasVO getSerMasVistVO(SeriesMasVistasEntity serMasVistasEntity)  {
		
		SeriesMasVistasVO serMasVistasVO=new SeriesMasVistasVO();
		BeanUtils.copyProperties(serMasVistasEntity,serMasVistasVO);
			
		return serMasVistasVO;
	}

	
	@Override
	public SeriesMsgResponse consultSeries(long id) {
		CabeceraResponse cabResponse = new CabeceraResponse();
		SeriesMsgResponse seriesMsgResponse = new SeriesMsgResponse();
		SeriesVO seriesVO = new SeriesVO();
		String sUrl= "http://localhost:8097/horas_libres_mant_rest/dato/buscarSeries/"+id;
		
		seriesVO = null; 
		
			cabResponse.setCodigo(200);
			cabResponse.setIdRastreo("Exito en consulta de Continuar Viendo :"+id);
			
			RestTemplate restTemplate = new RestTemplate();
			SeriesMsgResponse response   = restTemplate.getForObject(sUrl, SeriesMsgResponse.class);
			
			
			seriesMsgResponse.setCabeceraResponse(cabResponse);
			seriesMsgResponse.setMensaje("Registro consultado existe");
			seriesMsgResponse.setSeriesVO(response.getSeriesVO());
			
			return seriesMsgResponse;
	}

	







	

	
}
