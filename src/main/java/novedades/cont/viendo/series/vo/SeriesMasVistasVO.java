package novedades.cont.viendo.series.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

public class SeriesMasVistasVO implements Serializable{
	
	private static final long serialVersionUID = 8889765510811719485L;
	
	
	private long id_ser_m_vi ;
	 private long  id_serie ;
	 private String   estado_ser_m_vi ;
	 private LocalDateTime  fec_reg ;
	 private LocalDateTime  fec_modif ;
	public long getId_ser_m_vi() {
		return id_ser_m_vi;
	}
	public void setId_ser_m_vi(long id_ser_m_vi) {
		this.id_ser_m_vi = id_ser_m_vi;
	}
	public long getId_serie() {
		return id_serie;
	}
	public void setId_serie(long id_serie) {
		this.id_serie = id_serie;
	}
	public String getEstado_ser_m_vi() {
		return estado_ser_m_vi;
	}
	public void setEstado_ser_m_vi(String estado_ser_m_vi) {
		this.estado_ser_m_vi = estado_ser_m_vi;
	}
	public LocalDateTime getFec_reg() {
		return fec_reg;
	}
	public void setFec_reg(LocalDateTime fec_reg) {
		this.fec_reg = fec_reg;
	}
	public LocalDateTime getFec_modif() {
		return fec_modif;
	}
	public void setFec_modif(LocalDateTime fec_modif) {
		this.fec_modif = fec_modif;
	}
	
	@Override
	public String toString() {
		return "SeriesMasVistasVO [id_ser_m_vi=" + id_ser_m_vi + ", id_serie=" + id_serie + ", estado_ser_m_vi="
				+ estado_ser_m_vi + ", fec_reg=" + fec_reg + ", fec_modif=" + fec_modif + "]";
	}
	 

	 

	   
	
	 
	 
}
