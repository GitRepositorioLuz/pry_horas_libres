package novedades.cont.viendo.series.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.SequenceGenerator;

@Table(name="NOVEDADES")
@Entity

public class NovedadesEntity   implements Serializable{

	private static final long serialVersionUID = 8889765510811719485L;
	
	@Id   
	@Column(name="ID_NOVEDAD")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqUnico")
	@SequenceGenerator(name = "seqUnico",allocationSize=1,sequenceName="SEQ_NOVEDADES")
	private long id_novedad;
	
	@Column(name="DESC_SERIE_PEL")
	private  String desc_serie_pel;
	
	@Column(name="ID_SERIE_PEL")
	private long  id_serie_pel;
	
	@Column(name="ESTADO_NOVEDAD")
	private  String estado_novedad;
	
	@Column(name="FEC_REG_NOVEDAD")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "GMT-5:00")
	private LocalDateTime fec_reg_novedad;
	
	@Column(name="FEC_MODIF_NOVEDAD")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "GMT-5:00")
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

	@Override
	public String toString() {
		return "NovedadesEntity [id_novedad=" + id_novedad + ", desc_serie_pel=" + desc_serie_pel + ", id_serie_pel="
				+ id_serie_pel + ", estado_novedad=" + estado_novedad + ", fec_reg_novedad=" + fec_reg_novedad
				+ ", fec_modif_novedad=" + fec_modif_novedad + "]";
	}



	
	
}
