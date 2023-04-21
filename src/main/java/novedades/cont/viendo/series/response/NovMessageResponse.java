package novedades.cont.viendo.series.response;



import novedades.cont.viendo.series.vo.NovedadesVO;

public class NovMessageResponse {

	private NovCabeceraResponse cabResponse;
	private NovedadesVO novedadesVO;
	private String mensaje;
	
	public NovCabeceraResponse getCabResponse() {
		return cabResponse;
	}
	public void setCabResponse(NovCabeceraResponse cabResponse) {
		this.cabResponse = cabResponse;
	}
	public NovedadesVO getNovedadesVO() {
		return novedadesVO;
	}
	public void setNovedadesVO(NovedadesVO novedadesVO) {
		this.novedadesVO = novedadesVO;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	@Override
	public String toString() {
		return "NovMessageResponse [cabResponse=" + cabResponse + ", novedadesVO=" + novedadesVO + ", mensaje="
				+ mensaje + "]";
	}
	
	

	
	
	
	
	
	
	
	
	
	
}
