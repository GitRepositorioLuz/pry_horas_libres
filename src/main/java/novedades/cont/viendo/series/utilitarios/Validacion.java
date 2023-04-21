package novedades.cont.viendo.series.utilitarios;

import java.util.ArrayList;
import java.util.List;
import novedades.cont.viendo.series.enums.EnumCatalogo;
import novedades.cont.viendo.series.exception.UnprocessableEntityException;
import novedades.cont.viendo.series.vo.ContinuarViendoVO;
import novedades.cont.viendo.series.vo.NovedadesVO;
import novedades.cont.viendo.series.vo.SeriesMasVistasVO;

public class Validacion {

    private Validacion(){}

    public static void validacionNovedad(NovedadesVO novedadVO) throws UnprocessableEntityException {
        List<ErrorMessageVO> lstErrores = new ArrayList<>();
        
        Long l_val=null;

        if(novedadVO.getDesc_serie_pel().trim().isEmpty()){
            lstErrores.add(new ErrorMessageVO(EnumCatalogo.CATALOGO_ERROR_42201));
        }
        
        if(novedadVO.getEstado_novedad().trim().isBlank()){
            lstErrores.add(new ErrorMessageVO(EnumCatalogo.CATALOGO_ERROR_42202));
        }
        
        if( novedadVO.getId_serie_pel() == 0  ){
            lstErrores.add(new ErrorMessageVO(EnumCatalogo.CATALOGO_ERROR_42203));
        }
        

        if(!lstErrores.isEmpty()){
            throw new UnprocessableEntityException(lstErrores);
        }
    }

    public static void validacionSegViendo(ContinuarViendoVO contViendoVO) throws UnprocessableEntityException {
        List<ErrorMessageVO> lstErrores = new ArrayList<>();
        Long l_val=null;

        if(contViendoVO.getDesc_serie_pel().trim()==""){
            lstErrores.add(new ErrorMessageVO(EnumCatalogo.CATALOGO_ERROR_42204));
        }
        
        if(contViendoVO.getEstado_cont_viend().trim()==""){
            lstErrores.add(new ErrorMessageVO(EnumCatalogo.CATALOGO_ERROR_42205));
        }
        
        if( contViendoVO.getId_serie_pel() == 0   ){
            lstErrores.add(new ErrorMessageVO(EnumCatalogo.CATALOGO_ERROR_42206));
        }
        


        if(!lstErrores.isEmpty()){
            throw new UnprocessableEntityException(lstErrores);
        }
    }

    public static void validacionSeriesMasVistas(SeriesMasVistasVO seriesMasVistVO) throws UnprocessableEntityException {
        List<ErrorMessageVO> lstErrores = new ArrayList<>();
        Long l_val=null;

        if(seriesMasVistVO.getId_serie()  == 0 ){
            lstErrores.add(new ErrorMessageVO(EnumCatalogo.CATALOGO_ERROR_42207));
        }
        
        if(seriesMasVistVO.getEstado_ser_m_vi().trim()==""){
            lstErrores.add(new ErrorMessageVO(EnumCatalogo.CATALOGO_ERROR_42208));
        }
        

        if(!lstErrores.isEmpty()){
            throw new UnprocessableEntityException(lstErrores);
        }
    }

}
