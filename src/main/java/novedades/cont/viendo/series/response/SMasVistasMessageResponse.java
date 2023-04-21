package novedades.cont.viendo.series.response;

import novedades.cont.viendo.series.vo.SeriesMasVistasVO;

public class SMasVistasMessageResponse {
		
	private NovCabeceraResponse cabResponse;
	private SeriesMasVistasVO serMasVistasVO;
	private String mensaje;
	
	public NovCabeceraResponse getCabResponse() {
		return cabResponse;
	}
	public void setCabResponse(NovCabeceraResponse cabResponse) {
		this.cabResponse = cabResponse;
	}
	public SeriesMasVistasVO getSerMasVistasVO() {
		return serMasVistasVO;
	}
	public void setSerMasVistasVO(SeriesMasVistasVO serMasVistasVO) {
		this.serMasVistasVO = serMasVistasVO;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	@Override
	public String toString() {
		return "SMasVistasMessageResponse [cabResponse=" + cabResponse + ", serMasVistasVO=" + serMasVistasVO
				+ ", mensaje=" + mensaje + "]";
	}
	
	
	
}
