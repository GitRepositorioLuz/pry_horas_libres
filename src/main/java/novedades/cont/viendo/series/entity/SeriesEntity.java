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

@Entity
@Table(name="SERIES")
public class SeriesEntity  implements Serializable{
	
	private static final long serialVersionUID = 8889765510811719485L;
	
	@Id   
	@Column(name="ID_SERIE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqUnico")
	@SequenceGenerator(name = "seqUnico",allocationSize=1,sequenceName="SEQ_SERIE")
	private long id_serie ;

	
	@Column(name="DESCRIP_SERIE")
	 private String   descrip_serie ;
	
	@Column(name="ID_CATEGORIA")
	private long id_categoria;
	
	@Column(name="ESTADO_SERIE")
	private String estado_serie;
	
	@Column(name="FEC_REG_SER")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "GMT-5:00")
	 private LocalDateTime  fec_reg_ser ;
	   
	 @Column(name="FEC_MODIF_SER")
	 @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "GMT-5:00")
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
