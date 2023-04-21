package novedades.cont.viendo.series.vo;
import java.io.Serializable;
import java.time.LocalDateTime;


public class NovedadesVO   implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id_novedad;
	private  String desc_serie_pel;
	private long  id_serie_pel;
	private  String estado_novedad;
	private LocalDateTime fec_reg_novedad;
	private  LocalDateTime fec_modif_novedad;
	public long getId_novedad() {
		return id_novedad;
	}
	public void setId_novedad(long id_novedad) {
		this.id_novedad = id_novedad;
	}
	public String getDesc_serie_pel() {
		return desc_serie_pel;
	}
	public void setDesc_serie_pel(String desc_serie_pel) {
		this.desc_serie_pel = desc_serie_pel;
	}
	public long getId_serie_pel() {
		return id_serie_pel;
	}
	public void setId_serie_pel(long id_serie_pel) {
		this.id_serie_pel = id_serie_pel;
	}
	public String getEstado_novedad() {
		return estado_novedad;
	}
	public void setEstado_novedad(String estado_novedad) {
		this.estado_novedad = estado_novedad;
	}
	public LocalDateTime getFec_reg_novedad() {
		return fec_reg_novedad;
	}
	public void setFec_reg_novedad(LocalDateTime fec_reg_novedad) {
		this.fec_reg_novedad = fec_reg_novedad;
	}
	public LocalDateTime getFec_modif_novedad() {
		return fec_modif_novedad;
	}
	public void setFec_modif_novedad(LocalDateTime fec_modif_novedad) {
		this.fec_modif_novedad = fec_modif_novedad;
	}
	

	

	
	
}
