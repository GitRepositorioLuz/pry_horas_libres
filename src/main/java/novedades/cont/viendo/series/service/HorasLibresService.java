package novedades.cont.viendo.series.service;

import novedades.cont.viendo.series.exception.UnprocessableEntityException;
import novedades.cont.viendo.series.response.ContVerMessageResponse;
import novedades.cont.viendo.series.response.NovMessageResponse;
import novedades.cont.viendo.series.response.SMasVistasMessageResponse;
import novedades.cont.viendo.series.response.SeriesMsgResponse;
import novedades.cont.viendo.series.vo.ContinuarViendoVO;
import novedades.cont.viendo.series.vo.NovedadesVO;
import novedades.cont.viendo.series.vo.SeriesMasVistasVO;

public interface HorasLibresService {
		
	void insertNoved ( NovedadesVO novedadVO) throws UnprocessableEntityException;
	NovMessageResponse consultNovedad(long id);
	NovMessageResponse  modifNovedad(NovedadesVO novedadVO);
	void deleteNovedad(long id);
	
	void insertContinuaVer ( ContinuarViendoVO ContinuaViendoVO) throws UnprocessableEntityException;
	ContVerMessageResponse consultContinuaVer(long id);
	ContVerMessageResponse  modifContinuarVer(ContinuarViendoVO ContinuaViendoVO);
	void deletecontViendo(long id);
	
	void insertSeriesMasVistas( SeriesMasVistasVO serMasVistasVO) throws UnprocessableEntityException;
	SMasVistasMessageResponse consultSeriesMasVistas(long id);
	SMasVistasMessageResponse  modifSerMasVistas(SeriesMasVistasVO serMasVistasVO);
	void deleteSeriesMasVistas(long id);
	
	SeriesMsgResponse consultSeries(long id);
	
}
