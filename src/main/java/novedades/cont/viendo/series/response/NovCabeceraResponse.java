package novedades.cont.viendo.series.response;

public class NovCabeceraResponse {
	
	private String idRastreo;
	private Integer codigo;
	
	public String getIdRastreo() {
		return idRastreo;
	}
	public void setIdRastreo(String idRastreo) {
		this.idRastreo = idRastreo;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "CabeceraResponse [idRastreo=" + idRastreo + ", codigo=" + codigo + "]";
	}
	
	

}
