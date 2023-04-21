package novedades.cont.viendo.series.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import novedades.cont.viendo.series.response.ContVerMessageResponse;
import novedades.cont.viendo.series.response.NovMessageResponse;
import novedades.cont.viendo.series.response.SMasVistasMessageResponse;
import novedades.cont.viendo.series.response.SeriesMsgResponse;
import novedades.cont.viendo.series.service.HorasLibresService;
import novedades.cont.viendo.series.vo.ContinuarViendoVO;
import novedades.cont.viendo.series.vo.NovedadesVO;
import novedades.cont.viendo.series.vo.SeriesMasVistasVO;

import org.springframework.beans.factory.annotation.Autowired;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.validation.Valid;

@RestController
@RequestMapping("/tv")
public class HorasLibresController {

	@Autowired
	private HorasLibresService horasLibresServ;

	@PostMapping("/insNovedad")
	public Response insertNoved(@Valid  @RequestBody  NovedadesVO novedadVO) {

		try {

			horasLibresServ.insertNoved(novedadVO);
			return Response.ok().build();
		
		} catch (Exception e) {
			
		    String message = "No se registro Novedades de Peliculas o Series"+HttpStatus.INTERNAL_SERVER_ERROR;

		    return Response
		      .status(Response.Status.NOT_MODIFIED)
		      .entity(message)
		      .build();
			
		}
	}
	
	@GetMapping("buscarNoved/{id}")
	public ResponseEntity<NovMessageResponse>   findNoved(@PathVariable long id){
		return new ResponseEntity<>(
				horasLibresServ.consultNovedad(id), 
		          HttpStatus.OK);
	}
	
	@PutMapping("/modifNoved")
	public ResponseEntity<NovMessageResponse>   modifNoved(@Valid  @RequestBody  NovedadesVO novedadVO){
		return new ResponseEntity<>(
				horasLibresServ.modifNovedad(novedadVO), 
		          HttpStatus.OK);
	}
	
	@DeleteMapping("elim/{id}")
	public Response  delNoved(@PathVariable long id){
		try {
					horasLibresServ.deleteNovedad(id);
					return Response.ok().build();
		} catch (Exception e) {
		    String message = "No se elimino Novedades de Peliculas o Series"+HttpStatus.INTERNAL_SERVER_ERROR+" "+id;

		    return Response
		      .status(Response.Status.NOT_MODIFIED)
		      .entity(message)
		      .build();
		}
		
	}
	
//	----------------------------------------------------------
	@PostMapping("/insertContinuaVer")
	public Response insertContinuaVer(@Valid @RequestBody  ContinuarViendoVO ContinuaverVO) {
		try {

			horasLibresServ.insertContinuaVer(ContinuaverVO);
			return Response.ok().build();
		
		} catch (Exception e) {
			
		    String message = "No se registro Continuar viendo"+HttpStatus.INTERNAL_SERVER_ERROR;

		    return Response
		      .status(Response.Status.NOT_MODIFIED)
		      .entity(message)
		      .build();
			
		}
	}
	
	@GetMapping("buscarContinuaVer/{id}")
	public ResponseEntity<ContVerMessageResponse>   findContinuaVer(@PathVariable long id){
		return new ResponseEntity<>(
				horasLibresServ.consultContinuaVer(id), 
		          HttpStatus.OK);
	}
	
	@PutMapping("/modifContinuarVer")
	public ResponseEntity<ContVerMessageResponse>   modifContinuarViend(@Valid @RequestBody  ContinuarViendoVO continuaverVO){
		return new ResponseEntity<>(
				horasLibresServ.modifContinuarVer(continuaverVO), 
		          HttpStatus.OK);
	}
	
	@DeleteMapping("elimcontViendo/{id}")
	public Response  delcontViendo(@PathVariable long id){
		try {
					horasLibresServ.deletecontViendo(id);
					return Response.ok().build();
		} catch (Exception e) {
		    String message = "No se elimino Continuar Viendo"+HttpStatus.INTERNAL_SERVER_ERROR+" "+id;

		    return Response
		      .status(Response.Status.NOT_MODIFIED)
		      .entity(message)
		      .build();
		}
		
	}
	
//	----------------------------------------------------------
	@PostMapping("/insertSerieMasV")
	public Response insertarSerieMasV(@Valid @RequestBody  SeriesMasVistasVO serMasVistasVO) {
		try {

			horasLibresServ.insertSeriesMasVistas(serMasVistasVO);
			return Response.ok().build();
		
		} catch (Exception e) {
			
		    String message = "No se registro Series Mas Vistas"+HttpStatus.INTERNAL_SERVER_ERROR;

		    return Response
		      .status(Response.Status.NOT_MODIFIED)
		      .entity(message)
		      .build();
			
		}
	}
	
	@GetMapping("buscarSerieMasV/{id}")
	public ResponseEntity<SMasVistasMessageResponse>   findSerieMasV(@PathVariable long id){
		return new ResponseEntity<>(
				horasLibresServ.consultSeriesMasVistas(id), 
		          HttpStatus.OK);
	}
	
	@PutMapping("/modifSerieMasV")
	public ResponseEntity<SMasVistasMessageResponse>   modifSerieMasVistas(@Valid @RequestBody  SeriesMasVistasVO serMasVistasVO){
		return new ResponseEntity<>(
				horasLibresServ.modifSerMasVistas(serMasVistasVO), 
		          HttpStatus.OK);
	}
	
	@DeleteMapping("elimSeriesMasVistas/{id}")
	public Response  delSeriesMasVistas(@PathVariable long id){
		try {
					horasLibresServ.deleteSeriesMasVistas(id);
					return Response.ok().build();
		} catch (Exception e) {
		    String message = "No se elimino Series Mas Vistas "+HttpStatus.INTERNAL_SERVER_ERROR+" "+id;

		    return Response
		      .status(Response.Status.NOT_MODIFIED)
		      .entity(message)
		      .build();
		}
		
	}
	
//	----------------------------------------------------
	@GetMapping("consultarSeries/{id}")
	public ResponseEntity<SeriesMsgResponse>   findSerie(@PathVariable long id){
		return new ResponseEntity<>(
				horasLibresServ.consultSeries(id), 
		          HttpStatus.OK);
	}
	
}
