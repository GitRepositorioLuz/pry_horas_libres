package novedades.cont.viendo.series.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name="SERIES_MAS_VISTAS")
@Entity
public class SeriesMasVistasEntity implements Serializable{
	
	private static final long serialVersionUID = 8889765510811719485L;
	
	@Id   
	@Column(name="ID_SER_M_VI")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqUnico")
	@SequenceGenerator(name = "seqUnico",allocationSize=1,sequenceName="SEQ_SERIE_M_VIS")
	private long id_ser_m_vi ;
	
	@Column(name="ID_SERIE")
	 private long  id_serie ;
	
	@Column(name="ESTADO_SER_M_VI")
	 private String   estado_ser_m_vi ;
	
	@Column(name="FEC_REG")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "GMT-5:00")
	 private LocalDateTime  fec_reg ;
	   
	 @Column(name="FEC_MODIF")
	 @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "GMT-5:00")
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
		return "SeriesMasVistasEntity [id_ser_m_vi=" + id_ser_m_vi + ", id_serie=" + id_serie + ", estado_ser_m_vi="
				+ estado_ser_m_vi + ", fec_reg=" + fec_reg + ", fec_modif=" + fec_modif + "]";
	}



	 
	   
	
	 
	 
}
