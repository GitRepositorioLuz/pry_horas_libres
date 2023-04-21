package novedades.cont.viendo.series.entity;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name="CONTINUAR_VIENDO")
@Entity

public class ContinuarViendoEntity   implements Serializable{
		
	private static final long serialVersionUID = 8889765510811719485L;
	
	@Id   
	@Column(name="ID_CONT_VIEND")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqUnico")
	@SequenceGenerator(name = "seqUnico",allocationSize=1,sequenceName="SEQ_CONTINUAR_VIENDO")
	private long id_cont_viend;
	
	@Column(name="DESC_SERIE_PEL")
	private String desc_serie_pel;
	
	@Column(name="ID_SERIE_PEL")
	private long id_serie_pel;
	
	@Column(name="ESTADO_CONT_VIEND")
	private String estado_cont_viend;
	
	@Column(name="FEC_REG_CONT_VIEND")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "GMT-5:00")
	private LocalDateTime fec_reg_cont_viend;
	
	@Column(name="FEC_MODIF_CONT_VIEND")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "GMT-5:00")
	private LocalDateTime fec_modif_cont_viend;

	public long getId_cont_viend() {
		return id_cont_viend;
	}

	public void setId_cont_viend(long id_cont_viend) {
		this.id_cont_viend = id_cont_viend;
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

	public String getEstado_cont_viend() {
		return estado_cont_viend;
	}

	public void setEstado_cont_viend(String estado_cont_viend) {
		this.estado_cont_viend = estado_cont_viend;
	}

	public LocalDateTime getFec_reg_cont_viend() {
		return fec_reg_cont_viend;
	}

	public void setFec_reg_cont_viend(LocalDateTime fec_reg_cont_viend) {
		this.fec_reg_cont_viend = fec_reg_cont_viend;
	}

	public LocalDateTime getFec_modif_cont_viend() {
		return fec_modif_cont_viend;
	}

	public void setFec_modif_cont_viend(LocalDateTime fec_modif_cont_viend) {
		this.fec_modif_cont_viend = fec_modif_cont_viend;
	}

	@Override
	public String toString() {
		return "ContinuarViendoEntity [id_cont_viend=" + id_cont_viend + ", desc_serie_pel=" + desc_serie_pel
				+ ", id_serie_pel=" + id_serie_pel + ", estado_cont_viend=" + estado_cont_viend
				+ ", fec_reg_cont_viend=" + fec_reg_cont_viend + ", fec_modif_cont_viend=" + fec_modif_cont_viend + "]";
	}

	
	
	
	
	
}
