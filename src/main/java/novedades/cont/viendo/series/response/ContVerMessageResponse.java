package novedades.cont.viendo.series.response;

import novedades.cont.viendo.series.vo.ContinuarViendoVO;

public class ContVerMessageResponse {
	
	private NovCabeceraResponse cabResponse;
	private ContinuarViendoVO contViendoVO;
	private String mensaje;
	public NovCabeceraResponse getCabResponse() {
		return cabResponse;
	}
	public void setCabResponse(NovCabeceraResponse cabResponse) {
		this.cabResponse = cabResponse;
	}
	public ContinuarViendoVO getContViendoVO() {
		return contViendoVO;
	}
	public void setContViendoVO(ContinuarViendoVO contViendoVO) {
		this.contViendoVO = contViendoVO;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	@Override
	public String toString() {
		return "ContVerMessageResponse [cabResponse=" + cabResponse + ", contViendoVO=" + contViendoVO + ", mensaje="
				+ mensaje + "]";
	}
	
	
	
}
