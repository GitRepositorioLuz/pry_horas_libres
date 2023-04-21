package novedades.cont.viendo.series.response;

import java.util.Optional;
import novedades.cont.viendo.series.vo.SeriesVO;

public class SeriesMsgResponse {

	private CabeceraResponse cabeceraResponse;
	private SeriesVO seriesVO;
	private String mensaje;
	public CabeceraResponse getCabeceraResponse() {
		return cabeceraResponse;
	}
	public void setCabeceraResponse(CabeceraResponse cabeceraResponse) {
		this.cabeceraResponse = cabeceraResponse;
	}
	public SeriesVO getSeriesVO() {
		return seriesVO;
	}
	public void setSeriesVO(SeriesVO seriesVO) {
		this.seriesVO = seriesVO;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	@Override
	public String toString() {
		return "SeriesMsgResponse [cabeceraResponse=" + cabeceraResponse + ", seriesVO=" + seriesVO + ", mensaje="
				+ mensaje + "]";
	}
	
	
	
	
	
	
	
}
