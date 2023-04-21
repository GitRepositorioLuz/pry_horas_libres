package novedades.cont.viendo.series.vo;

import java.io.Serializable;
import java.time.LocalDateTime;


public class SeriesVO  implements Serializable{
	
	private static final long serialVersionUID = 8889765510811719485L;
	

	private long id_serie ;
	 private String   descrip_serie ;
	private long id_categoria;
	private String estado_serie;
	 private LocalDateTime  fec_reg_ser ;
	 private LocalDateTime  fec_modif_ser ;

	public long getId_serie() {
		return id_serie;
	}

	public void setId_serie(long id_serie) {
		this.id_serie = id_serie;
	}

	public String getDescrip_serie() {
		return descrip_serie;
	}

	public void setDescrip_serie(String descrip_serie) {
		this.descrip_serie = descrip_serie;
	}

	public long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(long id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getEstado_serie() {
		return estado_serie;
	}

	public void setEstado_serie(String estado_serie) {
		this.estado_serie = estado_serie;
	}

	public LocalDateTime getFec_reg_ser() {
		return fec_reg_ser;
	}

	public void setFec_reg_ser(LocalDateTime fec_reg_ser) {
		this.fec_reg_ser = fec_reg_ser;
	}

	public LocalDateTime getFec_modif_ser() {
		return fec_modif_ser;
	}

	public void setFec_modif_ser(LocalDateTime fec_modif_ser) {
		this.fec_modif_ser = fec_modif_ser;
	}

	@Override
	public String toString() {
		return "SeriesEntity [id_serie=" + id_serie + ", descrip_serie=" + descrip_serie + ", id_categoria="
				+ id_categoria + ", estado_serie=" + estado_serie + ", fec_reg_ser=" + fec_reg_ser + ", fec_modif_ser="
				+ fec_modif_ser + "]";
	}

	

	
	 
	
	
	 
}
